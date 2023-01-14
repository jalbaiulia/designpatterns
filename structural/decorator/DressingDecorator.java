package structural.decorator;

public class DressingDecorator extends MeatDecorator {

  public DressingDecorator(Sandwich customSandwich) {
    super(customSandwich);
  }

  @Override
  public String make() {
    return customSandwich.make() + addDressing();
  }

  private String addDressing() {
    return "mayo ";
  }
}
