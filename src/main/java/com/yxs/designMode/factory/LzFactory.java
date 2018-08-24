package com.yxs.designMode.factory;

public class LzFactory extends Factory {

    @Override
    public Noodles create() {
        return new LzNoodles();
    }
}
