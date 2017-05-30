package holidayStuff;

public class MultidimensionalArrays {
	private static int[] theArray = new int[50];
	private static int arraySize = 15;
	public void generateRandomArray(){
		
		// create arrrays that have values
	
		for(int i = 0; i < arraySize; i++){
			theArray[i] = (int)(Math.random()*10)+10;
		}
		
	}
	public void PrintArray(){
		System.out.println("-----------");
	    for(int i = 0; i < arraySize; i++){
	    	System.out.print("|" + "|");
	    	System.out.println(theArray[i]+"|");
	    	System.out.println("-----------");
	}
	}
	public int getValueIndex(int index){
			if(index < arraySize) return theArray[index];
			return 0;
	}
	public boolean doeasArrayContainThisValue(int searchValue){
		boolean valueInArray = false;
		for(int i = 0; i < arraySize; i++){
			if (theArray[i] == searchValue){
				valueInArray = true;
			}
		}
		return valueInArray;
	}
	
	public void deteIndex(int index){
		if(index < arraySize){
			for(int i = index; i< (arraySize - 1); i++){
				theArray[i]= theArray[i+1];
			}
			arraySize--;
		}
	}
	public void insertValue(int value){
		if(arraySize < 50){
			theArray[arraySize] = value;
			arraySize ++;
		}
	}
	// linear search to find all matches
	public String linearSeachForValue(int value){
		boolean valueInArray = false;
		String indexsWithValue = "";
		System.out.println("The value was found in the following:");
		for(int i = 0; i<arraySize; i++){
			if(theArray[i] == value){
				valueInArray = true;
				System.out.println(i + "");
				indexsWithValue+= i + "";
				
			}
		}
		if(!valueInArray){
			indexsWithValue = "None";
			System.out.print(indexsWithValue);
			
		}
		System.out.println();
		return indexsWithValue;
	}
	
	//buble sort
	public void bubbleSort(){
		for(int i = arraySize - 1;i > 1; i--){
			for (int j =0; j<i; j++){
				if(theArray[j] > theArray[j+1]){
					swapValues(j, j+1);
					printHorzArray(i, j);
				}
				printHorzArray(i, j);
			}
		}
	}
	private void printHorzArray(int i, int j) {
		// TODO Auto-generated method stub
		
		
	}
	public void swapValues(int indexOne, int indexTwo){
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		
	}
	
	// BinariSearch
	
	public void binarySearchForValue(int value){
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		 
		while(lowIndex <= highIndex){
			int middleIndex = (highIndex + lowIndex)/2;
			if (theArray[middleIndex] < value) lowIndex = middleIndex +1;
			else if (theArray[middleIndex] > value) highIndex = middleIndex - 1;
			else {
				System.out.println("\nFound a match for"+ value+" at Index" + middleIndex);
				lowIndex = highIndex + 1;
				
			}
			printHorzArray(middleIndex, -1);
		}
	}
// selectionSort
	
	public void selectionSort(){
		for(int x = 0; x < arraySize; x++){
			int minimum = x;
			for(int y = x; y < arraySize; y++){
				if(theArray[minimum] > theArray[y]){
					minimum = y;
				}
			}
			swapValues(x, minimum);
			printHorzArray(x, -1);
		}
	}
	
public static void main(String[] args){
	MultidimensionalArrays newArray = new MultidimensionalArrays();
	newArray.generateRandomArray();
	newArray.PrintArray();
//	System.out.println(newArray.getValueIndex(0));
//	System.out.println(newArray.doeasArrayContainThisValue(17));
//	newArray.deteIndex(2);
//	newArray.PrintArray();
//	newArray.insertValue(52);
//	newArray.linearSeachForValue(12);
//	newArray.bubbleSort();
//	newArray.binarySearchForValue(30);
    newArray.selectionSort();
	
}

//@SuppressWarnings("unused")
//private void getValueAtIndex(int i) {
//	// TODO Auto-generated method stub
	
}

