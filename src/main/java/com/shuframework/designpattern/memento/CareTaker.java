package com.shuframework.designpattern.memento;

/**
 * 负责管理备忘录对象
 * @author shuheng
 */
public class CareTaker {

    //由于存在多次存档，所以这里会进行管理

    private BookInfoMemento memento;

    public BookInfoMemento getMemento() {
        return memento;
    }

    public void setMemento(BookInfoMemento memento) {
        this.memento = memento;
    }


}
