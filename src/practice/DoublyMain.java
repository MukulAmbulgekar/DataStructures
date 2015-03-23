package practice;

import java.util.Random;

public class DoublyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList dList = new DoublyLinkedList();
		
		
		Random randomGenerator = new Random();
		
	
		  
		 
		 for (int idx = 1; idx <= 100; ++idx){
		      int randomInt = randomGenerator.nextInt(100);
		     dList.insert_effiecient(randomInt); // most effective
		      //dList.insertFirst(randomInt);
		     // dList.insertLast(randomInt);
		   // dList.insert(randomInt);
		      
		     
		    }
		 dList.displayForward();
		 long startTime = System.currentTimeMillis();
		if (dList.search(5) != null) {
				System.out.println("Found:-" + dList.search(5).iData);
			} else {
				System.out.println("Not found");
			}
		
		dList.deleteFirst();
		dList.displayForward();
		dList.deleteLast();
		dList.displayForward();
		 long endTime   = System.currentTimeMillis();
		 long totalTime = endTime - startTime;
		 System.out.println("Time in Miliseconds"+totalTime);
		

	//	dList.displayForward(); // traverse forward
		//dList.displayBackward(); // traverse backward

		
		/* will search element depending upon searchkey greater than o less than root element*/
		/*if (dList.search(25) != null) {
			System.out.println("Found:-" + dList.search(35).iData);
		} else {
			System.out.println("Not found");
		}

		if (dList.search(35) != null) {
			System.out.println("Found:-" + dList.search(35).iData);
		} else {
			System.out.println("Not found");
		}

		if (dList.search(105) != null) {
			System.out.println("Found:-" + dList.search(105).iData);
		} else {
			System.out.println("Not found");
		}*/

	}

}
