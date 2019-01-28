package testPackage;

import cardPackage.Card;
import cardPackage.Deck;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DeckTest
{
	Deck myDeck;

	
	@BeforeEach
	public void setUp() throws Exception
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
		assertEquals(myDeck.count(),52);
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
	public void testIsEmpty() throws Exception
	{
		Deck emptyDeck=new Deck();	
		int count=emptyDeck.count()-1;
		for(int i=0;i<=count;i++)
		{
			emptyDeck.draw();
		}
		assertTrue(emptyDeck.isEmpty());
	}
	

}
