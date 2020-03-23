package com.datastructure.linkedlist;

public class Sum {
	/**
	 * 数组求和
	 */
	//用户使用，调用求和函数
	public static int sum(int[] arr){
		return sum(arr,0);
	}
	
	//系统内部进行求和递归，除了传入数组外， 还需要一个左边界
	public static int sum(int[] arr, int l){
		if(l == arr.length)
			return 0;
		
		return arr[l] + sum(arr,l + 1);
	}
	
	public static void main(String args[]){
		int[] nums = {1,2,3,4,5,6,7,8};
		System.out.println(sum(nums));
	}
}
