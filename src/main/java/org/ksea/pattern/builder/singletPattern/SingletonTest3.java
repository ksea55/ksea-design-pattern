package org.ksea.pattern.builder.singletPattern;

import org.junit.Test;

/**
 * 单例模式-懒汉式
 */
public class SingletonTest3 {

    @Test
    public void test1() {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();

        System.out.println(instance == instance1); //这种情况下true

    }

    @Test
    public void test2() {
        //多线程下 我们可以看到其并未hashcode都一致
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton3 instance = Singleton3.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }


    }


}

//声明一个单例类，这种单例模式，在单线程下确实实现了起懒加载，但是在多线程下，是线程不安全的，会破坏其单例模式只实例化一次的原则，这种写法不推荐也不采用
class Singleton3 {

    //私有化构造函数
    private Singleton3() {
    }

    //声明一个实例变凉
    private static Singleton3 singleton;

    //对外提供访问
    public static Singleton3 getInstance() {
        //延迟加载，判定没有实例化的情况下在实例化
        if (null == singleton) {
            singleton = new Singleton3();
        }
        return singleton;
    }

}
