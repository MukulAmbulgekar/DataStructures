package practice;

public class HashTable {

	private int arraySize;
	private HashItem[] hashArray;
	private HashItem nonItem;
private int counter=0;
	public HashTable(int size) {
		arraySize = size;
		hashArray = new HashItem[size];
		nonItem = new HashItem(-1);
	}

	public int hashFunction(int key) {

		return key % arraySize;
	}
	
	public void insert(HashItem item){
		int key=item.getKey();
		int hashVal=hashFunction(key);
		while(hashArray[hashVal]!=null){
			
	//		System.out.println("Collision occurred "+ hashVal);
		hashVal++;
		
		hashVal=hashVal%arraySize;
		
		}
		//System.out.println("Array Index:- "+ hashVal+ "Value:-");
		hashArray[hashVal]=item;
		
	//	System.out.println("Array Index:- "+ hashVal+ "Value:-"+ hashArray[hashVal].getKey());
	}
	
	public void displayHash(){
		System.out.println("\n********");
		for (int i=0;i<hashArray.length;i++){
			if (hashArray[i]!=null){
				System.out.print("\t"+  hashArray[i].getKey());
			
			}
			else{
				System.out.print("\t**");
			}
		}
	}	
	
	public int find (int key){
		
		int hashVal=hashFunction(key);
		while (hashArray[hashVal]!=null){
			
			if(hashArray[hashVal].getKey()==key){
				return hashVal;
			}
			else if(counter==arraySize){
				counter=0;
				return -1;
			}
			hashVal++;
			counter++;
			hashVal=hashVal%arraySize;
			//System.out.println("Hello "+hashVal);
		}
		return -1;
			
		}
		
		
	
		public void delete(int key) {
			
			int hashVal=hashFunction(key);
			
			while (hashArray[hashVal]!=null){
			if(hashArray[hashVal].getKey()==key){
				hashArray[hashVal]=null;
				
			}
			else if(counter==arraySize){
				counter=0;
				break;
			//	System.out.println("Not found");
				
			}
		//	System.out.println("Hello "+hashVal);
			hashVal++;
			counter++;
			hashVal=hashVal%arraySize;
			}
		
		}
	

}
