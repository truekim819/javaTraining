/**
 * Created by truekim819 on 2016-07-04.
 */
public class Q2 {

  String name;
  void myName( String n ){
    name = n;
  }
  public static void main(String[] args) {
    myName('True Kim');
    System.out.println(name+", Hello World!");
  }
}
