package testPackage;

import cardPackage.Card;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class cardTest {

	Card S5;
    Card DK;
	@SuppressWarnings("unused")
	@BeforeEach
	public void SetUp() throws Exception
	{
	      S5=new Card("spades", "five");
	      DK=new Card("diamonds","king");
	}
	 @Test
	 public void testTrue()
	 {
		
		assertTrue(true);
	 }
	 @Test
	 public void testSuit()
	 {
		
	 	assertEquals(S5.getSuit(),"spades");
	 	assertNotEquals(DK.getSuit(),"Clubs");
	 }
	 @Test
	 public void testNum()
	 {
		
	 	assertEquals(S5.getcNum(),"five");
	 	assertEquals(DK.getcNum(),"king");
	 }
	 @Test
	 public void testValueS5()
	 {
	 	assertEquals(S5.getValue(),5);
	 	
	 }
	 @Test
	 public void testValueDK()
	 {
	 	
	 	assertEquals(DK.getValue(),10);
	 }
	 @Test
	 public void testInvalidSuitConstructor() throws Exception
	 {
		 Throwable exception = assertThrows(Exception.class, () -> {
			 Card c=new Card("cat", "five");
		    });
		    assertEquals("That is not a valid suit for a card", exception.getMessage());
		
		    
	 }
	 @Test
	 public void testInvalidNumConstructor() throws Exception
	 {
		 Throwable exception = assertThrows(Exception.class, () -> {
			 Card c=new Card("club", "cat");
		    });
		    assertEquals("That is not a valid face value for a card", exception.getMessage());
		
		    
	 }

}
