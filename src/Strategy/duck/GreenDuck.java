package Strategy.duck;

import Strategy.flybehavior.FlyBehavior;
import Strategy.quackbehavior.QuackBehavior;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 17:55
 * @Description:
 */
public class GreenDuck extends Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public GreenDuck(){
        System.out.println("I am GreenDuck");
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
