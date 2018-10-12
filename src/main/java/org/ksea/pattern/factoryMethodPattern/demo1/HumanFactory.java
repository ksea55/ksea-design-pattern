package org.ksea.pattern.factoryMethodPattern.demo1;

/**
 * 造成工厂
 */
public interface HumanFactory {

    /**
     * 此处使用泛型
     *
     * @param clz 需要被创建的人
     * @param <T> 泛型 是Human的子类
     * @return
     */
    <T extends Human> T createHuman(Class<T> clz);
}
