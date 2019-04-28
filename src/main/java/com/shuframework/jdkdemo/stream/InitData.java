package com.shuframework.jdkdemo.stream;

import com.shuframework.jdkdemo.testmodel.BookInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuheng
 */
public class InitData {

    public static List<BookInfo> initBookInfoList() {

        BookInfo book1 = new BookInfo(1, "java编程的逻辑", 50.0);
        BookInfo book2 = new BookInfo(2, "Java性能优化权威指南", 85.0);
        BookInfo book3 = new BookInfo(3, "深入理解Java虚拟机_JVM高级特性与最佳实践(第2版)", 105.0);
        BookInfo book4 = new BookInfo(3, "编程珠玑(第2版)", 50.0);
        BookInfo book5 = new BookInfo(3, "Effective Java中文版[第3版]", 85.0);

        List<BookInfo> bookInfoList = new ArrayList<>();
        bookInfoList.add(book1);
        bookInfoList.add(book2);
        bookInfoList.add(book3);
        bookInfoList.add(book4);
        bookInfoList.add(book5);

        return bookInfoList;
    }


}
