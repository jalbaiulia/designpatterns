package structural.decorator;

public class Main {

  public static void main(String[] args) {

    Sandwich sandwich = new DressingDecorator(new MeatDecorator(new BasicSandwich()));
    System.out.println(sandwich.make());
  }

}
