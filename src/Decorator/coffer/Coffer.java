package Decorator.coffer;

import Decorator.Drink;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/6 18:00
 * @Description:
 */
public class Coffer extends Drink {

    public Float cost() {
        return super.getPrice();
    }
}
