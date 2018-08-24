package com.yxs.designMode.factory;

public class LaoFactory extends Factory {
    @Override
    public Noodles create() {
        return new LaoNooles();
    }
}
