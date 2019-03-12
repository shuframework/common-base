package com.shuframework.designpattern.observerbyjdk;

import org.junit.Test;

/**
 * @author shuheng
 */
public class ObserverClient {

    @Test
    public void test(){
        //目标对象（通知者）
        ConcreteSubject subject = new ConcreteSubject();
        //创建多个观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        //移除3 即不通知它
        subject.deleteObserver(observer3);

        //改变subject的状态
        subject.setState(10);
//        //在具体的通知者里面已经调用过了，这里可以不用再次调用了
//        //表示目标对象已经做了更改
//        subject.setChanged();
//        //主题对象(目标对象)值发生了变化，请通知所有的观察者
//        subject.notifyObservers();
    }

}
