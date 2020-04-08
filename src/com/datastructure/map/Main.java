package com.datastructure.map;

import java.util.ArrayList;

public class Main {

	private static double testMap(Map<String,Integer> map, String fileName){
		long startTime = System.nanoTime();
		
		System.out.println(fileName);
		ArrayList<String> words = new ArrayList<>();
		if(FileOperation.readFile(fileName, words)){
			System.out.println("Total words:" + words.size());
			
			for(String word : words)
				map.add(word,map.get(word) + 1);
			System.out.println("Total different word:" + map.getSize());
		}
		long endTime = System.nanoTime();
	
		return(endTime - startTime)/1000000000.0;
	}
	
	public static void main(String[] args){
		String fileName = "pride-and-prejudice.txt";
		
		BinarySearchTreeMap<String,Integer> bstMap = new BinarySearchTreeMap<>();
		double time1 = testMap(bstMap,fileName);
		System.out.println("BST map:" + time1 + "s");
		
		System.out.println();
		
		LinkedListMap<String,Integer> linkedListMap = new LinkedListMap<>();
		double time2 = testMap(linkedListMap,fileName);
		System.out.println("Linked List Map:" + time2 + "s");
	}
}
