package Main;
//import java.util.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import cardPackage.BlackJackHand;
import cardPackage.Card;
import cardPackage.Deck;
import cardPackage.Hand;

public class cardMain 
{
	static String newLine = System.getProperty("line.separator");
	static Scanner in = new Scanner(System.in);
	static Deck deck;
	static BlackJackHand playerHand;
	static BlackJackHand dealerHand;

	public static void main(String args[]) throws Exception
	{
		//System.out.println("");
		//in.nextLine()
		System.out.println("Welcome to Blackjack");
		setUp();
		play();
	}
	//set up
	public static void setUp() throws Exception
	{
		deck=new Deck();
		deck.Shuffle();
		playerHand=new BlackJackHand();
		Card c=deck.draw();
		playerHand.add(c);
		c=deck.draw();
		playerHand.add(c);
		dealerHand=new BlackJackHand();
		c=deck.draw();
		dealerHand.add(c);
		c=deck.draw();
		dealerHand.add(c);

	}
	public static void playerDisplay()
	{
		System.out.println(newLine+"Your total score is "+playerHand.Score());
		for(int i=0;i<playerHand.count();i++)
		{
			Card c=playerHand.indexOf(i);
			System.out.println("You have a "+c.getcNum()+" of "+c.getSuit());
		}
	}
	
	public static void dealerDisplay()
	{
		
		Card c=dealerHand.first();
		System.out.println("The dealer is showing a "+c.getcNum()+" of "+c.getSuit());
	}
	public static void play()
	{
		dealerDisplay();
		playerDisplay();
	}
	public static Boolean checkBust(BlackJackHand h)
	{
		Boolean bust=false;
		if(h.bust()==true)
		{
			System.out.println("You busted.");
			bust=true;
		}
		return bust;
	}
	public static void hitOrStay() throws Exception
	{
		System.out.println("Would you like to hit or stay?(hit/stay)");
		String choice=in.nextLine();
		choice=choice.trim();
		choice=choice.toLowerCase();		
		if (choice.equals("hit"))
		{
			hit(playerHand,"You");
		}
		else if(choice.equals("stay"))
		{
			stay(playerHand);
		}
		else
		{
			System.out.println("I'm sorry. I didn't understand that.");
			hitOrStay();
		}
	}
	
	public static void hit(BlackJackHand h,String who) throws Exception
	{
		Card c=deck.draw();
		System.out.println("You get a "+c.getcNum()+" of "+c.getSuit());
		System.out.println("Your new score is "+h.score());
		Boolean bust=h.bust();
		if(bust==false)
		{
			hitOrStay();
		}
		
	}
	public static void stay(BlackJackHand h) throws Exception
	{
		System.out.println("You stay with a score of "+h.score());
		dealerMove();
	}
	public static void dealerMove() throws Exception
	{
		System.out.println("The dealer goes.");
		dealerDecsion();
	}
	public static void checkBlackJack(BlackJackHand hand, String who) throws Exception
	{
		if(hand.BlackJack()==true)
		{
			System.out.println(who+" has BlackJack! How lucky!");
			playAgain();
		}
	}
	public static void dealerDecsion() throws Exception
	{
		TimeUnit.SECONDS.sleep(3);
		if(dealerHand.Bust().equals(true))
		{
			finish();
		}
		if(dealerHand.Score()<=16)
		{
			hit(dealerHand,"The dealer");
			dealerDecsion();
		}
		else
		{	
			System.out.println("The dealer stays.");
			System.out.println("The round is over");
			finish();
		}
			
}
	public static void bust(String who)
	{
		System.out.println(who+" has busted!");
	}
	public static void finish() throws Exception
	{
		System.out.println("You have "+playerHand.Score());
		System.out.println("The dealer has "+dealerHand.Score());
		int pScore=playerHand.Score();
		int dScore=dealerHand.Score();
		
		if(pScore>dScore & playerHand.Bust().equals(false)|dealerHand.Bust().equals(true))
		{
			System.out.println("You win great!");
		}
		else if(dScore>pScore & dealerHand.Bust().equals(false)|playerHand.Bust().equals(true))
		{
			System.out.println("Dealer wins, tough luck.");
		}
		else if(dealerHand.Score()==playerHand.Score()&playerHand.Bust().equals(false))
		{
			System.out.println("House wins a tie sorry(Sucker");
		}
		else if(dealerHand.Bust().equals(true) & playerHand.Bust().equals(true))
		{
			System.out.println("You both busted....");
		}

		playAgain();
	}
	public static void playAgain() throws Exception
	{
		System.out.println("Would you like to play again? (Yes/No)");
		String choice=in.nextLine();
		choice=choice.trim();
		choice=choice.toLowerCase();
		if(choice.equals("yes"))
		{
			System.out.println("Okay one more time!");
			play();
		}
		else if(choice.equals("no"))
		{
				System.out.println("Come again!");
		}
		else
		{
			System.out.println("I'm sorry. I didn't understand that.");
			playAgain();
		}
		
}

	
}
