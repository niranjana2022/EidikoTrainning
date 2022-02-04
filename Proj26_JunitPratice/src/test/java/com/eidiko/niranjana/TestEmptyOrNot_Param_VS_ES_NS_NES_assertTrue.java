package com.eidiko.niranjana;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import com.eidiko.niranjana.service.EmptyOrNotService;

public class TestEmptyOrNot_Param_VS_ES_NS_NES_assertTrue {

	@ParameterizedTest
	//@ValueSource(strings= {""," ","Chenna"})
	//@EmptySource
	//@NullSource
	@NullAndEmptySource
	public void testIsEmpty(String user)
	{
		EmptyOrNotService service = new EmptyOrNotService();
		assertTrue(service.isEmpty(user)); //isBlank() method allow "whiteSpace" character also, if "wS" there then no error 
	}
}
