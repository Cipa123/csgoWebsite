import java.util.ArrayList


public class blackJack extends Card
{
  private List<Card> cardList;
  
  public void addCard(String a, int c)
  {
   Card b = new Card(a,c);
   cardList.add(b);

  }

}
