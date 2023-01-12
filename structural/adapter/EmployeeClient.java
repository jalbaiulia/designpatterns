package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

  public List<Employee> getEmployees() {

    List<Employee> employees = new ArrayList<>();
    Employee employeeFromDB = new EmployeeDB(123, "Wasi", "wasi");
    employees.add(employeeFromDB);
    EmployeeLdap employeeFromLdap = new EmployeeLdap(1234, "miau", "Miau");
    employees.add(new EmployeeAdapterLdap(employeeFromLdap));

    return employees;

  }

}
