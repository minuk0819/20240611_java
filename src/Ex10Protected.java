import p05_Inherit.Ex10Modifier;

public class Ex10Protected extends Ex10Modifier {
  String str = protectedVar;
  public Ex10Protected() {
    System.out.println(protectedVar);
  }
  void done() {
    System.out.println(publicVar);
    System.out.println(protectedVar);
    // System.out.println(defaultVar);
    // System.out.println(privateVar);
  }
}

class ModifierEx {
  Ex10Modifier ex10Modifier = new Ex10Modifier();
  void done() {
    System.out.println(ex10Modifier.publicVar);
   // System.out.println(ex10Modifier.protectedVar);
   // System.out.println(ex10Modifier.defaultVar);
   // System.out.println(ex10Modifier.privateVar);
  }
}


// -----------------------------------------------
// 클래스 : public, default, final, abstract
// 메서드 : all, final, abstract, static
// 멤버변수 : all, final, static
// 지역변수 : final, var
// -----------------------------------------------