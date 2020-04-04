package com.datastructure.tree;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		/*int[] nums = {5,3,6,8,4,2};
		for(int num : nums)
			bst.add(num);
		
		/////////////////
		//      5      //
		//    /   \    //
		//   3     6   //
		//  / \     \  //
		// 2   4     8 //
		/////////////////
		
		bst.preOrder();
		System.out.println();
		
		//System.out.println(bst);
		
		bst.inOrder();
		System.out.println();
		
		bst.postOrder();
		System.out.println();*/
		
		Random random = new Random();
		int n = 1000;
		for(int i = 0; i < n ;i++)
			bst.add(random.nextInt(10000));
		
		ArrayList<Integer> nums = new ArrayList<>();
		while(!bst.isEmpty())
			nums.add(bst.removeMin());
		
		System.out.println(nums);
		for(int i = 1; i < nums.size(); i++)
			if(nums.get(i - 1) > nums.get(i))
				throw new IllegalArgumentException("Error");
		System.out.println("removeMin test completed.");
		
		for(int i = 0; i < n ;i++)
			bst.add(random.nextInt(10000));
		ArrayList<Integer> numsMax = new ArrayList<>();
		while(!bst.isEmpty())
			numsMax.add(bst.removeMax());
		
		System.out.println(numsMax);
		for(int i = 1; i < numsMax.size(); i++)
			if(numsMax.get(i - 1) < numsMax.get(i))
				throw new IllegalArgumentException("Error");
		System.out.println("removeMax test completed.");
	}

}
