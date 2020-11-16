package com.blackMamba.dp.singleton;

/**
 * Created by Black Mamba on 2020/9/3 8:10
 *
 * @version 1.0
 * @description
 *      基于Version4，优化效率问题，在Version4中synchronized锁定了整个方法
 *      思路：尽可能缩小锁范围，采用同步代码块的方式，
 *      但是，这种方法又要产生线程不安全的问题
 *          1、当第1个线程获得执行权进去同步代码块后，在没有初始化instance之前，
 *          2、第2个线程判断instance == null为true，也会进入if语句中，只是在synchronized前被阻塞，
 *          3、当第1个线程执行完，第2个线程获得cpu执行权后，进入同步代码块又会实例化instance
 *
 */
public class Version5 {
    private static Version5 instance;

    private Version5(){}

    public static Version5 getInstance(){
        if(null == instance){
            synchronized (Version5.class){

                instance = new Version5();
            }


        }
        return instance;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(Version5.getInstance().hashCode());
            }).start();
        }
    }
}
