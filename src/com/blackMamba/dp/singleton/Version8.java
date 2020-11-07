package com.blackMamba.dp.singleton;

/**
 * Created by Black Mamba on 2020/9/4 8:11
 *
 * @version 1.0
 * @description
 *      1、枚举形式创建单例对象
 */
public enum Version8 {

    instance;

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Version8.instance.hashCode());
            }).start();
        }
    }
}
