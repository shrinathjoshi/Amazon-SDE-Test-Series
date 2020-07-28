package Arrays.Java;

/*
@Author :- Shrinath Joshi

https://practice.geeksforgeeks.org/problems/container-with-most-water0535/1/?track=amazon-arrays&batchId=192

Container With Most Water
Given N non-negative integers a1,a2,....an where each represents a point at coordinate (i, ai). N vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i,0). Find two lines, which together with x-axis forms a container, such that it contains the most water.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains an integer N followed by N space-separated integers.

Output:
For each test case, the output is the integer denoting the maximum area of water that can be contained ( maximum area instead of maximum volume as working with 2D)

Your Task :
You only need to implement the given function maxArea. Do not read input, instead use the arguments given in the function and return the desired output.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1<=T<=100
2<=N<=105
1<=A[i]<=100

Example:
Input:
2
4
1 5 4 3
5
3 1 2 4 5
Output
6
12

Explanation:
Testcase 1: 5 and 3 are distance 2 apart. So the size of the base = 2. Height of container = min(5, 3) = 3. So total area = 3 * 2 = 6.
Testcase 2: 5 and 3 are distance 4 apart. So the size of the base = 4. Height of container = min(5, 3) = 3. So total area = 4 * 3 = 12.
 */
public class ContainerWithMostWater {

	// Time complexity :- O(n)
	// Space complexity :- O(1)
	long maxArea(int A[], int len) {
		int result = 0;

		int left = 0;
		int right = A.length - 1;

		while (left < right) {
			result = Math.max(result, Math.min(A[left], A[right]) * (Math.abs(right - left)));
			if (A[left] < A[right])
				left++;
			else
				right--;
		}
		return result;
	}

	public static void main(String[] args) {
		int A[] = { 3, 1, 2, 4, 5 };
		int A1[] = { 1, 5, 4, 3 };

		ContainerWithMostWater mostWater = new ContainerWithMostWater();
		System.out.println(mostWater.maxArea(A, A.length));
		System.out.println(mostWater.maxArea(A1, A1.length));

	}

}
