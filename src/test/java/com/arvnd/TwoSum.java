package com.arvnd;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
//if the sum of two integer from the given array equals target,need to return those indices
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println(i+","+j);
					break;
					}
				System.out.println("con");
			}
		}
		
	}

}
