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
public class StreamDemo {

    List<BookInfo> bookInfoList;

    @Before
    public void init() {
        bookInfoList = InitData.initBookInfoList();
    }

    @Test
    public void max_stream_test() {
        // 价格最高的一本书
        BookInfo bookInfo = bookInfoList.stream()
                .max(Comparator.comparing(BookInfo::getPrice))
                .get();
        System.out.println(bookInfo);
        System.out.println("==========");
        // 价格最高的一本书
        BookInfo bookInfo2 = bookInfoList.stream()
                .max(Comparator.comparing(BookInfo::getPrice).reversed())
                .get();
        System.out.println(bookInfo2);
        System.out.println("==========");
    }

//    com.shuframework.jdkdemo.stream.LambdaDemo.filter_lambda_test
//    @Test
//    public void filter_stream_test() {
//        List<BookInfo> returnList1 = bookInfoList.stream().filter(book -> book.getPrice() < 100)
//                .collect(Collectors.toList());
//        System.out.println(returnList1);
//        System.out.println("==========");
//
//        List<BookInfo> returnList2 = bookInfoList.stream().filter(book -> book.getName().length() <= 10)
//                .collect(Collectors.toList());
//        System.out.println(returnList2);
//    }

}
