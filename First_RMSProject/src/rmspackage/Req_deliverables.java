package rmspackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import rmspackage.Request_details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Req_deliverables {
	WebDriver driver;
	Request_details objdetails;
	
	@FindBy(linkText="View requests")
	 WebElement View;
	
	@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_rptrRequestStatus_ctl00_lnkButtonRequestStatus")
	WebElement unassignlink;
	
	@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_rptrRequestStatus_ctl01_lnkButtonRequestStatus")
	WebElement inprogresslink;
	
	@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_rptrRequestStatus_ctl02_lnkButtonRequestStatus")
	WebElement onholdlink;
	
	@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_rptrRequestStatus_ctl03_lnkButtonRequestStatus")
	WebElement cancellink;
	
	@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_rptrRequestStatus_ctl04_lnkButtonRequestStatus")
	WebElement completelink;

	@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_rptrRequestStatus_ctl05_lnkButtonRequestStatus")
	WebElement closelink;
	
	@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_rptrRequestStatus_ctl06_lnkButtonRequestStatus")
	WebElement TBDlink;
		
	/* @FindBy(id="lnkFilterpane")
	 WebElement Filter;

	 @FindBy(id="ctl00_SPWebPartManager1_RequestFilterProvider_rptrFilters_ctl02_lst__Arrow")
	 WebElement Status;

	 @FindAll({@FindBy(className="rcbCheckBox")})
	 List<WebElement> checkstatus;

	 @FindBy(id="btnFilter")
	 WebElement Apply;*/
	
	@FindBy(linkText="Deliverables")
	WebElement deliclick;
	
	@FindBy(xpath="//Select[contains(@id,'_ddlDeliverableType')]")
	WebElement type;
	
	@FindBy(xpath="//input[contains(@id,'_radUpDeliverableDocumentfile0')]")
	WebElement choose;
	
	@FindBy(tagName="iframe")
	WebElement frametag;
		
	@FindBy(xpath="//iframe[contains(@id,'_rptrDeliverables_ctl00_richTextMultiLineTextBox1_contentIframe')]")
	WebElement descframe;
	
	@FindBy(tagName="body")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b9b66502_20fe_447d_ada5_7decc0bdf3a3_richTextMultiLineTextBox1ContentHiddenTextarea")
	WebElement delcomment;
	
	@FindBy(id="btnUpload")
	WebElement delsubmit;
	
	@FindBy(xpath="//input[contains(@id,'_rptrDeliverables_ctl00_btnAddComment')]")
	WebElement addsubmit;
	
	@FindBy(id="btnDownloadAllFiles")
	WebElement downbtn;
	
	@FindBy(xpath="//a[contains(@id,'_imgDeleteDeliverableSet')]")
	WebElement Deletedel;
	
	 @FindAll({@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_ddlRecordsPerPage")})
		List<WebElement> requestexist;
	
	 @FindAll({@FindBy(xpath="//a[starts-with(@class,'icon')][contains(@class,'toolTipClass')]")})
	//@FindAll({@FindBy(xpath="//a[contains(@class,'toolTipClass')][@href='javascript:void()']")})
	List<WebElement> countelements;
	
	String path1="C:\\Users\\chaman.preet\\Downloads\\TimesheetReport (9) (1) (2).xlsx";
	
	String logname;
	
	public static String downloadPath = "C:\\Users\\chaman.preet\\Desktop\\download";
	
	public Req_deliverables(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void opendeliverables() throws InterruptedException
	{
		Thread.sleep(1000);
		    driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
				Thread.sleep(3000);
		  deliclick.click();
	}
	
	  
  public void upload() throws InterruptedException, AWTException {
	  /*View.click();
	  Thread.sleep(3000);
	  inprogresslink.click();
	  Thread.sleep(3000);
	  opendeliverables();
	  Thread.sleep(1000);*/
	  Select selecttype=new Select(type);
	  selecttype.selectByVisibleText("Interim");
	  Thread.sleep(1000);
	  choose.click();
	  Thread.sleep(1000);
	  StringSelection ss=new StringSelection(path1);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  Robot rob=new Robot();
	  rob.keyPress(KeyEvent.VK_CONTROL);
	  rob.keyPress(KeyEvent.VK_V);
	  rob.keyRelease(KeyEvent.VK_CONTROL);
	  rob.keyRelease(KeyEvent.VK_V);
	  Thread.sleep(1000);
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(1000);
      driver.switchTo().frame(frametag);
	  delcomment.sendKeys("Add comment while uploading deliverables");
	  driver.switchTo().defaultContent();
	  Thread.sleep(1000);
	  delsubmit.click();
  }
  

  public void addcomment() throws InterruptedException
  {
	  //opendeliverables();
	  Thread.sleep(1000);
	  //driver.switchTo().frame(3);
	  driver.switchTo().frame(descframe);
	  delcomment.sendKeys("Add comment in comment section");
	  driver.switchTo().defaultContent();
	  addsubmit.click();
  }
  
  public void deletedeliverable() throws InterruptedException, AWTException
  {
	  opendeliverables();
	  Thread.sleep(1000);
	  Deletedel.click();
	  Thread.sleep(1000);
	  Robot rob=new Robot();
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  rob.delay(1000);
  }
  
  public FirefoxProfile download() throws InterruptedException, AWTException
  {
	  /*View.click();
	  Thread.sleep(3000);
	  inprogresslink.click();
	  Thread.sleep(2000);
	  opendeliverables();*/
	  downbtn.click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", downloadPath);
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		Thread.sleep(1000);
		Robot rob=new Robot();
		  rob.keyPress(KeyEvent.VK_DOWN);
		  rob.keyRelease(KeyEvent.VK_DOWN);
		  rob.keyPress(KeyEvent.VK_TAB);
		  rob.keyRelease(KeyEvent.VK_TAB);
		  rob.keyPress(KeyEvent.VK_TAB);
		  rob.keyRelease(KeyEvent.VK_TAB);
		  rob.keyPress(KeyEvent.VK_TAB);
		  rob.keyRelease(KeyEvent.VK_TAB);
		  Thread.sleep(1000);
		  rob.keyPress(KeyEvent.VK_ENTER);
		  rob.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		driver.navigate().back();
		return profile;
		}
  
  //Perform all actions on deliverables
  public void deliverable_action() throws InterruptedException, AWTException
  {
	  View.click();
	  Thread.sleep(3000);
	  inprogresslink.click();
	  Thread.sleep(3000);
	  opendeliverables();
	  Thread.sleep(1000);
	  if(driver.findElements(By.xpath("//div[contains(@id,'_noData')][class='noData']")).size()>0)
	  {
			  System.out.println("Deliverables cannot be viewed");
	  }
		  else
		  {
	  logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2": case "Analyst Demo2":
		  upload();
		  addcomment();
		  deletedeliverable();
		  download();  
	  break;
		 case "Gatekeeper Demo2":
	  addcomment();
	  download();
	  break;
		 case "Requestor Demo2":
			  addcomment();
			  download();
			  break;
	  }
	  }
  }	 
  
  // To verify if assign analyst is present.
  public void assign_analyst_details1() throws InterruptedException {
	  String detailtitle = driver.findElement(By.xpath(".//*[@id='innerTitleHeaderRequestDetail']/div[1]/h1")).getText();
	  Assert.assertEquals(detailtitle, "Deliverables");
	  boolean assignpresent=driver.findElements(By.id("lnkAssign")).size()>0;
	  if(assignpresent)
	  {
		 // System.out.println("Assign analyst action button is PRESENT");
  }
	  else
	  {
		  System.out.println("Assign analyst action button is not present");
	  }
  }
  // To verify if add supporting document is present.
  public void addsupporting_details1()
  {
	  boolean addpresent=driver.findElements(By.id("lnkAddSupportingDocument")).size()>0;
	  if(addpresent)
	  {
		  //System.out.println("Add supporting document action button is PRESENT");
  }
  else
  {
	  System.out.println("Add supporting document action button is not present.");
  }
  }
  
	  	  
	  // To verify if edit deadline is present.
	  public void editdead_details1()
	  {
		  boolean editpresent=driver.findElements(By.id("lnkEditRequestDeadline")).size()>0;
		 			if(editpresent)
			{	
		 				//System.out.println("Edit deadline is PRESENT");		
			}
			else{
				System.out.println("Edit deadline is not present");
			}
		}
	  
	  //To verify if edit request coverage is present.
	  
	  public void editcoverage_details1()
	  {
		  boolean covpresent=driver.findElements(By.id("lnkEditCoverageGroup")).size()>0;
		  if(covpresent)
		  {
			  //System.out.println("Edit coverage is PRESENT");
		  }
		  else
		  {
			  System.out.println("Edit coverage is not present");
		  }
	  }
	  
	//To verify if fill timesheet is present.
	  public void filltimesheet_details1()
	  {
		  
		  boolean timesheetpresent=driver.findElements(By.id("lnkFillTimesheet")).size()>0;
		  if(timesheetpresent)
		  {
			 // System.out.println("Fill timesheet is PRESENT");
		  }
		  else{
			  System.out.println("Fill timesheet is not present");
		  }
		  
	  }
	  
	//To verify if Edit request is present.
	  public void Editrequest_details1()
	  {
		  boolean requestpresent=driver.findElements(By.id("lnkEdit")).size()>0;
		  if(requestpresent)
		  {
			 // System.out.println("Edit request action button is PRESENT");
	  }
		  else
		  {
			  System.out.println("Edit request action button is not present");
		  }
	  }
	  
	  //To verify if hold request is present.
	  public void holdreq_details1()
	  {
		  boolean holdpresent=driver.findElements(By.id("lnkHold")).size()>0;
		  if(holdpresent)
		  {
			  //System.out.println("Hold action button is PRESENT");  
	  }
		  else
		  {
			System.out.println("Hold action button is not present");  
		  }
		  }
	  
	  //To verify if unhold request is present
	  public void unholdreq_details1()
	  {
		  boolean unholdpresent=driver.findElements(By.id("lnkUnHold")).size()>0;
		  if(unholdpresent)
		  {
			 // System.out.println("Hold action button is PRESENT"); 
		  }
		  else
		  {
			System.out.println("Hold action button is not available");  
		  }
		  }
			  
	  //To verify if cancel request is present.
	  public void cancelreq_details1()
		{
		  boolean cancelpresent=driver.findElements(By.id("lnkCancelRequest")).size()>0;
			if(cancelpresent)
			{
				//System.out.println("Cancel action button is PRESENT");  
			}	
			else
			{
				System.out.println("Cancel action button is not available");  
			}
		}
	  
	//To verify if version history is present.
	  public void requesthistory_details1() throws InterruptedException
	  {
		  boolean historypresent=driver.findElements(By.id("lnkVersionHistory")).size()>0;
		  if(historypresent)
		  {
			 // System.out.println("Version history is PRESENT");
		  }
		  else
		  {
			  System.out.println("Version history is not present");
		  }
		  
	  }
	  
	//To verify if recurring request is present.
	  public void recurring_details1()
	  {
		  boolean recurpresent=driver.findElements(By.id("lnkRecurringRequest")).size()>0;
		  if(recurpresent)
		  {
			 // System.out.println("Recurring request is PRESENT");
	  }
	  else
	  {
		  System.out.println("Recurring request is not present");
	  }
	  }
	  
	//To verify if set as large request is present.
	  public void setaslarge1()
	  {
		 // if(largereq.isDisplayed())
			 boolean largepresent = driver.findElements(By.id("lnkSetAsLargeRequest")).size()>0;
			  if(largepresent)
		  {
				 // System.out.println("Set as large request is PRESENT");
		  }
		  else
		  {
			  System.out.println("Set as large request is not present");
		  }
		  
	  }
	  
	//To verify if request comments is present.
	  public void req_comments1()
	  {
		  boolean commentpresent=driver.findElements(By.id("lnkRequestComments")).size()>0;
		  if(commentpresent)
		  {
			//  System.out.println("req comment is PRESENT");
	  }
	  else
	  {
		  System.out.println("req comment is not present");
	  }
}
	  
		//To verify if deadline TBD is present.
	  public void deadline_TBD1()
	  {
		  boolean TBDpresent=driver.findElements(By.id("lnkPostponeRequest")).size()>0;
		  if(TBDpresent)
		  {
			 // System.out.println("deadline TBD is PRESENT");
		  }
		  else
		  {
			  System.out.println("deadline TBD is not present");
		  }
	  }
  
	  
	//To verify if deadline confirmed is present.
	  public void deadline_confirmed1()
	  {
		  boolean confirmpresent=driver.findElements(By.id("lnkResumeRequest")).size()>0;
		  if(confirmpresent)
		  {
			//  System.out.println("deadline confirmed is PRESENT");
		  }
		  else
		  {
			  System.out.println("deadline confirmed is not present");
		  }
	  }
	  
	//To verify if reactivate is present.
	  public void reactivatereq1() throws InterruptedException {
		  String detailtitle = driver.findElement(By.xpath(".//*[@id='innerTitleHeaderRequestDetail']/div[1]/h1")).getText();
		  Assert.assertEquals(detailtitle, "Request detail"); 
		  boolean reactivatepresent=driver.findElements(By.id("lnkReactivateRequest")).size()>0;
		  if(reactivatepresent)
		  {
			//  System.out.println("Reactivate action button is PRESENT");
	  }
		  else
		  {
			  System.out.println("Reactivate action button is not present");
		  }
	  }
	  
	  //To verify if view feedback is present
	  public void view_feedback1() throws InterruptedException
	  {
		  boolean viewpresent=driver.findElements(By.id("lnkViewFeedback")).size()>0;
		  if(viewpresent)
		  {
			 // System.out.println("View feedback button is PRESENT");  
		  }
		  else
		  {
			System.out.println("View feedback button is not available");  
		  }
		  }
			  	
	  //To verify if fill feedback is present
	  public void fill_feedback1() throws InterruptedException
	  {
		  boolean fillpresent=driver.findElements(By.id("lnkFillFeedback")).size()>0;
		  if(fillpresent)
		  {
			 // System.out.println("View feedback button is PRESENT");  
		  }
		  else
		  {
			System.out.println("Fill feedback button is not available");  
		  }
		  }
	  
	  
	  //Perform action buttons for unassigned request
  public void actionunassigned1() throws InterruptedException
  {
	  System.out.println("\n" +"Req_deliverables.actionunassigned()");
	  View.click();
	  Thread.sleep(3000);
	  unassignlink.click();
	  Thread.sleep(2000);
	  if(requestexist.size()>0)
		{
	  opendeliverables();
	  logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
	//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
	    if((countelements.size()!=12) && (countelements.size()!=13))
		  {
			  System.out.println("INCORRECT action buttons displaying for unassigned request");
		  }
		  else
		  {
			  System.out.println("Correct action buttons displaying for unassigned request");
		  }
	   assign_analyst_details1();
	  addsupporting_details1();
	  editdead_details1();
	   editcoverage_details1();
	   filltimesheet_details1();
	Editrequest_details1();
	   holdreq_details1();
	 cancelreq_details1();
	 requesthistory_details1();
	  recurring_details1();
	 setaslarge1();
	 req_comments1();
	deadline_TBD1();
	 break;		
	 case "Gatekeeper Demo2": case "Requestor Demo2":
		 if(countelements.size()!=9)
		  {
			  System.out.println("INCORRECT action buttons displaying for unassigned request");
		  }
		  else
		  {
			  System.out.println("Correct action buttons displaying for unassigned request");
		  }
		 addsupporting_details1();
		   editdead_details1();
		 editcoverage_details1();
		   Editrequest_details1();
		   requesthistory_details1();
		   req_comments1();
		   holdreq_details1();
		   deadline_TBD1();
			  cancelreq_details1();
				 break;
	 case "Analyst Demo2":
		    if(countelements.size()!=8)
			  {
				  System.out.println("INCORRECT action buttons displaying for unassigned request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for unassigned request");
			  }
		 addsupporting_details1();
		   editdead_details1();
		 editcoverage_details1();
		   filltimesheet_details1();
		   Editrequest_details1();
		   requesthistory_details1();
		   req_comments1();
		  assign_analyst_details1();
			 break;			 
  }
}
	  else
		{
			System.out.println("No unassigned request available" + "\n");
		}
	}
		
  public void actioninprogress() throws InterruptedException
  {
	  System.out.println("\n" +"Req_deliverables.actioninprogress()");
	  View.click();
	  Thread.sleep(3000);
	  inprogresslink.click();
	  Thread.sleep(2000);
	  if(requestexist.size()>0)
		{
	  opendeliverables();
	  logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
if((countelements.size()!=12) && (countelements.size()!=13))
{
	  System.out.println("INCORRECT action buttons displaying for inprogress request");
}
else
{
	  System.out.println("Correct action buttons displaying for inprogress request");
}
	  
	  assign_analyst_details1();
	  addsupporting_details1();
	  editdead_details1();
	   editcoverage_details1();
	   filltimesheet_details1();
	Editrequest_details1();
	   holdreq_details1();
	 cancelreq_details1();
	 requesthistory_details1();
	  recurring_details1();
	 setaslarge1();
	 req_comments1();
	deadline_TBD1();
	break;
		 case "Gatekeeper Demo2": case "Requestor Demo2":
			 System.out.println("Element count is" +countelements.size());
			 if(countelements.size()!=8) 
			  {
				 System.out.println("INCORRECT action buttons displaying for inprogress request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for inprogress request");
			  }
			addsupporting_details1();
			  editdead_details1();
			  editcoverage_details1();
			Editrequest_details1();
			 holdreq_details1();
			  requesthistory_details1();
			   req_comments1();
			  deadline_TBD1();
			  break;
		 case "Analyst Demo2":
			    if(countelements.size()!=8)
				  {
					  System.out.println("INCORRECT action buttons displaying for inprogress request");
				  }
				  else
				  {
					  System.out.println("Correct action buttons displaying for inprogress request");
				  }
			   assign_analyst_details1();
			   addsupporting_details1();
			   editdead_details1();
			   editcoverage_details1();
			  filltimesheet_details1();
			 Editrequest_details1();
			   requesthistory_details1();
			    req_comments1();
				 break;			 
  }
  }
	  else
		{
			System.out.println("No inprogress request available" + "\n");
		}
	}
  
  public void actiononhold() throws InterruptedException
  {
	  System.out.println("\n" + "Req_deliverables.actiononhold()");
	  View.click();
	  Thread.sleep(3000);
	  onholdlink.click();
	  Thread.sleep(2000);
	  if(requestexist.size()>0)
		{
	  opendeliverables();
	  logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
	 if((countelements.size()!=9) && (countelements.size()!=10))
	  {
		  System.out.println("INCORRECT action buttons displaying for onhold request");
	  }
	  else
	  {
		  System.out.println("Correct action buttons displaying for onhold request");
	  }	   
	  addsupporting_details1();
	  editdead_details1();
	   editcoverage_details1();
	   filltimesheet_details1();
	Editrequest_details1();
	 cancelreq_details1();
	 requesthistory_details1();
	 setaslarge1();
	 req_comments1();
	 break;
		 case "Gatekeeper Demo2": case "Requestor Demo2":
			 if(countelements.size()!=8)
			  {
				 System.out.println("INCORRECT action buttons displaying for onhold request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for onhold request");
			  }
			 addsupporting_details1();
			  editdead_details1();
			  editcoverage_details1();
			  Editrequest_details1();
			  requesthistory_details1();
			  req_comments1();
			 cancelreq_details1();
			   unholdreq_details1();
			   break;
				 case "Analyst Demo2":
					    if(countelements.size()!=7)
						  {
							  System.out.println("INCORRECT action buttons displaying for onhold request");
						  }
						  else
						  {
							  System.out.println("Correct action buttons displaying for onhold request");
						  }
					  addsupporting_details1();
					   editdead_details1();
					  editcoverage_details1();
					  filltimesheet_details1();
					  Editrequest_details1();
					  requesthistory_details1();
					  req_comments1();
						 break;			 
		 }
  }
  else
	{
		System.out.println("No onhold request available" + "\n");
	}
}
  
  public void actioncompleted() throws InterruptedException
  {
	  System.out.println("\n" + "Req_deliverables.actioncompleted()");
	  View.click();
	  Thread.sleep(3000);
	  completelink.click();
	  Thread.sleep(2000);
	  if(requestexist.size()>0)
		{
	  opendeliverables();
	 logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
	    if((countelements.size()!=5) && (countelements.size()!=6))
		  {
			  System.out.println("INCORRECT action buttons displaying for complete request");
		  }
		  else
		  {
			  System.out.println("Correct action buttons displaying for complete request");
		  }
	   filltimesheet_details1();
	 requesthistory_details1();
	  recurring_details1();
	 setaslarge1();
	 req_comments1();
	reactivatereq1();
	 break;
		 case "Gatekeeper Demo2": case "Requestor Demo2":
			 if(countelements.size()!=4)
			  {
				 System.out.println("INCORRECT action buttons displaying for complete request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for complete request");
			  }
			 requesthistory_details1();
			   req_comments1();
			   fill_feedback1();
			   reactivatereq1();
			   break;
		 case "Analyst Demo2" :
			 if(countelements.size()!=4)
			  {
				 System.out.println("INCORRECT action buttons displaying for complete request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for complete request");
			  }
			requesthistory_details1();
			  req_comments1();
			 filltimesheet_details1();
			   reactivatereq1();
			   Thread.sleep(1000);
		 }
  }
	  else
		{
			System.out.println("No complete request available" + "\n");
		}
	}
  
  
  public void actionclosed() throws InterruptedException
  {
	System.out.println("\n" + "Req_deliverables.actionclosed()");
	  View.click();
	  Thread.sleep(3000);
	  closelink.click();
	  Thread.sleep(2000);
	  if(requestexist.size()>0)
		{
	  opendeliverables();
	 logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		  if(countelements.size()!=5)
		  {
			  System.out.println("INCORRECT action buttons displaying for closed request");
		  }
		  else
		  {
			  System.out.println("Correct action buttons displaying for closed request");
		  }
	   filltimesheet_details1();
	 requesthistory_details1();
	  recurring_details1();
	 req_comments1();
	 view_feedback1();
	 break;
		 case "Gatekeeper Demo2": case "Requestor Demo2":
			 System.out.println("Element count is" +countelements.size());
			 if(countelements.size()!=3)
			  {
				 System.out.println("INCORRECT action buttons displaying for closed request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for closed request");
			  }
			 requesthistory_details1();
			   req_comments1();
			   view_feedback1();
			   break;
		 case "Analyst Demo2" :
			 if(countelements.size()!=4)
			  {
				 System.out.println("INCORRECT action buttons displaying for closed request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for closed request");
			  }
			 requesthistory_details1(); 
			  req_comments1();	 
			   filltimesheet_details1();
			   view_feedback1();
			   Thread.sleep(1000);
			   break;
		 }
  }
	  else
		{
			System.out.println("No closed request available" + "\n");
		}
	}
    
  
  public void actionTBD() throws InterruptedException
  {
	System.out.println("\n" + "Req_deliverables.actionTBD()");
	  View.click();
	  Thread.sleep(3000);
	  TBDlink.click();
	  Thread.sleep(2000);
	  if(requestexist.size()>0)
		{
	  opendeliverables();
	 logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
	    if((countelements.size()!=10) && (countelements.size()!=9))
	  {
		  System.out.println("INCORRECT action buttons displaying for deadline TBD request");
	  }
	  else
	  {
		  System.out.println("Correct action buttons displaying for deadline TBD request");
	  }
	  addsupporting_details1();
	  editdead_details1();
	   editcoverage_details1();
	   filltimesheet_details1();
	Editrequest_details1();
	 cancelreq_details1();
	 requesthistory_details1();
	 setaslarge1();
	 req_comments1();
	deadline_confirmed1();
		 case "Gatekeeper Demo2": case "Requestor Demo2":
			 if(countelements.size()!=8)
			  {
				 System.out.println("INCORRECT action buttons displaying for deadline TBD request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for deadline TBD request");
			  }
			 addsupporting_details1();
			 editdead_details1();
			  editcoverage_details1();
			 Editrequest_details1();
			 cancelreq_details1();
			  requesthistory_details1();
			 req_comments1();
			 deadline_confirmed1();
			   break;
		 case "Analyst Demo2" :
			 if(countelements.size()!=7)
			  {
				 System.out.println("INCORRECT action buttons displaying for deadline TBD request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for deadline TBD request");
			  }
			 addsupporting_details1();
			   editdead_details1();
			  editcoverage_details1();
			 Editrequest_details1();
			 requesthistory_details1();
			  req_comments1();
			  filltimesheet_details1();
		 }
  }
	  else
		{
			System.out.println("No TBD request available" + "\n");
		}
	}
  
  
  public void actioncancelled() throws InterruptedException
  {
  System.out.println("\n" + "Req_deliverables.actioncancelled()");
  View.click();
  Thread.sleep(3000);
  cancellink.click();
  Thread.sleep(2000);
  if(requestexist.size()>0)
	{
  opendeliverables();
 logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
	//System.out.println("Loged in user is " +logname);
	switch(logname)
	 {
	 case "Teammanager Demo2":
    if(countelements.size()!=3)    		
  {
	  System.out.println("INCORRECT action buttons displaying for cancelled request");
  }
  else
  {
	  System.out.println("Correct action buttons displaying for cancelled request");
  }
   filltimesheet_details1();
 requesthistory_details1();
 req_comments1();
	 case "Gatekeeper Demo2": case "Requestor Demo2":
		 if(countelements.size()!=2)
		  {
			 System.out.println("INCORRECT action buttons displaying for cancelled request");
		  }
		  else
		  {
			  System.out.println("Correct action buttons displaying for cancelled request");
		  }
		  requesthistory_details1();
		 req_comments1();
		   break;
	 case "Analyst Demo2" :
		 if(countelements.size()!=3)
		  {
			 System.out.println("INCORRECT action buttons displaying for cancelled request");
		  }
		  else
		  {
			  System.out.println("Correct action buttons displaying for cancelled request");
		  }
		 requesthistory_details1();
		   req_comments1();
		   filltimesheet_details1();
	 }
}
  else
	{
		System.out.println("No cancelled request available" + "\n");
	}
}
}
