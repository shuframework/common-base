package com.shuframework.designpattern.template;

import org.junit.Test;

public class PapersClient {

    @Test
    public void test(){
        Papers stu1 = new Stu1Answer();
        stu1.showPapers();
    }
    @Test
    public void test2(){
        Papers stu2 = new Stu2Answer();
        stu2.showPapers();
    }

}
