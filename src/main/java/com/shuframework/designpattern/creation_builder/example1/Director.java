package com.shuframework.designpattern.creation_builder.example1;

/**
 * 指导者
 * 如果步骤比较简单，这个类可以简化掉，直接在客户端进行处理
 *
 * @author shuheng
 */
public class Director {

    private PersonBuild builder;

    public Director(PersonBuild builder) {
        this.builder = builder;
    }

    /**
     * 指导构建过程(整体的构建算法)
     *
     * @param head
     * @param body
     * @param foot
     */
    public void init(String head, String body, String foot) {
        // 实际过程中，这里的指导过程可能会很复杂
        builder.buildHead(head);
        builder.buildBody(body);
        builder.buildFoot(foot);
    }
}
