package com.blackMamba.dp.singleton;

import java.io.Serializable;

/**
 * Created by Black Mamba on 2020/9/4 7:55
 *
 * @version 1.0
 * @description
 *      1、使用静态内部类方式，创建实例对象
 */
public class Version7 {

    private Version7(){}

    private static class InstanceFactory {
        private static Version7 instance = new Version7();
    }

    public static Version7 getInstance(){
        return InstanceFactory.instance;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Version7.getInstance().hashCode());
            }).start();
        }
    }
}
