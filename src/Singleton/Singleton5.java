package Singleton;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/7 11:51
 * @Description:双重锁验证模式，优点：线程安全，进行双重检查，保证只在实例未初始化前进行同步，效率高
 *                               缺点：还是实例非空判断，耗费一定资源
 */
public class Singleton5 {
    private static Singleton5 singleton4 = null;
    private Singleton5(){ }
    public static Singleton5 getSingleton5(){
    if (singleton4==null){
        synchronized (Singleton5.class){
            if(singleton4==null){
                singleton4 = new Singleton5();
            }
        }
    }
        return singleton4;
    }
}
