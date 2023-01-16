package behavioral.chain;

public abstract class Handler {

  public Handler supervisor;

  public void setSupervisor(Handler supervisor) {
    this.supervisor = supervisor;
  }

  public abstract void handleRequest(Request request);
}
