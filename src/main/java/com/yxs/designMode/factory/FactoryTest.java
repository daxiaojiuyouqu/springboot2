package com.yxs.designMode.factory;

public class FactoryTest {

    /**
     * 工厂方法模式
     */
    public static void main(String[] args) {
        Factory factory = new LzFactory();
        Noodles noodles = factory.create();
        noodles.desc();
    }
}
