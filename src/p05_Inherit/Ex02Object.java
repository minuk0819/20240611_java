package p05_Inherit;

public class Ex02Object {
  public static void main(String[] args) {
    Member m1 = new Member("LGH","010-3446-7374");
    String str = new String("hello");
    System.out.println(m1); System.out.println(str);
    System.out.println(m1 instanceof Object);
    System.out.println(m1 instanceof Member);
    // System.out.println(m1 instanceof String);
  }
}
// 모든 클래스는 Object를 상속받는다. extends Object 안써도 됨.
class Member extends Object {
  String name, mobile;

  public Member(String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }

  @Override
  public String toString() {
    return String.format("%s, %s",name,mobile);
  }
}
class Phone { int key;}
class Computer {int key;}
//java는 다중상속을 허용하지 않는다.명확하기 때문에
//class SmartPhone extends Phone, Computer {}