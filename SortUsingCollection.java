package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		List<String> values = new ArrayList<String>();
		values.add("Google");
		values.add("Microsoft");
		values.add("TestLeaf");
		values.add("Maverick");

		// print array values
		System.out.println("Array values : " + values);
		//length of array
		System.out.println("****************************");
		System.out.println("Length of array :" + values.size());
		// sorting array
		System.out.println("****************************");
		Collections.sort(values);
		System.out.println("Sorted array list :");
		System.out.println(values);
		// iterate in reverse order
		System.out.println("****************************");
		Collections.reverse(values);
		System.out.println("Reversed order array list :");
		System.out.println(values);
		System.out.println("****************************");
		//for (String ro : values) {
			//System.out.println(ro);}
		for (int i = 0; i < values.size(); i++) {
			String string = values.get(i);
			System.out.println(string);
			
		}
		
	}

}
