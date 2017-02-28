package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import businessFunctions.ReusableFunctions;

public class BVT_Testcases extends ReusableFunctions {

@Test
public void Launch_Global() throws IOException, Exception {
	  deleteCookies();
	  loadUrl("STAGECIR_URL_Global");
	  waitUntil("Homepage_Keymetrics", "exist");
	   
}

public void Launch_LCSP() throws IOException, Exception {
	  deleteCookies();
	  loadUrl("STAGECIR_URL_LCSP");
	  waitUntil("Homepage_Keymetrics", "exist");
	   
}

  @Test
  public void Access_Global() throws IOException, Exception {
	  deleteCookies();
	  loadUrl("STAGECIR_URL_Global");
	  waitUntil("Homepage_Keymetrics", "exist");
	  click("Homepage_Keymetrics");
	  waitUntil("Keymetrics_NSRbyfunction", "exist");
	  waitUntil("Myclient","exist");
	  click("Myclient");
	  waitUntil("Myclient_NSRbyfunction", "exist");
	  waitUntil("Engagement","exist");
	  click("Engagement");
	  waitUntil("Engagement_Flex_Errormessage","exist");
	  waitUntil("Opportunity","exist");
	  click("Opportunity");
	  waitUntil("Opportunity_GlobalFootprint","exist");
	  waitUntil("Countrysrvicesgroups","exist");
	  click("Countrysrvicesgroups");
	  waitUntil("Countrysrvicesgroups_NSRGlobalFootprint","exist");
	  waitUntil("Whitespace","exist");
	  click("Whitespace");
	  waitUntil("Whitespace_NSRbyFunction","exist");
	  click("Detailed");
	  waitUntil("Detailed_Revenueplan", "exist"); 
	    
  }
  
  @Test
  public void Access_LCSP() throws IOException, Exception {
	  deleteCookies();
	  loadUrl("STAGECIR_URL_LCSP");
	 waitUntil("Myclient","exist");
	  click("Myclient");
	  waitUntil("Myclient_NSRbyfunction", "exist");
	  
	  waitUntil("Engagement","exist");
	  click("Engagement");
	  waitUntil("Engagement_NSRcolumn","exist");
	  waitUntil("Opportunity","exist");
	  click("Opportunity");
	  waitUntil("Opportunity_GlobalFootprint","exist");
	  
	  /*waitUntil("Countrysrvicesgroups","exist");
	  click("Countrysrvicesgroups");
	  waitUntil("Countrysrvicesgroups_NSRGlobalFootprint","exist");
	  waitUntil("Whitespace","exist");
	  click("Whitespace");
	  waitUntil("Whitespace_NSRbyFunction","exist");
	  click("Detailed");
	  waitUntil("Detailed_Revenueplan", "exist"); */
	    
  }
 
  
  @Test
  public void Access_Global_AccessDetails() throws IOException, Exception {
	  deleteCookies();
	  loadUrl("STAGECIR_URL_LCSP");
	 /* verifyExist("Myclient");
	 waitUntil("Myclient","exist");
	  click("Myclient");
	  waitUntil("Myclient_NSRbyfunction", "exist"); */
	  
	  waitUntil("Engagement","exist");
	  javascriptClick("Engagement");
	  //waitUntil("Engagement_Flex_Errormessage","exist");
	  waitUntil("Opportunity","exist");
	  javascriptClick("Opportunity");
	  waitUntil("Opportunity_GlobalFootprint","exist");
	  
	  /*waitUntil("Countrysrvicesgroups","exist");
	  click("Countrysrvicesgroups");
	  waitUntil("Countrysrvicesgroups_NSRGlobalFootprint","exist");
	  waitUntil("Whitespace","exist");
	  click("Whitespace");
	  waitUntil("Whitespace_NSRbyFunction","exist");
	  click("Detailed");
	  waitUntil("Detailed_Revenueplan", "exist"); */
	    
  }
 
  
  
  
}
