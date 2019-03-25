package com.shuframework.designpattern.mediator.example2;

/**
 * 美国
 *
 * @author shuheng
 */
public class USA implements Country {

    private String name = "usa";
    private UnitedNations mediator;

    public USA(UnitedNations mediator) {
        this.mediator = mediator;
        mediator.register(name, this);
    }

    @Override
    public void declare(String message) {
        System.out.println("美国申明信息: " + message);
        mediator.declare(name, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("美国获得对方信息: " + message);
    }

}
