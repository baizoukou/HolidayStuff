package holidayStuff;

import java.util.Arrays;

public class TheQueue {
	private static final String input = null;
	private String[] queueArray;
	private int queueSize;
	private int front, end, numberOfItems = 0;
	TheQueue(int size){
		queueSize = size;
		queueArray = new String[size];
		Arrays.fill(queueArray, "-1");
		
	}
	public void insert(String input){
		if(numberOfItems + 1 <= queueSize){
			queueArray[end] = input;
			end++; // increment rear to increase the size of array
			numberOfItems++;
			System.out.println("INSERT" + input + "Was Added to the Queue\n");
		}else{
			System.out.println("Sorry the Queue is full");
			
		}
	}
	
	public void remove(){
		if(numberOfItems > 0){
			System.out.println("Reove" + queueArray[front]+ "Was removed" );
			queueArray[front] = "-1";
			front++;
			numberOfItems--;
		}else{
			System.out.println("Sorry the Queue is empty");
		}
	}
	
	public void peek(){
		System.out.println("The first element is " + queueArray[front] );
	}
	
	public void priorityInsert(String string){
		int i;
		 
		if(numberOfItems == 0){
			insert(input);
		}else{
			for(i=numberOfItems - 1; i>= 0; i--){
				if(Integer.parseInt(input)> Integer.parseInt(queueArray[i])){
					queueArray[i+1] = queueArray[i];
					
				}else break;
				
						}
			queueArray[i+1] = input;
			end++;
			numberOfItems++;
		}
	}
	public static void main(String[] args){
		
		TheQueue theQueue = new TheQueue(20);
//		theQueue.insert("20");
//		theQueue.insert("25");
//		theQueue.insert("29");
		
		theQueue.priorityInsert("20");
		theQueue.priorityInsert("25");
		theQueue.priorityInsert("15");
		theQueue.priorityInsert("9");
		
		theQueue.remove();
		theQueue.remove();
		
		theQueue.displayTheQueue();
		theQueue.peek();
		
	}
	private void displayTheQueue() {
		// TODO Auto-generated method stub
		
	}

}
