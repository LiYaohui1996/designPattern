package Observer;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/5 21:09
 * @Description:
 */
public class Content {
    private Integer year;
    private Integer num;
    private String describe;
    public Content(Integer year,Integer num,String describe) {
        this.describe = describe;
        this.num = num;
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
