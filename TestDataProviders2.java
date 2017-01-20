package testng.src;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProviders2 {

	@DataProvider(name="dp1")
	public static Object[][] LoginData(Method m) {
		Object[][] retObj=null; 
		
		if (m.getName().equals("NegativeScenarioTests")) {
		    retObj=new Object[2][2];
			retObj[0][0]="John";
			retObj[0][1]=28;
			retObj[1][0]="Smith";
			retObj[1][1]=29;
		}
		if (m.getName().equals("positiveScenarioTests")) {
			retObj=new Object[3][3];
			retObj[0][0]="Admin Role";
			retObj[0][1]="/PO/startad.se";
			retObj[0][2]="Active";
			retObj[1][0]="Shop Role";
			retObj[1][1]="/PO/starts.ps";
			retObj[1][2]="Active";
			retObj[2][0]="Vendor Role";
			retObj[2][1]="/PO/startv.de";
			retObj[2][2]="Inactive";
		}
	
		return retObj;
	}
}
