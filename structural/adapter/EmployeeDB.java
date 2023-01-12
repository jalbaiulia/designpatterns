package structural.adapter;

public class EmployeeDB implements Employee {

  private int id;
  private String name;
  private String surname;

  public EmployeeDB(int id, String name, String surname) {
    this.id = id;
    this.name = name;
    this.surname = surname;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getSurname() {
    return surname;
  }
}
