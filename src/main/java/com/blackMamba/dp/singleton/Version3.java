package com.blackMamba.dp.singleton;

/**
 * Created by Black Mamba on 2020/9/2 8:06
 *
 * @version 1.0
 * @description
 *      懒汉式，但是有一个严重的问题--线程不安全 因为：
 *          1、当第一个线程进来时，instance == null
 *          2、当第二个线程进来时，第一个线程的还没来得及初始化，判断instance == null，就又会实例化一个instance
 *
 */
public class Version3 {
    private static Version3 instance;

    private Version3(){};

    public static Version3 getInstance(){
        if(null == instance){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Version3();
        }
        return instance;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Version3.getInstance().hashCode());
            }).start();
        }
    }



}
