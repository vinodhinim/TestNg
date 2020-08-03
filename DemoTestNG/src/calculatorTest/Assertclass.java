package calculatorTest;


import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Assertclass {
	public static int a, b, c;  //variable declaration
	 
	@BeforeClass
	 public static void setup()  
	 	{

		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter A value:" );
		a = userinput.nextInt();
		//System.out.println("Value of A is " + a);
		System.out.println("Enter B value:" );
		b = userinput.nextInt();
			
	 	}	 
	 
	    @Test
	    public void add() 
	    {
	    c = a + b;
		System.out.println("Addition of " + a + " and " + b + " : " + c);
		Assert.assertEquals(c, a+b);
		Reporter.log("Addition operation is successful");
		
	    }	
	    
		@Test 
	    boolean sub1() 
		{
			 //System.out.println("Welcome ->"+x+" Your search key is->"+y);
		c = a - b ;
		boolean d = false ;
		if (c == a-b) {
			d = true;
		}
		else {
			d = false;
		}
		
		//return false;
		return d;		
        }
		
		@Test
		public void sub(){
	
	      
	       System.out.println("Difference of " + a + " and " + b + " : " + c);
			Assert.assertTrue(sub1(), "Executed Subraction operation successfully");  // Only boolean condition is allowed
			Assert.assertFalse(sub1(), "Subraction operation Failed");
			Assert.assertNotEquals(c,3);
		}
	    
	   
		
	   @Test
	   public void mul()
		 {
			 c = a * b;	
			 System.out.println("Multiplication of " + a + " and " + b + " : " + c);
			}
		
	   
		@Test
		public void div() {
			c = a / b;
			System.out.println("Division of " + a + " and " + b + " : " + c);
			
		}
		
		
		@Test
		public void exponent() 
		{
			
			double c = Math.pow(a,b); 
	           System.out.println("The Exponent of " + a + " to the power " + b + " is : " + c);
	        }

		@Test
		public static void mod() {
			c = a % b;
			System.out.println("Modulus of " + a + " and " + b + " : " + c);
		}
		
		@Test
		public static void inverse() {
			double c = 1 / a;
			System.out.println("Inverse of " + a + " is : " + c);
		}
		
		@Test
		public static void negate() {
			c = (-1) * a;
			System.out.println("Negation of " + a + " is : " + c);
		}
		
		
}
