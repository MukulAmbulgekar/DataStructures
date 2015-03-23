package practice;

public class DoubleEndedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoubleEndedList list=new DoubleEndedList();
list.insertFirst("m", 22);
list.insertFirst("a", 44);
list.insertFirst("b", 66);
list.insertLast("c", 11);
list.insertLast("d", 33);
list.insertLast("e", 55);
list.displayList();
list.deleteFirst();
list.displayList();
list.deleteLast();
list.displayList();
list.insertFirst("b", 66);
list.displayList();
list.insertLast("e", 55);
list.displayList();
	}

}
