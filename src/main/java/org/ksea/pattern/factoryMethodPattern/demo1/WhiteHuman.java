package org.ksea.pattern.factoryMethodPattern.demo1;

/**
 * 白人的实现
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("获取到白色肤色的人种。");
    }

    @Override
    public void talk() {
        System.out.println("白色人种主要说 English。");
    }
}
