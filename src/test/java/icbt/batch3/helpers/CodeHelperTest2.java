package icbt.batch3.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeHelperTest2 {

	CodeHelper helper = new CodeHelper();
	
	@Test
	void testCreateCode_Basic() {
		String actual = helper.createCode("TEXT");
		String expected = "COD-TEXT-INV";
		
        assertEquals(expected, actual);
	}

	@Test
	void testCreateCode_withDash() {
        assertEquals("COD-TEXT_2-INV", helper.createCode("TEXT-2"));
	}
	
	@Test
	void testCreateCode_Lowercase() {
        assertEquals("COD-TEXT-INV", helper.createCode("text"));
	}
}
