package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = { 3, 2, 10, 4, 6, 7, 2, 3, 3, 6, 7, 1, 5, 1, 8 };
		Set<Integer> setData = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			setData.add(data[i]);
		}
		List<Integer> listData = new ArrayList<Integer>(setData);
		Collections.sort(listData);
		for (int i = 0; i < listData.size()-1; i++) {
			if(listData.get(i+1)!=(listData.get(i)+1))
			{
				System.out.println("The Missing number is "+(listData.get(i)+1));
			}
		}
	}

}
