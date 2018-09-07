package Singleton;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/7 11:51
 * @Description:基本懒汉模式，用到时再创建，但是无法保证线程安全
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;
    private Singleton2(){ }
    public static Singleton2 getSingleton2(){
    if (singleton2==null){
        singleton2 = new Singleton2();
    }
        return singleton2;
    }
}
