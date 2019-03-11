package com.shuframework.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 策略
 */
public interface CashStrategy {

    //收钱
    BigDecimal acceptCash(BigDecimal money);
}
