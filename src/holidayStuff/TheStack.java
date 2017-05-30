package holidayStuff;

import java.util.ArrayList;
import java.util.Arrays;

public class TheStack {
	
	private String[] stackArray;
	private int stackSize;
	
	private int topOfStack = -1;
	
	TheStack(int size){
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	public void push(String input){
		if(topOfStack + 1 < stackSize){
			topOfStack ++;
			stackArray[topOfStack] = input;
			
		}else System.out.println("Sorry But the Stack is full");
		displayTheStack();
		System.out.println("PUSH" + input + "Was added to the Stack");
	}
	private void displayTheStack() {
		// TODO Auto-generated method stub
		}
	
	public String pop(){
		
		if(topOfStack >= 0){
			displayTheStack();
			System.out.println("POP" + stackArray[topOfStack] + "Was Removed from the Stack\n");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack --];
		}else{
			displayTheStack();
			System.out.println("Sorry but the Stack is empty");
			return "-1";
		}
		
	}
	
	public String peek(){
		displayTheStack();
		System.out.println("PEEK"+ stackArray[topOfStack] + "Is at the Top of the Stack\n");
		return stackArray[topOfStack];
		
	}
	
	public void pushMany(String multipleValues){
		String[] tempString = multipleValues.split("");
		for(int i = 0; i < tempString.length; i++){
			push(tempString[i]);
		}
	}
	
	public void popAll(){
		for(int i = topOfStack; i >= 0; i++){
			pop();
			
		}
	}
	public static void main(String[] args){
		TheStack theStack = new TheStack(15);
		theStack.push("10");
		theStack.push("15");
		theStack.peek();
		theStack.pop();
		theStack.push("12 13 14 15");
		theStack.popAll();
		theStack.displayTheStack();
	}

}
