package com.shuframework.designpattern.observer;

/**
 * 具体观察者，本身的状态与通知者的状态相协调
 */
public class ConcreteObserver implements MyObserver {

    private int myState;   //myState需要跟目标对象的state值保持一致！

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).getState();
        System.out.println("状态改变为"+ myState);
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

}