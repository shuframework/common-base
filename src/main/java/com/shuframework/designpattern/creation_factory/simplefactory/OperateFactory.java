package com.shuframework.designpattern.creation_factory.simplefactory;

import com.shuframework.designpattern.creation_factory.cacl.AddOperate;
import com.shuframework.designpattern.creation_factory.cacl.DivideOperate;
import com.shuframework.designpattern.creation_factory.cacl.MultiplyOperate;
import com.shuframework.designpattern.creation_factory.cacl.OperateApi;
import com.shuframework.designpattern.creation_factory.cacl.OperateEnum;
import com.shuframework.designpattern.creation_factory.cacl.SubtractOperate;

/**
 * 简单工厂
 * @author shuheng
 */
public class OperateFactory {

    //拓展性较好，增加实现类即可，但是也暴露了之前算法的实现类
    // op改为枚举 可读性会高很多
    public static OperateApi getOperate(String op) {
        OperateApi operate = null;
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

    // 如果只有3种，第4种算法就在改方法加
    public static OperateApi getOperate(OperateEnum op) {
        OperateApi operate = null;
        if (OperateEnum.ADD.equals(op)) {
            operate = new AddOperate();
        }
        if (OperateEnum.SUBTRACT.equals(op)) {
            operate = new SubtractOperate();
        }
        if (OperateEnum.MULTIPLY.equals(op)) {
            operate = new MultiplyOperate();
        }
        if (OperateEnum.DIVIDE.equals(op)) {
            operate = new DivideOperate();
        }
        return operate;
    }

}
