package creational.abstractFactory;

public class AmexCardFactory extends AbstractCardFactory {

  public AmexCard getCard(CardType cardType) {
    switch (cardType) {
      case PLATINUM:
        return new AmexPlatinumCard();
      default:
        return new AmexGoldCard();
    }
  }
}
