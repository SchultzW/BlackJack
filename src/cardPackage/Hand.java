package cardPackage;
import java.util.*;

public class Hand 
{
    private List<Card>hand=new ArrayList<Card>();
    
    //constructor
    public Hand()
    {
        hand=new ArrayList<Card>();
        
    }
    
    public int Score()
    {
        int score=0;
        for (Card c : hand) 
        {
            score+=c.getValue();
        }
        return score;
    }

    public Boolean Bust(Hand h)
    {
        Boolean bust=false;
        int score=h.Score();
        if(score>21)
        {
            bust=true;
        }
        return bust;
    }

    public void ClearHand()
    {
        for(int i=0;i<hand.size();i++)
        {
            hand.remove(i);
        }
    }
    public void Add(Card c)
    {
        hand.add(c);
    }
    public Card First()
    {
        Card first=hand.get(0);
        return first;
    }

    //new hand


}
