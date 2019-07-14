package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean isEmailValid(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

	public boolean isPhoneNumberValid(String phoneNumber) {
		/*
		 * For example, in Serbia, phone number is valid if 3 conditions below are
		 * specified: 
		 * 1) Begins with +381 (that's country calling code) 
		 * 2) Then contains 2 digits in range 10-27, or 30-37, or 60-69, or number 230 (2- or 3-digit
		 * calling code) 
		 * 3) Then contains 6 or 7 digits of customer number
		 */
		String regex = "^\\+?(381)[- ]?(1[0-9]|2[0-7]|3[0-7]|[230]|6[0-9])[- ]?[0-9]{6,7}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.find();
	}

}
