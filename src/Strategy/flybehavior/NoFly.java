package Strategy.flybehavior;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 17:37
 * @Description:
 */
public class NoFly implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly");
    }
}
