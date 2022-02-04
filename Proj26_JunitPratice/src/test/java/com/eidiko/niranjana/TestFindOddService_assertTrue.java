package com.eidiko.niranjana;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.eidiko.niranjana.service.FindOddService;

public class TestFindOddService_assertTrue {
	//@Test   //not required
	@ParameterizedTest
	@ValueSource(ints= {29,22,35,46})
	public void testIsOdd(int n)
	{
		FindOddService service = new FindOddService();
		Assertions.assertTrue(service.IsOdd(n),"Check Annotations are added properly or not");
	}
}
