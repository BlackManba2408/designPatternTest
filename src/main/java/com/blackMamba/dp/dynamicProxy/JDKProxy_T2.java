package com.blackMamba.dp.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * Created by Black Mamba on 2020/11/16 22:07
 *
 * @version 1.0
 * @description
 */
public class JDKProxy_T2 {
    public static void main(String[] args) {
        NikeFactory_T2 nikeFactory_t2 = new NikeFactory_T2();
        // 保存生成的代理文件
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles",true);
        Clothe_T2 proxy = (Clothe_T2) Proxy.newProxyInstance(NikeFactory_T2.class.getClassLoader(),new Class[]{Clothe_T2.class},new MyInvocationHandler(nikeFactory_t2));
        proxy.makeClothes();
    }

}

class MyInvocationHandler implements InvocationHandler{

    NikeFactory_T2 nikeFatory;

    public MyInvocationHandler(NikeFactory_T2 _nikeFactory_t2){
        this.nikeFatory = _nikeFactory_t2;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("检查材料是否为原厂提供");
        Object result = method.invoke(nikeFatory,args);
        System.out.println("衣服生产完成");
        return result;
    }
}

interface Clothe_T2{
    void makeClothes();
}

class NikeFactory_T2 implements Clothe_T2{

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

