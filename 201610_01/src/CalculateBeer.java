/**
 * Created by truekim819 on 2016-10-04.
 */

public class CalculateBeer extends Calculate {
  @Override
  public float calculateSum(){
    this.totalCnt =  price*(count/unit);

    if(count >= 5){
      int discountBeer = count/4; //4+1;
      this.totalCnt = price * ((count-discountBeer)/unit);
    }

    System.out.println(product+": "+price +"* ("+count+"/"+unit+") = "+totalCnt);
    return this.totalCnt;
  }
}
