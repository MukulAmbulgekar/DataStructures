package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackDemoMain {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter string to be reversed:-");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		StackDemo d=new StackDemo(input.length());
		System.out.println("Reverse of String:-"+d.reverseString(input));
	    if(d.isPalindrome(input)){
	    	System.out.println("String is palindrome");
	    }
	    else{
	    	System.out.println("String is not palindrome");
	    }
	   if( d.palindrome(input)){
		   System.out.print("Yes it is palindrome");
	   }
	   else {
		   System.out.print("Not a palindrome");
	   }
	 /*   for (int i=1;i<13;i++){
	    	for(int j=1;j<13;j++){
	    		
	    	
	    	System.out.print((i*j)+" ");
	    
	    	}
	    	System.out.print("\n");
	    }*/
	 
	   

/*d.push('M');
d.push('U');
d.push('K');
d.push('U');
d.push('L');
d.push('A');
d.pop();
d.pop();
d.pop();
d.pop();
d.pop();
d.pop();
*/

	}

}
