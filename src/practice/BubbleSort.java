package practice;

public class BubbleSort {

	private int number[];
	private int array_index;
	
	public BubbleSort(int max_size){
	
		number=new int[max_size];
		array_index=0;
	}
	
	public void insert(int element){
		number[array_index]=element;
		
		array_index++;
		//System.out.println("Value of i "+array_index);
		
	}
	
	public void display(){
		
		for(int i=0;i<array_index;i++){
			
		System.out.println("Element:-"+ number[i]);
		} 
	}
	int outer,inner;
	public void bubbleSort(){
		
		for (outer=array_index-1;outer>0;outer--){
			
			for (inner=0;inner<outer;inner++){
				
				if(number[inner]>number[inner+1]){
					
					swap();
					System.out.println("**************Each Iteration**************");
					display();
				}
			}
			System.out.println("After Bubble Sort");
			display();
		}
	}
	
public void bubbleSort1(){
		
		
		boolean swap=true;	
	  while(swap){
	        swap = false;
	        for(int i = 0;i<number.length-1;i++){


	            if(number[i] > number[i+1]){
	                swap(i,i+1);    
	                display();
	                swap = true;
	            }
	        }
	    }
			
			System.out.println("After Bubble Sort");
			display();
		}
	
	
	
	
	public void selectionSort(){
		
		int outer,inner,min;
		
		for(outer=0;outer<number.length-1;outer++){
					min=outer;
						for (inner=outer+1;inner<number.length;inner++){
				
				if(number[inner]<number[min]){
					
					min=inner;
					
				}
				
				
			}
						if(min!=outer){
						swap(min,outer);		
						System.out.println("**************After each swap**************"+min);
						display();
						}
		}
		
	}
	
	public void insertionSort(){
		int i,j,temp,counter=0;
		
		for (i=1;i<number.length;i++){
			temp=number[i];
		
			j=i;
			
			while(j>0&&number[j-1]> temp){
				counter++;
			number[j]=number[j-1];
			System.out.println("**************After each swap**************");
			display();	
			j--;
			}
			if(number[j]!=temp){
			number[j]=temp;
			System.out.println("**************After each swap**************");
			display();	
			}
			
		}
		display();
		System.out.println("Number of comparisons:- "+counter);
	}
	
	
	public void swap(int inner,int outer){
		int temp;
		temp=number[outer];
		number[outer]=number[inner];
		number[inner]=temp;
		
	}
	public void swap(){
		int temp;
		temp=number[inner];
		number[inner]=number[inner+1];
		number[inner+1]=temp;
		
	}
public void sortMukul(){
		
		int outer,inner;
		outer=0;
		//for(outer=0;outer<number.length-1;outer++){
			//min=outer;
			for (inner=outer+1;inner<number.length;inner++){
				if(number[inner]<number[outer]){
					shift(inner,outer);
					
				}
			}
		//}
		System.out.println("After My Sort");
		display();
	}


public void shift(int inner,int outer){
		int temp;
		
		temp=number[inner];
		for (int i=inner;i>outer;i--){
			number[i]=number[i-1];
		}
		number[outer]=temp;
		System.out.println("**************************Shift*****************");
		display();
}
	
	public void simpeSearch(int search_element){
		for (int j=0;j<array_index;j++){
			if(number[j]==search_element){
				System.out.println("Simple Search :- "+search_element+ " found at index "+ j);
				break;
			}
			else if(j==array_index-1){
				System.out.println(search_element+ " not found");
			}
		}
	}
	public void binarySearch(int search_element){
		int i=0;
		int mid_index,max_index,min_index;
		
		max_index=array_index;
		min_index=0;
		mid_index=(max_index+min_index)/2;
		while(i<=array_index){
			//System.out.println(i);
			if(i==array_index){
				
				
					System.out.println("Binary Search :- "+search_element+ " not found ");
					break;
				
			}
			
			else if(number[mid_index]>search_element){
				max_index=mid_index;
				mid_index=(max_index+min_index)/2;
			}
			else if(number[mid_index]<search_element){
				min_index=mid_index;
				mid_index=(max_index+min_index)/2;
			}
			else if(number[mid_index]==search_element){
				
				System.out.println("Binary Search :- "+search_element+ " found at index "+ mid_index);
				break;
			}
			
			 i++;
			
			
		}
	}
	
}
