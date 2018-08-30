package com.yxs.aop;

public class Dog implements Animal {
    @Override
    public void run() {
        System.out.println("跑");
    }

    @Override
    public void eat() {
        System.out.println("吃");
    }
}
