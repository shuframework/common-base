package com.shuframework.designpattern.strategy;

import org.junit.Test;

import java.math.BigDecimal;

public class StrategyClient {

    @Test
    public void test1(){
        BigDecimal money = new BigDecimal("200");
        //普通用户 不打折
        StrategyFactory.getRebateMoney(money, "1");
        //普通用户 打9折
        StrategyFactory.getRebateMoney(money, "0.9");
        //vip用户 打8折
        StrategyFactory.getRebateMoney(money, "0.8");

        //满100减50
        StrategyFactory.getReturnMoney(money, "100", "50");
        //满200减80
        StrategyFactory.getReturnMoney(money, "200", "80");
        //满300减100
        StrategyFactory.getReturnMoney(money, "300", "100");
    }

}
