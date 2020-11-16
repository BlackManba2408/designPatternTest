package com.blackMamba.dp.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * Created by Black Mamba on 2020/11/16 20:28
 *
 * @version 1.0
 * @description
 */
public class JDKProxy_T1 {

    public static void main(String[] args) {
        NikeFactory_T1 nikeFactory_T1 = new NikeFactory_T1();

        Clothe_T1 proxy = (Clothe_T1) Proxy.newProxyInstance(NikeFactory_T1.class.getClassLoader(), new Class[]{Clothe_T1.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("检查材料是否为原厂提供");
                Object result = method.invoke(nikeFactory_T1,args);
                System.out.println("衣服生产完成");
                return result;
            }
        });
        proxy.makeClothes();
    }
}

interface Clothe_T1{
    void makeClothes();
}

class NikeFactory_T1 implements Clothe_T1{

    @Override
    public void makeClothes() {
        System.out.println("生产NIKE的衣服");
        try{
            Thread.sleep(new Random().nextInt(1000));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

