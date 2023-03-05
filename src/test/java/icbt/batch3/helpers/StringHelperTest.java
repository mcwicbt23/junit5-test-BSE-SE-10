package icbt.batch3.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AInFirst2() {		
		assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));			
	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirst() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABCAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//		assertFalse("This is custom message", helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
}
