package cardPackage;
//import java.util.*;
import java.util.Scanner;
import cardPackage.Hand;

public class cardMain 
{
	String newLine = System.getProperty("line.separator");
	Scanner in = new Scanner(System.in);
	static Deck deck;
	static Hand playerHand;
	static Hand dealerHand;

	public static void main(String args[])
	{
		//System.out.println("");
		//in.nextLine()
		System.out.println("Welcome to Blackjack");
		setUp();
		play();
	}
	//set up
	public static void setUp()
	{
		deck=new Deck();
		playerHand=new Hand();
		Card c=deck.draw();
		playerHand.Add(c);
		c=deck.draw();
		playerHand.Add(c);
		dealerHand=new Hand();
		c=deck.draw();
		dealerHand.Add(c);
		c=deck.draw();
		dealerHand.Add(c);

	}
	public static void playerDisplay()
	{
		
	}
	public static void dealerDisplay()
	{
		
		Card c=dealerHand.First();
		System.out.println("The dealer is showing a "+c.getSuit()+c.getcNum());
	}
	public static void play()
	{
		dealerDisplay();
	}

	
}
