package Strategy;

import Strategy.duck.Duck;
import Strategy.duck.GreenDuck;
import Strategy.duck.RedDuck;
import Strategy.flybehavior.BadFly;
import Strategy.flybehavior.FlyBehavior;
import Strategy.flybehavior.GoogFly;
import Strategy.quackbehavior.GagaQuack;
import Strategy.quackbehavior.MioamioaQuack;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 18:03
 * @Description:https://www.cnblogs.com/jenkinschan/p/5645300.html
 * 定义算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。这算法体现了几个设计原则，
 *               第一、把变化的代码从不变的代码中分离出来；
 *              第二、针对接口编程而不是具体类（定义了策略接口）；
 *              第三、多用组合，少用继承（客户通过组合方式使用策略）。
 */
public class strategyTest {
    public  static void main(String args[]){

        Duck redDuck = new RedDuck();
        redDuck.setFlyBehavior(new BadFly());
        redDuck.setQuackBehavior(new GagaQuack());
        redDuck.fly();
        redDuck.quack();
        System.out.println("------------------------------");
        Duck greenDuck = new GreenDuck();
        greenDuck.setQuackBehavior(new MioamioaQuack());
        greenDuck.setFlyBehavior(new GoogFly());
        greenDuck.quack();
        greenDuck.fly();
    }
}
