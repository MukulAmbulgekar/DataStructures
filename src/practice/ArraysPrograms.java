package practice;

public class ArraysPrograms {
	
	public void isPrime (int number) {
		int reminder;
		boolean flag=true;
		for (int i=2;i<=number/2;i++){
			reminder=number%i;
			//System.out.println("**"+reminder+"**"+i);
			if (reminder==0){
				flag=false;
				break;
			}
			
		}
		if(flag){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not a prime number");
		}
	}
	
	public void fibonacci(int number){
			
		int prev=0;
		int next=1;
		int fibonacci=0;
		for (int i =2;i<number;i++){
			System.out.println(prev);
			fibonacci=prev+next;
			prev=next;
			next=fibonacci;
		}
		
	}
	
	public void sum_Digits (int n){
		
		int reminder;
		int sum=0;
		System.out.println("Reverse of number is:-");
		while(n>0){
			
			reminder=n%10;
			
			sum+=reminder;
			n=n/10;
			System.out.print(reminder);
		}
		System.out.println("\nAddition is "+sum);
	}
	
	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    System.out.println(str.substring(1));
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public String reverseString(String str){
		String reverse="";
		if(str.length()==1){
			return str;
		}
		else {
			System.out.println(":"+str.substring(0, str.length()-1));
			reverse+=str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
			return reverse;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str ="mukum";



ArraysPrograms a=new ArraysPrograms();
System.out.println(a.reverseString(str));

System.out.println(reverse(str));

System.out.println("Mukul".substring(3));

if(str.equals(a.reverseString(str))	){
	System.out.println("Palindrome");
}
else {
	System.out.println("Not a Palindrome");
}

for (int i=str.length()-1;i>=0;i--){
	
	System.out.print(str.charAt(i));
	
}
a.fibonacci(10);
	
a.sum_Digits(32145689);
a.isPrime(121);
	
	}
	
}
