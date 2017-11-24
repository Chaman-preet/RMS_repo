package rmspackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Reports {
	WebDriver driver;
	
	@FindBy(linkText="Reports")
	WebElement clickreports;
	
	@FindBy(linkText="My reports")
	WebElement myreportlink;
		
	@FindAll({@FindBy(linkText="Request details")})
	List<WebElement> reqdetails;
	
	@FindAll({@FindBy(linkText="Large Request details")})
	List<WebElement> lareqdetails;
	
	@FindAll({@FindBy(linkText="Request multiple volume")})
	List<WebElement> Reqmultiple;
	
	@FindBy(xpath="//li[contains(@id,'_ctl02_liCategory')]")
	WebElement feedbacklink;
	
	@FindAll({@FindBy(linkText="Feedback request")})
	List<WebElement> Feedbackreq;
	
	@FindAll({@FindBy(linkText="Request type")})
	List<WebElement> reqtype;
	
	@FindBy(xpath="//li[contains(@id,'_ctl03_liCategory')]")
	WebElement timelink;
	
	@FindAll({@FindBy(linkText="My timesheet report")})
	List<WebElement> mytimesheetrep;
	
	@FindAll({@FindBy(linkText="Timesheet report")})
	List<WebElement> timesheetrep;
	
	@FindBy(xpath="//li[contains(@id,'_ctl04_liCategory')]")
	WebElement userlink;
	
	@FindAll({@FindBy(linkText="User details")})
	List<WebElement> userdetails;
	
	@FindAll({@FindBy(linkText="User mappings")})
	List<WebElement> usermapping;
	
	@FindBy(xpath="//li[contains(@id,'_ctl05_liCategory')]")
	WebElement SLAlink;
	
	@FindAll({@FindBy(linkText="SLA report")})
	List<WebElement> SLAreport;
	
	@FindBy(xpath="//li[contains(@id,'_ctl06_liCategory')]")
	WebElement auditlink;
	
	@FindAll({@FindBy(linkText="Tracking report")})
	List<WebElement> trackingreport;
	
	@FindBy(xpath="//li[contains(@id,'_ctl07_liCategory')]")
	WebElement knowlink;
	
	@FindAll({@FindBy(linkText="Knowledge document details")})
	List<WebElement> knowdoc;
	
	@FindAll({@FindBy(xpath="//a[contains(@id,'lnkReport')]")})
	//@FindAll({@FindBy(xpath="//a[contains(@class,'toolTipClass')][@href='javascript:void()']")})
	List<WebElement> countreports;
	
  //constructor
  public Reports(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
    
  //Check visibility of request details report
  public void Req_detail()
  {
	  boolean reqpresent=reqdetails.size()>0;
	 // boolean reqpresent = driver.findElements(By.linkText("Requests details")).size()>0;
	  if(reqpresent)
	  {
		 // System.out.println("Request details report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Request details report is not present");
	  }
  }
  
//Check visibility of large request details report
  public void Large_Req_detail()
  {
	  boolean largereqpresent =lareqdetails.size()>0;
	  if(largereqpresent)
	  {
		//  System.out.println("Large Request details report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Large Request details report is not present");
	  }
  }
	  
//Check visibility of request multiple volume report
  public void Req_Multiple_vol()
  {
	  boolean reqmultiplepresent =Reqmultiple.size()>0;
	  if(reqmultiplepresent)
	  {
		  //System.out.println("Request multiple volume report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Request multiple volume report is not present");
	  }
  }
	  
//Check visibility of feedbck request report
  public void Feedback_req()
  {
	  boolean feedbackreqpresent =Feedbackreq.size()>0;
	  if(feedbackreqpresent)
	  {
		 // System.out.println("Feedback Request report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Feedback Request report is not present");
	  }
  }
	  
//Check visibility of request type report
  public void Request_type()
  {
	  boolean reqtypepresent =reqtype.size()>0;
	  if(reqtypepresent)
	  {
		  //System.out.println("Request type report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Request type report is not present");
	  }
  }
  
//Check visibility of timesheet report
  public void timesheet_report()
  {
	  boolean timesheetreppresent =timesheetrep.size()>0;
	  if(timesheetreppresent)
	  {
		 // System.out.println("Timesheet report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Timesheet report is not present");
	  }
  }
  
  
//Check visibility of timesheet report
  public void my_timesheet_report()
  {
	  boolean timesheetreppresent =mytimesheetrep.size()>0;
	  if(timesheetreppresent)
	  {
		 // System.out.println(" My Timesheet report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Timesheet report is not present");
	  }
  }
  
//Check visibility of user details report
  public void user_details()
  {
	  boolean userdetpresent =userdetails.size()>0;
	  if(userdetpresent)
	  {
		  //System.out.println("User details report is PRESENT");
	  }
	  else
	  {
		  System.out.println("User details report is not present");
	  }
  }
  
//Check visibility of user mapping report
  public void user_mappings()
  {
	  boolean mappingpresent =usermapping.size()>0;
	  if(mappingpresent)
	  {
		 // System.out.println("User mapping report is PRESENT");
	  }
	  else
	  {
		  System.out.println("User mapping report is not present");
	  }
  }
  
//Check visibility of SLA report
  public void SLA_Report()
  {
	  boolean SLApresent =SLAreport.size()>0;
	  if(SLApresent)
	  {
		 // System.out.println("SLA report is PRESENT");
	  }
	  else
	  {
		  System.out.println("SLA report is not present");
	  }
  }
  
//Check visibility of tracking report
  public void tracking_Report()
  {
	  boolean trackingpresent =trackingreport.size()>0;
	  if(trackingpresent)
	  {
		  //System.out.println("Tracking report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Tracking report is not present");
	  }
  }
  
//Check visibility of Knowledge document details report
  public void know_doc_Report()
  {
	  boolean knowedgepresent =knowdoc.size()>0;
	  if(knowedgepresent)
	  {
		 // System.out.println("Knowledge document details report is PRESENT");
	  }
	  else
	  {
		  System.out.println("Knowledge document details report is not present");
	  }
  }
    
  
  //Check reports visibility for Team Manager
  public void reports_TM() throws InterruptedException
  {
	  System.out.println("---*** Reports.reports_TM() ***---");
	  if(driver.findElements(By.linkText("Reports")).size()>0)
	  {
		  clickreports.click();
		  Thread.sleep(1000);
		  if(driver.findElements(By.linkText("My reports")).size()>0)
		  {
			  myreportlink.click();
			  Thread.sleep(2000);
			  String logname = driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
				System.out.println("Loged in user is " +logname);
				switch(logname)
				 {
				 case "Teammanager Demo2":
	  Req_detail();
	  Large_Req_detail();
	  Req_Multiple_vol();
	  feedbacklink.click();
	  Thread.sleep(1000);
	  Feedback_req();
	  Request_type();
	  timelink.click();
	  Thread.sleep(1000);
	  timesheet_report();
	  userlink.click();
	  Thread.sleep(1000);
	  user_details();
	  user_mappings();
	  SLAlink.click();
	  Thread.sleep(1000);
	  SLA_Report();
	  auditlink.click();
	  Thread.sleep(1000);
	  tracking_Report();
	  knowlink.click();
	  Thread.sleep(1000);
	  know_doc_Report();
	  if(countreports.size()!=11)
		  {
			  System.out.println("INCORRECT reports displaying for Team manager");
		  }
		  else
		  {
			  System.out.println("Correct reports displaying for Team manager");
		  }
	  break;
		case "Analyst Demo2":
		 Req_detail();
			 feedbacklink.click();
			  Thread.sleep(1000);
			 my_timesheet_report();
			 if(countreports.size()!=2)
			  {
				  System.out.println("INCORRECT reports displaying for Analyst");
			  }
			  else
			  {
				  System.out.println("Correct reports displaying for Analyst");
			  }
			 break;
			 }
		 }
		  else
		  {
			  System.out.println("\n" + "My Reports is not present");
		  }
	  }
	  else
	  {
		  System.out.println("\n" + "Reports module not present");
	  }
	  }
  }