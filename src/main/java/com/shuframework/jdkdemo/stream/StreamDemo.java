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

    @Test
    public void sum_stream_test() {
        bookInfoList = new ArrayList<>();
        double sum = bookInfoList.stream().mapToDouble(book -> book.getPrice()).sum();
        System.out.println(sum);
    }

}
