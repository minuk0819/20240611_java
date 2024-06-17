package p03_method;

public class Ex01declare {
  // return type :
  // return 없는 경우 => void
  // return 있는 경우 => primitive, reference ( 9가지 )

  boolean b1;

  void print1() {
    System.out.println("Hello method~!");
    // return; // 암묵적으로 return 생략
  }

  boolean print2() {
    /* boolean result;
    Ex01declare ex01declare = new Ex01declare();
    result = ex01declare.b1;
    return result; */
    return new Ex01declare().b1; // false를 리턴
  }

  char print3() {
    return 'C';}

  int print4() {
    return 10;}

  int print6(int result) {
    return result;}

  double print5(int result) {
    return result;}





  boolean print() {
    boolean result = false;
    return result; }

  boolean print(boolean result) {
    return result; }

  char print(char c) {
    return c; }




  public static void main(String[] args) {
    Ex01declare e1 = new Ex01declare();
    e1.print1();
    System.out.println(e1.print2());
    System.out.println(e1.print());
    System.out.println(e1.print(true));
    System.out.println(e1.print('Z'));

    System.out.println(e1.print6(10));
    System.out.println(e1.print5(50));


  }
}



class Math {
  int add(int n1, int n2) {

  }

  int subtrack (int n1, int n2) {

  }

  int muliplay (int n1, int n2) {

  }

  double divide (int n1. int n2) {

  }

  public static void main(String[] args) {
    Math math = new Math;
  }


}


















