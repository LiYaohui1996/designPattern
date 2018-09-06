package Decorator.decorator;

import Decorator.Drink;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/6 19:46
 * @Description:
 */
public class Spice extends Drink{
    Drink drink;
    public Spice(Drink drink){
       this.drink=drink;
    }

    @Override
    public Float cost() {
        return super.getPrice()+drink.cost();
    }
    @Override
    public String getDescription() {
        return super.getDescription()+drink.getDescription();
    }
}
