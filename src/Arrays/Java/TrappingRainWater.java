package Arrays.Java;

/*
https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1/?track=amazon-arrays&batchId=192


Given an array arr[] of N non-negative integers representing the height of blocks at index i as Ai where the width of each block is 1. Compute how much water can be trapped in between blocks after raining.
The structure is like below:
|  |
|_|
We can trap 2 units of water in the middle gap.



Example 1:

Input:
N = 4
arr[] = {7,4,0,9}
Output: 10
Explanation: Water trapped by the
block of height 4 is 3 units, block
of height 0 is 7 units. So, the
total unit of water trapped is
10 units.
Example 2:

Input:
N = 3
arr[] = {6,9,9}
Output: 0
Explanation: No water will be trapped.
Your Task:
The task is to complete the function trappingWater() which returns the total amount of water that can be trapped.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
3 <= N <= 107
0 <= Ai <= 108
 */
public class TrappingRainWater {

	// Time complexity :- O(n)
	// Space complexity :- O(n)
	int trappingWater(int arr[], int n) {

		int left[] = new int[n];
		int right[] = new int[n];

		int result = 0;

		int currMax = arr[0];
		for (int i = 0; i < n; i++) {
			if (currMax < arr[i])
				currMax = arr[i];
			left[i] = currMax;
		}

		currMax = arr[n - 1];
		for (int i = n - 1; i >= 0; i--) {
			if (currMax < arr[i])
				currMax = arr[i];
			right[i] = currMax;
		}

		for (int i = 0; i < n; i++) {
			result += Math.min(left[i], right[i]) - arr[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int N = 7, arr[] = { 8, 8, 2, 4, 5, 5, 1 };

		System.out.println(new TrappingRainWater().trappingWater(arr, N));
		System.out.println(new TrappingRainWater().trappingWaterOptimal(arr, N));

	}

	// Time complexity :- O(n)
	// Space complexity :- O(1)
	// reference :- https://www.youtube.com/watch?v=XqTBrQYYUcc

	private int trappingWaterOptimal(int[] arr, int n) {

		if (n < 3)
			return 0;

		int totalWater = 0;

		int left = 0;
		int right = n - 1;

		int leftMax = arr[left];
		int rightMax = arr[right];

		while (left < right) {
			leftMax = Math.max(leftMax, arr[left]);
			rightMax = Math.max(rightMax, arr[right]);

			if (leftMax > rightMax) {
				totalWater += (rightMax - arr[right]);
				right--;
			} else {
				totalWater += (leftMax - arr[left]);
				left++;
			}
		}

		return totalWater;
	}

}
