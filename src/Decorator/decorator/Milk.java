package Decorator.decorator;

import Decorator.Drink;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/6 18:07
 * @Description:
 */
public class Milk  extends Spice{

    public Milk(Drink drink){
        super(drink);
        super.setDescription("milk");
        super.setPrice(3.0f);
        System.out.println("1111"+drink.getDescription());

    }

}
