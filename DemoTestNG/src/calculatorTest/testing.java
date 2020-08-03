package calculatorTest;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testing {
	
	public static int a, b, c;  //variable declaration
	
	 @Test(groups = { "add and sub", "mul and div" })
	
	 @BeforeClass

	 public static void setup()  {

		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter A value:" );
		a = userinput.nextInt();
		//System.out.println("Value of A is " + a);
		System.out.println("Enter B value:" );
		b = userinput.nextInt();
			
	 }

	/* @DataProvider (name = "data-provider")

	 public Object[][] dpMethod(){

	 return new Object[][] {{a}, {b}};

	 } */
	 
	@Test(dataProvider="SearchProvider",dataProviderClass=DataProviderclass.class)

//@Test (dataProvider = "data-provider")

	public static void div() {
		c = a / b;
		System.out.println("Division of " + a + " and " + b + " : " + c);
	}
/* public void div (int val) {

	        System.out.println("Passed Parameter Is : " + val);

	    }*/
	 

	    
	    @Test(groups = { "add and sub" })

	 void add() {

		c = a + b;
		System.out.println("Addition of " + a + " and " + b + " : " + c);
		Assert.assertEquals(c, a+b);
		Reporter.log("Addition operation is successful");
		
	 }	          
		 
		 
	   // @Test(groups = { "add and sub" })		
	
	    void sub(String x, String  y) {
			 System.out.println("Welcome ->"+x+" Your search key is->"+y);
		//String z = x - y;
		//System.out.println("Difference of " + x + " and " + y + " : " + z);
		//Assert.assertTrue(sub(), "Executed Subraction operation successfully"); // Only boolean condition is allowed
		//Assert.assertFalse(sub(), "Subraction operation Failed");
		//Assert.assertNotEquals(z,3);
		//return false;
		
}
	@Test(groups = { "mul and div"})
	@Parameters({"a","b"})
	 public void mul(@Optional("8") int a, @Optional("8") int b)
	// ( @Optional("Abc") String author,String searchKey)
	 
	 {
		 c = a * b;	
		 System.out.println("Multiplication of " + a + " and " + b + " : " + c);
			
		}
	
	
}
