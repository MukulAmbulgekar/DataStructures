package practice;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleLinkedList list=new SimpleLinkedList();
		list.insertLink("Mukul",25);
		list.insertLink("Sayali",25);
		list.insertLink("Akshay",28);
		list.insertLink("Mahesh",26);
		list.insertLink("Ratan",24);
		list.insertLink("Neeraj",22);
		list.insertAfter("Anjali",51, "Mukul");
		list.insertAfter("Pappa",45, "Anjali");
		list.displayList();
		
	
		Link searchLink=list.searchLink("aaa");
		if(searchLink!=null){
		System.out.println("Link is found:- "+"Name:-"+searchLink.name+" Age:-"+searchLink.age);
		}
		else{
			System.out.println("Not Found");
		}
		Link deleteKey=list.deleteLinkKey(25);
		if(deleteKey!=null){
		System.out.println("Deleted Link is:- "+"Name:-"+deleteKey.name+" Age:-"+deleteKey.age);
		list.displayList();
		}
		else{
			System.out.println("Not Found");
		}
		
		while (!list.isEmpty()){
			Link deleteLink=list.deleteLink();
			System.out.println("Deleted Link is:- "+"Name:-"+deleteLink.name+" Age:-"+deleteLink.age);
			list.displayList();
			
		}
	}

}
