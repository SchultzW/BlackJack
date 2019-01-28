package cardPackage;
import java.util.*;

public class Hand 
{
    protected List<Card>hands=new ArrayList<Card>();
    
    //constructor
    public Hand()
    {
        hands=new ArrayList<Card>();
        
    }
    
    public void ClearHand()
    {
      
        for(Card c:hands)
        {
        	hands.remove(c);
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
