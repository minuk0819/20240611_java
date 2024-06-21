package p05_Inherit;

public class Ex03extends {
  public static void main(String[] args) {
    Marine m1 = new Marine();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}

abstract class Unit {
  public Unit(String tribe, int hp) {
    super();
    this.tribe = tribe;
    this.hp = hp;
  }
  int hp;
  String tribe;
  public void move(int x, int y){}
  public void stop(){}

  @Override // 오버로딩 : class 안에 같은 이름 ( 개발을 편하게 하기 위해 사용 )
  public String toString() {
    return String.format("Unit{hp=%d, tribe=%s}",hp,tribe);
  }
}

abstract class Terran extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Terran(int hp) {
    super("Terran", hp);
  }
}
class Marine extends Terran {
  public Marine() {
    super(60);
  }
}
class Medic extends Terran {
  public Medic() {
    super(45);
  }
}