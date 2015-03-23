package practice;

public class PrioritiyQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue(10);
		p.insert(25);
		//p.display();
		p.insert(35);
		//p.display();
		p.insert(45);
		p.insert(55);
		p.insert(15);
		p.insert(5);
		p.insert(40);
		p.display();
		System.out.println("Max Element is:-"+p.max());
		System.out.println("Min Element is:-"+p.min());
		while(!p.isEmpty()){
		System.out.print(p.remove()+"\t");
		}
	}

}
