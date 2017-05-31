package holidayStuff;

import java.util.Arrays;

public class TheQueue {
	private String[] queueArray;
	private int queueSize;
	private int front, rear, numberOfItems = 0;
	TheQueue(int size){
		queueSize = size;
		queueArray = new String[size];
		Arrays.fill(queueArray, "-1");
		
	}
	public void insert(String input){
		if(numberOfItems + 1 <= queueSize){
			queueArray[rear] = input;
			rear++; // increment rear to increase the size of array
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
	public static void main(String[] args){
		
		TheQueue theQueue = new TheQueue(20);
		theQueue.insert("20");
		theQueue.insert("25");
		theQueue.insert("29");
		theQueue.displayTheQueue();
		
	}
	private void displayTheQueue() {
		// TODO Auto-generated method stub
		
	}

}
