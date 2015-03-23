	package practice;

public class QueueLinkedList {
	DoubleEndedList list=new DoubleEndedList();
	public void insert(String name,int age){
		list.insertLast(name, age);
	}
	
public Link remove(){
		return list.deleteFirst();
	}
public void DisplayQueue(){
	list.displayList();
}
}
