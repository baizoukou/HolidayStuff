package holidayStuff;

public class ConditionStatement {
	
	public static void main(String[] args) {
		
		int randomNum =(int)(Math.random()*50);
		/* relational operator*/
		
		if (randomNum < 35 )
		{
			System.out.println("The random numbe is less than 35");
		}else if(randomNum > 60)
		{
			System.out.println("The random numbe is greater than 60");
		}
		else if(randomNum ==  14)
		{
			System.out.println("The random numbe is = to 14");
		
		
		}else if(randomNum != 60){
			System.out.println("The random numbe is not =  60");
		}
			System.out.println("The random number is" + randomNum); 
	
	}
}
