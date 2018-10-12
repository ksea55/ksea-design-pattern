package org.ksea.pattern.abstractFactoryPattern;

/**
 * 黄色肤色的女性
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("女性");
    }
}
