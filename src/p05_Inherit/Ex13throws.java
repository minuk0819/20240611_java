package p05_Inherit;

public class Ex13throws { // alt Enter : 자동으로 메서드를 만들어줌.
  public static void main(String[] args) throws Exception {
    method1();
    System.out.println("main");
  }

  private static void method1() throws Exception {
    method2();
    System.out.println("method1");
  }

  private static void method2() throws Exception {
    method3();
    System.out.println("method2");
  }

  private static void method3()  throws Exception {
    try {
      throw new Exception();
    } catch (Exception e) {
      throw new RuntimeException(e);
      // System.out.println("method3");
    }
  }
}
