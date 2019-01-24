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
	public void SetUp()
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
		
		 assertEquals(h.Score(),15);
		 

	 } 
	 @Test
	 public void testBust()
	 {
		
		h.Add(DK);
		assertTrue(h.Bust());
		
	 }
	 @Test
	 public void testClearHand()
	 {
		
		h.ClearHand();
		assertEquals(h.Count(),0);
	 }
	
	 @Test
	 public void testFirst()
	 {
		
		Card first=h.First();
		assertEquals(S5.getSuit(),first.getSuit());
		assertEquals(S5.getcNum(),first.getcNum());
		
	 }
	 @Test
	 public void testAdd()
	 {	
		 Card c=new Card("spades", "five");
		 Hand h1=new Hand();
		 h1.Add(c);
		 assertEquals(h1.First().getSuit(),c.getSuit());
		 assertEquals(h1.First().getcNum(),c.getcNum());
	 }
}
