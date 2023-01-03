package javaYogi;

public class MaxMinElemInAnArr4 {
// using dynamic programming
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 510, 20};
		int[][] dp = new int[array.length][2];
		dp[0][0] = array[0]; // minimum element
		dp[0][1] = array[0]; // maximum element
		for (int i = 1; i < array.length; i++) {
		    dp[i][0] = Math.min(dp[i-1][0], array[i]); // minimum element
		    dp[i][1] = Math.max(dp[i-1][1], array[i]); // maximum element
		}
		int[] result = dp[array.length-1];
		System.out.println("Minimum element: " + result[0]);
		System.out.println("Maximum element: " + result[1]);
	}
}
