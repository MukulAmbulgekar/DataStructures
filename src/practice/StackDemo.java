package practice;

public class StackDemo {

	char [] text;
	
	String reverse="";
	int word_length,top;
	public StackDemo( int size){
		text= new char[size];
		word_length=size;
		top=-1;
		
	}
	
	boolean check=false;
	   public boolean palindrome(String input){
		   int m=input.length()-1;
		    for (int k=0;k<input.length();k++){
		    	
		    		if(input.charAt(k)==input.charAt(m)){
		    			check=true;
		    		
		    			
		    		}
		    		else{
		    			check=false;
		    			break;
		    		}
		    		m--;
		    		//System.out.println(input.charAt(k));
		    	}
		    	
		    
		    	
		    
		    System.out.println(check);
		    return check;
		    }
	
	public void push(char text1){
		
		if(!isFull()){
		top++;
		//word_length++;
		text[top]=text1;
		//System.out.println("Element pushed to stack:- ");
		//System.out.println(text1);
		
		}
		else {
			
			System.out.println("Stack is full");
		}
	}
	
	public void pop(){
	
		if(!isEmpty()){
		System.out.println("Popped element is :-"+text[top]);
		reverse=reverse+text[top];
		top--;
		}
		else {
			
			System.out.println("Stack is empty");
		}
	
	}
	
	public boolean isPalindrome(String input){
		reverse="";
		String reverse_string=reverseString(input);
		
		if(input.equals(reverse_string)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String reverseString(String input){
		int j=0;
		for (int i=0;i<input.length();i++){
			push(input.charAt(i));
		}
		while(j<input.length()){
		pop();
		j++;
			//top--;
		}
		
		
		return reverse;
	}
	
	public boolean isFull (){
		
		if ((top==word_length-1)){
			
			return true;
			
		}
		else {
			return false;
			
		}
	}
	
	public boolean isEmpty(){
		if(top==-1){
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
