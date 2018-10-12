package org.ksea.pattern.factoryMethodPattern.demo1;

/**
 * 黑色皮肤的人
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("获取到黑色皮肤的人种。");
    }

    @Override
    public void talk() {
        System.out.println("黑色皮肤的人主要说 火星语言。");
    }
}
