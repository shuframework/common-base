package com.shuframework.commonbase.util.io;

import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

/**
 * @author shuheng
 */
public class PropertiesUtilTest {

    @Test
    public void load() {
        String filePath = "/config/db.properties";
        Properties p = PropertiesUtil.load(filePath);
        String url = p.getProperty("jdbc.url");
        String username = p.getProperty("jdbc.username");
        System.out.println(url);
        System.out.println(username);
    }

    @Test
    public void getProperty() {
        String filePath1 = "/config/db.properties";
        String filePath2 = "/config/db2.properties";
//        Properties p = PropertiesUtil.load(filePath);
        String url = PropertiesUtil.getProperty(filePath1, "jdbc.url");
        String url2 = PropertiesUtil.getProperty(filePath2,"jdbc.url");
        System.out.println(url);
        System.out.println(url2);
    }


}