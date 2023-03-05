package icbt.batch3.helpers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArrayCompareTest {

	@Test
	public void testArrayCompare_Basic() {	
		
		int [] numbers = {2, 5, 20, 13};
		int [] expected = {2, 5, 13, 20};
		
		Arrays.sort(numbers);
		
        assertArrayEquals(expected, numbers) ;
	}
}
