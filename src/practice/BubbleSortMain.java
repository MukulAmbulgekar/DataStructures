package practice;

public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort b=new BubbleSort(5);
		/*b.insert(10);
		b.insert(9);
		b.insert(8);
		b.insert(7);
		b.insert(6);*/
		b.insert(2);
		b.insert(4);
		b.insert(3);
		b.insert(5);
		b.insert(1);
		b.display();
		//b.display();
		//b.simpeSearch(100);
		//b.sortMukul();
		//b.bubbleSort1();
		//b.selectionSort();
		b.insertionSort();
		//b.binarySearch(25);
		/*b.binarySearch(8);
		b.binarySearch(89);
		b.binarySearch(0);*/
		b.binarySearch(5);
		
		
	}

}
