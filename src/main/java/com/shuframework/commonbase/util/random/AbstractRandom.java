package com.shuframework.commonbase.util.random;

import com.shuframework.commonbase.util.lang.StringUtil;

/**
 * static与abstract 不能同时使用
 * @author shuheng
 */
public abstract class AbstractRandom {

    /** int类型的长度限制为10（不超过9个）*/
    int LIMIT_INT_LENGTH = 10;

    // 使用到Algerian字体，系统里没有的话需要安装字体，字体只显示大写，去掉了1,0,i,o几个容易混淆的字符
    String VERIFY_CODES = "23456789ABCDEFGHJKMNPQRSTUVWXYZ";


    /**
     * 返回的范围是[0,num) 需要重写
     *
     * @param num 数字
     */
    protected abstract int random(int num);

    /**
     * 返回的范围是[start,end)
     *
     * @param start 范围起始值
     * @param end   范围终止值
     */
    protected int random(int start, int end) {
//		return random(end - start) + start; //返回[start, end)
//		return random(end - start + 1) + start;	//返回[start, end]
        return random(end - start) + start;
    }

    /**
     * 生成含有字母的验证码
     * @param length
     * @return
     */
    protected String verifyCodeHasLetter(int length) {
        String sources = VERIFY_CODES;
        int codesLen = sources.length();
        StringBuilder verifyCode = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            verifyCode.append(sources.charAt(random(codesLen - 1)));
        }
        return verifyCode.toString();
    }

    /**
     * 返回的几位数之间的值, length范围 [1,10) <br>
     * 如length=1,返回[0, 10) 即0-9之间的值<br>
     * 如length=2,返回[10, 100) 即10-99之间的值<br>
     * 如length=3,返回[100, 1000) 即100-999之间的值<br>
     *
     * @param length    几位数
     */
    protected int randomByLength2Int(int length) {
        int start = 0;
        if (length == 1) {
            return random(10);
        } else if (length > 1 && length < LIMIT_INT_LENGTH) {
            // 由于10^0 =1,所以单独处理
            start = (int) Math.pow(10, (length - 1));
        } else {
            throw new IllegalArgumentException("超过范围, length范围是[1,10)");
        }
        int end = (int) Math.pow(10, length);

        return random(start, end);
    }

    /**
     * 返回的几位数之间的值, length范围 [1, +∞) <br>
     * 如length=1,返回[0, 10) 即0-9之间的值<br>
     * 如length=2,返回[10, 100) 即10-99之间的值<br>
     * 如length=3,返回[100, 1000) 即100-999之间的值<br>
     *
     * @param length    几位数
     */
    protected String randomByLength2Str(int length) {
        String randomId = "";
        int restLength = 0;
        int limitLength = LIMIT_INT_LENGTH - 1;//最多9位
        if (length < 1) {
            throw new IllegalArgumentException("超过范围, length范围是[1,+∞)");
        } else if (length < LIMIT_INT_LENGTH) {
            restLength = length;
        } else {
            int count = length / limitLength;
            for (int i = 0; i < count; i++) {
                randomId = randomId + randomByLength2Int(limitLength);
            }
            //加上不满长度的部分
            restLength = length - count * limitLength;
        }
        if (restLength != 0) {
            randomId = randomId + randomByLength2Int(restLength);
        }

        return randomId;
    }

    /**
     * 返回的几位数的值, 位数不够则补零, length范围 [1,10) <br>
     * 如length=1,返回[0, 10) 即0-9之间的值<br>
     * 如length=2,返回[00, 100) 即00-99之间的值<br>
     * 如length=3,返回[000, 1000) 即000-999之间的值<br>
     *
     * @param length	几位数
     */
    protected String randomFillZeroHasLimit(int length) {
        if (length > 0 && length < LIMIT_INT_LENGTH) {
            int end = (int) Math.pow(10, length);
            int num = random(end);
            return StringUtil.fillLeftZero(num, length);
        } else {
            throw new IllegalArgumentException("超过范围, length范围是[1,10)");
        }
    }

    //觉得冗余可以调用StringUtil.fillZero
//	private static String fillZero(int num, int length) {
//		return String.format("%0" + length + "d", num);
//	}

}
