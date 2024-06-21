package p03_method;

public class Ex09For {
  public static void main(String[] args) {
    // 반복문을 구현할 때
    // 첫번째 패턴을 찾아라
    // 두번째 초조증을 적용하여 구현
    int sum = 0;
    sum = sum + 0;
    sum = sum + 1;
    sum = sum + 2;
    sum = sum + 3;
    sum = 0;
//    for (int i = 9; i >= 0; --i) sum = sum + i;
    System.out.println(sum);
    for (int i = 2; i < 10; i++) {
      System.out.println("[ "+i+"단 ]");
      for (int j = 1; j < 10 ; j++) {
        System.out.printf("%d * %d = %2d\n", i, j, i*j);
      }
      System.out.println();
    }
    for (int i = 2; i < 10; i+=3) {
      for (int j = 1; j < 10; j++) {
        for (int k = 0; k < 3; k++) {
          System.out.printf("%d * %d = %2d \t",
              i + k, j, (i + k) * j);
        }
        System.out.println();
      }
      System.out.println();
    }
    // for문은 비교적 횟수에 대한 예측이 가능할 때
    int i = 0;
    for ( ; ; ) {
      System.out.println(i++);
      if(i >= 10)
        break; //자신이 속한 반복문을 벗어남
    }
    for (int k = 10, j = 0; j < 10; j++, k--) {

    }
  }
}