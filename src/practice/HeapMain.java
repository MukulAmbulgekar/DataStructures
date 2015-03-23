package practice;

public class HeapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Heap heap=new Heap(15);
    heap.insert(100);
    heap.insert(90);
    heap.insert(80);
    heap.insert(30);
    heap.insert(60);
    heap.insert(50);
    heap.insert(70);
    heap.insert(20);
    heap.insert(10);
    heap.insert(40);
    
    heap.displayHeap();
    heap.insert(53);
    System.out.println("Removed Element is:-"+heap.remove().getData());
    heap.displayHeap();
  
   // heap.change(0, 43);
    //heap.displayHeap();
    
	}

}
