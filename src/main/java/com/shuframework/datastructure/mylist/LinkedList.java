package com.shuframework.datastructure.mylist;

import java.util.Collection;

/**
 * 双向链表
 * @author shuheng
 */
public class LinkedList<E> implements MyList {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object element) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
