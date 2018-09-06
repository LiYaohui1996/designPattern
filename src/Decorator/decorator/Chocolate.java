package Decorator.decorator;

import Decorator.Drink;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/6 18:07
 * @Description:
 */
public class Chocolate extends Spice{

    public Chocolate(Drink drink){
        super(drink);
        //super(drink);
        super.setDescription("Chocolate");
        super.setPrice(4.0f);
        System.out.println("3333"+drink.getDescription());

    }

}
