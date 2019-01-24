package testPackage;

import cardPackage.Card;
import cardPackage.Deck;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class DeckTest
{
	Deck myDeck=new Deck();

	
	@Before
	public void setUp()
	{
		myDeck=new Deck();
	}
	//@Test
	public void testConstructor()
	{
		
	}
	@Test
	public void testShuffle()
	{
		Card c=myDeck.peek();
		myDeck.Shuffle();
		Card c1=myDeck.peek();
		assertTrue(c!=c1);
	}
	@Test
	public void testCount()
	{
		assertEquals(myDeck.count(),54);
	}
	@Test
	public void testDraw()
	{
		Card c=myDeck.peek();
		Card c1;
		c1=myDeck.draw();
		assertEquals(c,c1);
		Card c3=myDeck.peek();
		assertTrue(c!=c3);
	}
	@Test
	public void testIsEmpty()
	{
		int count=myDeck.count();
		for(int i=0;0<=count;i++)
		{
			myDeck.draw();
		}
		assertEquals(myDeck.count(),0);
	}
	

}
