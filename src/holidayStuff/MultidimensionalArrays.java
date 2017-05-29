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
public static void main(String[] args){
	MultidimensionalArrays newArray = new MultidimensionalArrays();
	newArray.generateRandomArray();
	newArray.PrintArray();
}
}
