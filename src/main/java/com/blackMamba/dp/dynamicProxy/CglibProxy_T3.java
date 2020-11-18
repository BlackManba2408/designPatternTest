package com.blackMamba.dp.dynamicProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Black Mamba on 2020/11/16 22:51
 *
 * @version 1.0
 * @description
 */
public class CglibProxy_T3 {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(NikeFactory_T3.class);
        enhancer.setCallback(new MyInterceptor());
        NikeFactory_T3 nikeFactory_t3 = (NikeFactory_T3)enhancer.create();
        nikeFactory_t3.makeClothes();
    }
}

class MyInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("检查材料是否为原厂提供");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("衣服生产完成");
        return result;
    }
}

class NikeFactory_T3{
    public void makeClothes(){
        System.out.println("生产NIKE衣服");
    }
}

