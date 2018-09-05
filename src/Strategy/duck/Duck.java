package Strategy.duck;

import Strategy.flybehavior.FlyBehavior;
import Strategy.quackbehavior.QuackBehavior;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 17:33
 * @Description:鸭子类为该程序的超类
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}
    //鸭子飞的抽象方法
    public  abstract void fly();
    //鸭子叫的抽象方法
    public abstract void quack();
    //注入飞行的方法
    public abstract void setFlyBehavior(FlyBehavior flyBehavior);
    //注入叫声的方法
    public abstract void setQuackBehavior(QuackBehavior quackBehavior);

}
