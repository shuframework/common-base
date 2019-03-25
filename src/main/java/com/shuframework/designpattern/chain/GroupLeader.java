package com.shuframework.designpattern.chain;

/**
 * 小组长审核
 * @author shuheng
 */
public class GroupLeader extends Leader {

    public GroupLeader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() <= 2) {
            String msg = "员工: %s 请假, 天数: %s, 理由: %s";
            System.out.println(String.format(msg, request.getEmpName(), request.getLeaveDays(), request.getReason()));
            System.out.println("经理：" + this.name + ",审批通过！");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
