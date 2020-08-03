package calculatorTest;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProvideconcept 
{
	public static int a, b, c;  //variable declaration
	

	 @Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	 void add(int x, int y) 
	 {
		 
		int z = x + y;
		System.out.println("Addition of " + x + " and " + y + " : " + z);
		//System.out.println("I am inside Thread 1 : test case one with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Addition operation through Data Provider is successful");
		
	 }	  
	
	@Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	void sub(int x, int y) 
	{
		int z = x - y;
		System.out.println("Difference of " + x + " and " + y + " : " + z);
		//System.out.println("I am inside Thread 1 : test case one with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Subraction operation through Data Provider is successful");
	
	}	  
	
	@Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	void mul(int x, int y)
	{
		int z = x * y;
		System.out.println("Product of " + x + " and " + y + " : " + z);
		//System.out.println("I am inside Thread 2 : test case one with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Multiplication operation through Data Provider is successful");
	}
	
	@Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	void div(int x, int y)
	{
		int z = x / y;
		System.out.println("Division of " + x + " and " + y + " : " + z);
		//System.out.println("I am inside Thread 2 : test case one with Thread id :" +Thread.currentThread().getId() + " at time : " + getTime());
		Reporter.log("Division operation through Data Provider is successful");
	}
	
	@Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	void exponent(int x, int y)
	{
		double z = Math.pow(x, y);
		System.out.println("The Exponent of " + x + " to the power " + y + " : " + z);
		Reporter.log("Exponential operation through Data Provider is successful");
	}
	
	@Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	void mod(int x, int y)
	{
		double z = x % y;
		System.out.println("The Modulus of " + x + " and " + y + " : " + z);
		Reporter.log("Modulus operation through Data Provider is successful");
	}
	
	@Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	void inverse(int x, int y)
	{
		double z = 1 / x;
		System.out.println("The Inverse of " + x + " : " + z);
		Reporter.log("Inverse operation through Data Provider is successful");
	}
	
	@Test(dataProvider="CalcuDataProvide",dataProviderClass=DataProviderclass.class)
	void negate(int x, int y)
	{
		double z = (-1) * x;
		System.out.println("The Negation of " + x +  " : " + z);
		Reporter.log("Negation operation through Data Provider is successful");
	}
	
}
