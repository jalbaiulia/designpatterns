package behavioral.chain;

public class VP extends Handler {
  @Override
  public void handleRequest(Request request) {
    if (request.getAmount() < 1000) {
      System.out.println("VP approved");
    } else {
      supervisor.handleRequest(request);
    }
  }
}
