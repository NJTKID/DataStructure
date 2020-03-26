package com.datastructure.tree;


//二分搜索树：节点的值大于其所有左子树节点的值，且小于其所有右子树节点的值的二叉树
//二叉树不是支持所有类型，而是支持可比较的类型
public class BinarySearchTree <E extends Comparable<E>>{
	
	private class Node{
		public E e;
		public Node left,right;
		
		public Node(E e){
			this.e = e;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	private int size;
	
	public BinarySearchTree(){
		root = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	//项二分搜索树中添加新的元素e
	public void add(E e){
		if(root == null){
			root = new Node(e);
			size ++;
		}else
			add(root,e);
	}
	
	//向以node为根的二分搜索树中插入元素e，递归算法
	private void add(Node node,E e){
		
		if(e.equals(node.e))
			return;
		else if(e.compareTo(node.e) < 0 && node.left == null){
			node.left = new Node(e);
			size ++;
			return;
		}else if(e.compareTo(node.e) > 0 && node.e == null){
			node.right = new Node(e);
			size ++;
			return;
		}
			
		if(e.compareTo(node.e) < 0)
			add(node.left , e);
		else	//e.compareTo(node.e) > 0
			add(node.right , e);
	}
}
