package org.ksea.pattern.abstractFactoryPattern;

/**
 * 白色肤色人种的抽象类
 */
public abstract class AbstratWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白色肤色的人种.");
    }

    @Override
    public void talk() {
        System.out.println("白色人种主要说English.");
    }
}
