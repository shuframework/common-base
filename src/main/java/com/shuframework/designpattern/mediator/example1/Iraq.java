package com.shuframework.designpattern.mediator;

/**
 * 伊拉克
 *
 * @author shuheng
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    /**
     * 申明
     *
     * @param message
     */
    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息: " + message);
    }

}
