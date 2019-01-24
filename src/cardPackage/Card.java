package cardPackage;

public class Card 
{
	private int value; //actual point value of the card
	private String suit;
	private String cNum; //num or letter displayed on card
	private String[] suits = {"clubs","hearts","spades","diamonds"};
	private String[] nums= {"ace","two","three","four","five","six","seven","eight","nine",
			"ten","jack","queen","king"};
	
	
	private void setValue(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		int value=0;
		switch(this.cNum)
		{
		case "ace":
			value= 11;
			break;
		case "two":
			value= 2;
			break;
		case "three":
			value= 3;
			break;
		case "four":
			value= 4;
			break;
		case "five":
			value= 5;
			break;
		case "six":
			value= 6;
			break;
		case "seven":
			value= 7;
			break;
		case "eight":
			value= 8;
			break;
		case "nine":
			value= 9;
			break;
		case "ten":
		case "jack":
		case"queen":
		case"king":
			value= 10;
			break;
		}
		return value;
	}
	private void setSuit(String suit)
	{
		this.suit=suit;
	}
	public String getSuit()

	{
		return this.suit;
	}
	public String getcNum()
	{
		return this.cNum;
	}
	private void SetCNum(String cNum)
	{
		this.cNum=cNum;
	}
	
	public Card(String aSuit,String aCNum)
	{
		suit=aSuit;
		
		cNum=aCNum;
	}
	public String toString(Card aCard)
	{
		return aCard.cNum +"of"+ aCard.suit;
	}
	
	
	
}
