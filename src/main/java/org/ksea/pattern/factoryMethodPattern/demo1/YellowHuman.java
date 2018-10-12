package org.ksea.pattern.factoryMethodPattern.demo1;

/**
 * 黄色人种
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("获取到黄色皮肤的人。");
    }

    @Override
    public void talk() {
        System.out.println("黄色皮肤的人主要说Chinese");
    }
}
