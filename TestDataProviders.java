package testng.src;

import org.testng.annotations.DataProvider;

public class TestDataProviders {

	@DataProvider(name="dp2")
	public Object[][] LoginData2() {
		Object[][] retObj={
				{"John",28},
				{"Smith",29},
				{"Cass",31},
				{"Adam",26}
		};
		return retObj;
	}


	@DataProvider(name="dp1")
	public static Object[][] LoginData() {
		Object[][] retObj={
				{"Admin Role","/PO/startad.se"},
				{"Shop Role","/PO/starts.ps"},
				{"Vendor Role","/PO/startv.de"},
				{"Accounts Role","/PO/startat.do"}
		};
		return retObj;
	}
}
