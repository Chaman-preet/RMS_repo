package rmspackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import rmspackage.ExcelUtils;

public class FillTimesheet {
	WebDriver driver;
	
	@FindBy(linkText="Timesheet")
	WebElement timesheet;
	
	@FindBy(linkText="Fill timesheet")
	WebElement Fill;
	
	@FindBy(xpath="//input[contains(@id,'_txtRequestIds')]")
	WebElement Req_id;
	
	@FindBy(id="dateTimesheetDate")
	WebElement timesheet_date;
	
	@FindBy(xpath=".//*[@id='ctl00_SPWebPartManager1_g_9cee05a3_a7fe_4289_a52a_79f82a342526_tblData']/tbody/tr[4]/td[2]/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div")
	WebElement calenderdate;
	
	@FindBy(xpath="//table[@id='ctl00_SPWebPartManager1_g_9cee05a3_a7fe_4289_a52a_79f82a342526_tblData']/tbody/tr[4]/td[2]/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[1]")
	WebElement calenderact;
	
	@FindBy(id="btnGo")
	WebElement Idgo;
	
	@FindBy(xpath="//input[contains(@id,'_txtHours')]")
	WebElement hours;
	
	@FindBy(xpath="//textarea[contains(@id,'_txtComments')]")
	WebElement timesheet_comment;	

	@FindBy(xpath="//input[contains(@id,'_btnSubmit')]")
	WebElement timesheet_submit;	
	
	@FindBy(xpath="//input[contains(@id,'_radActivity')]")
	WebElement Timesheet_radio;
	
	@FindBy(xpath="//select[contains(@id,'_ddlTimesheetActivity')]")
	WebElement act_dropdown;
	
	@FindBy(xpath="//input[contains(@id,'btnViewTimesheet')]")
	WebElement Viewlink;
	
	@FindBy(xpath="//input[contains(@id,'_btnAddTimesheet')]")
	WebElement Fillnewlink;
	
	@FindBy(xpath="//input[contains(@id,'_btnReset')]")
	WebElement Resettimesheet;
	
	@FindBy(xpath="//span[contains(@id,'_rangeValidateHours')][@class='errorMsg']")
	WebElement valimsg;
	
	//Constructor
  public FillTimesheet(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  //Check If fill timesheet is present or not.
  public void fill_availability() throws InterruptedException
  {
  boolean fillpresent = driver.findElements(By.linkText("Fill timesheet")).size()>0;
  if(fillpresent)
  {
	  Fill.click();
	  Thread.sleep(2000);
	  //fill_activity();
	 // reset();
	  Thread.sleep(1000);
  fill_reqid();
  Thread.sleep(3000);
  //String date=ExcelUtils.getCellData(21, 2);
 // timesheet_date.sendKeys(date);
 //fill_date();
  //calenderdate.click();
 // System.out.println("get text in time" +get);
  Thread.sleep(1000);
  fill_hours();
  Thread.sleep(1000);
  fill_comment();
  Thread.sleep(1000);
  timesheet_submit.click();
  Thread.sleep(2000);
  String timetitle=driver.findElement(By.xpath(".//*[@id='innerTitleHeader']/div[1]/h1")).getText();
  //System.out.println("text is" +timetitle);
  Assert.assertEquals(timetitle,"Timesheet acknowledgement","Title not matches");
  Viewlink.click();
  }
  else{
	  System.out.println("Fill Timesheet module is not present");
  }
  }
  
  //Fill Request ID and click Go
  public void fill_reqid()
  {
	  String ID=ExcelUtils.getCellData(21, 2);
	  Req_id.sendKeys(ID);
	  Idgo.click();
  }
  
//Fill timesheet date
  public void fill_date() throws InterruptedException
  {
	  timesheet_date.click();
	  Thread.sleep(2000);
	  driver.findElement(By.className("xdsoft_today_button")).click();
	  Thread.sleep(2000);
	 
  }
  
//Fill hours
  public void fill_hours() throws InterruptedException
  {
	  String morehour=ExcelUtils.getCellData(23, 3);
	  hours.sendKeys(morehour);
	  timesheet_comment.click();
	  Thread.sleep(1000);
	  Assert.assertEquals(valimsg.getText(),"Timesheet hours should be between 0.1-24","No validation message"); 
	  hours.clear();
	  String hour=ExcelUtils.getCellData(23, 2);
	  hours.sendKeys(hour);
  }
  
//Fill timesheet comment
  public void fill_comment() throws InterruptedException
  {
	  String comment=ExcelUtils.getCellData(24, 2);
	  timesheet_comment.sendKeys(comment);
  }
  
  //Fill timesheet by Request
public void fill_timesheet() throws InterruptedException
  {
	  System.out.println("---*** FillTimesheet.fill_timesheet() ***---");
	  Thread.sleep(1000);
	  timesheet.click();
	  fill_availability();
	  Thread.sleep(1000);
	  }

  
//Fill timesheet by Activity
  public void fill_activity() throws InterruptedException
  {
	  System.out.println("---*** FillTimesheet.fill_activity() ***---");
	  Thread.sleep(1000);
	  Timesheet_radio.click();
	  Thread.sleep(1000);
	  Select sel=new Select(act_dropdown);
	  String act=ExcelUtils.getCellData(25, 2);
	  sel.selectByVisibleText(act);
	  Thread.sleep(1000);
	  //fill_date();
	  //calenderact.click();
	  //Thread.sleep(1000);
	  fill_hours();
	  Thread.sleep(1000);
	  fill_comment();
	  Thread.sleep(1000);
	  timesheet_submit.click();
	  Thread.sleep(3000);
	  //String timetitle=driver.findElement(By.xpath("//div/div/div/div/div/h1")).getText();
	  String timetitle=driver.findElement(By.xpath(".//*[@id='innerTitleHeader']/div[1]/h1")).getText();
	  Assert.assertEquals(timetitle, "Timesheet acknowledgement","Title matches");
	  Fillnewlink.click();
  }
  
  //Check Reset functionality
  public void reset() throws InterruptedException
  {
	  System.out.println("---*** FillTimesheet.reset() ***---");
	  Thread.sleep(1000);
	  timesheet.click();
	  Thread.sleep(1000);
	  Fill.click();
	  Thread.sleep(1000);
	  fill_reqid();
	  Thread.sleep(2000);
	  Resettimesheet.click();
	  Thread.sleep(2000);
	  String id_present = Req_id.getText();
	  Assert.assertEquals(id_present, "", "Request Id is not blank");
	  }
}
