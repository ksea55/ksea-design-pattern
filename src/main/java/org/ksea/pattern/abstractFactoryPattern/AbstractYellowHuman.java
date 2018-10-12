package org.ksea.pattern.abstractFactoryPattern;

/**
 * 黄种人的抽象类s
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色肤色的人种.");
    }

    @Override
    public void talk() {
        System.out.println("黄种人交流主要说Chinese.");
    }
}
