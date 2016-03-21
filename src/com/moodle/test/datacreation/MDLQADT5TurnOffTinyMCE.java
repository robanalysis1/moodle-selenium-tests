/**
 * Create a test course as a pre-requisite for any testing
 */
package com.moodle.test.datacreation;

import com.moodle.test.TestRunSettings;
import org.junit.Test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MDLQADT5TurnOffTinyMCE extends TestRunSettings {
		//Test Data Property Files
	public static String usersData = "properties/data/user/Users/usersData.properties";
	private Map<String, String> properties = new HashMap<String, String>();
		//Load test data from properties file
	public MDLQADT5TurnOffTinyMCE(){
			this.loadTestData();
	}
	public void loadTestData() {
		Properties testData = new Properties();
		try {
			testData.load(new FileInputStream(usersData));
		} catch (Exception e) {}
		this.properties.put("adminUser", testData.getProperty("adminUser"));
		this.properties.put("password", testData.getProperty("password"));
	}
		//Test to turn off Tiny MCE YOU BETCHA :)
	@Test
	public void turnOffTinyMCE() {
	user.loginToSystem(this.properties.get("adminUser"), this.properties.get("password"));
	settingsBlock.navigateBlockManageEditors();
	manageEditors.clickEnableDisableTinyMCE();
	}		
}