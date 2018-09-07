package Singleton;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/7 11:51
 * @Description:加锁懒汉模式，用到时再创建，锁住了得到单例的方法
 */
public class Singleton3 {
    private static Singleton3 singleton3 = null;
    private Singleton3(){ }
    public static synchronized Singleton3 getSingleton3(){
    if (singleton3==null){
        singleton3 = new Singleton3();
    }
        return singleton3;
    }
}
