package practice;

public class SampleArray {

	public static void main (String args[]){
		
	int j=5;
	int searchkey=45;
	int i,k;
	int delete_element=45;
	int number[];
	number=new int[10];
for (i=0;i<10;i++){
	number[i]=j+5;
	j+=5;
}
for (i=0;i<number.length;i++){
	
	System.out.println("Array Element:- "+number[i]);
	}
	
	// Search particular element in an array Linear Search
	for(i=0;i<=number.length;i++){
		if(number[i]==searchkey){
			System.out.println("Number found at location:- "+ i);
			break;
		}
		else if(i==number.length) {
			System.out.println("Number not found");
		}
	}
	
	for (j=0;i<number.length;j++){
		
		if(number[j]==delete_element){
			
			break;
		}
		
		
	}
	for (k=j;k<number.length-1;k++){
		System.out.println("hhhhh"+number[k]+k);
		number[k]=number[k+1];
	}
	for (i=0;i<number.length;i++){
		
		System.out.println("Array Element:- "+number[i]);
		}
}
}

