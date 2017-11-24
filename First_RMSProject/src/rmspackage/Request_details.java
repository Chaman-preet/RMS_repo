package rmspackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import rmspackage.Req_deliverables;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Request_details {
	WebDriver driver;
	
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
	
 @FindBy(linkText="View requests")
 WebElement View;
	
/* @FindBy(id="lnkFilterpane")
 WebElement Filter;

 @FindBy(id="ctl00_SPWebPartManager1_RequestFilterProvider_rptrFilters_ctl02_lst__Arrow")
 WebElement Status;

 @FindAll({@FindBy(className="rcbCheckBox")})
 List<WebElement> checkstatus;

 @FindBy(id="btnFilter")
 WebElement Apply;*/
	
  @FindBy(id="lnkAssign")
  WebElement Assignreq;
  
  @FindBy(xpath="//input[contains(@id,'_ddlAnalysts_Input')]")
 // @FindBy(id="ctl00_SPWebPartManager1_g_4de00c5e_f4bc_4ae2_84a9_f8fccf0ab154_ddlAnalysts_Input")
  WebElement Team;
  
  @FindBy(id="btnAssignAnalyst")
  WebElement submitanalyst;
  
  @FindBy(id="lnkAddSupportingDocument")
  WebElement Addsupport;
  
  @FindBy(className="ms-dlgFrame")
  WebElement supportframe;
  
  @FindAll({@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_ddlRecordsPerPage")})
	List<WebElement> requestexist;
  
  //@FindBy(id="DlgFrameed9443c0-f070-4e62-8b0f-c98aefc4cda8")
 // WebElement supportframe;
  
  @FindBy(id="txtRequestDocComments")
  WebElement supportcomment;
  
  @FindBy(xpath="//input[contains(@id,'_radUpSupportingDocumentfile0')]")
 // @FindBy(id="ctl00_SPWebPartManager1_g_5499d7fe_762c_4d81_a2b7_da2102ea58fb_SupportingDocument_radUpSupportingDocumentfile0")
  WebElement supportupload;
  
  @FindBy(id="btnSupportingDocument")
  WebElement supportsubmit;
  
  @FindBy (id="lnkEditRequestDeadline")
  WebElement reqdeadline;

  @FindBy(id="dateRequestDeadline")
  WebElement enterdate;

  @FindBy(className="ms-dlgFrame")
  WebElement framedeadline;

  @FindBy(xpath=".//*[@id='divEditRequestDeadline']/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div[1]/div/div[1]/div[2]/table/tbody/tr[5]/td[7]/div")
  WebElement dateframe;

  @FindBy(id="timeRequestDeadline")
  WebElement entertime;

  @FindBy(xpath="//textarea[contains(@id,'_txtComment')]")
  //@FindBy(id="ctl00_SPWebPartManager1_g_8bc97765_7a09_45e1_a126_f1bcd8da8c8b_txtComment")
  WebElement editdesc;

  @FindBy(id="btnSaveRequestDeadline")
  WebElement submitdeadline;
  
  @FindBy(id="lnkEditCoverageGroup")
  WebElement addcov;
    
  @FindBy(xpath="//a[contains(@id,'_ddlMemberFirmKey_Arrow')]")
  //@FindBy(id="ctl00_SPWebPartManager1_g_1fe24510_7104_4c9e_82d2_34e2a18e851e_ddlMemberFirmKey_Arrow")
  WebElement covarrow;
  
  /*@FindBy(xpath="//textarea[contains(@id,'_txtComment')]")
  @FindBy(id="ctl00_SPWebPartManager1_g_1fe24510_7104_4c9e_82d2_34e2a18e851e_txtComment")
  WebElement covcomment;*/
  
  @FindBy(id="btnSaveRequestCoverageGroup")
  WebElement covsubmit;
  
  @FindBy(id="lnkFillTimesheet")
  WebElement timesheet;
  
  @FindBy(id="lnkEdit")
 WebElement edit;

 @FindBy(xpath="//a[contains(@id,'_ddlRequestPriority_Arrow')]")
// @FindBy(id="ctl00_SPWebPartManager1_g_68cb04f8_161f_4e9a_8842_a39c56f735c7_ddlRequestPriority_Arrow")
 WebElement priority1;

 @FindAll({@FindBy(className="rcbItem")})
 List<WebElement> priclass1;

 @FindBy(id="btnReq")
 WebElement updatereq;
 
 @FindBy(id="lnkHold")
 WebElement holdclick;
 
 @FindBy(xpath="//textarea[contains(@id,'_txtHoldComment')]")
 //@FindBy(id="ctl00_SPWebPartManager1_g_9674e814_c15f_45e2_8a18_0adc8103db7c_txtHoldComment")
 WebElement holdcomment;
 
 @FindBy(id="btnRequestHold")
 WebElement holdsubmit;
 
 @FindBy(id="lnkUnHold")
 WebElement unholdclick;
 
 @FindBy(xpath="//textarea[contains(@id,'_txtUnholdComment')]")
 //@FindBy(id="ctl00_SPWebPartManager1_g_32e85aea_6b75_490a_a9d5_f5c0a88885c2_txtUnholdComment")
 WebElement unholdcomment;
 
 @FindBy(id="btnRequestUnhold")
 WebElement unholdbtn;
 
 @FindBy(id="lnkCancelRequest")
WebElement cancel;

/*@FindBy(id="ctl00_SPWebPartManager1_g_9674e814_c15f_45e2_8a18_0adc8103db7c_txtHoldComment")
WebElement cancel_comment;*/

	@FindBy(id="btnRequestHold")
	WebElement clickcancel;
	
	@FindBy(id="lnkVersionHistory")
	WebElement history;
	
	@FindBy(id="lnkRecurringRequest")
	WebElement recurring;
	
	@FindBy(id="startDatePicker")
	WebElement startdt;
	
	@FindBy(xpath=".//*[@id='RecurringRequest']/table/tbody/tr[1]/td[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/div")
	WebElement choosestart;
	
	@FindBy(id="endDatePicker")
	WebElement enddt;
	
	@FindBy(xpath=".//*[@id='RecurringRequest']/table/tbody/tr[2]/td[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[5]/div")
	WebElement chooseend;
	
	@FindBy(id="ddlFrequency")
	WebElement Frequency;
	
	@FindBy(id="txtDeadline")
	WebElement recurdeadline;
	
	@FindBy(id="btnRecurringRequest")
	WebElement recursubmit;
	
	@FindBy(id="lnkSetAsLargeRequest")
	WebElement largereq;
	
	@FindBy(xpath="//input[contains(@id,'_txtRequestor')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_d831e079_5257_47cc_9264_3d0abf87348c_txtRequestor")
	WebElement Emailto;
	
	@FindBy(id="btnSaveLargeRequest")
	WebElement Largesubmit;
	
	@FindBy(id="lnkRequestComments")
	WebElement reqcomment;
	
	@FindBy(className="ms-dlgCloseBtn")
	WebElement closecomment;
	
	@FindBy(id="lnkPostponeRequest")
	WebElement TBD;
	
	@FindBy(id="dateRequestDeadline")
	WebElement deadlineTBD;
	
	@FindBy(id="timeRequestDeadline")
	WebElement timeTBD;
	
	/*@FindBy(id="ctl00_SPWebPartManager1_g_6c19edff_a865_4bd0_a803_d28d563a62e0_txtComment")
	WebElement TBDcomment;*/
	
	@FindBy(id="btnPostponeRequest")
	WebElement SubmitTBD;
	
	@FindBy(id="lnkResumeRequest")
	WebElement confimedlink;
	
	@FindBy(id="lnkReactivateRequest")
	WebElement reactivatelink;
	
	@FindBy(id="dateProposedDeliveryDateTime")
	WebElement reactivatedate;
	
	@FindBy(id="timeProposedDeliveryDateTime")
	WebElement reactivatetime;
	
	@FindBy(id="btnReactivateRequest")
	WebElement reactivatebtn;
	
	@FindBy(id="lnkViewFeedback")
	WebElement viewfeedlink;
	
	@FindBy(id="lnkFillFeedback")
	WebElement fillfeed;
	
	@FindBy(xpath=".//*[@id='innerTitleHeader']/div[1]/h1")
	WebElement Filltitle;
	
	@FindAll({@FindBy(xpath="//a[starts-with(@class,'icon')][contains(@class,'toolTipClass')]")})
	//@FindAll({@FindBy(xpath="//a[contains(@class,'toolTipClass')]")})
	List<WebElement> countelements;
	
	String logname;
  String path="C:\\Users\\chaman.preet\\Desktop\\04 PIA Requirement V 2 3.docx";
  
  public Request_details(WebDriver driver)
  {
  this.driver=driver;
  PageFactory.initElements(driver,this);
  } 
 
//To verify and perform action if assign analyst is present.
  public void assign_analyst_details() throws InterruptedException {
	  String detailtitle = driver.findElement(By.xpath(".//*[@id='innerTitleHeaderRequestDetail']/div[1]/h1")).getText();
	  Assert.assertEquals(detailtitle, "Request detail");
	  boolean assignpresent=driver.findElements(By.id("lnkAssign")).size()>0;
	  if(assignpresent)
	  {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Assignreq.click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.className("racTextToken")).sendKeys("Kamaljeet Verma");
	  driver.switchTo().frame(framedeadline); 
		Thread.sleep(2000);
	  //driver.findElement(By.className("racTextToken")).clear();
		Thread.sleep(2000);
	 Team.sendKeys("tea");
	Thread.sleep(1000);
	 driver.findElement(By.className("racList")).click();
	// driver.findElements(By.tagName("td")).get(1).click();
	// driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[1]/div/ul/li[1]")).click();
	  //driver.findElement(By.cssSelector("td")).click();
	  submitanalyst.click();
	  Thread.sleep(1000);
	  Assert.assertEquals(detailtitle, "Request detail","Title not matching");
	  String req2=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
	  System.out.println("Status of request is " +req2);
	  Assert.assertEquals(req2, "In-progress");
	  
  }
	  else
	  {
		  System.out.println("Assign analyst action button is not present");
	  }
  }
  
  
//To verify if assign analyst is present.
  public void assign_analyst_details2() throws InterruptedException {
	  String detailtitle = driver.findElement(By.xpath(".//*[@id='innerTitleHeaderRequestDetail']/div[1]/h1")).getText();
	  Assert.assertEquals(detailtitle, "Request detail"); 
	  boolean assignpresent=driver.findElements(By.id("lnkAssign")).size()>0;
	  if(assignpresent)
	  {
		  //System.out.println("Assign analyst action button is PRESENT");
  }
	  else
	  {
		  System.out.println("Assign analyst action button is not present");
	  }
  }
  
  // To verify and perform action if add supporting document is present.
  public void addsupporting_details() throws InterruptedException
  {
	  String detailtitle = driver.findElement(By.xpath(".//*[@id='innerTitleHeaderRequestDetail']/div[1]/h1")).getText();
	  Assert.assertEquals(detailtitle, "Request detail");
	  boolean addpresent=driver.findElements(By.id("lnkAddSupportingDocument")).size()>0;
	  if(addpresent)
	  {
	  Addsupport.click();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.switchTo().frame(supportframe);
	  supportcomment.sendKeys("This is to add support document");
	  supportupload.click();
	  StringSelection ss=new StringSelection(path);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  upload2();
	  Thread.sleep(1000);
	  supportsubmit.click();
	  driver.switchTo().defaultContent();
	  Thread.sleep(2000);
  }
  else
  {
	  System.out.println("Add supporting document action button is not present.");
  }
  }
	  public void upload2()
	  {
		  try
		  {
			  Robot rr=new Robot();
			  rr.keyPress(KeyEvent.VK_CONTROL);
			  rr.keyPress(KeyEvent.VK_V);
			  rr.keyRelease(KeyEvent.VK_CONTROL);
			  rr.keyRelease(KeyEvent.VK_V);
			  rr.delay(2000);
			  rr.keyPress(KeyEvent.VK_ENTER);
			  rr.keyRelease(KeyEvent.VK_ENTER);
			  rr.delay(1000);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  	  
	  // To verify and perform action if edit deadline is present.
	  public void editdead_details() throws InterruptedException
	  {
		  boolean editpresent=driver.findElements(By.id("lnkEditRequestDeadline")).size()>0;
		 			if(editpresent)
				//if(driver.findElement(By.xpath("//a[contains(@href,'javascript:void()')]")).isDisplayed())
			{	
		 				try {
							Thread.sleep(3000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		 				reqdeadline.click();
						driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
						driver.switchTo().frame(framedeadline);
						enterdate.click();
							Thread.sleep(2000);
						driver.findElement(By.className("xdsoft_today_button")).click();
						Thread.sleep(2000);
						dateframe.click();
						entertime.sendKeys("05:00");
						editdesc.sendKeys("edit deadline");
						submitdeadline.click();
			}
			else{
				System.out.println("Edit deadline is not present");
			}
		}
	  
	  //To verify and perform action if edit request coverage is present.
	  
	  public void editcoverage_details()
	  {
		  boolean covpresent=driver.findElements(By.id("lnkEditCoverageGroup")).size()>0;
		  if(covpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  addcov.click();
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  driver.switchTo().frame(framedeadline);
			  covarrow.click();
			  driver.findElement(By.tagName("li")).click();
			  editdesc.sendKeys("Edit request coverage");
			  covsubmit.click();
		  }
		  else
		  {
			  System.out.println("Edit coverage is not present");
		  }
	  }
	  
	//To verify and perform action if fill timesheet is present.
	  public void filltimesheet_details() throws InterruptedException
	  {
		  
		  boolean timesheetpresent=driver.findElements(By.id("lnkFillTimesheet")).size()>0;
		  if(timesheetpresent)
		  {
					Thread.sleep(1000);
			  timesheet.click();
			  String heading = driver.findElement(By.id("innerTitleHeader")).getText();
				Assert.assertEquals(heading, "Fill timesheet");
			  View.click();
					Thread.sleep(2000);
		  }
		  else{
			  System.out.println("Fill timesheet is not present");
		  }
		  
	  }
	  
	//To verify and perform action if Edit request is present.
	  public void Editrequest_details()
	  {
		  boolean requestpresent=driver.findElements(By.id("lnkEdit")).size()>0;
		  if(requestpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  edit.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'_txtClientProjectCode')]")));

			String newrequest = driver.findElement(By.id("innerTitleHeader")).getText();
			Assert.assertEquals(newrequest, "New request");
			priority1.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("rcbItem")));
			priclass1.get(2).click();
			updatereq.click();
	  }
		  else
		  {
			  System.out.println("Edit request action button is not present");
		  }
	  }
	  
	  //To verify and perform action if hold request is present.
	  public void holdreq_details()
	  {
		  boolean holdpresent=driver.findElements(By.id("lnkHold")).size()>0;
		  if(holdpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  holdclick.click();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.switchTo().frame(framedeadline);
		  holdcomment.sendKeys("Request is put on hold");
		  holdsubmit.click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  String req=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
		  System.out.println("\n" + "Status of request is " +req);
		  Assert.assertEquals(req, "On hold");
	  }
		  else
		  {
			System.out.println("Hold action button is not available");  
		  }
		  }
	  
	  //To verify and perform action if unhold request is present
	  public void unholdreq_details()
	  {
		  boolean unholdpresent=driver.findElements(By.id("lnkUnHold")).size()>0;
		  if(unholdpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	  unholdclick.click();
		  driver.switchTo().frame(framedeadline);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  unholdcomment.sendKeys("Unhold request");
		  unholdbtn.click();
		  String req=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
		  System.out.println("\n" + "Status of request is " +req);
		  Assert.assertEquals(req, "Unassigned");
		  }
		  else
		  {
			System.out.println("Hold action button is not available");  
		  }
		  }
			  
	  //To verify and perform action if cancel request is present.
	  public void cancelreq_details()
		{
		  boolean cancelpresent=driver.findElements(By.id("lnkCancelRequest")).size()>0;
			if(cancelpresent)
			{
				  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				cancel.click();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.switchTo().frame(framedeadline);
				holdcomment.sendKeys("this is cancelling request from details");
				clickcancel.click();	
				String req=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
				  System.out.println("\n" +"Status of request is " +req);
				  Assert.assertEquals(req, "Cancelled");
			}	
			else
			{
				System.out.println("Cancel action button is not available");  
			}
		}
	  
	//To verify and perform action if version history is present.
	  public void requesthistory_details() throws InterruptedException
	  {
		  boolean historypresent=driver.findElements(By.id("lnkVersionHistory")).size()>0;
		  if(historypresent)
		  {
					Thread.sleep(1000);
			  history.click();
			  Thread.sleep(1000);
			 String version=driver.findElement(By.xpath(".//*[@id='dialogTitleSpan']")).getAttribute("title");
			  Assert.assertEquals(version, "Version History", "Title is not matching");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[contains(@id,'DlgClose')]")).click();
				Thread.sleep(1000);
		  }
		  else
		  {
			  System.out.println("Version history is not present");
		  }
		  
	  }
	  
	//To verify and perform action if recurring request is present.
	  public void recurring_details() throws InterruptedException
	  {
		  boolean recurpresent=driver.findElements(By.id("lnkRecurringRequest")).size()>0;
		  if(recurpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  recurring.click();
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		  driver.switchTo().frame(framedeadline);
		  startdt.click();
			Thread.sleep(2000);
		  choosestart.click();
		  Thread.sleep(1000);
		  enddt.click();
		  Thread.sleep(2000);
		  chooseend.click();
		  Select myselect1=new Select(Frequency);
		  myselect1.selectByValue("Daily");
		  recurdeadline.sendKeys("2");
		  recursubmit.click();
	  }
	  else
	  {
		  System.out.println("Recurring request is not present");
	  }
	  }
	  
	//To verify and perform action if set as large request is present.
	  public void setaslarge()
	  {
		 // if(largereq.isDisplayed())
			 boolean largepresent = driver.findElements(By.id("lnkSetAsLargeRequest")).size()>0;
			  if(largepresent)
		  {
				  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			  largereq.click();
			  driver.switchTo().frame(framedeadline);
			  Emailto.clear();
			  Emailto.sendKeys("chaman.preet@evalueserve.com");
			Largesubmit.click();
		  }
		  else
		  {
			  System.out.println("Set as large request is not present");
		  }
		  
	  }
	  
	//To verify and perform action if request comments is present.
	  public void req_comments()
	  {
		  boolean commentpresent=driver.findElements(By.id("lnkRequestComments")).size()>0;
		  if(commentpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  reqcomment.click();
		  //driver.switchTo().frame(framedeadline);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  closecomment.click();
	  }
	  else
	  {
		  System.out.println("req comment is not present");
	  }
}
	  
	//To verify and perform action if deadlineTBD is present.
	  public void deadline_TBD()
	  {
		  boolean TBDpresent=driver.findElements(By.id("lnkPostponeRequest")).size()>0;
		  if(TBDpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  TBD.click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.switchTo().frame(framedeadline);
			  deadlineTBD.clear();
			  deadlineTBD.sendKeys("20-Apr-16");
			  timeTBD.clear();
			  timeTBD.sendKeys("20:00");
			  editdesc.sendKeys("Add comment to change request to TBD");
			  SubmitTBD.click();
			  String req1=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
			  System.out.println("\n" + "Status of request is " +req1);
			  Assert.assertEquals(req1, "Deadline TBD");
		  }
		  else
		  {
			  System.out.println("deadline TBD is not present");
		  }
	  }
	  
	//To verify and perform action if deadline confirmed is present.
	  public void deadline_confirmed()
	  {
		  boolean confirmpresent=driver.findElements(By.id("lnkResumeRequest")).size()>0;
		  if(confirmpresent)
		  {
			  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  confimedlink.click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.switchTo().frame(framedeadline);
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  unholdcomment.sendKeys("Unhold request");
			  unholdbtn.click();
			  String req3=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
			  System.out.println("\n" + "Status of request is " +req3);
			  Assert.assertEquals(req3, "Unassigned");
		  }
		  else
		  {
			  System.out.println("deadline confirmed is not present");
		  }
	  }
	  
	//To verify and perform action if reactivate is present.
	  public void reactivatereq() throws InterruptedException {
		  String detailtitle = driver.findElement(By.xpath(".//*[@id='innerTitleHeaderRequestDetail']/div[1]/h1")).getText();
		  Assert.assertEquals(detailtitle, "Request detail"); 
		  boolean reactivatepresent=driver.findElements(By.id("lnkReactivateRequest")).size()>0;
		  if(reactivatepresent)
		  {
			  reactivatelink.click();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.switchTo().frame(framedeadline);
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			  reactivatedate.sendKeys("06/29/2016");
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  reactivatetime.sendKeys("16:15");
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  supportcomment.sendKeys("This is to reactivate request");
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  reactivatebtn.click();
			  String req4=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
			  System.out.println("\n" + "Status of request is " +req4);
			  Assert.assertEquals(req4, "In-progress");
	  }
		  else
		  {
			  System.out.println("Reactivate action button is not present");
		  }
	  }
	  
	  //To verify and perform action if view feedback is present
	  public void view_feedback() throws InterruptedException
	  {
		  boolean viewpresent=driver.findElements(By.id("lnkViewFeedback")).size()>0;
		  if(viewpresent)
		  {
					Thread.sleep(1000);
					viewfeedlink.click();
		  String viewfeedbacktitle=driver.findElement(By.xpath(".//*[@id='innerTitleHeader']/div[1]/h1")).getText();
		  Assert.assertEquals(viewfeedbacktitle, "View feedback");
		  View.click();
		  Thread.sleep(2000);
		  }
		  else
		  {
			System.out.println("View feedback button is not available");  
		  }
		  }
			  	  
	  
	  public void fill_feedback() throws InterruptedException
	  {
		  boolean fillpresent=driver.findElements(By.id("lnkFillFeedback")).size()>0;
	  if(fillpresent)
	  {
		  String windowbefore=driver.getWindowHandle();
		  Thread.sleep(1000);
		  fillfeed.click();
		  for(String handle:driver.getWindowHandles())
			{
				driver.switchTo().window(handle);
			}
		  String Fillfeedbacktitle = Filltitle.getText();
		  Assert.assertEquals(Fillfeedbacktitle, "Fill feedback","Fillfeedback page not opened");
		  driver.switchTo().window(windowbefore);
		 Thread.sleep(2000);
	  }
	  else
	  {
		  System.out.println("Fill feedback button is not available");
	  }
	  }
	  
	  
	  //Perform action buttons for unassigned request
  public void unassignedreq() throws InterruptedException
  {
	  System.out.println("\n" +"*** Request_details.unassignedreq() ***");
	  View.click();
	  Thread.sleep(3000);
	 unassignlink.click();
	  Thread.sleep(4000);
	  if(requestexist.size()>0)
		{
	    driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
	 addsupporting_details();
	   Thread.sleep(2000);
	   editdead_details();
	   Thread.sleep(1000);
	 editcoverage_details();
	   Thread.sleep(1000);
	   filltimesheet_details();
	   Thread.sleep(3000);
	   unassignlink.click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   Editrequest_details();
	   Thread.sleep(1000);
	   requesthistory_details();
	   Thread.sleep(1000);
	    recurring_details();
	    Thread.sleep(1000);
	    setaslarge();
	    Thread.sleep(1000);
	   req_comments();
	   Thread.sleep(1000);
	   holdreq_details();
	   Thread.sleep(1000);
	   onholdreq();
	   Thread.sleep(1000);
	  deadline_TBD();
	  Thread.sleep(1000);
	  TBDreq();
	  assign_analyst_details();
		Thread.sleep(1000);
		inprogressreq();
		 cancelreq_details();
		 cancelreq();
		 break;
		 case "Gatekeeper Demo2":  case "Requestor Demo2":
			 if(countelements.size()!=9)
			  {
				  System.out.println("INCORRECT action buttons displaying for unassigned request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for unassigned request");
			  }
			 addsupporting_details();
			   Thread.sleep(2000); 
			   editdead_details();
			   Thread.sleep(1000);
			 editcoverage_details();
			   Thread.sleep(1000);
			   Editrequest_details();
			   Thread.sleep(1000);
			   requesthistory_details();
			   Thread.sleep(1000);
			   req_comments();
			   Thread.sleep(1000);
			   holdreq_details();
			   Thread.sleep(1000);
			   onholdreq();
			   Thread.sleep(1000);
			   deadline_TBD();
				  Thread.sleep(1000);
				  TBDreq();
				  cancelreq_details();
					 cancelreq();
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
			 addsupporting_details();
			   Thread.sleep(2000);
			   editdead_details();
			   Thread.sleep(1000);
			 editcoverage_details();
			   Thread.sleep(1000);
			   filltimesheet_details();
			   Thread.sleep(3000);
			   unassignlink.click();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   Editrequest_details();
			   Thread.sleep(1000);
			   requesthistory_details();
			   Thread.sleep(1000);
			   req_comments();
			   Thread.sleep(1000);
			  assign_analyst_details();
				Thread.sleep(1000);
				inprogressreq();
				 break;			 
  }
		}
	  else
		{
			System.out.println("No unassigned request available" + "\n");
		}
	}
  
//Perform action buttons for inprogress request
  public void inprogressreq() throws InterruptedException
  {
	 System.out.println("\n" +"*** Request_details.inprogressreq() ***");
	 Req_deliverables objdel=PageFactory.initElements(driver, Req_deliverables.class);
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
	 assign_analyst_details2();
	 objdel.addsupporting_details1();
			   objdel.editdead_details1();
			   objdel.editcoverage_details1();
			   objdel.filltimesheet_details1();
			   objdel.Editrequest_details1();
			   objdel.holdreq_details1();
			   objdel.cancelreq_details1();
			   objdel.requesthistory_details1();
			   objdel.recurring_details1();
			    objdel.setaslarge1();
			    objdel.req_comments1();
			   objdel.deadline_TBD1();
			   break;
			 case "Gatekeeper Demo2":  case "Requestor Demo2":
				 View.click();
				  Thread.sleep(3000);
				  inprogresslink.click();
				  Thread.sleep(3000);
				  if(requestexist.size()>0)
					{
				    driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
				    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 System.out.println("Element count is " +countelements.size());
				 if(countelements.size()!=8)
				  {
					 System.out.println("INCORRECT action buttons displaying for inprogress request");
				  }
				  else
				  {
					  System.out.println("Correct action buttons displaying for inprogress request");
				  }
				 objdel.addsupporting_details1();
				   objdel.editdead_details1();
				   objdel.editcoverage_details1();
				   objdel.Editrequest_details1();
				   objdel.holdreq_details1();
				   objdel.requesthistory_details1();
				   objdel.req_comments1();
				   objdel.deadline_TBD1();
					}
				   else
					{
						System.out.println("No inprogress request available" + "\n");
					}
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
				   assign_analyst_details2();
				   objdel.addsupporting_details1();
				   objdel.editdead_details1();
				   objdel.editcoverage_details1();
				   objdel.filltimesheet_details1();
				   objdel.Editrequest_details1();
				   objdel.requesthistory_details1();
				    objdel.req_comments1();
					 break;			 
			 }
		}
 
//Perform action buttons for onhold request
  public void onholdreq() throws InterruptedException
  {
	 System.out.println("\n" +"*** Request_details.onholdreq() ***");
	 Req_deliverables objdel=PageFactory.initElements(driver, Req_deliverables.class);
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
	 assign_analyst_details2();
			 objdel.addsupporting_details1();
					   objdel.editdead_details1();
					   objdel.editcoverage_details1();
					   objdel.filltimesheet_details1();
					   objdel.Editrequest_details1();		  
					   objdel.cancelreq_details1();
					   objdel.requesthistory_details1();
					    objdel.setaslarge1();
					    objdel.req_comments1();
					   unholdreq_details();
					   Thread.sleep(2000);
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
			 objdel.addsupporting_details1();
			   objdel.editdead_details1();
			   objdel.editcoverage_details1();
			   objdel.Editrequest_details1();
			   objdel.requesthistory_details1();
			   objdel.req_comments1();
			   objdel.cancelreq_details1();
			   unholdreq_details();
			   Thread.sleep(2000);
			   break;
		 case "Analyst Demo2":
			 View.click();
			  Thread.sleep(3000);
			  onholdlink.click();
			  Thread.sleep(3000);
			  if(requestexist.size()>0)
				{
				    driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();	    
				    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			    if(countelements.size()!=7)
				  {
					  System.out.println("INCORRECT action buttons displaying for onhold request");
				  }
				  else
				  {
					  System.out.println("Correct action buttons displaying for onhold request");
				  }
			   objdel.addsupporting_details1();
			   objdel.editdead_details1();
			   objdel.editcoverage_details1();
			   objdel.filltimesheet_details1();
			   objdel.Editrequest_details1();
			   objdel.requesthistory_details1();
			    objdel.req_comments1();
				}
			  else
				{
					System.out.println("No onhold request available" + "\n");
				}
				 break;			 
		 }
  }
  
//Perform action buttons for completed request
  public void completedreq() throws InterruptedException
  {
	 System.out.println("\n" +"*** Request_details.completedreq() ***");
	 Req_deliverables objdel=PageFactory.initElements(driver, Req_deliverables.class);
	  View.click();
	  Thread.sleep(3000);
	  completelink.click();
	  Thread.sleep(3000);
	  if(requestexist.size()>0)
		{
	  			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		    objdel.filltimesheet_details1();
			 objdel.requesthistory_details1();
			   objdel.req_comments1();
			   objdel.recurring_details1();
			    objdel.setaslarge1();
			   reactivatereq();
			   Thread.sleep(1000);
			   //System.out.println("count is " +countele);
			   break;
			 case "Gatekeeper Demo2":  case "Requestor Demo2":
				 if(countelements.size()!=4)
				  {
					 System.out.println("INCORRECT action buttons displaying for complete request");
				  }
				  else
				  {
					  System.out.println("Correct action buttons displaying for complete request");
				  }
				 objdel.requesthistory_details1();
				   objdel.req_comments1();
				   fill_feedback();
				   reactivatereq();
				   Thread.sleep(1000);
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
				 objdel.requesthistory_details1();
				   objdel.req_comments1();
				   objdel.filltimesheet_details1();
				   reactivatereq();
				   Thread.sleep(1000);
			 }
		}
	  else
		{
			System.out.println("No completed request available" + "\n");
		}
	}
  
//Perform action buttons for closed request
  public void closedreq() throws InterruptedException
  {
	 System.out.println("\n" +"*** Request_details.closedreq() ***");
	  View.click();
	  Thread.sleep(3000);
	  closelink.click();
	  Thread.sleep(3000);
	  Req_deliverables objdel=PageFactory.initElements(driver, Req_deliverables.class);
	  if(requestexist.size()>0)
			{
			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
			  objdel.filltimesheet_details1();
			    objdel.requesthistory_details1();
			   objdel.recurring_details1();
			    objdel.req_comments1();
			   view_feedback();
			   Thread.sleep(1000);
			   break;
			 case "Gatekeeper Demo2":  case "Requestor Demo2":
				 if(countelements.size()!=3)
				  {
					 System.out.println("INCORRECT action buttons displaying for closed request");
				  }
				  else
				  {
					  System.out.println("Correct action buttons displaying for closed request");
				  }
				 objdel.requesthistory_details1(); 
				   objdel.req_comments1();	 
				   view_feedback();
				   Thread.sleep(1000);
				   inprogressreq();
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
				 objdel.requesthistory_details1(); 
				   objdel.req_comments1();	 
				   objdel.filltimesheet_details1();
				   view_feedback();
				   Thread.sleep(1000);
				   onholdreq();
				   cancelreq();
				   TBDreq();
				   break;
			 }
		}
  else
	{
		System.out.println("No closed request available" + "\n");
	}
}
  
//Perform action buttons for cancelled request
  public void cancelreq() throws InterruptedException
  {
		System.out.println("\n" +"*** Request_details.cancelreq() ***");
		 Req_deliverables objdel=PageFactory.initElements(driver, Req_deliverables.class);
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
					   objdel.filltimesheet_details1();
					   objdel.requesthistory_details1();
					    objdel.req_comments1();
					    break; 
					    case "Gatekeeper Demo2":  case "Requestor Demo2":
							 if(countelements.size()!=2)
							  {
								 System.out.println("INCORRECT action buttons displaying for cancelled request");
							  }
							  else
							  {
								  System.out.println("Correct action buttons displaying for cancelled request");
							  }
							 objdel.requesthistory_details1();
							    objdel.req_comments1();
							    break;
					    case "Analyst Demo2" :
					    	View.click();
					  	  Thread.sleep(3000);
					  	  cancellink.click();
					  	  Thread.sleep(3000);
					  	 if(requestexist.size()>0)
							{
						  			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
							    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
							 if(countelements.size()!=3)
							  {
								 System.out.println("INCORRECT action buttons displaying for cancelled request");
							  }
							  else
							  {
								  System.out.println("Correct action buttons displaying for cancelled request");
							  }
							 objdel.requesthistory_details1();
							   objdel.req_comments1();
							   objdel.filltimesheet_details1();
			 }
					  	 else
					  	 {
					  		System.out.println("No cancelled request available" + "\n");
					  		}
				  	 break;
					  	 }
}
 
  
//Perform action buttons for TBD request
  public void TBDreq() throws InterruptedException
  {
	 System.out.println("*** Request_details.TBDreq() ***");
	 Req_deliverables objdel=PageFactory.initElements(driver, Req_deliverables.class);
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
			 objdel.addsupporting_details1();
					   objdel.editdead_details1();
					   objdel.editcoverage_details1();
					   objdel.filltimesheet_details1();
					   objdel.Editrequest_details1();
					   objdel.cancelreq_details1();
					   objdel.requesthistory_details1();
					    objdel.setaslarge1();
					    objdel.req_comments1();
					   objdel.deadline_confirmed1();
					   deadline_confirmed();
					   //Thread.sleep(2000);
					   break;
		 case "Gatekeeper Demo2":  case "Requestor Demo2":
			 if(countelements.size()!=8)
			  {
				 System.out.println("INCORRECT action buttons displaying for deadline TBD request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for deadline TBD request");
			  }
			 objdel.addsupporting_details1();
			   objdel.editdead_details1();
			   objdel.editcoverage_details1();
			   objdel.Editrequest_details1();
			   objdel.cancelreq_details1();
			   objdel.requesthistory_details1();
			   objdel.req_comments1();
			   objdel.deadline_confirmed1();
			   deadline_confirmed();
			   break;
		 case "Analyst Demo2" :
			 View.click();
		  	  Thread.sleep(3000);
		  	  TBDlink.click();
		  	  Thread.sleep(3000);
		  	if(requestexist.size()>0)
			{
			    driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();	    
			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 if(countelements.size()!=7)
			  {
				 System.out.println("INCORRECT action buttons displaying for deadline TBD request");
			  }
			  else
			  {
				  System.out.println("Correct action buttons displaying for deadline TBD request");
			  }
			 objdel.addsupporting_details1();
			   objdel.editdead_details1();
			   objdel.editcoverage_details1();
			   objdel.Editrequest_details1();
			   objdel.requesthistory_details1();
			   objdel.req_comments1();
			   objdel.filltimesheet_details1();
		 }
		  	else
			{
				System.out.println("No deadline TBD request available" + "\n");
			}
       break;
  }
}
}
  

