package p07_Collection;

import java.util.*;

public class Lotto {
  public static void main(String[] args) {
    Set<Integer> lotto = new HashSet<>();
    while (lotto.size() < 6) {
      lotto.add((int) (Math.random() * 45) + 1);
    }
    ArrayList list = new ArrayList(lotto);
    Collections.sort(list);
    System.out.println(list);

    Set<Integer> lotto2 = new TreeSet<>();
    while (lotto2.size() < 6) {
      lotto2.add((int) (Math.random() * 45) +1);
    }
    System.out.println(lotto2);
  }//
}
