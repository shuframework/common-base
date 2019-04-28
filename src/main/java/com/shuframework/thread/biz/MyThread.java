package com.shuframework.thread.biz;

/**
 * @author shuheng
 */
public class MyThread extends Thread {

    public MyThread(){

    }
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("currentThread:"+Thread.currentThread().getName());
		System.out.println("this:"+this.getName());
        System.out.println("hello world");
    }

}
