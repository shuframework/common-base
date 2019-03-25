package com.shuframework.designpattern.mediator.example3;

/**
 * 国家 抽象类
 *
 * @author shuheng
 */
public abstract class AbstractCountry {

    protected String name;
    protected UnitedNations mediator;

    public AbstractCountry(UnitedNations mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        //name 也需要重新赋值，不然是null
        mediator.register(name, this);
    }

    /**
     * 申明
     *
     * @param message
     */
    public void declare(String message) {
        mediator.declare(name, message);
    }

    public abstract void getMessage(String message);

}
