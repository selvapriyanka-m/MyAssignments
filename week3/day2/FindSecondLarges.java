package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLarges {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		Set<Integer> largest = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			largest.add(data[i]);
		}
		List<Integer> list = new ArrayList<Integer>(largest);
		Collections.sort(list);
		System.out.println("The second largest number in the given array is " + list.get(list.size() - 2));
	}

}
