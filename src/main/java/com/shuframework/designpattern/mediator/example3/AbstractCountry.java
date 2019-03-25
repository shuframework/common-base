package com.shuframework.designpattern.mediator.example1;

/**
 * 国家 抽象类
 *
 * @author shuheng
 */
public abstract class AbstractCountry {

    protected UnitedNations mediator;

    public AbstractCountry(UnitedNations mediator) {
        this.mediator = mediator;
    }

    /**
     * 申明
     *
     * @param message
     */
    public void declare(String message) {
        mediator.declare(message, this);
    }

}
