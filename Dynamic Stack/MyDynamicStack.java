
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyDynamicStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
		//TO-COMPLETE
	private MyNode head;
	private int numItems;
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	

	public MyDynamicStack( ){
	//TO-COMPLETE
		this.head = null;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
		//TO-COMPLETE
		boolean result;
		if (this.numItems == 0) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
	//-------------------------------------------------------------------
	
	public int pop(){
		//TO-COMPLETE
		int result;
		if (numItems > 0) {
			MyNode currentNode = head;
			result = head.getInfo();
			head = currentNode.getNext();
			currentNode.setNext(null);
			numItems--;
		}
		else {
			System.out.println("Stack is empty, can't pop more items");
			result = -1;
		}
		return result;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	//-------------------------------------------------------------------

	public void push(int element){
			//TO-COMPLETE
		MyNode previousNode = this.head;
		MyNode newNode = new MyNode(element, null);
		newNode.setNext(previousNode);
		this.head = newNode;
		this.numItems++;
		
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------
		
	public void print(){
		//TO-COMPLETE
		MyNode nextNode = head;
		if (numItems > 0) {
			for (int i=0;i<numItems;i++) {
				System.out.print(nextNode.getInfo() + " ");
				nextNode = nextNode.getNext();
			}
		}
		else {
			System.out.println("[]");
		}
		
	}
	
}
