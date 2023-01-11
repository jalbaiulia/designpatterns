package creational.abstractFactory;

public abstract class AbstractCardFactory {

  public static AbstractCardFactory getCardFactory(int creditScore) {
    if (creditScore > 650) {
      return new AmexCardFactory();
    } else {
      return new VisaCardFactory();
    }
  }

  public abstract CreditCard getCard(CardType cardType);
}
