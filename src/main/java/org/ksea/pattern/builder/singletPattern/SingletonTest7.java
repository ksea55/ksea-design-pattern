package org.ksea.pattern.builder.singletPattern;

import org.junit.Test;

/**
 * 单例模式-懒汉式
 */
public class SingletonTest7 {

    @Test
    public void test1() {
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance1 = Singleton7.getInstance();

        System.out.println(instance == instance1); //这种情况下true

    }

    @Test
    public void test2() throws InterruptedException {
        //多线程下 我们可以看到其并未hashcode都一致
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton7 instance = Singleton7.getInstance();
                System.out.println(instance.hashCode());
            }).start();

        }


    }


}

//声明一个单例类
class Singleton7 {

    //私有化构造函数
    private Singleton7() {
    }


    //声明一个静态内部类，静态内部类不会随着Singleton7的装载而装载，同时保证了线程安全，实现其延迟初始化
    private static class Singleton {

        //在静态内部类中进行实例化对象
        private static final Singleton7 SINGLETON_7 = new Singleton7();
    }

    public static Singleton7 getInstance() {
        //这里是通过静态内部类去实例化对象
        return Singleton.SINGLETON_7;

    }

}
