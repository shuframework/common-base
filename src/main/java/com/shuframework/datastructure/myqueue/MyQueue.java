package com.shuframework.datastructure.myqueue;

/**
 * 队列的常用功能
 *
 * @author shuheng
 */
public interface MyQueue<E> {

    /** 实际长度 */
    int size();

    /** 是否为空（list != null && list.size() > 0） */
    boolean isEmpty();

    /**
     * 是否包含
     * @param element
     */
    boolean contains(E element);

    /**
     * 添加
     * @param e
     */
    boolean add(E e);

    /** 获得第一个 */
    E peek();

    /** 取出(获得第一个并删除) */
    E poll();

}
