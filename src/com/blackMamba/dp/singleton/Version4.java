package com.blackMamba.dp.singleton;

/**
 * Created by Black Mamba on 2020/9/3 8:00
 *
 * @version 1.0
 * @description
 *      在Version3的基础上，使用synchronized加锁，使得线程安全
 *      但是，一旦添加锁，就意味着多线程要串行化.会带来效率问题
 */
public class Version4 {
    private static Version4 instance;

    private Version4(){}

    public synchronized static Version4 getInstance(){
        if(null == instance){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Version4();
        }
        return instance;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(Version4.getInstance().hashCode());
            }).start();
        }
    }
}
