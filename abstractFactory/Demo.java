package abstractFactory;

public class Demo {

  public static void main(String[] args) {
    AbstractCardFactory creditCardFactory = AbstractCardFactory.getCardFactory(700);

    CreditCard card = creditCardFactory.getCard(CardType.GOLD);

    AbstractCardFactory anotherCreditCardFactory = AbstractCardFactory.getCardFactory(500);

    CreditCard anotherCreditCard = anotherCreditCardFactory.getCard(CardType.PLATINUM);

    System.out.println(card);
    System.out.println(anotherCreditCard);
  }

}
