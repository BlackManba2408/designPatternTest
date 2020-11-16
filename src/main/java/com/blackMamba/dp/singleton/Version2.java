package com.blackMamba.dp.singleton;

/**
 * Created by Black Mamba on 2020/9/2 7:18
 *
 * @version 1.0
 * @description
 *   和 Version1 是一个类型，因为：
 *      1、final修饰的变量要么直接初始化，要么在静态代码块中初始化
 */
public class Version2 {

    private static final Version2 instance ;

    static {
        instance = new Version2();
    }

    private Version2(){}

    public static Version2 getInstance(){
        return instance;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Version2 v1 = Version2.getInstance();
        Version2 v2 = Version2.getInstance();
        System.out.println(v1==v2);
    }
}
