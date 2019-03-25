package com.shuframework.designpattern.mediator.example2;

/**
 * 伊拉克
 *
 * @author shuheng
 */
public class Iraq implements Country {

    String name = "iraq";
    private UnitedNations mediator;

    public Iraq(UnitedNations mediator) {
        this.mediator = mediator;
        mediator.register(name, this);
    }

    @Override
    public void declare(String message) {
        System.out.println("伊拉克申明信息: " + message);
        mediator.declare(name, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息: " + message);
    }

}
