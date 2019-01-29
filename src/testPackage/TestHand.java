package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cardPackage.BlackJackHand;
import cardPackage.Card;
import cardPackage.Hand;

class TestHand 
{

	 BlackJackHand h;
     Card S5;
     Card DK;
     Boolean bool=true;
	@BeforeEach
	void setUp() throws Exception 
	{
		 h=new BlackJackHand();
	     S5=new Card("spades", "five");
	     DK=new Card("diamonds","king");
	     h.add(DK);
	     h.add(S5);
	     bool=true;
	}
	
	
	@Test
	public void testTrue()
	{
		
		assertTrue(true);
	}
	 @Test
	 public void testScore()
	 {
		 h.add(DK);
		 h.add(S5);
		 assertEquals(h.Score(),15);
		 

	 } 
	 @Test
	 public void testBust()
	 {
		h.add(DK);
		h.add(S5);
		h.add(DK);
		assertTrue(h.Bust());
		
	 }
	 @Test
	 public void testClearHand()
	 {
		Hand myHand=new Hand();
		myHand.clearHand();
		assertEquals(0,h.count());
	 }
	
	 @Test
	 public void testFirst()
	 {
		Hand myHand=new Hand();
		myHand.add(DK);
		myHand.add(S5);
		Card first=myHand.first();
		assertEquals(DK.getSuit(),first.getSuit());
		assertEquals(DK.getcNum(),first.getcNum());
		
	 }
	 @Test
	 public void testAdd() throws Exception
	 {	 
		 h.add(DK);
         h.add(S5);
		 Card c=new Card("spades", "five");
		 Hand h1=new Hand();
		 h1.add(c);
		 assertEquals(h1.first().getSuit(),c.getSuit());
		 assertEquals(h1.first().getcNum(),c.getcNum());
	 }
}