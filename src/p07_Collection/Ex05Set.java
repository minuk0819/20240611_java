package p07_Collection;

// Set은 hashset 과 treeset

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex05Set {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet();
    set.add(4);set.add(4);set.add(2);set.add(3);
    System.out.println(set);
    set.add(1);set.remove(4);
    System.out.println(set);
    for(int i : set) System.out.println(i);
    Iterator it = set.iterator();
    while (it.hasNext()) System.out.println();
    }
  }

