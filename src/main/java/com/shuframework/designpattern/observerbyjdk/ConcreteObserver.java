package com.shuframework.designpattern.observerbyjdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者，本身的状态与通知者的状态相协调
 */
public class ConcreteObserver implements Observer {

    private int myState;   //myState需要跟目标对象的state值保持一致！

    @Override
    public void update(Observable obj, Object arg) {
        myState = ((ConcreteSubject) obj).getState();
        System.out.println("状态改变为" + myState);
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

}