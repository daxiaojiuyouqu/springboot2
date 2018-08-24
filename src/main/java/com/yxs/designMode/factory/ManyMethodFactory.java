package com.yxs.designMode.factory;

/**
 * 多方法工厂模式
 */
public class ManyMethodFactory {

    public static Noodles createLz() {
        return new LaoNooles();
    }

    public static Noodles createMen() {
        return new MenNooles();
    }

    public static Noodles createLao() {
        return new LaoNooles();
    }


    public static void main(String[] args) {
        Noodles noodles = createMen();
        noodles.desc();
    }
}
