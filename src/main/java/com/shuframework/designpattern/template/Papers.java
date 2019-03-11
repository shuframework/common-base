package com.shuframework.designpattern.template;

/**
 * 试卷（报纸）
 */
public abstract class Papers {

    //试卷
    public void showPapers(){
        question1();
        question2();
        question3();
    }

    public void question1(){
        System.out.println("问题1：问题1");
        System.out.println("答案1："+answer1());
    }

    public void question2(){
        System.out.println("问题2：问题2");
        System.out.println("答案2："+answer2());
    }

    public void question3(){
        System.out.println("问题3：问题3");
        System.out.println("答案3："+answer3());
    }

    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();

}
