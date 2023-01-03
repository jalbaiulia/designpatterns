package prototype.shallow;

import prototype.shallow.Record;
import prototype.shallow.Statement;

import java.util.List;

public class ShallowCopyDemo {

  public static void main(String[] args) {

    Statement statement1 = new Statement("select * from movies where title=?", List.of("Joker"), new Record());
    Statement statement2 = statement1.clone();

    printStatements(statement1, statement2);

    statement1.addParameter("ceva");
    printStatements(statement1, statement2);

  }

  private static void printStatements(Statement statement1, Statement statement2) {
    System.out.println("Statement 1");
    System.out.println(statement1.getSql());
    System.out.println(statement1.getParameters());
    System.out.println(statement1.getRecord());

    System.out.println("Statement 2");
    System.out.println(statement2.getSql());
    System.out.println(statement2.getParameters());
    System.out.println(statement2.getRecord());
    System.out.println();
  }

}
