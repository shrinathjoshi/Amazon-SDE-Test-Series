package Arrays.Java;

/*
https://practice.geeksforgeeks.org/problems/binary-array-sorting5355/1/?track=amazon-arrays&batchId=192

Binary Array Sorting
Given a binary array A[] of size N. The task is to arrange the array in increasing order.

Note: The binary array contains only 0  and 1.

Input:
The first line of input contains an integer T, denoting the test cases. Every test case contains two lines, the first line is N(size of the array) and the second line is space-separated elements of the array.

Output:
Space-separated elements of sorted arrays. There should be a new line between the output of every test case.

Your Task:
Complete the function SortBinaryArray() which takes given array as input and returns the sorted array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Challenge: Try doing it in one pass.

Constraints:
1 < = T <= 100
1 <= N <= 106
0 <= A[i] <= 1

Example:
Input:
2
5
1 0 1 1 0
10
1 0 1 1 1 1 1 0 0 0
Output:
0 0 1 1 1
0 0 0 0 1 1 1 1 1 1
 */
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
