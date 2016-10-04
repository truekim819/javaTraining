import java.lang.Object;

public class Main {
    //가격 정보
    static Object[][][] priceInfo = new Object[][][]{
        {{"소고기"}, {3500 , 100}} ,//1
        {{"돼지고기"},{1500, 100}}, //1
        {{"감자"},{250, 100}}, //1
        {{"양파"},{1000, 1}},
        {{"고등어"},{5300,1}},
        {{"갈치"},{ 9900, 1}},
        {{"콜라"},{ 2300, 1}},
        {{"사이다"},{2300,1}},
        {{"맥주"},{2500,1}},//2 = 맥주
        {{"양말"},{990,1}}, //3 = 의류
        {{"체크무늬 티셔츠"},{15000,1}},
        {{"줄무늬 티셔츠"},{10000,1}},
        {{"반바지"},{20000,1}},
        {{"청바지"},{35000,1}},
    };

    public static void main(String[] args) {

        Object[][] myBucket = {
                {"소고기", 1000 , 3500, 100 , 1},
                {"양파" , 3 , 1000 , 1 , 1},
                {"맥주" , 5 , 2500 , 1 , 2},
                {"청바지", 1 , 35000,1 , 3}
        };

        System.out.println("구매 총 수량 : "+myBucket.length);
        float sum = 0;
        for(int i = 0 ; i < myBucket.length ; i++ ){
            sum += caseByproduct( myBucket[i] );
        }
        System.out.println("============================================");
        System.out.println("구매 총 금액 : "+sum);
    }

    public static float caseByproduct(Object[] obj){

        Calculate cal;
        float totalcount = 0 ;

      switch ((int)obj[4]){
          case 1 :
              cal =  new CalculateUnit();
              cal.Calculate(obj);
              totalcount = cal.calculateSum();
              break;
          case 2 :
              cal =  new CalculateBeer();
              cal.Calculate(obj);
              totalcount = cal.calculateSum();
              break;
          case 3 :
              cal =  new CalculateCloth();
              cal.Calculate(obj);
              totalcount = cal.calculateSum();
              break;
      }
        return totalcount;
    }
}
