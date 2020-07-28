package Arrays.Java;

public class BinaryArraySorting {
	int[] sortBinaryArray(int arr[], int n) {
		int pivot = -1;
		int current = 0;
		while (current < n) {

			if (arr[current] == 0) {
				pivot++;
				int temp = arr[pivot];
				arr[pivot] = arr[current];
				arr[current] = temp;
			}
			current++;
		}
		return arr;
	}

	public static void main(String[] args) {

		// int arr[] = { 1, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
		int arr[] = { 0, 1 };

		BinaryArraySorting binaryArraySorting = new BinaryArraySorting();
		int result[] = binaryArraySorting.sortBinaryArray(arr, arr.length);

		for (int res : result)
			System.out.print(res + " ");

	}

}
