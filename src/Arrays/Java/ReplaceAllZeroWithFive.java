package Arrays.Java;

public class ReplaceAllZeroWithFive {

	// Java Specific Code
	public int convertfive(int num) {
		String nums = Integer.toString(num);
		nums = nums.replace('0', '5');
		return Integer.parseInt(nums);
	}

	// Time Complexity :-
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
