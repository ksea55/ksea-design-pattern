package org.ksea.pattern.builder.singletPattern;

import org.junit.Test;

/**
 * 单例模式-懒汉式
 */
public class SingletonTest8 {

    @Test
    public void test1() {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance1 = Singleton8.INSTANCE;
        System.out.println(instance==instance1);
        instance.hello();

    }


}

//声明枚举,通过枚举的方式，创建单例模式，不仅保证了线程安全问题，也解决了反序列化实例对象问题
enum Singleton8 {

    INSTANCE;

    public void hello() {
        System.out.println("hello");
    }

}
