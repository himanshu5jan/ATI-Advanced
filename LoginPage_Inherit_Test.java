package com.jira.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.jira.pages.BaseClass;

public class LoginPage_Inherit_Test extends BaseClass {

	@Test
    public void jiraLoginTest() {
    	jira.log_into_jira("himanshu.tech10@gmail.com", "!nnocuous");
    	Assert.assertTrue(jira.titleContains("Atlassian"));
    }
	   
}
