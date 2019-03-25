package com.shuframework.designpattern.chain;

import org.junit.Test;

/**
 * @author shuheng
 */
public class ChainClient {

    @Test
    public void test() {
        GroupLeader group = new GroupLeader("小组长");
        ManagerA managerA = new ManagerA("A经理");
        ManagerB managerB = new ManagerB("B经理");
        GeneralManager generalManager = new GeneralManager("总经理");

        //配置 审批人顺序
        group.setNextLeader(managerA);
        managerA.setNextLeader(managerB);
        managerB.setNextLeader(generalManager);

        //开始请假操作
        LeaveRequest req1 = new LeaveRequest("小明", 2, "调休！");
        //都是从第一个处理人开始，处理不了就好往后抛
        group.handleRequest(req1);

        LeaveRequest req2 = new LeaveRequest("小明", 5, "休年假去旅游！");
        group.handleRequest(req2);

        LeaveRequest req3 = new LeaveRequest("小明", 10, "陪产假！");
        group.handleRequest(req3);

        LeaveRequest req4 = new LeaveRequest("小明", 15, "陪产假！");
        group.handleRequest(req4);

        LeaveRequest req5 = new LeaveRequest("小明", 31, "请超长假！");
        group.handleRequest(req5);
    }

}
