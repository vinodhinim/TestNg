package calculatorTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleCalc {
	
	public String getTime() {
        Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	    String formattedDate=sdf.format(date);
        return formattedDate;
	}

	@Test
	public void add() {
		int a= 1032;
		int b = 52;
		int c = a + b;
		System.out.println("Addition of " + a + " and " + b + " : " + c);
		System.out.println("I am inside Thread 1 : test case one with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Addition operation from Thread 1 is successful");
	}
	
	@Test
	public void sub() {
		int a= 1032;
		int b = 52;
		int c = a - b;
		System.out.println("Difference of " + a + " and " + b + " : " + c);
		System.out.println("I am inside Thread 1 : test case two with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Subraction operation from Thread 1 is successful");
	}
	
	@Test
	public void mul() {
		int a= 1032;
		int b = 52;
		int c = a * b;
		System.out.println("Product of " + a + " and " + b + " : " + c);
		System.out.println("I am inside Thread 1 : test case three with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Multiplication operation from Thread 1 is successful");
	}
	
	@Test
	public void div() {
		int a= 1032;
		int b = 52;
		int c = a / b;
		System.out.println("Division of " + a + " and " + b + " : " + c);
		System.out.println("I am inside Thread 1 : test case four with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Division operation from Thread 1 is successful");
	}
}
