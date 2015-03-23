package practice;

class binary_search{
	
	public static void main (String args[]){
	int a[]={1,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	int number=16;
	int min,max,mid;
	min=0;
	max=a.length;
//mid=(min+max)/2;
while(min<=max){
	mid=(min+max)/2;
	if(number==a[mid]){
	System.out.println("Found");
	min=max+1;
	}
	else if (number>a[mid]){
		min=mid+1;
	}
	else if(number<a[mid]){
	max=mid-1;
	}
		
	}

	

}
	
}
