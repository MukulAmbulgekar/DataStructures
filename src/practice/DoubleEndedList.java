package practice;

public class DoubleEndedList {

	Link first;
	Link last;
	
	public DoubleEndedList(){
		first=null;
		last=null;
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	public void insertFirst(String name,int age){
		Link newLink=new Link(name,age);
		if(isEmpty()){
			last=newLink;
			
		}
		newLink.next=first;
		first=newLink;
	}
	public void insertLast(String name,int age){
		Link newLink=new Link(name,age);
		if(isEmpty()){
			first=newLink;
			last=newLink;
			
		}
		
		last.next=newLink;
last=newLink;

	}
	public void displayList(){
		Link currentLink=first;
		System.out.println("****************");
		while(currentLink!=null){
			System.out.println("Name:-"+currentLink.name+" Age:-"+currentLink.age);
			currentLink=currentLink.next;
		}
	}
	
	public Link deleteFirst(){
		Link temp=first;
		first=first.next;
		return temp;
	}
	public Link deleteLast(){
		Link current=first;
		Link previous=first;
		while (current.next!=null){
			previous=current;
			current=current.next;
		}
		if(current==last){
			last=previous;
			last.next=null;
		}
	return current;
	}
	
/*	public void sort(){
		
		Link current=first;
		//Link previous=first;
		while(current.next!=null){
			//previous=current;
			
			System.out.println(current.age);
			System.out.println(current.next.age);
			displayList();
			if(current.age>current.next.age){
				current.next=current.next.next;
				current=current.next;
			}
			current=current.next;
			
		}
		
	}*/
	


		
	
}
