package com.shuframework.datastructure.mymap;

import java.util.Collection;
import java.util.Set;

/**
 * 自己实现的HashMap, 底层只是数组里面放拉链表, 没加红黑树,
 * jdk8 多了红黑树，同一index的链表元素有8个以上时会变成红黑树
 *
 * @author shuheng
 *
 */
public class HashMap<K, V> implements MyMap<K, V> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }
}
