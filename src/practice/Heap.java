package practice;

public class Heap {
	HeapNode heapArray[];
	int maxSize;
	int currentSize;

	public Heap(int size) {
		maxSize = size;
		heapArray = new HeapNode[size];
		currentSize = 0;
	}

	public boolean isEmpty() {

		if (currentSize == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int node) {
		HeapNode newNode = new HeapNode(node);

		if (currentSize == maxSize) {

			System.out.println("Heap is full");
		} else {
			heapArray[currentSize] = newNode;
			tickleUp(currentSize);
		}
	}

	public void tickleUp(int index) {
		int parent;
		parent = (index - 1) / 2;
		HeapNode bottom = heapArray[index];
		while (index > 0 && bottom.getData() > heapArray[parent].getData()) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (parent - 1) / 2;
		}
		heapArray[index] = bottom;
		currentSize++;
	}

	public HeapNode remove() {
		HeapNode root = heapArray[0];
		heapArray[0] = heapArray[currentSize - 1];
		currentSize--;
		tickleDown(0);
		return root;
	}

	public void tickleDown(int index) {
		HeapNode top = heapArray[index];
		int rightChild, leftChild, largerChild;
		while (index < currentSize / 2) {
			leftChild = (index * 2) + 1;
			rightChild = leftChild + 1;
			if (heapArray[leftChild].getData() > heapArray[rightChild]
					.getData()) {
				largerChild = leftChild;
			} else {
				largerChild = rightChild;
			}
			if (top.getData() > heapArray[largerChild].getData()) {
				break;
			}
			heapArray[index] = heapArray[largerChild];
			index = largerChild;
		}
		heapArray[index] = top;

	}

	public void change (int index,int newValue){
		if(index<0 || index>=currentSize){
			System.out.println("Index out of bound");
		}
		int oldValue=heapArray[index].getData();
		heapArray[index].setData(newValue);
		
		if(newValue>oldValue){
			tickleUp(index);
		}
		else{
			tickleDown(index);
		}
		
	}
	public void displayHeap() {
		for (int i = 0; i < currentSize; i++) {
			System.out.print(heapArray[i].getData() + "\t");

		}
		System.out.print("\n");
		for (int i = 0; i < currentSize; i++) {

			System.out.print(i + "\t");
		}
		System.out.println("Current Size" + currentSize);
	}

}
