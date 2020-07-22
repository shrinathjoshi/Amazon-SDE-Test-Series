package com.techdev.AmazonSDE.java.Arrays;

public class ReplaceAllZeroWithFive {
	int convertfive(int num) {
		String nums = Integer.toString(num);
		nums = nums.replace('0', '5');
		return Integer.parseInt(nums);
	}
}
