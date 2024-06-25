package p07_Collection;

import java.sql.SQLOutput;
import java.util.*;

public class Ex04StackQueue { // Stack에서 젤 중요한 메서드 : push, pop
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(0);stack.push(1);stack.push(2);
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println(stack.contains(1));
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack);
    System.out.println(stack.empty());

    // Queue : 그렇게 중요하진 않음.
    Queue q = new LinkedList();
    q.offer("a");q.offer("b");q.offer("c");
    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q.peek());
    System.out.println(q);

    // Collection 이전에 나온 버전(동기환 포함)
    Vector v = new Vector();
    v.add(0); v.add("a"); v.add(true);
    Enumeration e = v.elements();
    while (e.hasMoreElements()) {
      System.out.println(e.nextElement());
    }
    e =v.elements(); // 다시 사용하려고 할 때 초기화 시켜줘야함.
    Iterator it = v.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    it = v.iterator(); // 다시 사용하려고 할 때.
  }
}
