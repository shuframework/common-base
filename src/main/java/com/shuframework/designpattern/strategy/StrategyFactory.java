package com.shuframework.designpattern.strategy;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 策略工厂 可以将这个移到CashContext 里面，这样可降低耦合度
 */
public class StrategyFactory {

    private StrategyFactory(){}

    public static void getRebateMoney(BigDecimal money, String rateStr) {
        RebateStrategy rebateStrategy = new RebateStrategy(new BigDecimal(rateStr));
        CashContext cashContext = new CashContext(rebateStrategy);
//        cashContext.print(rebateStrategy.acceptCash(money));//其实调用了2遍
        cashContext.print(money);
    }

    public static void getReturnMoney(BigDecimal money, String moneyLimitStr, String moneyReturnStr) {
        CashStrategy returnStrategy = new ReturnStrategy(new BigDecimal(moneyLimitStr), new BigDecimal(moneyReturnStr));
        CashContext cashContext = new CashContext(returnStrategy);
//        cashContext.print(returnStrategy.acceptCash(money));//其实调用了2遍
        cashContext.print(money);
    }

}
