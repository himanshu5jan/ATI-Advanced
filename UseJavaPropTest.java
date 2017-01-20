package javaprops;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UseJavaPropTest {
    
	static Properties prop;
    
	public static String getValue(String property) {
		//getProperty method of class Property is used fetch the value from the key=value pair written in properties file
		return prop.getProperty(property);
	}
	
    public static String getValue(String property, int whichField) {
    		String gv=getValue(property);
    		if (gv!=null)
    			return gv.split(":")[whichField];
    		else
    			return null;
    }

	public static void main(String[] args) throws IOException {
		
		//Step1: Read the file.
		FileInputStream inputfile=new FileInputStream("./resources/config.properties");
		//Step2: create the Object
		prop= new Properties();
		//Step3: load the file to input to the methods in the Properties Class
		prop.load(inputfile);
	 
		String url=getValue("applink");
		String host=getValue("host");
		String role=getValue("credentials", 0);
		String usrname=getValue("credentials", 1);
		String password=getValue("credentials", 2);
		System.out.println("URL : "+url);
		System.out.println("Host : "+host);
		System.out.println("ROLE : "+role);
		System.out.println("USERNAME : "+usrname);
		System.out.println("PASSWORD : "+password);
		
		inputfile.close();
	}

}
