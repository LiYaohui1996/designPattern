package Observer;

import java.util.Observable;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 21:14
 * @Description:https://www.cnblogs.com/luohanguo/p/7825656.html
 *                在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新。
 *               其实就是发布订阅模式，发布者发布信息，订阅者获取信息，订阅了就能收到信息，没订阅就收不到信息。
 */
public class TestObserver {
    public static void main(String[] args){
        Court court = new Court();
        Lawyer lawyer = new Lawyer();
        Constitution constitution = new Constitution();
        constitution.addObserver(court);
        constitution.addObserver(lawyer);
        constitution.setConstitution(1,2,"6666");
        System.out.println("---------------------------");
        constitution.deleteObserver(lawyer);
        constitution.setConstitution(1,2,"7777");
    }


}
