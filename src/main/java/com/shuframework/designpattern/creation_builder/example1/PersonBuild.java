package com.shuframework.designpattern.creation_builder.example1;

public interface PersonBuild {

    /**头*/
    void buildHead(String head);
//
//    /**眼睛*/
//    void buildEye(String eye);
//
//    /**脸*/
//    void buildFace(String face);

    /**身体*/
    void buildBody(String body);

    /**脚*/
    void buildFoot(String foot);

}
