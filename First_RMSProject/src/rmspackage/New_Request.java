package rmspackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_Request {
	WebDriver driver;
	
	@FindBy(linkText="New request")
	WebElement Requestlink;
	
	@FindBy(xpath="//a[contains(@id,'ddlRegion_Arrow')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_ddlRequestFormType_Arrow")
	WebElement region;
	
	@FindAll({@FindBy(tagName="li")})
	List<WebElement> regionvalue;
	
	@FindBy(xpath="//a[contains(@id,'ddlCoverageGroup_Arrow')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_68cb04f8_161f_4e9a_8842_a39c56f735c7_ddlCoverageGroup_Arrow")
	WebElement coverage;
	
	@FindAll({@FindBy(tagName="li")})
	List<WebElement> covvalue;
	
	@FindBy(className="rcbItem")
	WebElement covclass;
	
	@FindBy(xpath="//input[contains(@id,'ddlRequestor_Input')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_ddlRequestor_Input")
	WebElement Banker;
	
	@FindBy(xpath="//input[contains(@id,'_listBoxCoOwner_Input')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_listBoxCoOwner_Input")
	WebElement coowner;
	
	@FindBy(xpath="//input[contains(@id,'_txtRequestTitle')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_txtRequestTitle")
	WebElement Title;
	
	@FindBy(xpath="//input[contains(@id,'_txtClientProjectCode')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_txtClientProjectCode")
	WebElement code;
	
	@FindBy(xpath="//a[contains(@id,'_ddlRequestPriority_Arrow')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_ddlRequestPriority_Arrow")
	WebElement priority;
	
	@FindAll({@FindBy(className="rcbItem")})
	List<WebElement> priclass;
	
	@FindBy(id="dateExpectedDeliveryDateTime")
	WebElement originaldate;
	
	@FindBy(id="timeExpectedDeliveryDateTime")
	WebElement originaltime;
	
	@FindBy(xpath="//a[contains(@id,'_ddlMemberFirm_Arrow')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_68cb04f8_161f_4e9a_8842_a39c56f735c7_ddlMemberFirm_Input")
	WebElement Reqcoverage;

	//By requesttype=By.id("ctl00_SPWebPartManager1_g_68cb04f8_161f_4e9a_8842_a39c56f735c7_ddlRequestType_Input");
	
	@FindBy(xpath="//a[contains(@id,'_ddlRequestType_Arrow')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_ddlRequestType_Arrow")
	WebElement requesttype;
	
    @FindBy(className="rcbItem")
	WebElement typeclass;
		
    @FindBy(xpath="//a[contains(@id,'_ddlRequestSubType_Arrow')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_ddlRequestSubType_Arrow")
	WebElement subtype;

	@FindBy(className ="rcbItem")
	WebElement subclass;
	
	@FindBy(id="txtVolume")
	WebElement volume;
	
    @FindBy(id="btnRequestMultipleVolume")
    WebElement Add;
    
    @FindBy(xpath="//iframe[contains(@id,'_richTextRequestDescription_contentIframe')]")
    //@FindBy(id="ctl00_SPWebPartManager1_g_b65c754d_38c4_4ab6_8735_e954ebdb9dda_richTextRequestDescription_contentIframe")
    WebElement desframe;
    
    @FindBy(tagName="body")
    WebElement desc;
    
    @FindBy(xpath="//input[contains(@id,'_RequestSupportingDocument_radUpSupportingDocumentfile0')]")
    WebElement upload;

    @FindBy(id="btnReq")
    WebElement submit;
    	
    @FindBy(xpath="//input[contains(@id,'_btnViewRequests')]")
    //@FindBy(id="ctl00_SPWebPartManager1_g_f850089b_cd99_4089_ae99_4f81201e95e4_btnViewRequests")
    WebElement viewreq;
    
	String path="C:\\Users\\chaman.preet\\Desktop\\Projects without test cases (Autosaved).xlsx";
	
  public New_Request(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void clicklink()
  {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Requestlink.click();
  }
  public void selectregion(int i)
  {
	region.click();
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//regvalue=ExcelUtils.getCellData(5, 2);
	regionvalue.get(i).click();
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
 public void selectcoverage(int i) throws InterruptedException
  {
	  coverage.click();
	  Thread.sleep(1000);
	  covvalue.get(i).click();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 //covclass.click();
  }
 
 public void selectbanker() throws InterruptedException
  {
	 String bank=ExcelUtils.getCellData(7, 2);
	 Banker.sendKeys(bank);
	 Thread.sleep(1000);
	 driver.findElement(By.className("racList")).click();
  }
  
  public void selectcoowner() throws InterruptedException
  {
	  String coo=ExcelUtils.getCellData(19, 2);
	  coowner.sendKeys(coo);
	  Thread.sleep(1000); 
		 driver.findElement(By.className("racList")).click();
	  }
  
  public void selecttitle()
  {
	  String titl=(String) ExcelUtils.getCellData(8, 2);
	  Title.sendKeys(titl);
  }
  
  public void selectcode()
  {
	  String co=ExcelUtils.getCellData(9, 2);
	 code.sendKeys(co);
  }
  public void selectpriority() throws InterruptedException
  {
	  priority.click();
	  Thread.sleep(2000);
	  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	priclass.get(2).click();
  }
  
  public void date()
  {
	  String dt=ExcelUtils.getCellData(11, 2);
	  originaldate.sendKeys(dt);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	 
	 originaldate.click();
  }
  public void time()
  {
	  String tm=ExcelUtils.getCellData(12, 2);
	  originaltime.sendKeys(tm);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  originaltime.click();
  }
  public void selectreqcov()
  {
	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Reqcoverage.click();
	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  covvalue.get(1).click();
  }
  
  public void selecttype() throws InterruptedException
  {
	  requesttype.click();
	  Thread.sleep(2000);
	//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  typeclass.click();
  }
  public void selectsubtype() throws InterruptedException
  {
	 subtype.click();
	 Thread.sleep(2000);
	subclass.click();
  }
  public void selectvol()
  {
	  String vol=ExcelUtils.getCellData(16, 2);
	  volume.sendKeys(vol);
  }
  /*public void clickadd()
  {
	  Add.click();
  }*/
  public void selectframe()
  {
	  driver.switchTo().frame(desframe);
  }  
  public void enterdesc()
  {
	  String body=ExcelUtils.getCellData(17, 2);
	  desc.sendKeys(body);
	  driver.switchTo().defaultContent();
  }
  
  
  public void uploadfile() throws InterruptedException
  {
	  
	  StringSelection ss=new StringSelection(path);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  Thread.sleep(1000);
	  upload.click();
	  /*JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", upload);
	  Thread.sleep(3000);*/
	  System.out.println("New_Request.uploadfile()");
	  try{
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_V);
		  r.keyRelease(KeyEvent.VK_V);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.delay(1000);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  r.delay(1000);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	
	  
  public void submitreq()
  {
	submit.click();
	  //JavascriptExecutor js = (JavascriptExecutor)driver;
	 // js.executeScript("arguments[0].click();", submit);
  }
  
  public void reqack()
  {
	 String str = driver.findElement(By.xpath(".//*[@id='innerTitleHeader']/div[1]/h1")).getText();
	  
	  	  System.out.println("title is " +str);
	  	Assert.assertEquals("Request acknowledgement",str);
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	viewreq.click();
  }
  
  public void submit_req() throws InterruptedException
  {
	  clicklink();
	//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebDriverWait wait=new WebDriverWait(driver,60);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.className("marqueeHeading")));
	  String logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
	  System.out.println("Logname is" +logname);
      selectregion(1);
		Thread.sleep(3000);
		 
		switch(logname)
		  {
		 case "Analyst Demo2":
	  selectcoverage(2);
	  break;
		 case "Teammanager Demo2":
		selectcoverage(4);
		break;
		 case "Gatekeeper Demo2":
		 selectcoverage(2);
		break;
		  }  
		Thread.sleep(2000);
	 selectbanker();
	  Thread.sleep(2000);
	  selectcoowner();
	  Thread.sleep(1000);
	 selecttitle();
	 Thread.sleep(1000);
	 selectcode();
	  Thread.sleep(1000);
	 selectpriority();
	  Thread.sleep(1000);
	  date();
	  Thread.sleep(1000);
	  time();
	  Thread.sleep(1000);
	  selectreqcov();
	  Thread.sleep(1000);
	  selecttype();
		Thread.sleep(2000);
	  selectsubtype();
		Thread.sleep(2000);
	  selectvol();
		Thread.sleep(2000);
	  selectframe();
	 enterdesc();
	  Thread.sleep(3000);
      uploadfile();
      Thread.sleep(1000);
	  submitreq();
	  Thread.sleep(3000);
	  reqack();
  }
  
  public void submit_req_requestor() throws InterruptedException
  {
	  clicklink();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      selectregion(1);
		Thread.sleep(3000);
	  selectcoverage(1);
	  Thread.sleep(3000);
	  //selectcoowner();
	  Thread.sleep(1000);
	 selecttitle();
	 Thread.sleep(1000);
	 selectcode();
	  Thread.sleep(1000);
	 selectpriority();
	  Thread.sleep(1000);
	  date();
	 // objreq.date("06/15/2016");
	  Thread.sleep(1000);
	  time();
	  Thread.sleep(1000);
	  selectreqcov();
	  Thread.sleep(1000);
	  selecttype();
		Thread.sleep(3000);
	  selectsubtype();
	Thread.sleep(1000);
	  selectvol();
		Thread.sleep(1000);
	  selectframe();
	 enterdesc();
	 Thread.sleep(3000);
     uploadfile();
     Thread.sleep(1000);
	  submitreq();
	  Thread.sleep(3000);
	  reqack();
  }
  
  public void raise_Req() throws InterruptedException
  {
	 String logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
	  switch(logname)
	  {
	 case "Requestor Demo2":
		 submit_req_requestor();
		 break;
		 default:
			 submit_req();
			 break;
  }
  }
}
