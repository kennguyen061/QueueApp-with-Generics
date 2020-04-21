//Zack McGeehan
//Kenny Nguyen
package cpsc2150.MyQueue;

public class ArrayQueue<T> extends AbsQueue<T>  {
	private T[] myQ;
	private int maxSize;
	private int indexOfFirst;
	private int numElements;
	
	/**
	 * Class constructor to create an empty Array Object of MAX_DEPTH
	 */
	public ArrayQueue() {
		myQ = (T[]) new Object[MAX_DEPTH];
		indexOfFirst = 0;
		numElements = 0;
	}

	/**
	 * @pre Queue object must be created
	 * @post numElements = 1 + #numElements
	 */
	@Override
	public void add(T x) {
		myQ[numElements] = x;
		numElements++;
	}

	/**
	 * @pre numElements > 1
	 * @post numElements = 1 - #numElements
	 * @return first element in myQ
	 */
	@Override
	public T pop() {
		T temp = myQ[indexOfFirst];
		for(int i = 0; i < numElements; i++){
			myQ[i] = myQ[i+1];
		}
		numElements--;
		return temp;
	}

	/**
	 *
	 * @return numElements = the amount of elements in the array
	 */
	@Override
	public int size() {
		return numElements;
	}

//	public String toString() {
//		String str = "";
//		for(int i = 0; i < numElements; i++) {
//			str += myQ[i]+ " ";
//		}
//		return str;
//	}

}
