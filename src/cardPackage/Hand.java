package cardPackage;
import java.util.*;

public class Hand 
{
    private List<Card>hands=new ArrayList<Card>();
    
    //constructor
    public Hand()
    {
        hands=new ArrayList<Card>();
        
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

    public void ClearHand()
    {
        for(int i=0;i<hands.size();i++)
        {
            hands.remove(i);
        }
    }
    public void Add(Card c)
    {
        hands.add(c);
    }
    public Card First()
    {
        Card first=hands.get(0);
        return first;
    }
    public int Count()
    {
    	 return hands.size();
    	
    }
    public Card indexOf(int i)
    {
    	return hands.get(i);
    }

    //new hand


}
