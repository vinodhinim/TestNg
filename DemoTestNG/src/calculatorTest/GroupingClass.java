package calculatorTest;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class GroupingClass 

{

	public static int a, b, c; //variable declaration
	
	
	@BeforeClass(groups = "SubGroupA")
	public static void setup() 
	{
	Scanner userinput = new Scanner(System.in);
	System.out.println("Enter A value:" );
	a = userinput.nextInt();
	//System.out.println("Value of A is " + a);
	System.out.println("Enter B value:" );
	b = userinput.nextInt();
		
}	 

   @Test(groups = "SubGroupA" )

   void add() {

	c = a + b;
	System.out.println("Addition of " + a + " and " + b + " : " + c);
	//Assert.assertEquals(c, a+b);
	Reporter.log("Addition operation by grouping is successful");
	
}	      
   
   @BeforeClass(groups = "SubGroupB")
	public static void setup1() 
	{
	Scanner userinput = new Scanner(System.in);
	System.out.println("Enter A value:" );
	a = userinput.nextInt();
	//System.out.println("Value of A is " + a);
	System.out.println("Enter B value:" );
	b = userinput.nextInt();
		
}	 
   @Test(groups = { "SubGroupB" })
   void sub()
   {

   c = a - b;
	 System.out.println("Subraction of " + a + " and " + b + " : " + c);
		Reporter.log("Subraction operation by grouping is successful");
	
}
   
  @Test(groups =  "SubGroupA" )
	 public void mul()
	
	 {
		 c = a * b;	
		 System.out.println("Multiplication of " + a + " and " + b + " : " + c);
		 Reporter.log("Multipliction operation by grouping is successful");	
		}
	
   
   
	@Test(groups = "SubGroupB")

	public static void div() 
	{
		c = a / b;
		System.out.println("Division of " + a + " and " + b + " : " + c);
		Reporter.log("Division operation by grouping is successful");
	}
	
	
}
