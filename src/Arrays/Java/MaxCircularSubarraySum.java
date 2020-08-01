package Arrays.Java;

/*
@author:- Shrinath Joshi
https://www.geeksforgeeks.org/maximum-contiguous-circular-sum/
Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum.

Example 1:

Input:
N = 7
arr[] = {8,-8,9,-9,10,-11,12}
Output: 22
Explanation:  Starting from the last
element of the array, i.e, 12, and
moving in a circular fashion, we
have max subarray as 12, 8, -8, 9,
-9, 10, which gives maximum sum
as 22.
Example 2:

Input:
N = 8
arr[] = {10,-3,-4,7,6,5,-4,-1}
Output: 23
Explanation: Sum of the circular
subarray with maximum sum is 23
Your Task:
The task is to complete the function circularSubarraySum() which returns a sum of the circular subarray with maximum sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 10^6
-10^6 <= Arr[i] <= 10^6
 */
public class MaxCircularSubarraySum {
//	public int circularSubarraySum(int a[]) {
//		int n = a.length;
//
//		// Find the miniumum contiguious subarray and total sum
//		int totalSum = 0;
//		int maxSoFar = Integer.MIN_VALUE;
//		int maxEndingHere = 0;
//		for (int i = 0; i < a.length; i++) {
//			totalSum += a[i];
//			int element = -a[i];
//			maxEndingHere = maxEndingHere + element;
//
//			if (maxEndingHere < 0)
//				maxEndingHere = 0;
//
//			if (maxSoFar < maxEndingHere)
//				maxSoFar = maxEndingHere;
//		}
//
//		maxSoFar = -maxSoFar;
//
//		return Math.max(totalSum - maxSoFar, maxSoFar);
//
//	}

	public int circularSubarraySum(int a[]) {
		int totalSum = 0;
		int n = a.length;
		int maxStraightSum = Integer.MIN_VALUE;
		int minStraightSum = Integer.MAX_VALUE;
		int tempMax = 0;
		int tempMin = 0;

		for (int i = 0; i < n; i++) {
			totalSum += a[i];
			tempMax += a[i];

			if (maxStraightSum < tempMax)
				maxStraightSum = tempMax;

			if (tempMax < 0)
				tempMax = 0;

			tempMin += a[i];

			if (minStraightSum > tempMin)
				minStraightSum = tempMin;

			if (tempMin > 0)
				tempMin = 0;

		}

		if (totalSum == minStraightSum)
			return maxStraightSum;

		return Math.max(maxStraightSum, totalSum - minStraightSum);

	}

	public static void main(String[] args) {
		int a[] = { 8, -8, 9, -9, 10, -11, 12 };
		int a1[] = { 10, -3, -4, 7, 6, 5, -4, -1 };
		int a2[] = { -1, 40, -14, 7, 6, 5, -4, -1 };
		int a3[] = { -1, -2, -3, -4, -5 };

		MaxCircularSubarraySum maxSum = new MaxCircularSubarraySum();
		System.out.println(maxSum.circularSubarraySum(a));
		System.out.println(maxSum.circularSubarraySum(a1));
		System.out.println(maxSum.circularSubarraySum(a2));
		System.out.println(maxSum.circularSubarraySum(a3));

	}

}