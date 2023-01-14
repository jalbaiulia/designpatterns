package structural.composite;

public class Main {

  public static void main(String[] args) {

    Menu menu = new Menu("Main", "/main");
    MenuItem safety = new MenuItem("Safety", "/safety");
    menu.add(safety);
    Menu ceva = new Menu("MENU", "/ceva");
    menu.add(ceva);
    ceva.add(new MenuItem("cevaMic", "'lalal"));
    ceva.add(new MenuItem("ceva2", "lalaala"));
    Menu menu2 = new Menu("MENU2 ", "lala");
    menu2.add(new MenuItem("ceva","lala"));
    ceva.add(menu2);
    System.out.println(menu);
  }

}
