import java.util.List;


public class Deck extends Card
{
  private Card [] deck = new Card[52]; 
  public int value = 2;
  public Deck()
  {
      for(int i = 0; i<deck.length; i++)
      {
          
          if(i<13)
          {
              deck[i]= new Card("Hearts",value);
              value++;
           }
          if(i==13 || i== 27 || i == 40 )
          {
              value = 2;
            }
          if(i > 12 && i < 27)
          {
              deck[i]= new Card("Spades",value);
              value++;
           }  
           
          if(i > 26 && i < 40)
          {
              deck[i]= new Card("diamonds",value);
              value++;
           }  
           if(i > 39 && i < 53)
          {
              deck[i]= new Card("Clubs",value);
              value++;
           }  
      }
  }
   
  public void draw()
  {
      
      System.out.println("You have drawn " + deck[(int)(Math.random()*52)]);
    }
  

}