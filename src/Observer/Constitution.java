package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 20:49
 * @Description:
 */
public class Constitution extends Observable{

    private Integer year;
    private Integer num;
    private String describe;
    List<Observer> observers = new ArrayList<Observer>();
    public void setConstitution(Integer year,Integer num,String describe){
        this.describe = describe;
        this.num = num;
        this.year = year;
        this.setChange();
    }

    public void setChange(){
        this.setChanged();
        this.notifyObservers(new Content( year, num, describe) );
    }


}
