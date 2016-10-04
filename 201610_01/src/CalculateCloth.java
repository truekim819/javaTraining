import java.util.Calendar;

/**
 * Created by truekim819 on 2016-10-04.
 */

public class CalculateCloth extends Calculate {


  @Override
  public float calculateSum(){
    this.totalCnt =  price*(count/unit);

    Calendar today = Calendar.getInstance();
    int day = today.get(today.DAY_OF_MONTH);
    if(day == 15 || day == 4){
      this.totalCnt = (float)(price*(count/unit)*(0.8));
    }else{
      this.totalCnt = price*(count/unit);
    }

    System.out.println(product+": "+price +"* ("+count+"/"+unit+") = "+totalCnt);
    return this.totalCnt;
  }
}
