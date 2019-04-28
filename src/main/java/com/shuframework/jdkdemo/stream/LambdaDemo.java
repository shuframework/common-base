package com.shuframework.jdkdemo.stream;

import com.shuframework.jdkdemo.testmodel.BookInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * list的 filter和map示例 其实在Stream Api里面已经提供了
 *
 * @author shuheng
 */
public class LambdaDemo {

    List<BookInfo> bookInfoList;

    @Before
    public void init() {
        bookInfoList = InitData.initBookInfoList();
    }

    @Test
    public void sort_lambda_test() {
        //价格 升序
//        bookInfoList.sort(Comparator.comparing(book -> book.getPrice()));
//        //价格 升序
//        bookInfoList.sort(Comparator.comparing(BookInfo::getPrice));
        //价格 倒序
        bookInfoList.sort(Comparator.comparing(BookInfo::getPrice).reversed());
//        //多个条件 倒序
//        bookInfoList.sort(Comparator.comparing(BookInfo::getPrice).reversed()
//                .thenComparing(Comparator.comparing(BookInfo::getId).reversed())
//        );
        System.out.println(bookInfoList);
        System.out.println("==========");

//        List<Integer> returnList2 = map(bookInfoList, book -> book.getId());
//        System.out.println(returnList2);
    }


    @Test
    public void filter_test() {
        List<BookInfo> returnList = new ArrayList<>();
        for (BookInfo bookInfo : bookInfoList) {
            //查询 价格 小于100的书籍
            //假设需要查询 书名字数或 书籍发布时间，只需改这个判断
            if (bookInfo.getPrice() < 100) {
                returnList.add(bookInfo);
            }
        }
        System.out.println(returnList);
    }
    @Test
    public void filter_lambda_test() {
        List<BookInfo> returnList1 = filter(bookInfoList, book -> book.getPrice() < 100);
        System.out.println(returnList1);
        System.out.println("==========");

        List<BookInfo> returnList2 = filter(bookInfoList, book -> book.getName().length() <= 10);
        System.out.println(returnList2);
    }

    @Test
    public void filter_stream_test() {
        List<BookInfo> returnList1 = bookInfoList.stream().filter(book -> book.getPrice() < 100)
                .collect(Collectors.toList());
        System.out.println(returnList1);
        System.out.println("==========");

        List<BookInfo> returnList2 = bookInfoList.stream().filter(book -> book.getName().length() <= 10)
                .collect(Collectors.toList());
        System.out.println(returnList2);
    }


    @Test
    public void map_test() {
        List<String> returnList = new ArrayList<>();
        for (BookInfo bookInfo : bookInfoList) {
            //获得所有书籍名称
            //假设需要书名id，只需改这里
            returnList.add(bookInfo.getName());
        }
        System.out.println(returnList);
    }
    @Test
    public void map_lambda_test() {
        List<String> returnList1 = map(bookInfoList, book -> book.getName());
        System.out.println(returnList1);
        System.out.println("==========");

        List<Integer> returnList2 = map(bookInfoList, book -> book.getId());
        System.out.println(returnList2);
    }


    //过滤
    public <E> List<E> filter(List<E> list, Predicate<E> predicate) {
        List<E> returnList = new ArrayList<>();
        for (E e : list) {
            if (predicate.test(e)) {
                returnList.add(e);
            }
        }
        return returnList;
    }

    //转换
    public <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> returnList = new ArrayList<>();
        for (T t : list) {
            returnList.add(function.apply(t));
        }
        return returnList;
    }

}
