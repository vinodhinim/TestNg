package calculatorTest;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass 

{

	public String getTime() {
        Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();
	    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String formattedDate=sdf.format(date);
        return formattedDate;
	}
	
	 @Test
	 @Parameters({ "number1", "number2", "sum" })
	
	 void add(int a, int b, int c) 
	 {

	c = a + b;
	System.out.println("Addition of " + a + " and " + b + " : " + c);
	System.out.println("I am inside Thread 2 : test case five with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
	Reporter.log("Addition operation through parameterisation is successful");
	
}	          
	
	 @Test
	 @Parameters({ "number1", "number2", "sub"})
	
	 void sub( int a, int b, @Optional("2") int c) 
	 { 
		 c = a - b;
		 System.out.println("Subraction of " + a + " and " + b + " : " + c);
		 System.out.println("I am inside Thread 2 : test case five with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
			Reporter.log("Subraction operation through parameterisation is successful");
	 }
	
	 @Test
	 @Parameters({ "number1", "number2", "mul" })
	
	 void mul(int a, int b, int c) 
	 
	 {
		 c = a * b;	
		 System.out.println("Multiplication of " + a + " and " + b + " : " + c);
		 System.out.println("I am inside Thread 2 : test case five with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
			Reporter.log("Multiplication operation through parameterisation is successful");
			
		}
 
	 @Test
	 @Parameters({ "number1", "number2", "mul" })

	  void div(int a, int b, @Optional("2") int c)
	 {
		c = a / b;
		System.out.println("Division of " + a + " and " + b + " : " + c);
		 System.out.println("I am inside Thread 2 : test case five with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
			Reporter.log("Division operation through parameterisation is successful");
	}
	
	
}
