package behavioral.command;

//invoker
public class Switch {

  public void storeAndExecute(Command co){
    co.execute();
  }

}
