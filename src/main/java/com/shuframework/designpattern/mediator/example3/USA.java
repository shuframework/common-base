package com.shuframework.designpattern.mediator.example3;

/**
 * 美国
 *
 * @author shuheng
 */
public class USA extends AbstractCountry {
//    String name = "usa";

    public USA(UnitedNations mediator) {
        super(mediator, "usa");
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方信息: " + message);
    }

}
