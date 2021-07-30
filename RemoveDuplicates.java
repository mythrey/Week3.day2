package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "PayPal India";

		// Convert it into a character array
		char[] value1 = value.toCharArray();
		System.out.println(value1);
		// Declaring a Set
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		// Iterate character array and add it into charSet
		for (int i = 0; i < value1.length; i++) {
			char lowerCase = Character.toLowerCase(value1[i]);
			boolean add = charSet.add(lowerCase);

			if (add == false) {
				dupCharSet.add(lowerCase);
			}

		}
		System.out.println("Original character set : charSet :" + charSet);
		System.out.println("Duplicate character set : dupCharSet :" + dupCharSet);
		// Check the dupCharSet elements and remove those in the charSet
		charSet.removeAll(dupCharSet);
		System.out.println("****************************");
		System.out.println("Original character set : charSet :" + charSet);
		System.out.println("Duplicate character set : dupCharSet : " + dupCharSet);

		// Iterate using charSet, Check the iterator variable isn't equals to an empty
		// space, print it
		System.out.println("****************************");
		System.out.println("Printing without space in charset : "); 
		for (Character space : charSet) {
			if (space != ' ') {
				System.out.println(space);
			}
		}

	}

}
