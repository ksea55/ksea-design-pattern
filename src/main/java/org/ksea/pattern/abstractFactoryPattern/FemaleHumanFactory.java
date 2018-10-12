package org.ksea.pattern.abstractFactoryPattern;

/**
 * 女性工厂
 */
public class FemaleHumanFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }
}
