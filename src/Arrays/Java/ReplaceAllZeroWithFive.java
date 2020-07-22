package Arrays.Java;

/*
You are given an integer N. You need to convert all zeroes of N to 5.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a single integer N denoting the number.

Output:
For each test case, there will be a new line containing an integer where all zero's are converted to 5.

Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= T <= 100
1 <= n <= 10000

Example:
Sample Input:
2
1004
121

Sample Output:
1554
121

Explanation:
Test Case 1: There are two zeroes in "1004", on replacing all zeroes with "5", the new number will be "1554".
Test Case 2: Since there are no zeroes in "121", the number remains as "121".

 */
public class ReplaceAllZeroWithFive {

	// Java Specific Code
	public int convertfive(int num) {
		String nums = Integer.toString(num);
		nums = nums.replace('0', '5');
		return Integer.parseInt(nums);
	}

	// Time Complexity :- O(k) , k is the number of digits
	// Space Complexity :- O(1)
	public int convertFiveUsingRecursion(int num) {

		if (num == 0)
			return 0;

		int lastDigit = num % 10;
		if (lastDigit == 0)
			lastDigit = 5;
		num = num / 10;

		return convertFiveUsingRecursion(num) * 10 + lastDigit;
	}

	public static void main(String[] args) {

		System.out.println(new ReplaceAllZeroWithFive().convertFiveUsingRecursion(1050));
	}

}
