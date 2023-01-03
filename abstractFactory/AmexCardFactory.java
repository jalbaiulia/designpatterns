package abstractFactory;

import static abstractFactory.CardType.GOLD;
import static abstractFactory.CardType.PLATINUM;

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
