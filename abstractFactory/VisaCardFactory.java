package abstractFactory;


public class VisaCardFactory extends AbstractCardFactory {

  @Override
  public VisaCard getCard(CardType cardType) {
    switch (cardType) {
      case PLATINUM:
        return new VisaPlatinumCard();
      default:
        return new VisaGoldCard();
    }
  }
}
