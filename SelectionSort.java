import java.util.Arrays;

public class SelectionSort implements SortingAlgorithm {
	public void sort(int[] a) {
		// Iterate through the array, first finding the lowest and putting it at the beginning, then finding the 2nd lowest... etc. Until the second to last
		for (int sortedUpTo = 0; sortedUpTo < a.length-1; sortedUpTo++) {
			// System.out.println("sortedUpTo = " + sortedUpTo);
			int lowestFound=sortedUpTo;

			// Iterate through the array, looking for the lowest within the unsorted space 
			for (int lookingAt = sortedUpTo+1; lookingAt<a.length; lookingAt++) {
				// System.out.println("\tlookingAt = " + lookingAt);
				// System.out.println("\t  Comparing " + a[lookingAt] + " to " + a[lowestFound]);
				if (a[lookingAt] < a[lowestFound]) {
					lowestFound=lookingAt;
				}
			}

			// System.out.println("\tDECIDED to swap a[" + lowestFound + "]=" + a[lowestFound] + " with a[" + sortedUpTo+ "]=" +a[sortedUpTo]);
			swap(a,lowestFound,sortedUpTo);
			// System.out.println("\t(now array looks like: " + Arrays.toString(a) + ")");

		}
	}

	void swap(int[]a, int swap1, int swap2) {
		int temp = a[swap1];
		a[swap1] = a[swap2];
		a[swap2] = temp;
	}

	public static void main(String[] args) {
		int[] arrayToTest = new int[5];
		arrayToTest[0] = 5;
		arrayToTest[1] = 3;
		arrayToTest[2] = 9;
		arrayToTest[3] = -4;
		arrayToTest[4] = 12;

		// System.out.println("Started as: " + Arrays.toString(arrayToTest));
		SortingAlgorithm sorter = new SelectionSort();
		sorter.sort(arrayToTest);
		// System.out.println("Finished as: " + Arrays.toString(arrayToTest));
	}
}