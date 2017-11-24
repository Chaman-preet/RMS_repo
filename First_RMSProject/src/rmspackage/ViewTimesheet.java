package rmspackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import actionpackage.actionclass;
import rmspackage.FillTimesheet;

public class ViewTimesheet {
	
  WebDriver driver;
	
  static Logger log = Logger.getLogger(actionclass.class.getName());
  
  @FindBy(linkText="Timesheet")
  WebElement timesheet;
  
  @FindBy(linkText="View timesheet")
  WebElement viewlink;
  
  @FindBy(linkText="View all timesheet")
  WebElement viewalllink;
  
  @FindBy(xpath="//a[@class='iconReqDetail toolTipClass']")
  WebElement timesheet_details;
  
  @FindBy(xpath="//a[contains(@id,'_lnkBtnDelete')]")
  WebElement deletetimesheet;
  
  @FindBy(className="ms-dlgFrame")
  WebElement iframe;
  
  @FindBy(xpath="//h1[@id='dialogTitleSpan']")
  WebElement detailheading;
  
  @FindBy(className="ms-dlgCloseBtn")
WebElement closedetail;
  
  @FindBy(xpath="//span[contains(@id,'_LabelPaging')]")
  WebElement pagecount;
  
  @FindBy(xpath="//a[contains(@id,'_lnkBtnEdit')]")
  WebElement Edittimesheet;
  
  @FindBy(xpath="//input[contains(@id,'_radRequestID')]")
  WebElement searchbyid;
  
  @FindBy(id="txtRequestID")
  WebElement searchtext;
  
  @FindBy(id="btnSubmit")
  WebElement submitbtn;
  
  @FindBy(xpath="//input[contains(@id,'_txtHours')]")
  WebElement edittext;
  
  @FindBy(xpath="//a[contains(@id,'_btnUpdate')]")
  WebElement updatebtn;
  
  @FindBy(xpath="//input[contains(@id,'_btnReset')]")
  WebElement Resetbtn;
  
  //constructor
  public ViewTimesheet(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  //Check If view timesheet is present or not.
  public void view_availability() throws InterruptedException, AWTException
  {
  boolean viewpresent = driver.findElements(By.linkText("View timesheet")).size()>0;
  if(viewpresent)
  {
	  viewlink.click();
    Thread.sleep(1000);
    log.info("Checking View timesheet details");
  view_details();
  Thread.sleep(1000);
  log.info("Checking delete timesheet");
  delete();
  }
  else{
	  System.out.println("View Timesheet module is not present");
  }
  }
  
  //Check If view all timesheet is present or not.
  public void viewall_availability() throws InterruptedException, AWTException
  {
  boolean viewallpresent = driver.findElements(By.linkText("View all timesheet")).size()>0;
  if(viewallpresent)
  {
	  Thread.sleep(1000);
	  viewalllink.click();
	  Thread.sleep(1000);
	  log.info("Checking View timesheet details");
  view_details();
  Thread.sleep(1000);
  log.info("Searching timesheet");
  filterbyid();
  log.info("Editing timesheet");
  edit_timesheet();
  Resetbtn.click();
  Thread.sleep(2000);
  log.info("Checking delete timesheet");
  delete();
  }
  else{
	  System.out.println("View all Timesheet module is not present");
  }
  }
  
  
  //Click on timesheet detail and check dialog box opened
  public void view_details() throws InterruptedException
  {
	  timesheet_details.click();
	 // driver.switchTo().frame(iframe);
	  Thread.sleep(2000);
	  String detail = detailheading.getText();
	  Thread.sleep(1000);
	  Assert.assertEquals(detail, "View timesheet detail","Timesheet detail title not matching.");
	  Thread.sleep(1000);
	  closedetail.click();
  }
  
  //Delete timesheet
  public void delete() throws InterruptedException, AWTException
  {
	  String count=pagecount.getText();
	  String countdelete = count.substring(count.lastIndexOf("of ")+3);
	  System.out.println("before delete, count is " +countdelete);
	  int countint = Integer.parseInt(countdelete);
	  int afterdelete = countint-1;
	  String expectedcount = Integer.toString(afterdelete);
	  Thread.sleep(1000);
	  deletetimesheet.click();
	  Thread.sleep(1000);
	  Alert alr=driver.switchTo().alert();
	  alr.accept();
	  Thread.sleep(4000);
	  String count1=pagecount.getText();
	  //System.out.println("total count is " +count);
	  //String s[]=count.split("of ");
	  //String countdelete = s[s.length-1];
	  String countdelete1 = count1.substring(count.lastIndexOf("of ")+3);
	  System.out.println("After deletion count is " +countdelete1);
	  //String countdelete = count.substring(count.length()-1);
	  //String countdelete = count.substring(10, 12);
	 // Assert.assertEquals(countdelete1, expectedcount, "timesheet count is not matching");
	  //Assert.assertEquals(countdelete1, afterdelete,"timesheet count is not matching");
  }
  
  //Edit timesheet
  public void edit_timesheet() throws InterruptedException
  {
	  Edittimesheet.click();
	  boolean editbutton = driver.findElements(By.xpath("//a[@href='javascript:void(0)'][contains(@id,'_lnkBtnEdit')]")).size()>0;
			if(editbutton)
	  {
		  System.out.println("Edit button is disabled");
	  }
	  else
	  {
		  Edittimesheet.click();
		  Thread.sleep(3000);
		  edittext.clear();
		  edittext.sendKeys("2");
		  updatebtn.click();
		  Thread.sleep(1000);
	  }
  }
  
  //To search timesheet by request Id
  public void filterbyid() throws InterruptedException
  {
	  searchbyid.click();
	  Thread.sleep(2000);
	  String reqtext = ExcelUtils.getCellData(21, 2);
	  searchtext.sendKeys(reqtext);
	  Thread.sleep(1000);
	  submitbtn.click();
	  Thread.sleep(1000);
	  boolean searchresult = driver.findElements(By.xpath("//span[contains(@id,'_lblTimesheetTitle')]")).size()>0;
	  if(searchresult)
	  {
		  System.out.println("Search result is CORRECT");
	  }
	  else
	  {System.out.println("Search result is incorrect");
	  }  
  }
  
  //Check View timesheet and perform actions
  public void view_timesheet() throws InterruptedException, AWTException
  {
	  System.out.println("---*** ViewTimesheet.view_timesheet()***--- "); 
	  timesheet.click();
	  Thread.sleep(1000);
	  log.info("Executing View all timesheet");
	  viewall_availability();
	  Thread.sleep(1000);
	  log.info("Executing View timesheet");
	  timesheet.click();
	  Thread.sleep(1000);
	 view_availability();
	  }
}
