package behavioral.chain;

public class Request {

  private int amount;
  private RequestType type;

  public Request(int amount, RequestType type) {
    this.amount = amount;
    this.type = type;
  }

  public int getAmount() {
    return amount;
  }

  public RequestType getType() {
    return type;
  }
}
