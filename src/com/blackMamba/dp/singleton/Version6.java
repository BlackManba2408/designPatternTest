package com.blackMamba.dp.singleton;

/**
 * Created by Black Mamba on 2020/9/3 8:10
 *
 * @version 1.0
 * @description
 *      基于Version5，解决了Version5中的线程不安全问题
 *      思路：使用双重判断，避免阻塞的线程获取到执行权之后，再次创建实例对象
 *      使用volatile修饰的原因：可以规避一个很常见的问题 -- 半个对象
 *          1、了解JVM加载过程的知道static修饰的instance，
 *              1.1、在类加载的准备阶段，就会为instance分配地址空间并赋予默认值
 *              1.2、在类加载的解析阶段，才会为其初始化
 *          2、所以在1.1时，instance == null 已经是false了
 */
public class Version6 {
    private static volatile Version6 instance;

    static int a = 3;

    private Version6(){}

    public static Version6 getInstance(){
        if(null == instance){
            synchronized (Version6.class){
                if(null == instance){
                    instance = new Version6();
                }
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
                System.out.println(Version6.getInstance().hashCode());
            }).start();
        }
    }
}
