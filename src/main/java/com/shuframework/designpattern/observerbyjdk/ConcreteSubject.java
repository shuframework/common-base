package com.shuframework.designpattern.observerbyjdk;

import java.util.Observable;

/**
 * 具体通知者，其内部状态改变时，给所有登记过的观察者发出通知
 */
public class ConcreteSubject extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //表示目标对象已经做了更改
        setChanged();
        //主题对象(目标对象)值发生了变化，请通知所有的观察者
        this.notifyObservers();
    }

}
