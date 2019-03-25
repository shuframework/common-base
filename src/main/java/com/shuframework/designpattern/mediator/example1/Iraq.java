package com.shuframework.designpattern.mediator.example1;

/**
 * 伊拉克
 *
 * @author shuheng
 */
public class Iraq extends AbstractCountry {

    public Iraq(UnitedNations mediator) {
        super(mediator, "iraq");
    }

    @Override
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息: " + message);
    }

}
