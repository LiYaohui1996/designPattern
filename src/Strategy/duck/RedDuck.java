package Strategy.duck;

import Strategy.flybehavior.FlyBehavior;
import Strategy.quackbehavior.QuackBehavior;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 17:55
 * @Description:
 */
public class RedDuck extends Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public RedDuck(){
        System.out.println("I am RedDuck");
    }
    public void fly() {
        flyBehavior.fly();
    }


    public void quack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
