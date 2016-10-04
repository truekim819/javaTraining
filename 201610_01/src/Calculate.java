import java.lang.Object;

/**
 * Created by truek on 2016-10-04.
 */
public abstract class Calculate {
    String product;
    int price;
    int unit;
    int count;
    float totalCnt = 0 ;

    public void Calculate(Object[] info){ //{"소고기", 1000 , 3500, 100 , 1},
        this.product = (String) info[0];
        this.count = (int)info[1];
        this.price = (int)info[2];
        this.unit = (int)info[3];

    }
    protected abstract float calculateSum();

}
