package com.shuframework.designpattern.creation_factory.simplefactory.example_cacl;

/**
 * @author shuheng
 */
public class OperateFactory {

    //拓展性较好，增加实现类即可，但是也暴露了之前算法的实现类
    public static Operate getOperate(String op) {
        Operate operate = null;
        if ("+".equals(op)) {
            operate = new AddOperate();
        }
        if ("-".equals(op)) {
            operate = new SubtractOperate();
        }
        if ("*".equals(op)) {
            operate = new MultiplyOperate();
        }
        if ("/".equals(op)) {
            operate = new DivideOperate();
        }
        return operate;
    }

}
