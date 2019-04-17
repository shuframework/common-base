package com.shuframework.jdkdemo.exception;

/**
 * 自定义异常
 *
 * @author shuheng
 */
public class MyException extends RuntimeException {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

}
