package com.blackMamba.dp.staticProxy;

import java.util.Random;

/**
 * Created by Black Mamba on 2020/11/16 20:11
 *
 * @version 1.0
 * @description
 */
public class Main {
    public static void main(String[] args) {
        // 创建业务类
        NikeFactory nikeFactory = new NikeFactory();
        // 创建代理类
        NikeProxyFactory proxy = new NikeProxyFactory(nikeFactory);
        // 执行代理权
        proxy.makeClothes();
    }
}

interface Clothe{
    void makeClothes();
}

class NikeFactory implements Clothe{
    @Override
    public void makeClothes() {
        System.out.println("生产NIKE的衣服");
    }
}

class NikeProxyFactory implements Clothe{
    NikeFactory nikeFactory ;

    public NikeProxyFactory(NikeFactory _nikeFactory){
        this.nikeFactory = _nikeFactory;
    }

    @Override
    public void makeClothes() {
        this.before();
        try{
            Thread.sleep(new Random().nextInt(1000));
            this.nikeFactory.makeClothes();
        }catch(Exception e){
            e.printStackTrace();
        }
        this.after();
    }

    private void before(){
        System.out.println("检查材料是否为NIKE原厂提供");
    }

    private void after(){
        System.out.println("衣服生产完成");
    }
}
