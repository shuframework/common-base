package com.shuframework.designpattern.strategy;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;

import java.math.BigDecimal;

/**
 * 策略模式的例子
 */
public class StrategyDemo {

    public static void main(String[] args) {
        //根据不同的情景来定策略
        String type = "正常收费";
        String money = "100";
        BigDecimal result = acceptMoney(type, money);
        System.out.println(result);
    }

    /**
     * 收钱
     * @param type
     * @param money
     * @return
     */
    private static BigDecimal acceptMoney(String type, String money) {
        BigDecimal result = BigDecimal.ZERO;
        //简单的优化就是将不同的实现算法抽象，提高复用
        if("正常收费".equals(type)){
            result = BigDecimalUtil.multiply(money, "1");
        }
//        if("打九折".equals(type)){
//            result = BigDecimalUtil.multiply(money, "0.9");
//        }
        if("打八折".equals(type)){
            result = BigDecimalUtil.multiply(money, "0.8");
        }
        if("满200减100".equals(type)){
            BigDecimal moneyLimit = new BigDecimal("200");
            BigDecimal moneyReturn = new BigDecimal("100");
            BigDecimal moneyBig = new BigDecimal(money);
            //简单实现只扣一次
            if (moneyBig.compareTo(moneyLimit) >= 0){
                result = moneyBig.subtract(moneyReturn);
            }
        }
        return result;
    }
}
