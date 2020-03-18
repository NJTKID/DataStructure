package com.datastructure.queue;

public class LoopQueue<E> implements Queue<E>{

	private E[] data;
	private int front,tail;
	private int size;
	
	public LoopQueue(int capacity){
		data = (E[])new Object[capacity + 1];
		front = 0;
		tail = 0;
		size = 0;
	}
	
	public LoopQueue(){
		this(10);
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return front == tail;
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getCapacity(){
		return data.length - 1;//循环队列浪费一个空间
	}

}
