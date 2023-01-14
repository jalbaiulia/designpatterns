package structural.composite;

public class MenuItem extends MenuComponent {

  public MenuItem(String name, String url) {
    super(url, name);
  }

  @Override
  public String toString() {
    return print();
  }

}
