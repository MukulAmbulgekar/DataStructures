package practice;

public class QueueLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList queue=new QueueLinkedList();
		queue.insert("a", 20);
		queue.insert("b", 40);
		queue.DisplayQueue();
		queue.insert("c", 60);
		queue.insert("d", 80);
		queue.DisplayQueue();
		queue.remove();
		queue.remove();
		queue.DisplayQueue();
	}

}
