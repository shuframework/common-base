package com.shuframework.designpattern.memento;

import com.shuframework.commonbase.util.lang.DateUtil;
import org.junit.Test;

import java.util.Date;

/**
 * @author shuheng
 */
public class MementoClient {

    @Test
    public void test() {
        CareTaker taker = new CareTaker();

        BookInfo bookInfo = new BookInfo(1, "java", 50.5, new Date(), "30%");
        System.out.println("第一次打印对象：" + bookInfo);

        taker.setMemento(bookInfo.memento());   //备忘一次

        bookInfo.setCreateTime(DateUtil.addDay(new Date(), 1));
        bookInfo.setProgress("60%");
        System.out.println("第二次打印对象：" + bookInfo);

        bookInfo.recovery(taker.getMemento()); //恢复到备忘录对象保存的状态

        System.out.println("第三次打印对象：" + bookInfo);
    }

}
