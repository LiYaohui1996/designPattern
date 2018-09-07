package Singleton;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/7 11:51
 * @Description:静态内部类模式，既避免了同步带来的性能损耗，又能够延迟加载
 */
public class Singleton6 {
    private static class SingletonHolder{
        public static final Singleton6 singleton6 = new Singleton6();
    }

    private Singleton6(){ }
    public static Singleton6 getSingleton6(){

        return SingletonHolder.singleton6;
    }
}

