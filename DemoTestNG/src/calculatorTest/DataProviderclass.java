package calculatorTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderclass 
 
 {
	public static int l, m;
	 @DataProvider (name = "CalcuDataProvide")

	 public Object[][] dpMethod(){

	 return new Object[][] {{2,5}, {10,12}}; // Data can be imported from excel using apache poi

	 
	 }
	
 }




		