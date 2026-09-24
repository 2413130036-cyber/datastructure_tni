package labsheet11;

public class TestApp {

	public static void main(String[] args) {
		int[] nums1 = {11, 9, 23, 87, 38, 22, 92, 10};
		Sorting sort1 = new Sorting(nums1);
		sort1.bubbleSort();
		sort1.printSortedData();
		System.out.println();

		int[] nums2 = {25, 11, 45, 6, 87, 20, 78, 64};
		Sorting sort2 = new Sorting(nums2);
		sort2.selectionSort();
		sort2.printSortedData();
		System.out.println();

		int[] nums3 = {34, 8, 51, 2, 67, 19, 43, 90};
		Sorting sort3 = new Sorting(nums3);
		sort3.insertionSort();
		sort3.printSortedData();
		System.out.println();

		int[] nums4 = {73, 15, 4, 58, 31, 99, 26, 62};
		Sorting sort4 = new Sorting(nums4);
		sort4.quickSort();
		sort4.printSortedData();
		System.out.println();
	}

}