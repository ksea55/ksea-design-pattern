package org.ksea.pattern.builder.singletPattern;

/**
 * 饿汉式->静态常量方式
 * 这种方式：避免了线程安全问题，类加载而加载，不足是并未进行延迟加载，可能造成内存浪费
 */
public class Singleton1 {

    //将构造函数声明成私有方法，禁止对外实例化
    private Singleton1() {
    }

    //声明一个静态常量
    private final static Singleton1 singleton = new Singleton1();

    /**
     * 对外提供实例的访问方式
     *
     * @return
     */
    public static Singleton1 getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1); //true

        System.out.println("instance hashcode:" + instance.hashCode());
        System.out.println("instance1 hashcode:" + instance1.hashCode());
    }

}
