package exercises;

import java.util.ArrayList;
import java.util.List;
import examples.FileHelper;

public class Palindrome {

	List<String> words = new ArrayList<String>();

	public Palindrome() {
		words = loadWords();
	}

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}

	public boolean wordExists(String string) {
		return words.contains(string);
	}

	public boolean isPalindrome(String string) {
		StringBuilder builder = new StringBuilder(string);
		if (wordExists(string) && string.equals(builder.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}
}
