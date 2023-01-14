package structural.composite;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MenuItem extends MenuComponent {

  public MenuItem(String name, String url) {
    super(url, name);
  }

  @Override
  public String toString() {

    File file = new File("v");
    try {
      FileInputStream fs = new FileInputStream(file);
      BufferedInputStream bufferedInputStream = new BufferedInputStream(fs);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }


    return print();
  }

}
