package com.shuframework.designpattern.creation_builder.example1;

import org.junit.Test;

/**
 * @author shuheng
 */
public class BuilderClient {

    @Test
    public void test() {
        PersonBuild builderA = new APersonBuilder();
        Director director1 = new Director(builderA);
        director1.init("北京","天津","北京");
        System.out.println("==========");
        PersonBuild builderB = new BPersonBuilder();
        Director director2 = new Director(builderB);
        director2.init("上海","南京","上海");
    }
}
