package structural.adapter;

import java.util.List;

public class Demo {

  public static void main(String[] args) {
    Integer[] intArray = new Integer[]{1,2,3};
    List<Integer> list =  List.of(intArray);
    System.out.println(intArray);
    System.out.println(list);

    /////////////////////////////////////////

    EmployeeClient client = new EmployeeClient();
    List<Employee> employees = client.getEmployees();
    System.out.println(employees);


  }

}
