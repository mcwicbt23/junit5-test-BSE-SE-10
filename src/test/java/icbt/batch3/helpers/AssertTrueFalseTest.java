package icbt.batch3.helpers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueFalseTest {

	@Test
	public void testAssertTrue_Basic() {			
		String test = "ABC";	
		
        assertTrue(test.startsWith("A"));
	}
	
	@Test
	public void testAssertFalse_Basic() {			
		String test = "ABC";		
        assertFalse(test.startsWith("B"));
	}
	
	@Test
	public void testAssertFalse_withMessage() {			
		String test = "ABC";
		assertFalse(test.startsWith("A"));
	}
}
