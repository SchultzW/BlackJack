package cardPackage;
import cardPackage.Card;
import java.util.*;

public class Deck 
{
    private  List<Card>deckList=new ArrayList<Card>();
    private String[] suits = {"clubs","hearts","spades","diamonds"};
	private String[] nums= {"ace","two","three","four","five","six","seven","eight","nine",
			"ten","jack","queen","king"};
    
    
    
    public Deck()
    {
        List<Card>deck=new ArrayList<Card>();
        for(int i=0;i<suits.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                Card c=new Card(suits[i],nums[j]);
                deckList.add(c);
            }
        }
    }
    public List<Card> getDeck()
    {
        return deckList;
    }
    
    public void Shuffle()
    {
        Card temp;
        int count=deckList.size()-1;
        Random rand = new Random();
        for(int i=0;i<200;i++)
        {
            int n=rand.nextInt(count)+1;
            temp=deckList.get(n);
            deckList.remove(n);
            deckList.add(temp);
        }
        for(int j=0;j<52;j++)
        {
        	temp=deckList.get(j);
        	deckList.remove(j);
        	int n=rand.nextInt(count)+1;
        	deckList.add(n, temp);
        		
        	
        }
        
    }
    public Boolean isEmpty()
    {
        if(deckList.size()==0)
        {
            return true;
        }
        else
        return false;
    }

    public Card draw()
    {
        Card c=deckList.get(0);
        deckList.remove(0);
        return c;
    }

    public int count()
    {
        int count=deckList.size();
        return count;
    }
    public Card peek()
    {
    	Card c=deckList.get(0);
    	return c;
    }
}
