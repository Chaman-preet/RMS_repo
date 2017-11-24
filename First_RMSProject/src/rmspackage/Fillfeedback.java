package rmspackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Fillfeedback {
	WebDriver driver;
	
	@FindBy(linkText="Feedback")
	WebElement Feedbacklink;
	
	@FindBy(linkText="Pending feedback")
	WebElement pendingfeedlink;
	
	@FindBy(id="FillFeedbackDialogue")
	WebElement fillicon;
	
	@FindBy(xpath=".//*[@id='innerTitleHeader']/div[1]/h1")
	WebElement Filltitle;
	
	@FindBy(id="radButtonListQuestion1_0")
	WebElement ques1select;
	
	@FindBy(id="radButtonListQuestion2_1")
	WebElement ques2select;
	
	@FindBy(id="radButtonListQuestion3_2")
	WebElement ques3select;
	
	@FindBy(id="radButtonListQuestion4_3")
	WebElement ques4select;
	
	@FindBy(id="radButtonListQuestion5_4")
	WebElement ques5select;
	
	@FindBy(id="radButtonListQuestion6_5")
	WebElement ques6select;
	
	@FindBy(id="radButtonListQuestion7_0")
	WebElement ques7select;
	
	@FindBy(id="radButtonListQuestion8_1")
	WebElement ques8select;
	
	@FindBy(id="radButtonListQuestion9_3")
	WebElement ques9select;
	
	@FindBy(id="radButtonListQuestion10_4")
	WebElement ques10select;
	
	@FindBy(id="txtCommentField")
	WebElement feedcomment;
	
	@FindBy(id="btnSubmitFeedback")
	WebElement submitfeedback;
	
	@FindBy(xpath=".//*[@id='divAcknowledgement']/div/div/div/h1")
	WebElement feedbackacknow;
	
	//constructor
	public Fillfeedback(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Open pending feedback if present
	public void open_pendingfeedback()
	{
		boolean feedbackpresent = driver.findElements(By.linkText("Feedback")).size()>0;
	  if(feedbackpresent)
	  {
		Feedbacklink.click();
	  }
	  else
	  {
		  System.out.println("Feedback module is not present");
	  }
	  boolean pendingfeedbackpresent = driver.findElements(By.linkText("Pending feedback")).size()>0;
	  if(pendingfeedbackpresent)
	  {	  
		pendingfeedlink.click();
	}
	  else
	  {
		  System.out.println("Pending Feedback module is not present");
	  }
	}
	
	//Open feedback form if available
	public void open_feedbackform() throws InterruptedException
	{
		
		boolean feedbackformpresent = driver.findElements(By.id("FillFeedbackDialogue")).size()>0;
		  if(feedbackformpresent)
		  {
		fillicon.click();
		//Set<String> handle=driver.getWindowHandles();
		for(String handle:driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		  Thread.sleep(4000);
		  //driver.switchTo().window("");
		  String Fillfeedbacktitle = Filltitle.getText();
		  Assert.assertEquals(Fillfeedbacktitle, "Fill feedback","Fillfeedback page not opened");
		  fill_feedbackform();
		  }
		  else
		  {
			  System.out.println("No feedback is available in pending feedback");
		  }
	}
	
	//Fill feedback form
	public void fill_feedbackform() throws InterruptedException
	{
		 String windowbefore=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		ques1select.click();
		ques2select.click();
		ques3select.click();
		ques4select.click();
		ques5select.click();
		ques6select.click();
		ques7select.click();
		ques8select.click();
		ques9select.click();
		ques10select.click();
		feedcomment.sendKeys("Enter comments for feedback");
		//submitfeedback.click();
		String acknowledgment=feedbackacknow.getText();
		Assert.assertEquals(acknowledgment, "Your feedback has been submitted");
		Thread.sleep(1000);
		driver.close();
		 driver.switchTo().window(windowbefore);
	}
	
//Perform functionality of fill feedback module
  public void fill_feedback1() throws InterruptedException {
	  System.out.println("---*** Fillfeedback.fill_feedback1() ---***");
		Feedbacklink.click();	 
	  boolean pendingfeedbackpresent = driver.findElements(By.linkText("Pending feedback")).size()>0;
	  if(pendingfeedbackpresent)
	  {	  
		pendingfeedlink.click();
		Feedbacklink.click();
	 // open_pendingfeedback();
	  open_feedbackform();
	  }
	  else
	  {
		  System.out.println("Pending Feedback module is not present");
	  }
	  }
  }
