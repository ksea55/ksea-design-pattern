package org.ksea.pattern.builder.singletPattern;

import org.junit.Test;

/**
 * 单例模式-懒汉式
 */
public class SingletonTest6 {

    @Test
    public void test1() {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();

        System.out.println(instance == instance1); //这种情况下true

    }

    @Test
    public void test2() throws InterruptedException {
        //多线程下 我们可以看到其并未hashcode都一致
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                Singleton6 instance = Singleton6.getInstance();
                System.out.println(instance.hashCode());
            }).start();

        }


    }


}

//声明一个单例类
class Singleton6 {

    //私有化构造函数
    private Singleton6() {
    }

    //声明一个实例变凉
    private static volatile Singleton6 singleton;


    //这种方式，是非常推荐的，解决了延迟加载，同时处理了线程安全问题，注意上面的声明用了volatile
    public static Singleton6 getInstance() {

        if (null == singleton) {

            //这里使用了同步代码块，并使用双重检查机制
            synchronized (Singleton6.class) {

                if (null == singleton) {
                    singleton = new Singleton6();
                }
            }
        }
        return singleton;
    }

}
