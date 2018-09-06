package Decorator;

import Decorator.coffer.Coffer;
import Decorator.coffer.Espresso;
import Decorator.coffer.LongBlack;
import Decorator.decorator.Chocolate;
import Decorator.decorator.Milk;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/6 17:53
 * @Description:https://www.cnblogs.com/chenxing818/p/4705919.html
 * 1.Component（被装饰对象的基类）定义一个对象接口，可以给这些对象动态地添加职责。
   2.ConcreteComponent（具体被装饰对象）定义一个对象，可以给这个对象添加一些职责。
   3.Decorator（装饰者抽象类）维持一个指向Component实例的引用，并定义一个与Component接口一致的接口。
   4.ConcreteDecorator（具体装饰者）具体的装饰对象，给内部持有的具体被装饰对象，增加具体的职责。
   *****约定共同的超类，被装饰和装饰类继承它，在服务端使用基类接口创建一个被修饰类的主体，
         将装饰类包裹在基类上，生成一个基类的包装加强类，此操作可重复。
 */
public class DecoratorTest {
    public  static void main(String args[]){
        Drink order1 = new LongBlack();
        order1 = new Milk(order1);
        order1= new Chocolate(order1);
        System.out.println("合计"+order1.cost());
        System.out.println(order1.getDescription());

        System.out.println("------------");

        Drink order2 = new Espresso();
        System.out.println("合计"+order2.cost());
        System.out.println(order2.getDescription());
    }
}
