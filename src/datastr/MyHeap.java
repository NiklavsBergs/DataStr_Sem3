package datastr;

public class MyHeap<T> {
	private T elements[];
	private final int DEFAULT_ARRAY_SIZE = 10;
	private int arraySize = DEFAULT_ARRAY_SIZE;
	private int elementCounter = 0;
	
	public MyHeap() {
		elements = (T[]) new Object[arraySize];
	}
	
	public MyHeap(int inputArraySize) {
		
		if(inputArraySize > 0) {
			arraySize = inputArraySize;
		}
		elements = (T[]) new Object[arraySize];
	}
	
	public boolean isFull(){
		return elementCounter == arraySize;
	}
	
	public boolean isEmpty(){
		return elementCounter == 0;
	}
	
	public int howManyElements() {
		return elementCounter;
	}
	
	private void increaseArray() {
		int newSize;
		T[] newElements;
		if (elementCounter > 100) {
			newSize = (int) (arraySize * 1.5);
		}
		else {
			newSize = arraySize * 2;
		}
		newElements = (T[]) new Object[newSize];
		
		for (int i = 0; i < elementCounter; i++) {
			newElements[i] = elements[i];
		}
		
		elements = newElements;
		arraySize = newSize;
	}
	
	public void add(T newElement) {
		if(isFull()) {
			increaseArray();
		}
		
		elements[elementCounter] = newElement;
		elementCounter++;
		
		//call reheapUp()
	}
	
	public T remove() throws Exception{
		if(isEmpty()) {
			throw (new Exception("Heap is empty"));
		}
		
		T element = elements[0];
		elements[0] = elements[elementCounter - 1];
		elementCounter--;
		
		//call reheapDown();
		
		return element;
	}
	
	//public T getRightChild{
		
	//}
}
