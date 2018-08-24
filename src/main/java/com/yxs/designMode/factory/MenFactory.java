package com.yxs.designMode.factory;

public class MenFactory extends Factory {
    @Override
    public Noodles create() {
        return new MenNooles();
    }
}
