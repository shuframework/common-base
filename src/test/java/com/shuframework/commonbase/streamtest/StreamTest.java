package com.shuframework.commonbase.streamtest;

import com.shuframework.jdkdemo.testmodel.BookInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author shuheng
 */
public class StreamTest {

    @Test
    public void test(){

        BookInfo bookInfo = new BookInfo();
        bookInfo.setId(1);
        bookInfo.setName("aa");
        BookInfo bookInfo2 = new BookInfo();
        bookInfo2.setId(2);
        bookInfo2.setName("bb");

        List<BookInfo> list = new ArrayList<>();
        list.add(bookInfo);
        list.add(bookInfo2);
        System.out.println(list);

//        //并发修改异常：java.util.ConcurrentModificationException
//        for (BookInfo book : list){
//            if ("bb".equals(book.getName())){
//                list.remove(book);
//            }
//        }
        for (int i = 0, max = list.size(); i < max; i++) {
            BookInfo book = list.get(i);
            if ("bb".equals(book.getName())){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
