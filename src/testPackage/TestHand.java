package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cardPackage.Card;
import cardPackage.Hand;

class TestHand 
{

	 Hand h=new Hand();
     Card S5=new Card("spades", "five");
     Card DK=new Card("diamonds","king");
     Boolean bool=true;
	@BeforeEach
	void setUp() throws Exception 
	{
		 Hand h=new Hand();
	     Card S5=new Card("spades", "five");
	     Card DK=new Card("diamonds","king");
	     h.Add(DK);
	     h.Add(S5);
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
		  h.Add(DK);
		     h.Add(S5);
		 assertEquals(h.Score(),15);
		 

	 } 
	 @Test
	 public void testBust()
	 {
		  h.Add(DK);
		     h.Add(S5);
		h.Add(DK);
		assertTrue(h.Bust());
		
	 }
	 @Test
	 public void testClearHand()
	 {
		  h.Add(DK);
		     h.Add(S5);
		h.ClearHand();
		assertEquals(h.Count(),0);
	 }
	
	 @Test
	 public void testFirst()
	 {
		  h.Add(DK);
		     h.Add(S5);
		Card first=h.First();
		assertEquals(S5.getSuit(),first.getSuit());
		assertEquals(S5.getcNum(),first.getcNum());
		
	 }
	 @Test
	 public void testAdd()
	 {	 
		 h.Add(DK);
          h.Add(S5);
		 Card c=new Card("spades", "five");
		 Hand h1=new Hand();
		 h1.Add(c);
		 assertEquals(h1.First().getSuit(),c.getSuit());
		 assertEquals(h1.First().getcNum(),c.getcNum());
	 }
}