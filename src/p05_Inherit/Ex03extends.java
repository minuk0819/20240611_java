package p05_Inherit;

public class Ex03extends {
  public static void main(String[] args) {
    Marine m1 = new Marine();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}

// 추상클래스 : 스스로 인스턴스 생성 불가. 상속받은 후 인스턴스 생성 가능 ( abstract )
abstract class Unit {
  public Unit(String name, String tribe, int hp) {
    super();
    this.tribe = tribe;this.name = name;this.hp = hp;
  }
  String tribe; // String : 문자열
  String name;
  int hp;


  public void move(int x, int y){}
  public void stop(){}

  @Override // 오버로딩 : class 안에 같은 이름 ( 개발을 편하게 하기 위해 사용 )
  public String toString() {
    return String.format("{name=%s, hp=%d, tribe=%s}", name,hp,tribe);
  }
}

abstract class Protoss extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Protoss(int hp, String name ) {
    super("Protoss",name, hp);
  }
}

abstract class Terran extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Terran(String name ,int hp) {
    super(name, "Terran", hp);
  }
}

class Marine extends Unit {
  public Marine() {
    super( "Marine", "Terran", 60);
  }
}
class Medic extends Unit {
  public Medic() {
    super("Medic", "Terran", 45);
  }
}