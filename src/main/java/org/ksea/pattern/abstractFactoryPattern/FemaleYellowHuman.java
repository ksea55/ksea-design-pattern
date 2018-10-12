package org.ksea.pattern.abstractFactoryPattern;

/**
 * 创建黄色肤色的男性
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("男性");
    }
}
