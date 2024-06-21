package p05_Inherit;

public class Ex06Interface {
  public static void main(String[] args) {
    Hydra hydra = new Hydra();
  }
}
// java에서는 다중상속이 안된다. 그래서, interface를 사용한다.

// interface의 뒤에는 able을 붙이는것이 약속.
class Hydra implements AttackAirable, AttackGroudable {
  @Override
  public void attack() {
    // 중복된 상수는 static이 붙어 있기 때문에 클래스와 함께 지정
    System.out.println(AttackGroudable.LEVEL);
  }

  @Override
  public void attackG() {

  }
}

interface AttackAirable {
  // 추상메서드와 상수만 정의(static, default 메서드 추가) 가능
  void attack(); // public abstract이 자동으로 생략됨
  int LEVEL = 10; // <-- 상수 (public abstract이 자동으로 생략)
}

interface AttackGroudable {
  void attackG();
  int LEVEL = 20;
}
