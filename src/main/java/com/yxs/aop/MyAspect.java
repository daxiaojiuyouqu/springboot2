package com.yxs.aop;

public class MyAspect {

    public void before() {
        System.out.println("主人发出命令");
    }

    public void after() {
        System.out.println("主人给予奖励");
    }
}
