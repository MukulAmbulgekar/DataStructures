package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Recusrsion_Java {

	public static void remove_duplicates(){
		int a[]={1,2,3,3,3,2,2,1,1};
		int [] unique;
		int j=0;
		unique=new int[a.length];
		boolean found=false;
		int temp=a[0];
		for ( int i=0;i<a.length;i++){
			if (temp==a[i]&& !found){
				found=true;
			}
			else if(temp!=a[i]){
				unique[j]=temp;
				temp=a[i];
				j++;
			}
		}
		for (int i=0;i<unique.length;i++){
		System.out.println("Unique:-"+ unique[i]);
		}
		
		int end = a.length;
		Set<Integer> set = new HashSet<Integer> ();

		for(int i = 0; i < end; i++){
		  set.add(a[i]);
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove_duplicates();
    Factorial f=new Factorial();
    int result=f.factorial(6);
    int power_result=f.power(5,2);
    int pow_result=f.power_nonrec(5,2);
    System.out.println("Factorial is:-" + result);
    
    System.out.println("Power result is:-" + power_result);
    
    System.out.println("Power result without recusrsion is:-" + pow_result);
    
    int []numbers={1,2,3,4,131,454,123};
    
    for (int i=0;i<numbers.length;i++){
    	f.rev_number1(numbers[i]);
    }
    
   System.out.println("Output Number:-"+ f.rev_number1(1333331));
	}	
	

}
