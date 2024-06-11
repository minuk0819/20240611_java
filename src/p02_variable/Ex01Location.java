package p02_variable;

public class Ex01Location {
  // 1. 변수의 선언 위치 :: 전역, 지역
  int sum = 0; // 멤버변수는 전역(golval variable)
  // int sum =1; // 중복 선언되서어 에러 발생 (같은 변수이름 사용 X)
  public void sum() {
    System.out.printf("global:" + sum);
    int sum = 1; // 지역(local variable)
    System.out.println("local:" + sum);
  }

  public static void main(String[] args) {
    Ex01Location ex01 = new Ex01Location();
    System.out.println(ex01.sum);
    ex01.sum();
  }
}
