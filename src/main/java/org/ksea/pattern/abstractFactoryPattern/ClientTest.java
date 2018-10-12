package org.ksea.pattern.abstractFactoryPattern;

import org.junit.Test;

public class ClientTest {
    @Test
    public void test() {

        //女性工厂
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        //男性工厂
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        //创建黄色女性
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        //创建黄色男性
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();


        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();

        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

    }
}
