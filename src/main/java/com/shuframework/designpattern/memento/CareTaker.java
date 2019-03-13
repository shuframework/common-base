package com.shuframework.designpattern.memento;

/**
 * @author shuheng
 */
public class OperateMemento {

    private BookInfoMemento memento;

    public BookInfoMemento getMemento() {
        return memento;
    }

    public void setMemento(BookInfoMemento memento) {
        this.memento = memento;
    }


}
