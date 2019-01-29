package cardPackage;
import java.util.*;

public class Hand 
{
    protected List<Card>hands=new ArrayList<Card>();
    
    //constructor
    public Hand()
    {
        //hands=new ArrayList<Card>();
        
    }
    
    public int score()
    {
        int score=0;
        for (Card c : hands) 
        {
            score+=c.getValue();
        }
        return score;
    }

    public Boolean bust()
    {
        Boolean bust=false;
        int score=this.score();
        if(score>21)
        {
            bust=true;
        }
        return bust;
    }

    public void clearHand()
    {
      
        for(Card c:hands)
        {
        	hands.remove(c);
        }
    }
    public void add(Card c)
    {
        hands.add(c);
    }
    public Card first()
    {
        Card first=hands.get(0);
        return first;
    }
    public int count()
    {
    	 return hands.size();
    	
    }
    public Card indexOf(int i)
    {
    	return hands.get(i);
    }
    

    //new hand


}
