package com.shuframework.designpattern.mediator.example3;

/**
 * 伊拉克
 *
 * @author shuheng
 */
public class Iraq extends AbstractCountry {
//    private String name = "iraq";

    public Iraq(UnitedNations mediator) {
        super(mediator, "iraq");
//        super(mediator, name); //直接使用不了

    }
//    public Iraq(UnitedNations mediator, String name) {
//        super(mediator, name);
//    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息: " + message);
    }

}
