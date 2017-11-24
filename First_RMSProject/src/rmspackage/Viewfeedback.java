package rmspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Viewfeedback {
	WebDriver driver;
	
	@FindBy(linkText="Feedback")
	WebElement Feedbacklink;
	
	@FindBy(linkText="View feedback")
	WebElement viewfeedlink;
	
	@FindBy(id="ViewFeedbackDialogue")
	WebElement viewfeedback;
	
	@FindBy(xpath=".//*[@id='innerTitleHeader']/div[1]/h1")
	WebElement viewfeedtitle;
	
	public Viewfeedback(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Open View feedback if present
  public void open_viewfeedback() throws InterruptedException {
	  Feedbacklink.click();
	  Thread.sleep(1000);
	  boolean viewfeedbackpresent = driver.findElements(By.linkText("View feedback")).size()>0;
	  if(viewfeedbackpresent)
	  {
	  viewfeedlink.click();	  
	  click_feedback();
	  }
	  else
	  {
		  System.out.println("View feedback module is not present");
	  }
  }
  
  //Click view feedback form and verify if correct page opens.
  public void click_feedback() throws InterruptedException
  {
	  boolean feedbackiconpresent = driver.findElements(By.id("ViewFeedbackDialogue")).size()>0;
	  if(feedbackiconpresent)
	  {
	  viewfeedback.click();
	  }
	  else
	  {
		  System.out.println("No feedback is available in view feedback");
	  }
	  Thread.sleep(2000);
	  String feedbacktitle=viewfeedtitle.getText();
	  Assert.assertEquals(feedbacktitle, "View feedback", "View feedback page do not opened");
  }
  
  //Perform functionality of view feedback module
  public void View_feedback1() throws InterruptedException
  {
	  System.out.println("---*** Viewfeedback.View_feedback1() ***---");
	  open_viewfeedback();
	  //click_feedback();
  }
}
