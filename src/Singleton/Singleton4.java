package Singleton;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/7 11:51
 * @Description:加锁懒汉模式，用到时再创建，锁住了判断代码
 */
public class Singleton4 {
    private static Singleton4 singleton4 = null;
    private Singleton4(){ }
    public static  Singleton4 getSingleton4(){
    if (singleton4==null){
        synchronized (Singleton4.class){
            if(singleton4==null){
                singleton4 = new Singleton4();
            }
        }
    }
        return singleton4;
    }
}
