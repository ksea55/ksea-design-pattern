package org.ksea.pattern.builder.singletPattern;

/**
 * 饿汉式->静态块方式
 * 这种方式：避免了线程安全问题，类加载而加载，不足是并未进行延迟加载，可能造成内存浪费
 */
public class Singleton2 {

    //将构造函数声明成私有方法，禁止对外实例化
    private Singleton2() {
    }


    private static Singleton2 singleton;

    static {
        //实例化对象在静态方法块中
        singleton = new Singleton2();
    }

    /**
     * 对外提供实例的访问方式
     *
     * @return
     */
    public static Singleton2 getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1); //true

        System.out.println("instance hashcode:" + instance.hashCode());
        System.out.println("instance1 hashcode:" + instance1.hashCode());
    }

}
