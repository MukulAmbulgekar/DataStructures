package practice;

public class Factorial {
	
	public int factorial(int n){
	
		if(n==0){
			return 1;
		}
		else{
			return (n* factorial(n-1));
		}
		
	}
	
	public int power(int a, int b){
		
		if(b==0){
			return 1;

		}
		else {
			return (a*power(a,(b-1)));
		}
		
	}
	
public int power_nonrec(int a, int b){
		int res=1;
		while(b>=1){
			res=(res*a);
			b--;
		}
		return res;
		
	}

public int rev_number(int a){
	String number=Integer.toString(a);
	String rev="";
	
	for (int i=number.length()-1;i>=0;i--){
	rev=rev+number.charAt(i);
	}
	System.out.println("Input Number:-"+number);
	a=Integer.parseInt(rev);
	return a;
}

public int rev_number1(int a){
	int number=a;
	int result=0;
	
	while(a!=0){
		System.out.println("Iteration:-"+result);
		result=result*10+a%10;
		a=a/10;
	}
	
	if(number==result){
		System.out.println("Number is Palindrome");
	}
	else{
		System.out.println("Number is not Palindrome");
	}
	return result;
}


}
