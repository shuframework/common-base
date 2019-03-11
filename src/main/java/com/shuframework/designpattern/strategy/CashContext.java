package com.shuframework.designpattern.strategy;

import java.math.BigDecimal;

public class CashContext {

    private CashStrategy strategy;

    //这块可以根据注解+反射 来选择不同的策略实现类
    public CashContext(CashStrategy strategy){
        this.strategy = strategy;
    }

    //打印
    public void print(BigDecimal money){
        System.out.println(strategy.acceptCash(money));
    }
}
