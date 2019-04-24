package com.shuframework.arithmetic.maths;

import com.shuframework.commonbase.util.lang.BigDecimalUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Random;

/**
 * 抢红包算法
 * 随机金额可以是小数，最小0.01
 * https://www.cnblogs.com/EasonDongH/p/8997031.html
 *
 * @author shuheng
 */
public class RandomRedPacket {

    /**
     * 剩余金额
     */
    private BigDecimal leftMoney;
    /**
     * 剩余数量
     */
    private int leftNum;
    /**
     * 最小金额
     */
    private BigDecimal minMoney = new BigDecimal("0.01");

    private Random random;


    public RandomRedPacket(int total, int num) {
        this.leftMoney = BigDecimal.valueOf(total);
        this.leftNum = num;
        this.random = new Random();
    }

    // 2倍均值 算法

    /**
     * 10元发10个
     * 10/10*2=2    [0, 2)  1.2
     * 8.8/9*2=2    [0, 2)
     *
     * @return
     */
    public double nextMoney() {
        if (this.leftNum <= 0) {
            throw new IllegalStateException("抢光了");
        }
        if (this.leftNum == 1) {
            return this.leftMoney.doubleValue();
        }
        //随机最大值 leftMoney/leftNum * 2
        BigDecimal max = BigDecimalUtil.divide(this.leftMoney, String.valueOf(this.leftNum), 2).multiply(BigDecimal.valueOf(2));
        double weightNum = random.nextDouble();
        // 保留2位小数
        BigDecimal money = BigDecimalUtil.round(BigDecimalUtil.multiply(max, String.valueOf(weightNum)), 2);
        //可能有极端情况，最小值给0.01
        if (BigDecimalUtil.compare(minMoney, money)) {
            money = minMoney;
        }
        this.leftMoney = this.leftMoney.subtract(money);
        this.leftNum--;
        return money.doubleValue();
    }

}
