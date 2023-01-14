package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

  private List<MenuComponent> menuComponents = new ArrayList<>();

  public Menu(String url, String name) {
    super(url, name);
  }

  public List<MenuComponent> getMenuComponents() {
    return menuComponents;
  }

  public void setMenuComponents(List<MenuComponent> menuComponents) {
    this.menuComponents = menuComponents;
  }

  public List<MenuComponent> add(MenuComponent newComponent) {
    this.getMenuComponents().add(newComponent);
    return this.getMenuComponents();
  }

  public List<MenuComponent> remove(MenuComponent newComponent) {
    this.getMenuComponents().remove(newComponent);
    return this.getMenuComponents();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(print());
    for (MenuComponent component : this.getMenuComponents()) {
      sb.append(component.toString());
    }
    return sb.toString();
  }

}
