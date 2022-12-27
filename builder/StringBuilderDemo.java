package builder;

public class StringBuilderDemo {

  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder("ceva");
    builder.append(" altceva");
    builder.append(23);
    builder.append(true);
    System.out.println(builder);

    ///////////////////////////////////////////////////

    LunchOrder lunchOrder = new LunchOrder.Builder().condiments("sare").meat("pui").dressing("fara ceapa").bread("neagra").build();
    System.out.println(lunchOrder);

    LunchOrder.Builder builder2 = new LunchOrder.Builder();
    builder2.bread("alba").meat("curcan").condiments("piper roz");
    LunchOrder sandwich = builder2.build();
    System.out.println(sandwich);

    builder2.condiments("fara");
    sandwich = builder2.build();
    System.out.println(sandwich);

  }
}
