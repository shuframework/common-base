package com.shuframework.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 打折策略
 */
public class RebateStrategy implements CashStrategy {

    //折扣
    private BigDecimal rate;

    public RebateStrategy(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money.multiply(rate);
    }
}
