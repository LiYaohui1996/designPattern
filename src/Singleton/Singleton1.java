package Singleton;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/7 11:44
 * @Description: 饿汉模式效率不高，不管用不用都要初始化
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();
    private Singleton1(){ }

    public static Singleton1 getSingleton1(){

        return singleton1;
    }
}
