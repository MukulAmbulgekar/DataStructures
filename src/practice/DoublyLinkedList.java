package practice;

public class DoublyLinkedList {

	DoublyLink first;
	DoublyLink last;
	int root_data;

	public DoublyLinkedList() {

		first = null;
		last = null;
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int iData) {
		DoublyLink newLink = new DoublyLink(iData);
		DoublyLink current = first;
		DoublyLink current1 = last;
		if (isEmpty()) {
			first = newLink;
			last = newLink;
			root_data = iData;
		} else if (root_data > iData) {

			if (current.iData >= iData) {
				insertFirst(iData);
			} else {

				while (current.iData <= iData) {
					// System.out.println("While" + current.iData);
					current = current.next;
				}
				insertAfter(current.previous, iData);
			}

		} else {

			if (current1.iData <= iData) {
				insertLast(iData);
			} else {

				while (current1.iData >= iData) {
					// System.out.println("While" + current1.previous.iData);
					current1 = current1.previous;
				}
				insertAfter(current1, iData);
			}

		}

	}

	public void insert_effiecient(int iData) {
		// Below code will add elements less than root to left and greater than
		// root to right to make searching in linked list more efficient

		if (isEmpty()) {
			insertFirst(iData);
			root_data = iData;
		} else if (root_data > iData) {
			//System.out.println("Root Data" + root_data);
			insertFirst(iData);
		}

		else if (root_data < iData)

		{
			insertLast(iData);

		}
	}

	public void insertFirst(int iData) {

		DoublyLink newLink = new DoublyLink(iData);

		if (isEmpty()) {
			first = newLink;
			last = newLink;
		} else {
			first.previous = newLink;
			newLink.next = first;
			first = newLink;
		}

	}

	public void insertLast(int iData) {

		DoublyLink newLink = new DoublyLink(iData);

		if (isEmpty()) {
			first = newLink;
			last = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
			last = newLink;
		}
	}

	public void insertAfter(DoublyLink link, int iData) {

		DoublyLink newLink = new DoublyLink(iData);

		link.next.previous = newLink;
		newLink.next = link.next;
		link.next = newLink;
		newLink.previous = link;

	}

	public void insertAfter(int afterdata, int iData) {

		DoublyLink newLink = new DoublyLink(iData);
		DoublyLink current = first;
		while (current.iData != afterdata) {
			current = current.next;
		}

		current.next.previous = newLink;
		newLink.next = current.next;
		current.next = newLink;
		newLink.previous = current;

	}

	public DoublyLink search(int searchKey) {

		if (searchKey > root_data) {
			System.out.println("Using backward traversal ");

			return searchElementBackward(searchKey);
		}

		else {
			System.out.println("Using forward traversal");
			return searchElementForward(searchKey);
		}
	}

	public DoublyLink searchElementForward(int searchKey) {
		DoublyLink current = first;

		while (current.iData != searchKey) {
			current = current.next;
			if (current == null) {
				return current;
			}
			// System.out.println(current);
		}
		return current;

	}

	public DoublyLink searchElementBackward(int searchKey) {
		DoublyLink current = last;

		while (current.iData != searchKey) {
			current = current.previous;
			if (current == null) {
				return current;
			}
			// System.out.println(current);
		}
		return current;

	}
	
	public void deleteFirst(){
		if(first.next == null) {// if only one item
			last = null;
			first= null;
		}
		else {
		first.next.previous=null;
		//first.previous=null;
		first=first.next;
		}
	}
	
	public void deleteLast(){
		if(first.next == null) {// if only one item
			last = null;
			first= null;
		}
		else {
		
		last.previous.next=null;
		//last.previous=null;
		last=last.previous;
		}
		
	}

	public void displayForward() {
		DoublyLink current = first;
		System.out.println("Forward Traversal");
		while (current != null) {
			System.out.println("Node Element" + current.iData);
			current = current.next;
		}
	}

	public void displayBackward() {
		DoublyLink current = last;
		System.out.println("Backward Traversal");
		while (current != null) {
			System.out.println("Node Element:-" + current.iData);
			current = current.previous;
		}
	}
}
