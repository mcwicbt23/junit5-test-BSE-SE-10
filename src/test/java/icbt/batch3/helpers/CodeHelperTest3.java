package icbt.batch3.helpers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeHelperTest3 {

	CodeHelper helper;
	
	@BeforeEach
	public void setup() {
		System.out.println("@Before Test");
		helper = new CodeHelper();
	}
	
	@Test
	public void testCreateCode_Basic() {	
		System.out.println("Basic Test");
        assertEquals("COD-TEXT-INV", helper.createCode("TEXT"));
	}
	
	@Test
	public void testCreateCode_withDash() {
		System.out.println("With Dash Test");
        assertEquals("COD-TEXT_2-INV", helper.createCode("TEXT-2"));
	}
	
	@Test
	public void testCreateCode_Lowercase() {	
		System.out.println("Lowercase Test");
        assertEquals("COD-TEXT-INV", helper.createCode("text"));
	}
}
