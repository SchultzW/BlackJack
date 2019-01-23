package cardPackage;
import cardPackage.Card;
import java.util.*;
import java.util.Random;

public class Deck 
{
    private static List<Card>deck=new ArrayList<Card>();
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
                deck.add(c);
            }
        }
    }
    public List<Card> getDeck()
    {
        return deck;
    }
    
    public void Shuffle()
    {
        Card temp;
        int count=deck.size();
        Random rand = new Random();
        for(int i=0;i<200;i++)
        {
            int n=rand.nextInt(count)+1;
            temp=deck.get(n);
            deck.remove(n);
            deck.add(temp);
        }
        
    }
    public Boolean isEmpty()
    {
        if(deck.size()==0)
        {
            return true;
        }
        else
        return false;
    }

    public Card draw()
    {
        Card c=deck.get(0);
        deck.remove(0);
        return c;
    }

    public int count()
    {
        int count=deck.size();
        return count;
    }
}
