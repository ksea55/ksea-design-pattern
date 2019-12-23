package org.ksea.pattern.builder.singletPattern;

import org.junit.Test;

/**
 * 单例模式-懒汉式
 */
public class SingletonTest5 {

    @Test
    public void test1() {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();

        System.out.println(instance == instance1); //这种情况下true

    }

    @Test
    public void test2() throws InterruptedException {
        //多线程下 我们可以看到其并未hashcode都一致
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            new Thread(() -> {
                Singleton5 instance = Singleton5.getInstance();
                System.out.println(instance.hashCode());
            }).start();

        }


    }


}

//声明一个单例类
class Singleton5 {

    //私有化构造函数
    private Singleton5() {
    }

    //声明一个实例变凉
    private static Singleton5 singleton;

    //这种方式直接不推荐，不能保证线程安全
    public static Singleton5 getInstance() {
        //延迟加载，判定没有实例化的情况下在实例化
        if (null == singleton) {
            //虽然在代码块中实现其同步，但是这种方式在多线程方式下并不能实现其线程安全，这种方式破坏了单例模式，不推荐使用
            synchronized (Singleton5.class) {

                singleton = new Singleton5();
            }
        }
        return singleton;
    }

}
