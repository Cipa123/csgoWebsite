import java.util.Scanner;

public class Card {
	
	public boolean GetBool(){
		 return isDrawn();
	}

  private String cardName;
  private boolean isDrawn;
  private int value;
  
  
  
  
  
  
  public Card(String a, int c)
  {
    cardName = a;
    setDrawn(false);
    value = c;
    
  }
  public Card()
  {
      cardName = "noName";
       value = -1;
       setDrawn(false);
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
      setDrawn(true);
    }
   public String toString()
   {
       return("The "+getCardValue()+ " of " + getCardName());
    }
public boolean isDrawn() {
	return isDrawn;
}
public void setDrawn(boolean isDrawn) {
	this.isDrawn = isDrawn;
}
}
