package behavioral.chain;

public class Boss extends Handler{

  @Override
  public void handleRequest(Request request) {
    if (RequestType.CONFERENCE.equals(request.getType())){
      System.out.println("Boss approved");
    } else {
      supervisor.handleRequest(request);
    }
  }
}
