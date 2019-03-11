package com.shuframework.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 满减 策略
 */
public class ReturnStrategy implements CashStrategy {

    //满减金额
    private BigDecimal moneyLimit;
    //减多少
    private BigDecimal moneyReturn;

    public ReturnStrategy( BigDecimal moneyLimit, BigDecimal moneyReturn){
        this.moneyLimit = moneyLimit;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        //简单实现只扣一次
        if (money.compareTo(moneyLimit) >= 0){
            money = money.subtract(moneyReturn);
        }
        return money;
    }
}
