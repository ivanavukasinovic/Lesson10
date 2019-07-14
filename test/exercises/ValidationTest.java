package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {
	
	Validation testValidation = new Validation();

	@Test
	void testIsEmailValid() {
		assertTrue(testValidation.isEmailValid("user123@gmail.com"));
		assertTrue(testValidation.isEmailValid("User-123@ni.ac.rs"));
		assertFalse(testValidation.isEmailValid("user:123@gmail.com"));
		assertFalse(testValidation.isEmailValid("user123@gmail..com"));
		assertFalse(testValidation.isEmailValid("user123@gmail"));
		assertFalse(testValidation.isEmailValid("user123gmail.com"));
	}
	
	@Test
	void testIsPhoneNumberValid() throws Exception {
		assertTrue(testValidation.isPhoneNumberValid("+381230123456"));
		assertTrue(testValidation.isPhoneNumberValid("381-18-123456"));
		assertTrue(testValidation.isPhoneNumberValid("+381-61-1234567"));
		assertTrue(testValidation.isPhoneNumberValid("381371234567"));
		assertFalse(testValidation.isPhoneNumberValid("+123-20-123456"));
		assertFalse(testValidation.isPhoneNumberValid("ab1234567c"));
		assertFalse(testValidation.isPhoneNumberValid("+381-45-123456"));
		
		
	}

}
