package com.shuframework.commonbase.util.io;

import com.shuframework.commonbase.exception.UtilException;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 读取配置文件
 *
 * @author shuheng
 */
public class PropertiesUtil {

    private static Properties p = new Properties();

    /**
     * 获得key对应的值
     *
     * @param filePath
     * @param key
     */
    public static String getProperty(String filePath, String key){
        Properties p = PropertiesUtil.load(filePath);
        String val = p.getProperty(key);
        return val;
    }

    /**
     * 获得keys对应的值 转成map
     *
     * @param filePath
     * @param keys
     */
    public static Map<String, String> toMap(String filePath, String... keys){
        Properties p = PropertiesUtil.load(filePath);
        Map<String, String> returnMap = new HashMap<>();
        for (String key : keys) {
            String val = p.getProperty(key);
            returnMap.put(key, val);
        }
        return returnMap;
    }

    /**
     * 加载文件
     * @param filePath
     */
    public static Properties load(String filePath) {
        InputStream inputStream = PropertiesUtil.class.getResourceAsStream(filePath);
        try {
            p.load(inputStream);
        } catch (IOException e) {
            new UtilException("配置文件加载异常：" + e.getMessage());
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                new UtilException("配置文件关闭异常：" + e.getMessage());
            }
        }
        return p;
    }

//    // 将异常往上抛
//    public static Properties load(String filePath) throws IOException {
//        InputStream inputStream = PropertiesUtil.class.getResourceAsStream(filePath);
//        Properties p = new Properties();
//        try {
//            p.load(inputStream);
//        }finally {
//            inputStream.close();
//        }
//        return p;
//    }

}
