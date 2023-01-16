package random.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {

    List<Car> cars = new ArrayList<>();

    cars.add(new CarClass());
    cars.add(new ClassicsClass());

    List<? super Car> carsSuper = new ArrayList<>();
    carsSuper.add(new ClassicsClass());
    carsSuper.add(new CarClass());

    ArrayList<BMW> andrei = new ArrayList<BMW>();
    andrei.add(new BMWClass());
    List<? extends Car> extendCars = andrei;
//    extendCars.add(new BMWClass());
    // List<
//    extendCars.add(new ClassicsClass()); - nu merge

//    extendsNuEInutil(carsSuper);
    List<BMW> bmwCars = new ArrayList<>();
    bmwCars.add(new BMWClass());
    bmwCars.add(new ClassicsClass());
    extendsNuEInutil((bmwCars));

    List<? super BMW> carsSuper2 = new ArrayList<Car>();
    // List<Bmw> - classics, bmw
    // List<Car> - classics, bmxw, car
    // List<Object> - classics, bmw, car, object, .....
    carsSuper2.add(new ClassicsClass());

    carsSuper2.add(new ClassicsClass());
    carsSuper2.add(new BMWClass());
//    carsSuper2.add(new CarClass());
//    extendsNuEInutil(carsSuper2);

  }

  public static void extendsNuEInutil(List<? extends BMW> list) {
    list.forEach(System.out::println);
//    list.add(new CarClass());
  }

}
