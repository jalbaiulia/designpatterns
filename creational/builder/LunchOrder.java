package creational.builder;

public class LunchOrder {

  public static class Builder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public Builder() {
    }

    public LunchOrder build() {
      return new LunchOrder(this);
    }

    public Builder meat(String meat) {
      this.meat = meat;
      return this;
    }

    public Builder bread(String bread) {
      this.bread = bread;
      return this;
    }

    public Builder condiments(String condiments) {
      this.condiments = condiments;
      return this;
    }

    public Builder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }
  }

  private final String bread;
  private final String condiments;
  private final String dressing;
  private final String meat;

  public LunchOrder(Builder builder) {
    this.bread = builder.bread;
    this.condiments = builder.condiments;
    this.meat = builder.meat;
    this.dressing = builder.dressing;
  }

  @Override
  public String toString() {
    return "LunchOrder{" +
           "bread='" + bread + '\'' +
           ", condiments='" + condiments + '\'' +
           ", dressing='" + dressing + '\'' +
           ", meat='" + meat + '\'' +
           '}';
  }

}
