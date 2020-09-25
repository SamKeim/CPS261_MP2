package main;

import java.util.Collections;
import java.util.List;

public class MySelectionSort<T extends Comparable<T>> {

	public static <T extends Comparable<T>> List<T> sort(List<T> itemList) {
		// Sorting was not covered in the CPS 161 course I took for Summer 2020.
		// I would appreciate any feedback on this method, thank you!
		
		// Compares the i item to the j item, looks for the largest difference
		// between items, and swaps the items.
		
		int minIndex = 0;
		for (int i = 0; i < itemList.size(); i++) {
			int min = 0;
			for (int j = i; j < itemList.size(); j++) {
				if ((itemList.get(i)).compareTo(itemList.get(j)) <= min) {
					min = itemList.get(i).compareTo(itemList.get(j));
					minIndex = j;
				}
			}
			
			Collections.swap(itemList, minIndex, i);
		}
		return itemList;
	}

	public static <T> List<T> shuffle(List<T> itemList) {
		// I wrote this up to shuffle the list to confirm in testing that
		// the Sort method was working with StudentID.
		
		for (int i = 0; i < itemList.size(); i++) {
			int rand = (int) (Math.random() * itemList.size());
			Collections.swap(itemList, rand, i);
		}
		return itemList;
	}
}
