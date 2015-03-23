package practice;

public class StackLinkedList {
	
	DoubleEndedList list=new DoubleEndedList();
	public void push(String name,int age){
		list.insertFirst(name, age);
	}
	
public Link pop(){
		return list.deleteFirst();
	}
public void DisplayStack(){
	list.displayList();
}

}
