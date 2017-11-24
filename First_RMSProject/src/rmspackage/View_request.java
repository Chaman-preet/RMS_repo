package rmspackage;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import rmspackage.Request_details;

public class View_request {

	WebDriver driver;

	@FindBy(linkText="View requests")
	WebElement View;

/*	@FindBy(id="lnkFilterpane")
	WebElement Filter; 

	@FindBy(id="ctl00_SPWebPartManager1_RequestFilterProvider_rptrFilters_ctl02_lst__Arrow")
	WebElement Status;

	@FindAll({@FindBy(className="rcbCheckBox")})
	List<WebElement> checkstatus;

	@FindBy(id="btnFilter")
	WebElement Apply; */
	
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
	
	@FindAll({@FindBy(id="ctl00_SPWebPartManager1_ViewRequestsConsumer_ddlRecordsPerPage")})
	List<WebElement> requestexist;
		
	@FindBy(id="lnkRequestComments")
	WebElement reqcomment;

	@FindBy(className="ms-dlgCloseBtn")
	WebElement closecomment;

	@FindBy (id="lnkEditRequestDeadline")
	WebElement reqdeadline;

	@FindBy(id="dateRequestDeadline")
	WebElement enterdate;

	@FindBy(className="ms-dlgFrame")
	WebElement framedeadline;

	@FindBy(xpath="//*[@id='divEditRequestDeadline']/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div[1]/div/div[1]/div[2]/table/tbody/tr[5]/td[6]/div")
	WebElement dateframe;

	@FindBy(id="timeRequestDeadline")
	WebElement entertime;

	@FindBy(xpath="//textarea[contains(@id,'_txtComment')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_8bc97765_7a09_45e1_a126_f1bcd8da8c8b_txtComment")
	WebElement editdesc;

	@FindBy(id="btnSaveRequestDeadline")
	WebElement submitdeadline;

	@FindBy(id="lnkFillTimesheet")
	WebElement timesheet;

	@FindBy(id="lnkEdit")
	WebElement edit;

	@FindBy(xpath="//a[contains(@id,'_ddlRequestPriority_Arrow')]")
	//@FindBy(id="ctl00_SPWebPartManager1_g_68cb04f8_161f_4e9a_8842_a39c56f735c7_ddlRequestPriority_Arrow")
	WebElement priority1;

	@FindAll({@FindBy(className="rcbItem")})
	List<WebElement> priclass1;

	@FindBy(id="btnReq")
	WebElement updatereq;

	@FindBy(id="lnkCancelRequest")
	WebElement cancel;

	@FindBy(className="ms-dlgFrame")

	//@FindBy (id="DlgFrameadfc18b5-7c60-4d65-a94b-66fcbd322515")
	WebElement cancelframe;

	@FindBy(xpath="//textarea[contains(@id,'_txtHoldComment')]")
	WebElement cancel_comment;

	@FindBy(id="btnRequestHold")
	WebElement clickcancel;
	
	@FindBy(id="lnkVersionHistory")
	WebElement history;
	
	@FindBy(id="lnkViewDeliverables")
	WebElement viewdel;
	
	@FindBy(id="lnkFillFeedback")
	WebElement fillfeed;

	@FindBy(id="lnkViewFeedback")
	WebElement viewfeedlink;
	
	@FindBy(xpath=".//*[@id='innerTitleHeader']/div[1]/h1")
	WebElement Filltitle;
	
	 @FindBy(id="lnkAssign")
	  WebElement Assignreq;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlAnalysts_Input')]")
	  WebElement Team;
	  
	  @FindBy(id="btnAssignAnalyst")
	  WebElement submitanalyst;
	  
		
	@FindBy(xpath=".//*[@id='tblViewRequest']/tbody/tr[1]/th[10]")
	WebElement Actionstitle;
	WebElement getstatus;
	String Status1;
	String logname;

	String path="C:\\Users\\chaman.preet\\Desktop\\Selenium file for upload.xlsx";
	
	public View_request(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//Open view request page and select unassigned request by Filter

	public void viewreq()
	{
		View.click();
	}

	// Verify request comment button is present and perform function if present
	public void requestcomment(String abc)
	{
		boolean present1 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkRequestComments']")).size()>0;

		if(present1)
		{
			System.out.println("Request comment not available for " +abc);
		}
		else{
			reqcomment.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			closecomment.click();
		}
	}

	//Verify Edit deadline button is present and perform function if present
	public void Edit_deadline(String abcd) throws InterruptedException
	{
		//String cls=driver.findElement(By.xpath("//a[contains(@href, 'javascript:void()')]")).getTagName();
		//System.out.println("class is" +cls);
		//WebElement disablededit = driver.findElement(By.xpath("//a[contains(@href,'javascript:void()')]"));
		//System.out.println("View_request.Edit_deadline "+ "STATUS " +abcd);
		boolean present = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkEditRequestDeadline']")).size()>0;

		if(present)
			//if(driver.findElement(By.xpath("//a[contains(@href,'javascript:void()')]")).isDisplayed())
		{	
			System.out.println("Request edit deadline is not available for " +abcd);
		}
		else{
			reqdeadline.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.switchTo().frame(framedeadline);
			enterdate.click();
			Thread.sleep(1000);
			/*driver.findElement(By.className("xdsoft_today_button")).click();
			Thread.sleep(2000);
			dateframe.click();*/
			Actions act = new Actions(driver);
			act.doubleClick(driver.findElement(By.className("xdsoft_today_button"))).build().perform();
			entertime.sendKeys("20:00");
			editdesc.sendKeys("edit deadline");
			submitdeadline.click();
			 String str = driver.findElement(By.className("titleContainer")).getText();
			 System.out.println("title is " +str);
		  	Assert.assertEquals(" Current requests",str);
			//return;
		}
	}

	/*if(driver.findElement(By.xpath("//a[contains(@class,'iconEdtReqTimeline toolTipClass')]")).isDisplayed())
if(driver.findElement(By.xpath("//a[contains(@onclick,'javascript:openModalDialogWithReturnValue')]")).isDisplayed())
if(driver.findElement(By.xpath("//a[contains(@href, 'javascript:void()')]")).isDisplayed())*/


	//Verify fill timesheet button is present and perform function if present
	public void filltimesheet(String fill)
	{
		boolean present3 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkFillTimesheet']")).size()>0;
		if(present3)
		{
			System.out.println("Fill timesheet is not available for " +fill);
		}

		else
		{
			timesheet.click();
			String heading = driver.findElement(By.id("innerTitleHeader")).getText();
			Assert.assertEquals(heading, "Fill timesheet");
			viewreq();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}

	/*public void selectbackfilter()
	{
		clickfilter();
		selectstatus();
	}*/

	//Verify edit request button is present and perform function if present
	public void Editrequest(String ed)
	{
		boolean present4 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkEdit']")).size()>0;
		if(present4)
		{
			System.out.println("Edit request is not available for " +ed);
		}
		else
		{
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
	}

	//Verify cancel request button is present and perform function if present
	public void cancelreq(String can) throws InterruptedException
	{
		boolean present5 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkCancelRequest']")).size()>0;
		if(present5)
		{
			System.out.println("Cancel request is not available for " +can);
		}
		else
		{
			cancel.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.switchTo().frame(cancelframe);
			cancel_comment.sendKeys("this is to cancel request");
			clickcancel.click();
			Thread.sleep(2000);
		}
	}
	
	//Verify version history request button is present and perform function if present
		public void version_his(String his) throws InterruptedException
		{
			boolean present6 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkVersionHistory']")).size()>0;
			if(present6)
			{
				  System.out.println("Version history is not present for" +his);
		  }
		  else
		  {
			  Thread.sleep(1000);
			  history.click();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 String version=driver.findElement(By.xpath(".//*[@id='dialogTitleSpan']")).getAttribute("title");
			  //System.out.println("Dialog box opened is " +version);
			  Assert.assertEquals(version, "Version History", "Title is not matching");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[contains(@id,'DlgClose')]")).click();
				Thread.sleep(1000);
		  }
	  }
	
		//Verify View deliverable request button is present and perform function if present
			public void view_deliver(String del) throws InterruptedException
				{
				boolean present7 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkViewDeliverables']")).size()>0;
				if(present7)
				{
					  System.out.println("View Deliverables is not present for " +del);
			  }
			 else
			  {
				  Thread.sleep(1000);
				  viewdel.click();
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				  String detailtitle = driver.findElement(By.xpath(".//*[@id='innerTitleHeaderRequestDetail']/div[1]/h1")).getText();
				  Assert.assertEquals(detailtitle, "Deliverables");
				 Thread.sleep(2000);
				 viewreq();
				 Thread.sleep(2000);
				  }
			  }
	
			//Verify version fill_feedback is present and perform function if present
			public void fill_feedback(String feed) throws InterruptedException
				{
				boolean present7 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkFillFeedback']")).size()>0;
				if(present7)
				{
					  System.out.println("Fill feedback is not present for " +feed);
			  }
			 else
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
			  }

			//Verify version view_feedback is present and perform function if present
			public void view_feedback(String feed1) throws InterruptedException
				{
				boolean present7 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkViewFeedback']")).size()>0;
				if(present7)
				{
					  System.out.println("View feedback is not present for " +feed1);
			  }
			 else
			  {
				 Thread.sleep(1000);
					viewfeedlink.click();
		  String viewfeedbacktitle=driver.findElement(By.xpath(".//*[@id='innerTitleHeader']/div[1]/h1")).getText();
		  Assert.assertEquals(viewfeedbacktitle, "View feedback");
		  View.click();
		  Thread.sleep(2000);
				  }  
			  }
				
	 // Verify add supporting document is present and perform function if present
	  public void addsupporting_detail(String support1) throws InterruptedException
	  {
		  {
				boolean present7 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkAddSupportingDocument']")).size()>0;
				if(present7)
				{
					  System.out.println("View feedback is not present for " +support1);
			  }
			 else
			  {
				 Request_details objdetails=PageFactory.initElements(driver, Request_details.class);
				 objdetails.Addsupport.click();
			     Thread.sleep(1000);
				  driver.switchTo().frame(objdetails.supportframe);				 
				  objdetails.supportcomment.sendKeys("This is to add support document");
				  objdetails.supportupload.click();
				  StringSelection ss=new StringSelection(path);
				  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				  objdetails.upload2();
				  Thread.sleep(1000);
				  objdetails.supportsubmit.click();
				  driver.switchTo().defaultContent();
				  Thread.sleep(2000);
			  }
		  }
	  }
	  
	  // Verify assign analyst is present and perform function if present
	  public void assign_analyst(String assi1) throws InterruptedException
			 {
			boolean present8 = driver.findElements(By.xpath("//a[@href='javascript:void()'][@id='lnkAssign']")).size()>0;
			if(present8)
			{
				  System.out.println("Assign analyst is not present for " +assi1);
		  }
		 else
		  {
			 Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
			 switch(Status1)
			 {
			 case "In-progress":
				 Assignreq.click();
				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				  driver.switchTo().frame(framedeadline); 
					Thread.sleep(2000);
					submitanalyst.click();
					  Thread.sleep(1000);
				 break;
				 default:
	  Assignreq.click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.switchTo().frame(framedeadline); 
		Thread.sleep(2000);
	 Team.sendKeys("tea");
	Thread.sleep(1000);
	 driver.findElement(By.className("racList")).click();
		// driver.findElements(By.tagName("td")).get(1).click();
		// driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[1]/div/ul/li[1]")).click();
		  //driver.findElement(By.cssSelector("td")).click();
	  submitanalyst.click();
	  Thread.sleep(1000);
	  break;
			 }
	  }
			 }
	  
	//Open view request page and perform actions for unassigned request
	public void unassigned() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("\n" + "View_request.unassigned()");
		viewreq();
		 Thread.sleep(4000);
		unassignlink.click();
		 Thread.sleep(2000);
		 if(requestexist.size()>0)
			{
		Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Status for request is " +Status1);
		logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		requestcomment(Status1);
		//Edit_deadline(Status1);
		Thread.sleep(4000);
		unassignlink.click();
	   Thread.sleep(1000);
	   filltimesheet(Status1);
	   Thread.sleep(4000);
	   unassignlink.click();
       Editrequest(Status1);
       Thread.sleep(5000);
	   unassignlink.click();
  	   //cancelreq(Status1);
	   break;
		 case "Gatekeeper Demo2":
			 version_his(Status1);
			 view_deliver(Status1);
			 Thread.sleep(4000);
				unassignlink.click();
			   Thread.sleep(1000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
				unassignlink.click();
			   Thread.sleep(1000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			   break;
		 case "Requestor Demo2":
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 unassignlink.click();
			   Thread.sleep(1000);
			 addsupporting_detail(Status1);
			 Thread.sleep(2000);
		//	 Edit_deadline(Status1);
			 Thread.sleep(4000);
			 unassignlink.click();
			   Thread.sleep(1000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			 break;
		 case "Analyst Demo2":
			 requestcomment(Status1);
			 Thread.sleep(1000);
			 assign_analyst(Status1);
			 Thread.sleep(1000);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 unassignlink.click();
			   Thread.sleep(1000);
			   filltimesheet(Status1);
			   Thread.sleep(4000);
			   unassignlink.click();
			   Thread.sleep(1000);
			   Editrequest(Status1);
		       Thread.sleep(4000);
			   unassignlink.click();
			   Thread.sleep(1000);
			 break;
	}
			}
	else
	{
		System.out.println("No unassigned request available " + "\n");
	}
		 
		 }

	//Open view request page and perform actions for inprogress request

	public void inprogress() throws InterruptedException
	{
		System.out.println("\n" + "View_request.inprogress()");
		viewreq();
		Thread.sleep(2000);
		/*Filter.click();
		Status.click();
		checkstatus.get(0).click();
		checkstatus.get(1).click();
		Apply.click();*/
		inprogresslink.click();
		Thread.sleep(2000);
		if(requestexist.size()>0)
		{
		Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Status for request is " +Status1);
		logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Logged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		requestcomment(Status1);
		Thread.sleep(1000);
		//Edit_deadline(Status1);
		Thread.sleep(4000);
		inprogresslink.click();
		Thread.sleep(4000);
		filltimesheet(Status1);
		Thread.sleep(4000);
		inprogresslink.click();
		Thread.sleep(4000);
		Editrequest(Status1);
		Thread.sleep(4000);
		inprogresslink.click();
		//cancelreq(Status1);
		   break;
		 case "Gatekeeper Demo2":
	 version_his(Status1);
	 view_deliver(Status1);
	 Thread.sleep(4000);
		inprogresslink.click();
		Thread.sleep(1000);
	 //Edit_deadline(Status1);
	 Thread.sleep(4000);
		inprogresslink.click();
		Thread.sleep(4000);
	 fill_feedback(Status1);
	 //cancelreq(Status1);	
	   break;
		 case "Requestor Demo2":
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 inprogresslink.click();
			   Thread.sleep(1000);
			 addsupporting_detail(Status1);
			 Thread.sleep(4000);
				inprogresslink.click();
				Thread.sleep(1000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
			 inprogresslink.click();
			   Thread.sleep(1000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			 break;
		 case "Analyst Demo2":
			 requestcomment(Status1);
			 Thread.sleep(1000);
			 assign_analyst(Status1);
			 Thread.sleep(3000);
			 inprogresslink.click();
				Thread.sleep(2000);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 inprogresslink.click();
			   Thread.sleep(1000);
			   filltimesheet(Status1);
			   Thread.sleep(4000);
			   inprogresslink.click();
			   Thread.sleep(1000);
			   Editrequest(Status1);
		       Thread.sleep(4000);
		       inprogresslink.click();
			   Thread.sleep(1000);
			 break;
		 }
	}
	else
	{
		System.out.println("No inprogress request available " + "\n");
	}
		 
		 }

	//Open view request page and perform actions for onhold request

	public void onhold() throws InterruptedException
	{
		System.out.println("\n" + "View_request.onhold()");
		viewreq();
		Thread.sleep(2000);
		onholdlink.click();
		Thread.sleep(2000);
		 if(requestexist.size()>0)
			{
		Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Status for request is " +Status1);
		logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		requestcomment(Status1);
		Thread.sleep(1000);
		//Edit_deadline(Status1);
		Thread.sleep(4000);
		onholdlink.click();
		Thread.sleep(4000);
		filltimesheet(Status1);
		onholdlink.click();
		Thread.sleep(4000);
		Editrequest(Status1);
		Thread.sleep(4000);
		onholdlink.click();
		//cancelreq(Status1);
		   break;
		 case "Gatekeeper Demo2":
			 version_his(Status1);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 onholdlink.click();
				Thread.sleep(1000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
			 onholdlink.click();
				Thread.sleep(4000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			   break;
		 case "Requestor Demo2":
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 onholdlink.click();
			   Thread.sleep(1000);
			 addsupporting_detail(Status1);
			 Thread.sleep(2000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
			 onholdlink.click();
			   Thread.sleep(1000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			 break;
		 case "Analyst Demo2":
			 requestcomment(Status1);
			 Thread.sleep(1000);
			 assign_analyst(Status1);
			 Thread.sleep(3000);
			 onholdlink.click();
			   Thread.sleep(1000);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 onholdlink.click();
			   Thread.sleep(1000);
			   filltimesheet(Status1);
			   Thread.sleep(4000);
			   onholdlink.click();
			   Thread.sleep(1000);
			   Editrequest(Status1);
		       Thread.sleep(4000);
		       onholdlink.click();
			   Thread.sleep(1000);
			 break;
		 }
	}
		 else
			{
				System.out.println("No onhold request available " + "\n");
			}
	}

	//Open view request page and perform actions for completed request

	public void completed() throws InterruptedException
	{
		System.out.println("\n" + "View_request.completed()");
		viewreq();
		Thread.sleep(2000);
		completelink.click();
		Thread.sleep(2000);
		completelink.click();
		if(requestexist.size()>0)
		{
		Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Status for request is " +Status1);
		logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		requestcomment(Status1);
		Thread.sleep(1000);
		//Edit_deadline(Status1);
		Thread.sleep(4000);
		filltimesheet(Status1);
		completelink.click();
		Thread.sleep(4000);
		Editrequest(Status1);
		Thread.sleep(4000);
		//cancelreq(Status1);
		   break;
		 case "Gatekeeper Demo2":
			 version_his(Status1);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 completelink.click();
				Thread.sleep(1000);
			 //Edit_deadline(Status1);
			 Thread.sleep(4000);
			 completelink.click();
				Thread.sleep(4000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);	
			   break;
		 case "Requestor Demo2":
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 completelink.click();
			   Thread.sleep(1000);
			 addsupporting_detail(Status1);
			 Thread.sleep(2000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
			 completelink.click();
			   Thread.sleep(1000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			 break;
		 case "Analyst Demo2":
			 requestcomment(Status1);
			 Thread.sleep(1000);
			 assign_analyst(Status1);
			 Thread.sleep(4000);
			 completelink.click();
			   Thread.sleep(1000);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 completelink.click();
			   Thread.sleep(1000);
			   filltimesheet(Status1);
			   Thread.sleep(4000);
			   completelink.click();
			   Thread.sleep(1000);
			   Editrequest(Status1);
		       Thread.sleep(4000);
		       completelink.click();
			   Thread.sleep(1000);
			 break;
		 }
	}
		 else
			{
				System.out.println("No completed request available " + "\n");
			}
		}

	//Open view request page and perform actions for closed request

	public void closed() throws InterruptedException
	{
		System.out.println("\n" + "View_request.closed()");
		viewreq();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		closelink.click();
		Thread.sleep(4000);
		if(requestexist.size()>0)
		{
		Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Status for request is " +Status1);
		logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		requestcomment(Status1);
		Thread.sleep(1000);
		//Edit_deadline(Status1);
		Thread.sleep(4000);
		closelink.click();
		filltimesheet(Status1);
		Thread.sleep(4000);
		closelink.click();
		Editrequest(Status1);
		Thread.sleep(4000);
		closelink.click();
		//cancelreq(Status1);
		   break;
		 case "Gatekeeper Demo2":
			 version_his(Status1);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 closelink.click();
				Thread.sleep(1000);
			 //Edit_deadline(Status1);
			 Thread.sleep(4000);
			 closelink.click();
				Thread.sleep(4000);
			 view_feedback(Status1);
			 //cancelreq(Status1);	
			   break;
		 case "Requestor Demo2":
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 closelink.click();
			   Thread.sleep(1000);
			 addsupporting_detail(Status1);
			 Thread.sleep(2000);
		//	 Edit_deadline(Status1);
			 Thread.sleep(4000);
			 closelink.click();
			   Thread.sleep(1000);
			   view_feedback(Status1);
			 //cancelreq(Status1);
			 break;
		 case "Analyst Demo2":
			 requestcomment(Status1);
			 Thread.sleep(1000);
			 assign_analyst(Status1);
			 Thread.sleep(3000);
			 closelink.click();
			   Thread.sleep(1000);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 closelink.click();
			   Thread.sleep(1000);
			   filltimesheet(Status1);
			   Thread.sleep(4000);
			   closelink.click();
			   Thread.sleep(1000);
			   Editrequest(Status1);
		       Thread.sleep(4000);
		       closelink.click();
			   Thread.sleep(1000);
			 break;
		 }
	}
		 else
			{
				System.out.println("No closed request available " + "\n");
			}
		}

	//open view request page and perform actions for CANCELLED request
	
	public void cancelled() throws InterruptedException
	{
		System.out.println("\n" + "View_request.cancelled()");
		viewreq();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		cancellink.click();
		Thread.sleep(4000);
		if(requestexist.size()>0)
		{
		Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Status for request is " +Status1);
		logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		requestcomment(Status1);
		Thread.sleep(1000);
		//Edit_deadline(Status1);
		Thread.sleep(4000);
		cancellink.click();
		filltimesheet(Status1);
		Thread.sleep(4000);
		cancellink.click();
		Editrequest(Status1);
		Thread.sleep(4000);
		cancellink.click();
		//cancelreq(Status1);
		   break;
		 case "Gatekeeper Demo2":
			 version_his(Status1);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 cancellink.click();
				Thread.sleep(1000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
			 cancellink.click();
				Thread.sleep(4000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);	
			   break;
		 case "Requestor Demo2":
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 cancellink.click();
			   Thread.sleep(1000);
			 addsupporting_detail(Status1);
			 Thread.sleep(2000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
			 cancellink.click();
			   Thread.sleep(1000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			 break;
		 case "Analyst Demo2":
			 requestcomment(Status1);
			 Thread.sleep(1000);
			 assign_analyst(Status1);
			 Thread.sleep(4000);
			 cancellink.click();
			   Thread.sleep(1000);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 cancellink.click();
			   Thread.sleep(1000);
			   filltimesheet(Status1);
			   Thread.sleep(4000);
			   cancellink.click();
			   Thread.sleep(1000);
			   Editrequest(Status1);
		       Thread.sleep(4000);
		       cancellink.click();
			   Thread.sleep(1000);
			 break;
		 }
	}
		else
		{
			System.out.println("No cancelled request available " + "\n");
		}
	}
	
	//Open view request page and perform actions for  Deadline TBD request

	public void deadline_TBD() throws InterruptedException
	{
		System.out.println("\n" + "View_request.deadline_TBD()");
		viewreq();
		Thread.sleep(1000);
		TBDlink.click();
		Thread.sleep(2000);
		if(requestexist.size()>0)
		{
		Status1=driver.findElement(By.xpath(".//*[@id='tblViewRequest']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Status for request is " +Status1);
		logname=driver.findElement(By.xpath("//span[@class='userInfo']")).getText();
		//System.out.println("Loged in user is " +logname);
		switch(logname)
		 {
		 case "Teammanager Demo2":
		requestcomment(Status1);
		Thread.sleep(1000);
		//Edit_deadline(Status1);
		Thread.sleep(4000);
		TBDlink.click();
		filltimesheet(Status1);
		Thread.sleep(4000);
		TBDlink.click();
		Thread.sleep(4000);
		Editrequest(Status1);
		Thread.sleep(4000);
		TBDlink.click();
		//cancelreq(Status1);
		   break;
		 case "Gatekeeper Demo2":
			 version_his(Status1);
			 view_deliver(Status1);
			 Thread.sleep(4000);
				TBDlink.click();
				Thread.sleep(1000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
				TBDlink.click();
				Thread.sleep(4000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);	
			   break;
		 case "Requestor Demo2":
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 TBDlink.click();
			   Thread.sleep(1000);
			 addsupporting_detail(Status1);
			 Thread.sleep(2000);
			// Edit_deadline(Status1);
			 Thread.sleep(4000);
			 TBDlink.click();
			   Thread.sleep(1000);
			 fill_feedback(Status1);
			 //cancelreq(Status1);
			 break;
		 case "Analyst Demo2":
			 requestcomment(Status1);
			 Thread.sleep(1000);
			 assign_analyst(Status1);
			 Thread.sleep(4000);
			 TBDlink.click();
			   Thread.sleep(1000);
			 view_deliver(Status1);
			 Thread.sleep(4000);
			 TBDlink.click();
			   Thread.sleep(1000);
			   filltimesheet(Status1);
			   Thread.sleep(4000);
			   TBDlink.click();
			   Thread.sleep(1000);
			   Editrequest(Status1);
		       Thread.sleep(4000);
		       TBDlink.click();
			   Thread.sleep(1000);
			 break;
		 }
	}
		else
		{
			System.out.println("No deadline TBD request available " + "\n");
		}
	}
}
