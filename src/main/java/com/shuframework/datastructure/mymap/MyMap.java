package com.shuframework.datastructure.mymap;

import java.util.Collection;
import java.util.Set;

/**
 * 哈希表的常用功能
 *
 * @author shuheng
 */
public interface MyMap<K, V> {

    /**
     * 实际长度
     */
    int size();

    /**
     * 是否为空（list != null && list.size() > 0）
     */
    boolean isEmpty();

    /**
     * 是否包含key
     *
     * @param key
     */
    boolean containsKey(K key);

    /**
     * 是否包含value
     *
     * @param value
     */
    boolean containsValue(V value);

    /**
     * 新增，key相同时算是修改
     *
     * @param key
     * @param value
     */
    V put(K key, V value);

//    /**
//     * 替换（修改底层就是put）
//     * @param key
//     * @param value
//     */
//    V replace(K key, V value);

    /**
     * 获得
     *
     * @param key
     */
    V get(K key);

    /**
     * 移除
     *
     * @param key
     */
    V remove(K key);

    /**
     * 清空
     * 元素为null size=0
     */
    void clear();

    /**
     * key的集合
     */
    Set<K> keySet();

    /**
     * value的集合
     */
    Collection<V> values();

//    //暂时不加
//    Set<Map.Entry<K, V>> entrySet();

}
