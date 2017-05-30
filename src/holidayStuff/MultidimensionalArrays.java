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
public static void main(String[] args){
	MultidimensionalArrays newArray = new MultidimensionalArrays();
	newArray.generateRandomArray();
	newArray.PrintArray();
	System.out.println(newArray.getValueIndex(0));
	System.out.println(newArray.doeasArrayContainThisValue(17));
	newArray.deteIndex(2);
	newArray.PrintArray();
}

@SuppressWarnings("unused")
private void getValueAtIndex(int i) {
	// TODO Auto-generated method stub
	
}
}
