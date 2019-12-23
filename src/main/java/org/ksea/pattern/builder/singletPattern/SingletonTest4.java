package org.ksea.pattern.builder.singletPattern;

import org.junit.Test;

/**
 * 单例模式-懒汉式
 */
public class SingletonTest4 {

    @Test
    public void test1() {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();

        System.out.println(instance == instance1); //这种情况下true

    }

    @Test
    public void test2() {
        //多线程下 我们可以看到其并未hashcode都一致
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            new Thread(() -> {
                Singleton4 instance = Singleton4.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }


    }


}

//声明一个单例类
class Singleton4 {

    //私有化构造函数
    private Singleton4() {
    }

    //声明一个实例变凉
    private static Singleton4 singleton;

    //对外提供访问,这种方式，确实是单例，但是test2在多线程下其hashcode保持一致，这种方式的情况就是，同步解决了单例的线程安全问题，同时降低了其性能，每次访问的时候，都会进行排队，这种方式也不推荐使用
    public static synchronized Singleton4 getInstance() {
        //延迟加载，判定没有实例化的情况下在实例化
        if (null == singleton) {
            singleton = new Singleton4();
        }
        return singleton;
    }

}
