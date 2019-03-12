package com.shuframework.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者（或主题） 如果有多个则将其方法抽象到 抽象类（如果里面还有状态或其他属性）或接口
 * 其实jdk已经提供了该接口 java.util.Observable
 *
 * @author shuheng
 */
public class Subject {

    protected List<MyObserver> list = new ArrayList<MyObserver>();

    // 添加观察者
    public void addObserver(MyObserver obs) {
        if (!list.contains(obs)){
            list.add(obs);
        }
    }

    // 移除观察者
    public void removeObserver(MyObserver obs) {
        list.remove(obs);
    }

    //通知所有的观察者更新状态
    public void notifyAllObservers() {
        for (MyObserver obs : list) {
            obs.update(this);
        }
    }
}
