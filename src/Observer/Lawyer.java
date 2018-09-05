package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 21:03
 * @Description:
 */
public class Lawyer implements Observer{
    private Integer year;
    private Integer num;
    private String describe;
    public void update(Observable o, Object arg) {

        System.out.println("Lawyer know");
        System.out.println(((Content)(arg)).getDescribe());
        System.out.println(((Content)(arg)).getNum());
        System.out.println(((Content)(arg)).getYear());
    }
}
