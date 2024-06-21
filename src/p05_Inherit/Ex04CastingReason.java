package p05_Inherit;

public class Ex04CastingReason {
  public static void main(String[] args) {
    Buyer b1 = new Buyer();
    Laptop l1 = new Laptop();
    Tv t1 = new Tv();
    Audio a1 = new Audio();
  }
}
// Buyer, Laptop, Tv, Audio ( 4개의 class )

class Buyer {
  int money = 1000;
}

class Laptop {

}

class Tv {

}

class Audio {

}