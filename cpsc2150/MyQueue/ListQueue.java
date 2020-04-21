package cpsc2150.MyQueue;


import java.util.ArrayList;
import java.util.List;

public class ListQueue<T> extends AbsQueue<T> {
	
	private List<T> myQ;
	
	/**
	 * Constructor that creates an empty array list
	 */
	ListQueue(){
		 myQ = new ArrayList<T>();
		
	}
	/**
	 * @pre Queue object must be created
	 * @post adds x to the list queue
	 */
	@Override
	public void add(T x) {
		myQ.add(x);
	}

	/**
	 * @pre Queue object must be created
	 * @ removes the first element in the queue
	 * @return the first element in the queue
	 */
	@Override
	public T pop() {
		T temp =  myQ.get(0);
		myQ.remove(0);
		return temp;
	}

	/**
	 * @pre Queue object must be created
	 * @return size of the queue
	 */
	@Override
	public int size() {
		int size = myQ.size();
		return size;
	}

//	public String toString() {
//		String str = " ";
//		for(int i = 0; i < myQ.size(); i++ ) {
//			str += myQ.get(i) + " ";
//		}
//		return str;
//	}
}
