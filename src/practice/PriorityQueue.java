package practice;

public class PriorityQueue {

	private int arraySize;
	private int[] numbers;
	private int index;

	public PriorityQueue(int size) {
		arraySize = size;
		numbers = new int[size];
		index = 0;
	}
	public void insert (int element){
		int i;
		if(index==0){
			numbers[index]=element;
			index++;
		}
		else{
			for (i=index-1;i>=0;i--){
				if(element>numbers[i]){
					//System.out.println("I:-"+numbers[i+1]+" "+index);
					numbers[i+1]=numbers[i];
					//System.out.println("I:-"+numbers[i+1]);
				}
				else{
					break;	
				}
			}
			numbers[i+1]=element;
			index++;
		}
	}
	public boolean isEmpty(){
		if(index==0){
			return true;
		}
		else{
			return false;
		}
		
	}
	public int min(){
		return numbers[index-1];
	}
	public int max(){
		return numbers[0];
	}
	public int remove(){
		index--;
		return numbers[index];
	}
	public void display(){
		for (int i=0;i<index;i++){
			System.out.print(numbers[i]+"\t");
		}
		System.out.print("\n");
	}
	

}
