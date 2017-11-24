package actionpackage;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import rmspackage.Loginclass;
import rmspackage.New_Request;
import rmspackage.Reports;
import rmspackage.Req_deliverables;
import rmspackage.View_request;
import rmspackage.Request_details;
import rmspackage.ExcelUtils;
import rmspackage.FillTimesheet;
import rmspackage.ViewTimesheet;
import rmspackage.Viewfeedback;
import rmspackage.Fillfeedback;

public class actionclass {
	static WebDriver driver;
	Loginclass objlogin;
	New_Request objreq;
	View_request objview;
	Request_details objdetails;
	Req_deliverables objdeli;
	
	//Login to application using username and password
	
	 static Logger log = Logger.getLogger(actionclass.class.getName());
	 
	//driver=new FirefoxDriver();
	 public static WebDriver getDriver() {
			return driver;
		}
	 
 @BeforeSuite
 public void enterurl() throws IOException, InterruptedException
{
	 //Loginclass objurl=PageFactory.initElements(driver,Loginclass.class);
		//System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\chromedriver.exe");
			/*driver = new InternetExplorerDriver();
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			  capabilities.setCapability(InternetExplorerDriver.
			  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			  driver = new InternetExplorerDriver(capabilities);*/
			
			//DOMConfigurator.configure("log.xml");
		// driver =new ChromeDriver();
	 System.setProperty("webdriver.gecko.driver","C://Users//chaman.preet//Downloads//geckodriver.exe");
	driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	  Thread.sleep(1000);
	 log.info("Opening URL");	
	 Loginclass objurl=PageFactory.initElements(driver,Loginclass.class);
	 ExcelUtils.setexcel("C:\\RMS_workspace\\First_RMSProject\\RMS data.xlsx", "Sheet1");
	 objurl.logintourl();
 }
	 
@Test
  public void loginteam() throws IOException, InterruptedException {
		log.info("logging team manager");	
		
  Loginclass objlogin=PageFactory.initElements(driver,Loginclass.class);
  System.out.println("\n" +"///--- actionclass.loginteam() ---///");
	 // for(int i=2;i<=5;i++)
	 // {
	  objlogin.enteruser(2);
	  Thread.sleep(1000);
	  objlogin.enterpswd(2);
	  objlogin.log();
	  Thread.sleep(2000);
 // }
	}
	  	
	//Create new request
	@Test
public void newreq() throws InterruptedException{
		New_Request objreq=PageFactory.initElements(driver, New_Request.class);
	  System.out.println("\n" +"///--- actionclass.newreq() ---///");
		Thread.sleep(5000);
	 objreq.raise_Req();
  }

	// Check visibility and functionality on view request page
	@Test
	public void viewreq() throws InterruptedException
	{
		View_request objview=PageFactory.initElements(driver, View_request.class);
		System.out.println("\n" +"///---  actionclass.viewreq() ---///");
		objview.unassigned();
		objview.inprogress();
		objview.onhold();
		objview.completed();
		objview.closed();
		objview.cancelled();
		objview.deadline_TBD();
		
	}
	
	//Check visibility and functionality on request details page
	@Test
	public void reqdetails() throws InterruptedException
	{
		Request_details objdetails=PageFactory.initElements(driver, Request_details.class);
		System.out.println("\n" + "///--- actionclass.reqdetails() ---///");
		objdetails.unassignedreq();
		//objdetails.inprogressreq();
		/*objdetails.onholdreq();
		objdetails.cancelreq();
		objdetails.TBDreq();*/
		objdetails.completedreq();
	    objdetails.closedreq();
	}
	
	//Check visibility and functionality on request deliverable page
	@Test
	public void Request_deliverable() throws InterruptedException, AWTException
	{
		Req_deliverables objdeli=PageFactory.initElements(driver, Req_deliverables.class);
		System.out.println("\n" +"///--- actionclass.Request_deliverable() ---///");
		/*objdeli.upload();
		objdeli.addcomment();
		objdeli.download();
		objdeli.deletedeliverable();*/
		objdeli.deliverable_action();
		/*objdeli.actionunassigned1();
		objdeli.actioninprogress();
		objdeli.actiononhold();
		objdeli.actioncompleted();
		objdeli.actionclosed();
		objdeli.actionTBD();
		objdeli.actioncancelled();*/
	}
	
	//Check visibility and functionality on Fill Timesheet page
	@Test
	public void timesheet1() throws InterruptedException, AWTException
	{
		System.out.println("\n" + "///--- actionclass.timesheet1() ---///");
		 if(driver.findElements(By.linkText("Timesheet")).size()>0)
		  {
		FillTimesheet objfill=PageFactory.initElements(driver, FillTimesheet.class);
		objfill.fill_timesheet();
		//objfill.fill_activity();
		//objfill.reset();
		ViewTimesheet objview_timesheet=PageFactory.initElements(driver, ViewTimesheet.class);
		objview_timesheet.view_timesheet();
	}
		 else
		  {
			  System.out.println("\n" + "Timesheet module not present");
		  }
	}
	
	//Check visibility of reports
	@Test
	public void Reports_visibility() throws InterruptedException
	{
		System.out.println("\n" + "///actionclass.Reports() ---///");
		Reports objrep=PageFactory.initElements(driver, Reports.class);
		objrep.reports_TM();
	}
	
	//Ckeck visibility and functionaility of View feedback module
	@Test
	public void feedback() throws InterruptedException
	{
		System.out.println("\n" + "///---actionclass.feedback() ---///");
		boolean feedbackpresent = driver.findElements(By.linkText("Feedback")).size()>0;
		  if(feedbackpresent)
		  {
		Viewfeedback objfeedback=PageFactory.initElements(driver, Viewfeedback.class);
		objfeedback.View_feedback1();
		Fillfeedback objfillback=PageFactory.initElements(driver, Fillfeedback.class);
		objfillback.fill_feedback1();
		  }
		  else
		  {
			  System.out.println("Feedback module is not present");
		  }
	}
	
	@Test
	public void logout() throws InterruptedException 
	{
		log.info("Executing logout operation");
		Loginclass objlogout=PageFactory.initElements(driver,Loginclass.class);
		objlogout.logout();
		Thread.sleep(2000);
	}
	
	//Take screenshot and Close browser after test is completed
	@AfterSuite
	public void closetest() throws IOException
	{
	/*	log.info("Taking screenshot and closing window");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C://Users//chaman.preet//Desktop//screenshot.png"));*/
		driver.close();
	}
	 
}
