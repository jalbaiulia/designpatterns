package behavioral.chain;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

  public static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    logger.setLevel(Level.FINER);
    ConsoleHandler handler = new ConsoleHandler();
    handler.setLevel(Level.FINER);
    logger.addHandler(handler);

    logger.fine("fine");
    logger.finer("finer");
    logger.finest("finest");

    ////////////////////////////////

    Boss boss = new Boss();
    VP vp = new VP();
    CEO ceo = new CEO();

    boss.setSupervisor(vp);
    vp.setSupervisor(ceo);
    boss.handleRequest(new Request(2000, RequestType.PURCHASE));
    boss.handleRequest(new Request(200, RequestType.PURCHASE));
    boss.handleRequest(new Request(2000, RequestType.CONFERENCE));

  }
}
