package com.yxs.designMode.factory;

/**
 * 简单工厂模式
 */
public class NoolesFactory {

    public static final int TYPE_LZ = 1;

    public static final int TYPE_MEN = 2;

    public static final int TYPE_LAO = 3;

    public static Noodles createNooles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_MEN:
                return new MenNooles();
            case TYPE_LAO:
            default:
                return new LaoNooles();
        }
    }

    /**
     * 工厂模式:创建型设计模式，需要生成的对象叫做产品 ，生成对象的地方叫做工厂 。
     * 使用场景:在任何需要生成复杂对象的地方,都可以使用工厂方法模式
     * 一:
     * 简单工厂模式:
     * 1.特点
     * (1)它是一个具体的类，非接口 抽象类。有一个重要的create()方法，利用if或者 switch创建产品并返回。
     * (2)create()方法通常是静态的，所以也称之为静态工厂。
     * 2.优点:可以实现客户端和产品的解耦
     * 3.缺点:
     * (1)扩展性比较差,如果想增加一个产品,还需要修改工厂类方法
     * (2)不同的产品需要不同的额外参数的时候 不支持
     */
    public static void main(String[] args) {
        Noodles noodles = createNooles(TYPE_LAO);
        noodles.desc();
    }


}
