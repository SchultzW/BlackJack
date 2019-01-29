package testPackage;

import cardPackage.Card;
import cardPackage.Hand;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class HandTest 
{

	 Hand h;
     Card S5;
     Card DK;
     Boolean bool;
	@BeforeEach
	public void SetUp() throws Exception
	{
		 Hand h=new Hand();
	     Card S5=new Card("spades", "five");
	     Card DK=new Card("diamonds","king");
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
		
		 assertEquals(h.score(),15);
		 

	 } 
	 @Test
	 public void testBust()
	 {
		
		h.add(DK);
		assertTrue(h.bust());
		
	 }
	 @Test
	 public void testClearHand()
	 {
		
		h.clearHand();
		assertEquals(h.count(),0);
	 }
	
	 @Test
	 public void testFirst()
	 {
		
		Card first=h.first();
		assertEquals(S5.getSuit(),first.getSuit());
		assertEquals(S5.getcNum(),first.getcNum());
		
	 }
	 @Test
	 public void testAdd() throws Exception
	 {	
		 Card c=new Card("spades", "five");
		 Hand h1=new Hand();
		 h1.add(c);
		 assertEquals(h1.first().getSuit(),c.getSuit());
		 assertEquals(h1.first().getcNum(),c.getcNum());
	 }
}
