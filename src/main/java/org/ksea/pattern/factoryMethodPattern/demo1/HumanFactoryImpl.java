package org.ksea.pattern.factoryMethodPattern.demo1;

/**
 * 工厂方法的实现
 */
public class HumanFactoryImpl implements HumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> clz) {

        try {
            return (T) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return null;
    }
}
