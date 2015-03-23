package practice;

import java.util.Random;

public class HashTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashItem item;
		int arraySize=25;
		HashTable hash=new HashTable(arraySize);
		Random randomGenerator = new Random();
		
		for (int i=0;i<arraySize-15;i++){
			int key = randomGenerator.nextInt(70);
			item =new HashItem(key);
			hash.insert(item);
			
			
		}
		

		
	
		hash.displayHash();
	
		/*hash.delete(15);
		hash.delete(5);
		hash.delete(10);
		hash.delete(12);
		hash.delete(11);
		hash.delete(13);
		hash.delete(14);
		hash.delete(16);
		hash.displayHash();*/
		
		item =new HashItem(100);
		hash.insert(item);
		
		hash.displayHash();
		if (hash.find(100)!=-1){
			System.out.println("Found at:- "+ hash.find(100));
			}
			else{
				System.out.println("Not Found");
			}
	hash.delete(100);
		hash.displayHash();
	
	}

}
