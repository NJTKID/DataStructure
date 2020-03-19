package com.datastructure.linkedlist;

public class LinkedList<E> {
	private class Node{
		public E e;
		public Node next;
		
		public Node(E e,Node next){
			this.e = e;
			this.next = next;
		}
		
		public Node(E e){
			this(e,null);
		}
		
		public Node(Node next){
			this(null,next);
		}
		
		public Node(){
			this(null,null);
		}
		
		@Override
		public String toString(){
			return e.toString();
		}
	}
	
	//private Node head;
	private Node dummyHead;	//��������ͷ����Խ������û��ͷ�������⣨�Ż����룩
	private int size;
	
	public LinkedList(){
		//head = null;
		dummyHead = new Node(null,null);
		size = 0;
	}
	
	//��ȡ�����е�Ԫ�ظ���
	public int getSize(){
		return size;
	}
	
	//���������Ƿ�Ϊ��
	public boolean isEmpty(){
		return size == 0;
	}
	
	
	
	//�������index(0-based)λ������µ�Ԫ��e
	//�������в���һ�����õĲ�������ϰ��
	public void add(int index,E e){
		if(index < 0 || index > size)
			throw new IllegalArgumentException("Add failed.Illegal index.");
	
/*		if(index == 0){
			addFirst(e);
		}else{
			Node prev = head;
			for(int i = 0; i < index - 1;i++)
				prev = prev.next;

			prev.next = new Node(e,prev.next); 
			size++;
		}*/
		
		Node prev = dummyHead;
		for(int i = 0;i < index ; i++)
			prev = prev.next;
		
//		Node node = new Node(e);
//		node.next = prev.next;
//		prev.next = node;
		prev.next = new Node(e,prev.next);	//һ�д��������
		size ++;
	}
	
	//������ͷ����µ�Ԫ��e
		public void addFirst(E e){
//			Node node = new Node(e);
//			node.next = head;
//			head = node;
			
			//head = new Node(e,head);
			//size++;
			add(0,e);
		}
	
	//������ĩβ����µ�Ԫ��e
	public void addLast(E e){
		add(size,e);
	}
	
	//�������ĵ�index(0-based)��λ�õ�Ԫ��
	//�������в���һ�����õĲ�������ϰ��
	public E get(int index){
		
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Get failed,Illegal index.");
	
		Node cur = dummyHead.next;
		for(int i = 0;i < index;i++)
			cur = cur.next;
		return cur.e;
	
	}
	
	//�������ĵ�һ��Ԫ��
	public E getFirst(){
		return get(0);
	}
	
	//�����������һ��Ԫ��
	public E getLast(){
		return get(size - 1);
	}
	
	//�������ĵ�index(0-based)��λ�õ�Ԫ��
	//�������в���һ�����õĲ�������ϰ��
	public void set(int index,E e){
		
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Set failed,Illegal index.");
	
		Node cur = dummyHead.next;
		for(int i = 0;i < index;i++)
			cur = cur.next;
		cur.e = e;
	}
	
	//�����������Ƿ���Ԫ��e
	public boolean cotains(E e){
		Node cur = dummyHead.next;
		while(cur != null){
			if(cur.e.equals(e))
				return true;
			cur = cur.next;
		}
		return false;
	}
	
	//��������ɾ��index(0-based)λ�õ�Ԫ�أ�����ɾ����Ԫ��
	//�������в���һ�����õĲ�������ϰ��
	public E remove(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Remove failed.Index is illegal.");
	
		Node prev = dummyHead;
		for(int i = 0; i < index; i++)
			prev = prev.next;
		
		Node retNode = prev.next;
		prev.next = retNode.next;
		retNode.next = null;
		size--;
		
		return retNode.e;
	}
	
	//��������ɾ����һ��Ԫ�أ�����ɾ����Ԫ��
	public E removeFirst(){
		return remove(0);
	}
	
	//��������ɾ����һ��Ԫ�أ�����ɾ����Ԫ��
	public E removeLast(){
		return remove(size - 1);
	}
	
	@Override
	public String toString(){
		
		StringBuilder res = new StringBuilder();
		
		/*Node cur = dummyHead.next;
		while(cur != null){
			res.append(cur + "->");
			cur = cur.next;
		}*/
		for(Node cur = dummyHead.next;cur != null;cur = cur.next)
			res.append(cur + "->");
		res.append("NULL");
		
		return res.toString();
	}
}
