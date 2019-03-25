package com.shuframework.designpattern.chain;

/**
 * 总经理审核 多了终止操作
 * @author shuheng
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 30) {
            String msg = "员工: %s 请假, 天数: %s, 理由: %s";
            System.out.println(String.format(msg, request.getEmpName(), request.getLeaveDays(), request.getReason()));
            System.out.println("总经理：" + this.name + ",审批通过！");
        } else {
            //最上层进行终止处理
            System.out.println("莫非" + request.getEmpName() + "想辞职，居然请假" + request.getLeaveDays() + "天！");
        }
    }
}
