package Singleton;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/7 11:48
 * @Description: 优点：该类只存在一个实例，节省系统资源；对于需要频繁创建销毁的对象，使用单例模式可以提高系统性能。
                  缺点：不能外部实例化（new），调用人员不清楚调用哪个方法获取实例时会感到迷惑，尤其当看不到源代码时。
 */
public class TestSingleton {
    public static void main(String args[]){
        System.out.println(Singleton1.getSingleton1().toString());
        System.out.println(Singleton2.getSingleton2().toString());
        System.out.println(Singleton3.getSingleton3().toString());
        System.out.println(Singleton4.getSingleton4().toString());
        System.out.println(Singleton5.getSingleton5().toString());
        System.out.println(Singleton6.getSingleton6().toString());
        System.out.println(Singleton7.INTSTANCE.toString());
    }
}
