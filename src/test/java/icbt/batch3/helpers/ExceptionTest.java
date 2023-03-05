package icbt.batch3.helpers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

	@Test
	public void testArraySort_Null() {
	    assertThrows(NullPointerException.class, ()->{
            int [] numbers = null;
            Arrays.sort(numbers);
        });
	}

	@Test
	public void testArraySort_NotNull() {
		assertThrows(NullPointerException.class, ()->{
			int [] numbers = {};
			Arrays.sort(numbers);
		});
	}
}
