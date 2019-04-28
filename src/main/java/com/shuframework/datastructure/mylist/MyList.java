package com.shuframework.datastructure.mylist;

import java.util.Collection;

/**
 * list 常用功能 没有加遍历
 *
 * @author shuheng
 */
public interface MyList<E> {

    /** 实际长度 */
    int size();

    /** 是否为空（list != null && list.size() > 0） */
    boolean isEmpty();

    /**
     * 是否包含
     * @param element
     */
    boolean contains(E element);
//    boolean containsAll(Collection<?> c);

    E[] toArray();
//    <T> T[] toArray(T[] a);

    /**
     * 添加元素
     * @param element
     */
    boolean add(E element);

    /**
     * 获取元素
     * @param index
     */
    E get(int index);

    /**
     * 修改元素
     * @param index
     */
    E set(int index, E element);

    /**
     * 移除元素
     * @param element
     */
    boolean remove(E element);

    /**
     * 移除元素
     * @param index
     */
    boolean remove(int index);

    boolean addAll(Collection<? extends E> c);

    /**
     * removeAll与retainAll相似，都通过取当前列表与传入Collection交集来实现，
     * 当前列表不一定含有传入的Collection的所有元素，传入的Collection中可能包含一些当前列表中没有的元素，
     * 则移除交集的部分
     */
    boolean removeAll(Collection<? extends E> c);

    boolean retainAll(Collection<? extends E> c);

    /**
     * 清空
     * 元素为null size=0
     */
    void clear();

    /**
     * 是否已满, 满了返回true
     * @return
     */
    boolean isFull();
//    // 涉及到具体的对象 所以不适合默认实现
//    default boolean isFull() {
//        return size == elementData.length;
//    }

    /**
     * 检查index 是否合法
     * @param index
     * @param length 固定数组的length
     */
    default void rangeCheck(int index, int length) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
    }
}
