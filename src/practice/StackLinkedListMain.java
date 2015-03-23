package practice;

public class StackLinkedListMain {
	
	public static void main(String args[]){
		
		StackLinkedList stack=new StackLinkedList();
		stack.push("a", 20);
		stack.push("b", 40);
		stack.DisplayStack();
		stack.push("c", 60);
		stack.push("d", 80);
		stack.DisplayStack();
		stack.pop();
		stack.pop();
		stack.DisplayStack();
		
	}

}
