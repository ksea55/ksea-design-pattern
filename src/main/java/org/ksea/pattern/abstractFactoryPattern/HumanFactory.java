package org.ksea.pattern.abstractFactoryPattern;

/**
 * 造人工厂
 */
public interface HumanFactory {

    Human createYellowHuman();//创建黄种人

    Human createWhiteHuman(); //创建白种人
}
