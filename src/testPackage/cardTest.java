package testPackage;

import cardPackage.Card;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class cardTest {

	Card S5=new Card("spades", "five");
    Card DK=new Card("diamonds","king");
	@SuppressWarnings("unused")
	@Before
	public void SetUp()
	{
	     Card S5=new Card("spades", "five");
	     Card DK=new Card("diamonds","king");
	}
	 @Test
	 public void testTrue()
	 {
		
		assertTrue(true);
	 }
	 @Test
	 public void testSuit()
	 {
		
	 	assertEquals(S5.suit,"spades");
	 	assertNotEquals(DK.suit,"Clubs");
	 }
	 @Test
	 public void testNum()
	 {
		
	 	assertEquals(S5.cNum,"five");
	 	assertEquals(DK.cNum,"king");
	 }
	 @Test
	 public void testValue()
	 {
	 	assertEquals(S5.getValue(),5);
	 	assertEquals(DK.getValue(),10);
	 }
	

}
