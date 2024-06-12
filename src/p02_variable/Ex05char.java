package p02_variable;

import common.Utils;
import p01_class.Animal;

public class Ex05char {
  char chr; // 멤버 변수

  public static void main(String[] args) {
    char c1 = 'A';  // 'A' = 65
    Utils.typeOf(c1);
    System.out.println(c1);
    System.out.println((int) c1);
    System.out.println(c1 + c1); // 연산할 경우 int로 형변환
    Utils.typeOf(c1+c1);
    char c2 = 'a'; // 'a' = 97
    Utils.typeOf(new Animal());
    char c3 = '0'; // '0' = 48
    // char c4 = ''; <== 오류  // char는 무조건 1글자 이상 (에러)

    Ex05char ex05char = new Ex05char(); // 인스턴스
    System.out.println(ex05char.chr);
    // 공백의 hexa 코드값은 '\u0000', ' '
    System.out.println((int) ex05char.chr);
    Utils.typeOf(ex05char.chr);
    if(ex05char.chr == '\u0000') {
      System.out.println("공백이 같습니다.");
    }
    // 특수 문자 리터럴
    char c4 = '\'';
    char c5 = '\"';
    char c6 = '\\';
    char c7 = '\b'; //백스페이스
    char c8 = '\n'; //tab
    char c9 = '\n'; //개행  *많이 사용함
    char c10 = '\r'; //캐리지 리턴
    char c11 = '\f'; //폼피드
  }
}
