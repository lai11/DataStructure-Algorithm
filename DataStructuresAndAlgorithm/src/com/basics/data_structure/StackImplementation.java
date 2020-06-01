package com.basics.data_structure;

public class StackImplementation {

// time complexity: O(1)

	int size;
	int arr[];
	int top;

	public StackImplementation(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("pushed element: " + element);
		} else {
			System.out.println("Stack is full now");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("poped element: " + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public int peak() {
		if (!this.isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	

	public static void main(String[] args) {
		StackImplementation stackImp = new StackImplementation(10);
		stackImp.pop();

		System.out.println("------------");
		stackImp.push(10);
		stackImp.push(20);
		stackImp.push(30);
		stackImp.push(40);
		System.out.println("------------");
		
		stackImp.pop();
		stackImp.pop();
		
		System.out.println(stackImp.peak());
	}
	

}
