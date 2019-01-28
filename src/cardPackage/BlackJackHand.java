package cardPackage;

import java.util.List;

public class BlackJackHand extends Hand
{

	public BlackJackHand()
	{
		super();
	}
	  public Boolean Bust()
	    {
	        Boolean bust=false;
	        int score=this.Score();
	        if(score>21)
	        {
	            bust=true;
	        }
	        return bust;
	    }
	   public int Score()
	    {
	        int score=0;
	        for (Card c : hands) 
	        {
	            score+=c.getValue();
	        }
	        return score;
	    }
	   public Boolean BlackJack()
	   {
		   if(this.Score()==21)
		   {
			   return true;
		   }
		   else return false;
	   }
}
