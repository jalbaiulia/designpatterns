package structural.adapter;

public class EmployeeLdap {

  private int cn;
  private String firstName;
  private String lastName;

  public EmployeeLdap(int cn, String firstName, String lastName) {
    this.cn = cn;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getCn() {
    return cn;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
