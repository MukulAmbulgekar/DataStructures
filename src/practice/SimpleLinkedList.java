package practice;

public class SimpleLinkedList {

	public Link first;
	
	public SimpleLinkedList(){
		first=null;
	}
	public boolean isEmpty(){
		return(first==null);
	}
	
	public void insertLink(String name,int age){
		Link newLink=new Link(name,age);
		//System.out.println(first+"*************");
		newLink.next=first;
		first=newLink;
		//System.out.println(first+"*******Current******");
		//System.out.println(first.next+"******Next*******");
	}
	public void displayList(){
		
		Link currentLink=first;
		while(currentLink!=null){
			System.out.println("Name:-"+currentLink.name+" Age:-"+currentLink.age);
			currentLink=currentLink.next;
		}
	}
	public Link deleteLink(){
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	public Link searchLink(String name){
		Link searchLink=first;
		if(!isEmpty()){
			
			while(searchLink!=null){
			//	System.out.println("Hello"+searchLink.name);
				if(searchLink.name==name){
					System.out.print("Found");
					break;
				}else{
					searchLink=searchLink.next;
				}
				
			}
			
		}
		else {
			
			System.out.println("List is empty");
		}
		return searchLink;
	}
	
	public Link deleteLinkKey(int age){
		Link current=first;
		Link previous=first;
		if(!isEmpty()){
			while(current.age!=age){
				if(current.next==null){
					return null;
				}
				else{
					previous=current; // Storing preious link into previous before incrementing next link i.e. current.next
					current=current.next;
				}
			}
			if(current==first){
				first=first.next;
			}
			else{
				previous.next=current.next;
			}
			
		}else{
			System.out.println("List is Empty");
		}
		return current;
	}
	
	public void insertAfter(String name,int age,String after_name){
		Link current=first;
		Link newLink=new Link(name,age);
		while(current.name!=after_name){
			if(current.next==null){
				break;
			}else{
				current=current.next;
			}
		}
		
		if(current.next!=null){
		newLink.next=current.next;
		current.next=newLink;
		}
		else if(current.next==null) {
			current.next=newLink;
			newLink.next=null;
		}
	}
}
