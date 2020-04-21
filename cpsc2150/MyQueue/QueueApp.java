//Zack McGeehan
//Kenny Nguyen
package cpsc2150.MyQueue;

import java.util.*;
public class QueueApp{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		IQueue<Integer> q = null;
		int selection = 0;
		int userchoice = 0;
		boolean validinput = false;
		int count = 1;
		String str = null;

		while(!validinput) {
			System.out.println("Type 1 for an Array based queue and 2 for a List based queue");
			userchoice = input.nextInt();

			if (userchoice != 1 && userchoice != 2) {
				System.out.println("Invalid input, please type 1 or 2");
			} else if (userchoice == 1 || userchoice == 2) {
				validinput = true;
			}
		}
		//Turns q into an ArrayQueue
		if(userchoice == 1) {
			q = new ArrayQueue();
			validinput = true;
		}
		else if(userchoice == 2) {
			q = new ListQueue();
			validinput = true;
		}
		//Should never be reached



		while(selection != 8){
			System.out.println();
			System.out.println("1. Add to the queue");
			System.out.println("2. Get the next number from the queue");
			System.out.println("3. Peek at the first value in the queue");
			System.out.println("4. Peek at the last value in the queue");
			System.out.println("5. Insert into a position in the queue");
			System.out.println("6. Peek at a value in any position in the queue");
			System.out.println("7. Remove a value from any position in the queue and return it");
			System.out.println("8. Exit");
			selection = input.nextInt();

			if(selection == 1){
				System.out.print("What number to add to the Queue? ");
				int numToAdd = input.nextInt();
				q.add(numToAdd);

				str = q.toString();
				System.out.print("Queue is: \n" +  str);

			}
			if(selection == 2){
				if(q.size() == 0){
					System.out.println("Queue is empty!");
				}
				else{
					System.out.println("Next number is " + q.pop());
				}
				str = q.toString();
				System.out.print("Queue is: \n" +  str);
			}
			if(selection == 3){
				if(q.size() == 0){
					System.out.println("Queue is empty!");
				}
				else{
					System.out.println("Peek: " + q.peek());
				}
				str = q.toString();
				System.out.print("Queue is: \n" +  str);

			}
			if(selection == 4){
				if(q.size() == 0){
					System.out.println("Queue is empty!");
				}
				else{
					System.out.println("Peek at end: " + q.get(q.size()));
				}
				str = q.toString();
				System.out.print("Queue is: \n" +  str);
			}
			if(selection == 5){
				System.out.println("What number to add to queue?");
				int numWanted = input.nextInt();

				System.out.println("What position to insert in?");
				int pos = input.nextInt();
					while(pos > q.size()){
						System.out.println("Not a valid position in the Queue!");
						System.out.println("What position to insert in?");
						pos = input.nextInt();
				}
				q.insert(numWanted, pos);
				str = q.toString();
				System.out.print("Queue is: \n" +  str);
			}
			if(selection == 6){
				if(q.size() == 0){
					System.out.println("Queue is empty!");
				}
				else{
					System.out.println("What position to get from the queue?");
					int pos = input.nextInt();


					while(pos > q.size()){
						System.out.println("Not a valid position in the Queue!");
						System.out.println("What position to get?");
						pos = input.nextInt();
					}
					if(pos < q.size()) {
						System.out.println(q.get(pos) + " is at " + pos + " in the queue");
					}
					//System.out.println(q.get(q.size()));
				}
				str = q.toString();
				System.out.print("Queue is: \n" +  str);

			}
			if(selection == 7){
				if(q.size() == 0){
					System.out.println("Queue is empty!");
				}
				else{
					System.out.println("What position to remove from the queue?");
					int pos = input.nextInt();

					while(pos > q.size()){
						System.out.println("Not a valid position in the Queue!");
						System.out.println("What position to remove from the Queue?");
						pos = input.nextInt();
					}

					System.out.println(q.remove(pos) + " was at " + pos + " in the queue");

					//System.out.println(q.get(q.size()));
				}
				str = q.toString();
				System.out.print("Queue is: \n" +  str);
			}

		}//end big while
	}

}
