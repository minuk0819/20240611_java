package p05_Inherit;

public class Ex04CastingReason {
  public static void main(String[] args) {
    Buyer b = new Buyer();
    Laptop laptop = new Laptop();
    Tv tv = new Tv();
    Audio audio = new Audio();
    b.buy(tv);
    b.buy(laptop);
    b.buy(audio);
  }
}
// Buyer, Laptop, Tv, Audio ( 4개의 class )
// super 조상꺼

class Buyer {
  int money = 1000;

  // void buy(Tv tv) {money -= tv.price;}
  // void buy(Laptop laptop) {money -= laptop.price;}
  // void buy(Audio audio) {money -= audio.price;}
  void buy(Product product) {
    money -= product.price;
  }
}

abstract class Product {
  int price;
  public Product(int price) {
    this.price = price;
  }
}

class Laptop extends Product {
  public Laptop () {super(30);}
}

class Tv extends Product {
  public Tv () {super(30);}
}

class Audio extends Product {
  public Audio () {super(40);}
}