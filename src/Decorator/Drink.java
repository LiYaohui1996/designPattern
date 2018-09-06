package Decorator;

/**
 * @Auther: 李耀辉
 * @Date: 2018/9/6 17:54
 * @Description:
 */
public abstract class Drink {
    private String description ="";
    private Float price =0f;

    public String getDescription() {
        return description +"-"+this.price;
    }

    public void setDescription(String description) {
        this.description = description ;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public abstract Float cost();
}
