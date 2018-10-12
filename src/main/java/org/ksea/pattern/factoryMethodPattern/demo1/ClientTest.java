package org.ksea.pattern.factoryMethodPattern.demo1;

import org.junit.Test;

public class ClientTest {

    @Test
    public void client() {


        //造人工厂
        HumanFactory humanFactory = new HumanFactoryImpl();
        //创造黄种人
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);

        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
