package com.blackMamba.dp.singleton;

/**
 * Created by Black Mamba on 2020/9/2 7:18
 *
 * @version 1.0
 * @description
 *   饿汉式，类加载到内存就只会创建一个实例
 *     JVM能保证其在多线程环境的单例性，因为：
 *       1、JVM能保证同一份字节码文件只会被load到内存一次（双亲委派模型）
 *       2、instance由static修饰，根据Class的加载的过程得知，在准备阶段JVM就会为静态变量分配内存，并设置默认的初始值
 *   优点：简单、推荐使用
 *   缺点：无论是否能用到该实例，当Class被load到内存都会创建instance（无伤大雅）
 */
public class Version1 {

    private static final Version1 instance = new Version1();

    private Version1(){}

    public static Version1 getInstance(){
        return instance;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Version1 v1 = Version1.getInstance();
        Version1 v2 = Version1.getInstance();
        System.out.println(v1==v2);
    }
}
