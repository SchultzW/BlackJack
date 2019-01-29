package Main;
//import java.util.*;
import java.util.Scanner;

import cardPackage.Card;
import cardPackage.Deck;
import cardPackage.Hand;

public class cardMain 
{
	static String newLine = System.getProperty("line.separator");
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
		deck.Shuffle();
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
		System.out.println(newLine+"Your total score is "+playerHand.Score());
		for(int i=0;i<playerHand.Count();i++)
		{
			Card c=playerHand.indexOf(i);
			System.out.println("You have a "+c.getcNum()+" of "+c.getSuit());
		}
	}
	
	public static void dealerDisplay()
	{
		
		Card c=dealerHand.First();
		System.out.println("The dealer is showing a "+c.getcNum()+" of "+c.getSuit());
	}
	public static void play()
	{
		dealerDisplay();
		playerDisplay();
	}
	public static Boolean checkBust(Hand h)
	{
		Boolean bust=false;
		if(h.Bust()==true)
		{
			System.out.println("You busted.");
			bust=true;
		}
		return bust;
	}
	public void hitOrStay()
	{
		System.out.println("Would you like to hit or stay?(hit/stay)");
		String choice=in.nextLine();
		choice=choice.trim();
		choice=choice.toLowerCase();
		if(choice!="hit"|choice!="stay")
		{
			System.out.println("I'm sorry. I didn't understand that.");
			hitOrStay();
		}
		else if (choice=="hit")
		{
			hit(playerHand);
		}
		else if(choice=="stay")
		{
			stay(playerHand);
		}
	}
	public void hit(Hand h)
	{
		Card c=deck.draw();
		System.out.println("You get a "+c.getcNum()+" of "+c.getSuit());
		System.out.println("Your new score is "+h.Score());
		Boolean bust=h.Bust();
		if(bust==false)
		{
			hitOrStay();
		}
		
	}
	public void stay(Hand h)
	{
		System.out.println("You stay with a score of "+h.Score());
		dealerMove();
	}
	public void dealerMove()
	{
		System.out.println("The dealer goes.");
	}
	

	
}
