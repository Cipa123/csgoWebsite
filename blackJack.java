import java.util.ArrayList


public class blackJack extends Card
{
  private List<Card> cardList;
  
  public blackJack()
  {
    cardList = new ArrayList<Card>();
  }
  
  public void addCard(String a, int c)
  {
   Card b = new Card(a,c);
   cardList.add(b);

  }

}
