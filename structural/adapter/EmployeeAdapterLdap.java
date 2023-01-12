package structural.adapter;

public class EmployeeAdapterLdap implements Employee {

  EmployeeLdap instance;

  public EmployeeAdapterLdap(EmployeeLdap instance) {
    this.instance = instance;
  }

  @Override
  public int getId() {
    return instance.getCn();
  }

  @Override
  public String getName() {
    return instance.getFirstName();
  }

  @Override
  public String getSurname() {
    return instance.getLastName();
  }
}
