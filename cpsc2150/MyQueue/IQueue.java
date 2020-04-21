//Zack McGeehan
//Kenny Nguyen

package cpsc2150.MyQueue;


public interface IQueue<T> {
	
	int MAX_DEPTH = 100;
	// Adds x to the end of the Queue
	public void add(T x);
	//removes and returns the T object at the front of the queue
	public T pop();
	//returns the number of T objects in the Queue
	public int size();
	
	/**
	 * @pre this.size()>0
	 * @return the first element from the Queue
	 * @post gets the first item from the Queue without removing it
	 */
	default public T peek(){
		return this.get(1);
	}

	/**
	 * @pre this.size()>0
	 * @return the last element from the Queue
	 * @post gets the last item from the Queue without removing it
	 */
	default public T endOfQueue(){
		return this.get(this.size());
	}

	/**
	 * @params x = number to add, pos = position to add x
	 * @post adds x at pos in the Queue
	 */
	default public void insert(T x, int pos){
		if(pos == this.size()){
			this.add(x);
		}
		else{
			//use a for loop to loop through queue
			for(int i = 1; i < this.size(); i++) {
				T popped = this.pop();
				if (pos == i) {
					this.add(x);
					this.add(popped);
				}
				else {
					this.add(popped);
				}
			}
		}
	}

	/**
	 * @pre pos > 0 && pos <= this.size()
	 * @params pos = position to remove that corresponding element
	 * @return integer at pos
	 * @post removes T object at pos in the Queue
	 */
	default public T remove(int pos){

		T found = null;
		for(int i = 1; i <= this.size()+1; i++){
			T popped = this.pop();

			if(pos == i){
				found = popped;
			}
			else{
				this.add(popped);

			}
		}
		return found;
	}

	/**
	 * @pre pos > 0 && pos <= this.size()
	 * @params pos = position to get that corresponding element
	 * @return T at pos
	 */
	default T get(int pos){
		T found = null;
		for(int i = 1; i <= this.size(); i++){
			T popped = this.pop();

			if(pos == i){
				found = popped;
			}

				this.add(popped);
		}
		return found;
	}


}
