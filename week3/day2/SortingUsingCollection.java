package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {

		String company[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };
//		Set<String> order = new TreeSet<String>();
		List<String> order = new ArrayList<String>();
		for (int i = 0; i < company.length; i++) {
			order.add(company[i]);
		}
		Collections.sort(order, Collections.reverseOrder());
		System.out.println("The sorted order is"+order);
	}

}
