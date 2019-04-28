package com.shuframework.jdkdemo.classloader;

/**
 * @author shuheng
 */
public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //defineClass

        return super.findClass(name);
    }

    public static void main(String[] args) {
        ClassLoader classLoader = MyClassLoader.class.getClassLoader();
        // 递归 查询父类类加载
        while (classLoader != null){
            System.out.println(classLoader.getClass().getCanonicalName());
            classLoader = classLoader.getParent();
//            //打印结果
//            sun.misc.Launcher.AppClassLoader
//            sun.misc.Launcher.ExtClassLoader
        }
        System.out.println("=====tr.jar======");
        //启动类加载器它负责加载Java的基础类，主要是java_home/lib/rt.jar，一般是c++实现的
        System.out.println(String.class.getClassLoader());
    }

}
