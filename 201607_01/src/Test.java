/**
 * Created by truekim819 on 2016-07-04.
 */
public class A2 {

  String name;
  void myName( String n ){
    this.name = n;
  }
  public static void main(String[] args) {
    A2 t1 = new A2();

    t1.myName("True Kim");
    System.out.println(t1.name+", Hello World!");
  }
}