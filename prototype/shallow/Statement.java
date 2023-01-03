package prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class Statement implements Cloneable {

  public String sql;
  public List<String> parameters = new ArrayList<>();
  public Record record;

  public Statement(String sql, List<String> parameters, Record record) {
    this.sql = sql;
    this.record = record;
    this.parameters.addAll(parameters);
  }

  public String getSql() {
    return sql;
  }

  public List<String> getParameters() {
    return parameters;
  }

  public Record getRecord() {
    return record;
  }

  public Statement clone() {
    try {
      return (Statement) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void addParameter(String newParam) {
    parameters.add(newParam);
  }

}
