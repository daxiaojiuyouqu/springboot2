package com.yxs.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyFactory {

    public static Animal createDog() {
        final Animal dog = new Dog();
        final MyAspect aspect = new MyAspect();
        //生成代理对象
        Animal dogproxy = (Animal) Proxy.newProxyInstance(MyProxyFactory.class.getClassLoader(),
                dog.getClass().getInterfaces(), new InvocationHandler() {

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] arg2) throws Throwable {
                        aspect.before();
                        Object obj = method.invoke(dog, arg2);
                        aspect.after();
                        return obj;
                    }
                });
        return dogproxy;
    }

    public static void main(String[] args) {
        Animal dog = createDog();
        dog.eat();
    }
}
