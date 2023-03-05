package icbt.batch3.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeHelperTest {

	@Test
	void testCreateCode() {
		CodeHelper helper = new CodeHelper();
		String actual = helper.createCode("TEXT");
		String expected = "COD-TEXT-INV";
		
        assertEquals(expected, actual);
	}
}
