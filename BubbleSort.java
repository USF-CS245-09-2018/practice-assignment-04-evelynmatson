import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {
	public void sort(int[] a) {
		for (int nSortedNumbers = 0; nSortedNumbers < a.length-1; nSortedNumbers++) {
			// System.out.println("nSortedNumbers = " + nSortedNumbers);

			boolean madeASwap=false;

			for (int swapping = 1; swapping<a.length - nSortedNumbers; swapping++) {
				// System.out.println("\tswapping = " + swapping);
				// System.out.println("\tComparing a[" + swapping + "-1]=" + a[swapping-1] + " with a[" + swapping+ "]=" +a[swapping]);

				if (a[swapping-1]>a[swapping]) {
					swap(a,swapping,swapping-1);
					madeASwap=true;
				}

			}

			if (!madeASwap) {	// If no swaps were made on this run, then we're done!
				return;
			}


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
		SortingAlgorithm sorter = new InsertionSort();
		sorter.sort(arrayToTest);
		// System.out.println("Finished as: " + Arrays.toString(arrayToTest));
	}
}