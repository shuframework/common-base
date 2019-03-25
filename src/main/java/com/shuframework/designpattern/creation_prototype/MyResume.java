package com.shuframework.designpattern.creation_prototype;

import java.util.Date;

/**
 * 个人简历
 */
public class MyResume implements Cloneable {

    /** 姓名 */
    private String name;
//    /** 年龄 */
//    private String age;
    /** 出生日期 */
    private Date birthday;
    /** 性别 */
    private String sex;
    /** 工作年限 */
    private String timeArea;
    /** 公司 */
    private String company;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 直接调用object对象的clone()方法！（浅克隆）
        // 深克隆 建议采用io流的对象读写来实现
        return super.clone();
    }

    public MyResume(String name, Date birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public void setWork(String timeArea, String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    @Override
    public String toString() {
        return "MyResume{" +
                "name='" + name + '\'' +
//                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
