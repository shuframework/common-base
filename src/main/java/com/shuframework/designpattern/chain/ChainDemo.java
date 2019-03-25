package com.shuframework.designpattern.chain;

/**
 * 责任链模式示例
 *
 * @author shuheng
 */
public class ChainDemo {

    //请假流程
    public static void main(String[] args) {

        String name = "小明";
        int days = 1;
        apply(name, days);
        System.out.println("-------------");
        int days2 = 3;
        apply(name, days2);
        System.out.println("-------------");
        int days3 = 5;
        apply(name, days3);
        System.out.println("-------------");
        int days4 = 8;
        apply(name, days4);
        System.out.println("-------------");
        int days5 = 12;
        apply(name, days5);
        System.out.println("-------------");
        int days6 = 31;
        apply(name, days6);
    }

    private static void apply(String name, int days) {
        String managerName = "";
        String msg = "%s: %s申请%s天, 已被审批！";
        if (days <= 2) {
            managerName = "组长";
        } else if (days <= 5) {
            managerName = "A经理";
        } else if (days <= 10) {
            managerName = "B经理";
        } else if (days <= 30) {
            managerName = "总经理";
        } else {
            //兼容参数
            msg = "%s%s申请%s天, 无人处理！";
        }

        System.out.println(String.format(msg, managerName, name, days));
    }

}
