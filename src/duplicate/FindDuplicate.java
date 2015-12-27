package duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] withDuplicates = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 };
		Set<Integer> duplicates = findDuplicates(withDuplicates);
		System.out.println("input array is : "+ Arrays.toString(withDuplicates));
		System.out.println("Duplicate elements found in array are : "+ duplicates);
		
		// now calling our generic method to find duplicates
		String[] myArray = { "ab", "cd", "ab", "de", "cd", "ab" };
		System.out.println("input string array is : "+ Arrays.toString(myArray));
		getDuplicates(myArray);

	}

	//O(n^2) complexity
	public static Set<Integer> findDuplicates(int[] input) {
		Set<Integer> duplicates = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					// duplicate element found
					duplicates.add(input[i]);
					break;
				}
			}
		}
		return duplicates;
	}

	//O(n) complexity
	public static <T extends Comparable<T>> void getDuplicates(T[] array) {
		Set<T> dupes = new HashSet<T>();
		for (T i : array) {
			if (!dupes.add(i)) {
				System.out.println("Duplicate element in array is : " + i);
			}
		}
	}

}
