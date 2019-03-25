package com.shuframework.designpattern.mediator.example1;

/**
 * 美国
 *
 * @author shuheng
 */
public class USA extends AbstractCountry {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

//    /**
//     * 申明
//     *
//     * @param message
//     */
//    public void declare(String message) {
//        mediator.declare(message, this);
//    }

    public void getMessage(String message) {
        System.out.println("美国获得对方信息: " + message);
    }

}
