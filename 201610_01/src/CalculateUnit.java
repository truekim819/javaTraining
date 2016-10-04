/**
 * Created by truekim819 on 2016-10-04.
 */
public class CalculateUnit extends Calculate {

  @Override
  public float calculateSum(){
    this.totalCnt =  price*(count/unit);
    System.out.println(product+": "+price +"* ("+count+"/"+unit+") = "+totalCnt);
    return this.totalCnt;
  }
}
