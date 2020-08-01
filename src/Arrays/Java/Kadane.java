package Arrays.Java;

/*
@author :- Shrinath Joshi

https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

Kadane's Algorithm
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output: 9
Explanation: Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which
is a contiguous subarray.
Example 2:

Input:
N = 4
arr[] = {-1,-2,-3,-4}
Output: -1
Explanation: Max subarray sum is -1
of element (-1)
Your Task:
The task is to complete the function maxSubarraySum() which returns the sum of subarray with maximum sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 10^6
-10^7 ≤ A[i] <= 10^7
 */
public class Kadane {

	// Time complexity :- O(n)
	// Space complexity :- O(1)
	int maxSubarraySum(int arr[], int n) {
		int maxUntilNow = 0;
		int maxSoFar = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			maxUntilNow += arr[i];
			if (maxUntilNow < arr[i]) {
				maxUntilNow = arr[i];
			}
			if (maxUntilNow > maxSoFar) {
				maxSoFar = maxUntilNow;
			}
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int N = 5, arr[] = { 1, 2, 3, -2, 5 };
		int arr1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

		System.out.println(new Kadane().maxSubarraySum(arr, N));
		System.out.println(new Kadane().maxSubarraySum(arr1, arr1.length));

	}

}
