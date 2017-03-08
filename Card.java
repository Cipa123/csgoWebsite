import java.util.Scanner;

public class Card
{
  private String cardName;
  private boolean isDrawn;
  private int value;
  public Card(String a, int c)
  {
    cardName = a;
    isDrawn = false;
    value = c;
    
  }
  public Card()
  {
      cardName = "noName";
       value = -1;
       isDrawn = false;
    }
  public String getCardName()
  {
      return cardName;
    }
    
  public int getCardValue()
  {
      return value;
    }
  public void makeDrawn()
  {
      isDrawn = true;
    }
   public String toString()
   {
       return("The "+getCardValue()+ " of " + getCardName());
    }
}