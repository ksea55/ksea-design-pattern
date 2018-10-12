package org.ksea.pattern.abstractFactoryPattern;

/**
 * 男性工厂
 */
public class MaleHumanFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }
}
