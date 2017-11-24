	  package rmspackage;

	  import java.awt.Robot;
	  import java.awt.Toolkit;
	  import java.awt.datatransfer.StringSelection;
	  import java.awt.event.KeyEvent;
	  import java.util.List;
	  import java.util.concurrent.TimeUnit;
	  import rmspackage.Req_deliverables;

	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.WebElement;
	  import org.openqa.selenium.support.FindAll;
	  import org.openqa.selenium.support.FindBy;
	  import org.openqa.selenium.support.PageFactory;
	  import org.openqa.selenium.support.ui.ExpectedConditions;
	  import org.openqa.selenium.support.ui.Select;
	  import org.openqa.selenium.support.ui.WebDriverWait;
	  import org.testng.Assert;

	  public class Delete {
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
	  	
	  	@FindBy(xpath=".//*[@id='divEditRequestDeadline']/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div[1]/div/div[1]/div[2]/table/tbody/tr[5]/td[7]/div")
	  	WebElement choosestart;
	  	
	  	@FindBy(id="endDatePicker")
	  	WebElement enddt;
	  	
	  	@FindBy(xpath=".//*[@id='RecurringRequest']/table/tbody/tr[2]/td[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[5]/div")
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
	  	
	    String path="C:\\Users\\chaman.preet\\Desktop\\04 PIA Requirement V 2 3.docx";
	    
	    
	    
	    public Delete(WebDriver driver)
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
	  	  Thread.sleep(1000);;
	  	  Assert.assertEquals(detailtitle, "Request detail","Title not matching");
	    }
	  	  else
	  	  {
	  		  System.out.println("Assign analyst action button is not present");
	  	  }
	    }
	    // To verify and perform action if add supporting document is present.
	    public void addsupporting_details()
	    {
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
	  	  supportsubmit.click();
	  	  driver.switchTo().defaultContent();
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
	  			  Thread.sleep(2000);
	  			  rr.keyPress(KeyEvent.VK_ENTER);
	  			  rr.keyRelease(KeyEvent.VK_ENTER);
	  			  Thread.sleep(3000);
	  		  }
	  		  catch(Exception e)
	  		  {
	  			  e.printStackTrace();
	  		  }
	  	  }
	  	  	  
	  	  // To verify and perform action if edit deadline is present.
	  	  public void editdead_details()
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
	  						try {
	  							Thread.sleep(2000);
	  						} catch (InterruptedException e) {
	  							// TODO Auto-generated catch block
	  							e.printStackTrace();
	  						}
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
	  				Thread.sleep(1000);
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
	  	  public void filltimesheet_details()
	  	  {
	  		  
	  		  boolean timesheetpresent=driver.findElements(By.id("lnkFillTimesheet")).size()>0;
	  		  if(timesheetpresent)
	  		  {
	  			  try {
	  					Thread.sleep(1000);
	  				} catch (InterruptedException e) {
	  					// TODO Auto-generated catch block
	  					e.printStackTrace();
	  				}
	  			  timesheet.click();
	  			  String heading = driver.findElement(By.id("innerTitleHeader")).getText();
	  				Assert.assertEquals(heading, "Fill timesheet");
	  			  View.click();
	  			  try {
	  					Thread.sleep(2000);
	  				} catch (InterruptedException e) {
	  					// TODO Auto-generated catch block
	  					e.printStackTrace();
	  				}
	  			    /*Filter.click();
	  				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  				Status.click();
	  				
	  				//checkstatus.get(3).click();
	  				checkstatus.get(x).click();
	  			    Apply.click();
	  			    try {
	  					Thread.sleep(3000);
	  				} catch (InterruptedException e) {
	  					// TODO Auto-generated catch block
	  					e.printStackTrace();
	  				}
	  			    driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
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
	  		  System.out.println("Status of request is " +req);
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
	  				//clickcancel.click();	
	  				String req=driver.findElement(By.xpath("//span[contains(@id,'_rptrPrimaryDetail_ctl02_ValueLabel1')]")).getText();
	  				  System.out.println("Status of request is " +req);
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
	  			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  			 String version=driver.findElement(By.xpath(".//*[@id='dialogTitleSpan']")).getAttribute("title");
	  			  System.out.println("Dialog box opened is " +version);
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
	  	  public void recurring_details()
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
	  		  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  		  try {
	  			Thread.sleep(2000);
	  		} catch (InterruptedException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}
	  		  choosestart.click();
	  		  enddt.click();
	  		  try {
	  				Thread.sleep(2000);
	  			} catch (InterruptedException e) {
	  				// TODO Auto-generated catch block
	  				e.printStackTrace();
	  			}
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
	  			  timeTBD.sendKeys("16:00");
	  			  editdesc.sendKeys("Add comment to change request to TBD");
	  			  SubmitTBD.click();
	  		  }
	  		  else
	  		  {
	  			  System.out.println("deadline TBD is not present");
	  		  }
	  	  }
	  	  
	  	  
	  	  //Perform action buttons for unassigned request
	    public void unassignedreq() throws InterruptedException
	    {
	  	  System.out.println("Request_details.unassignedreq()");
	  	  View.click();
	  	  Thread.sleep(3000);
	  	  unassignlink.click();
	  	  Thread.sleep(1000);
	  	    driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	    assign_analyst_details();
	  		Thread.sleep(1000);
	  		inprogressreq();
	  	   addsupporting_details();
	  	   Thread.sleep(1000);
	  	   editdead_details();
	  	   Thread.sleep(1000);
	  	   editcoverage_details();
	  	   Thread.sleep(1000);
	  	   filltimesheet_details();
	  	   Thread.sleep(3000);
	  	   unassignlink.click();
	  	   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	   Editrequest_details();
	  	   Thread.sleep(1000);
	  	   holdreq_details();
	  	   Thread.sleep(1000);
	  	   cancelreq_details();
	  	   Thread.sleep(1000);
	  	   requesthistory_details();
	  	   Thread.sleep(1000);
	  	    recurring_details();
	  	    Thread.sleep(1000);
	  	    setaslarge();
	  	    Thread.sleep(1000);
	  	   req_comments();
	  	   Thread.sleep(1000);
	  	  deadline_TBD();
	  	  Thread.sleep(1000);
	  	  
	    } 
	    
	    public void inprogressreq() throws InterruptedException
	    {
	  	 System.out.println("Request_details.inprogressreq()");
	  	 Req_deliverables objdel=PageFactory.initElements(driver, Req_deliverables.class);
	  	/*  View.click();
	  	  Thread.sleep(3000);
	  	  inprogresslink.click();
	  	  Thread.sleep(1000);
	  			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	  	 objdel.assign_analyst_details1();
	  		    Thread.sleep(1000);
	  			   addsupporting_details();
	  			   Thread.sleep(2000);
	  			   editdead_details();
	  			   Thread.sleep(1000);
	  			  //editcoverage_details();
	  			   Thread.sleep(1000);
	  			   filltimesheet_details();
	  			   Thread.sleep(3000);
	  			   inprogresslink.click();
	  			   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  			   Editrequest_details();
	  			   Thread.sleep(1000);
	  			   holdreq_details();
	  			   Thread.sleep(1000);
	  			   cancelreq_details();
	  			   Thread.sleep(1000);
	  			   requesthistory_details();
	  			   Thread.sleep(1000);
	  			   // recurring_details();
	  			    Thread.sleep(1000);
	  			    setaslarge();
	  			    Thread.sleep(1000);
	  			   req_comments();
	  			   Thread.sleep(1000);
	  			   deadline_TBD();
	  			   Thread.sleep(1000);
	  		}
	    public void onholdreq() throws InterruptedException
	    {
	  	 System.out.println("Request_details.onholdreq()");
	  	  View.click();
	  	  Thread.sleep(3000);
	  	  onholdlink.click();
	  	  Thread.sleep(1000);
	  			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		    assign_analyst_details();
	  		    Thread.sleep(1000);
	  			   addsupporting_details();
	  			   Thread.sleep(1000);
	  			   editdead_details();
	  			   Thread.sleep(1000);
	  			   editcoverage_details();
	  			   Thread.sleep(1000);
	  			   filltimesheet_details();
	  			   Thread.sleep(3000);
	  			   onholdlink.click();
	  			   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  			   Editrequest_details();
	  			   Thread.sleep(1000);
	  			   holdreq_details();
	  			   Thread.sleep(1000);
	  			   unholdreq_details();
	  			   Thread.sleep(1000);
	  			   cancelreq_details();
	  			   Thread.sleep(1000);
	  			   requesthistory_details();
	  			   Thread.sleep(1000);
	  			    recurring_details();
	  			    Thread.sleep(1000);
	  			    setaslarge();
	  			    Thread.sleep(1000);
	  			   req_comments();
	  			   Thread.sleep(1000);
	  			   deadline_TBD();
	  			   Thread.sleep(1000);	
	    }
	    
	    public void completedreq() throws InterruptedException
	    {
	  	 System.out.println("Request_details.completedreq()");
	  	  View.click();
	  	  Thread.sleep(3000);
	  	  completelink.click();
	  	  Thread.sleep(1000);
	  	  			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		    assign_analyst_details();
	  		    Thread.sleep(1000);
	  			   addsupporting_details();
	  			   Thread.sleep(1000);
	  			   editdead_details();
	  			   Thread.sleep(1000);
	  			   editcoverage_details();
	  			   Thread.sleep(1000);
	  			   filltimesheet_details();
	  			   Thread.sleep(3000);
	  			   completelink.click();
	  			   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  			   Editrequest_details();
	  			   Thread.sleep(1000);
	  			   holdreq_details();
	  			   Thread.sleep(1000);
	  			   cancelreq_details();
	  			   Thread.sleep(1000);
	  			   requesthistory_details();
	  			   Thread.sleep(1000);
	  			    recurring_details();
	  			    Thread.sleep(1000);
	  			    setaslarge();
	  			    Thread.sleep(1000);
	  			   req_comments();
	  			   Thread.sleep(1000);
	  			   deadline_TBD();
	  			   Thread.sleep(1000);
	  		}
	    public void closedreq() throws InterruptedException
	    {
	  	 System.out.println("Request_details.closedreq()");
	  	  View.click();
	  	  Thread.sleep(3000);
	  	  closelink.click();
	  	  Thread.sleep(1000);
	  			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		    assign_analyst_details();
	  		    Thread.sleep(1000);
	  			   addsupporting_details();
	  			   Thread.sleep(1000);
	  			   editdead_details();
	  			   Thread.sleep(1000);
	  			   editcoverage_details();
	  			   Thread.sleep(1000);
	  			   filltimesheet_details();
	  			   Thread.sleep(3000);
	  			   closelink.click();
	  			   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  			   Editrequest_details();
	  			   Thread.sleep(1000);
	  			   holdreq_details();
	  			   Thread.sleep(1000);
	  			   cancelreq_details();
	  			   Thread.sleep(1000);
	  			   requesthistory_details();
	  			   Thread.sleep(1000);
	  			    recurring_details();
	  			    Thread.sleep(1000);
	  			    setaslarge();
	  			    Thread.sleep(1000);
	  			   req_comments();
	  			   Thread.sleep(1000);
	  			   deadline_TBD();
	  			   Thread.sleep(1000);
	  		}
	    
	    public void cancelreq() throws InterruptedException
	    {
	  		 System.out.println("Request_details.completedreq()");
	  		  View.click();
	  		  Thread.sleep(3000);
	  		  cancellink.click();
	  		  Thread.sleep(1000);
	  		  			driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  			    assign_analyst_details();
	  			    Thread.sleep(1000);
	  				   addsupporting_details();
	  				   Thread.sleep(1000);
	  				   editdead_details();
	  				   Thread.sleep(1000);
	  				   editcoverage_details();
	  				   Thread.sleep(1000);
	  				   filltimesheet_details();
	  				   Thread.sleep(3000);
	  				   cancellink.click();
	  				   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  				    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  				   Editrequest_details();
	  				   Thread.sleep(1000);
	  				   holdreq_details();
	  				   Thread.sleep(1000);
	  				   cancelreq_details();
	  				   Thread.sleep(1000);
	  				   requesthistory_details();
	  				   Thread.sleep(1000);
	  				    recurring_details();
	  				    Thread.sleep(1000);
	  				    setaslarge();
	  				    Thread.sleep(1000);
	  				   req_comments();
	  				   Thread.sleep(1000);
	  				   deadline_TBD();
	  				   Thread.sleep(1000);
	  			}
	    
	    public void TBDreq() throws InterruptedException
	    {
	  	 System.out.println("Request_details.TBDreq()");
	  	  View.click();
	  	Thread.sleep(3000);
	  	  TBDlink.click();
	  	  Thread.sleep(1000);
	  	  		driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		    assign_analyst_details();
	  		    Thread.sleep(1000);
	  			   addsupporting_details();
	  			   Thread.sleep(1000);
	  			   editdead_details();
	  			   Thread.sleep(1000);
	  			   //editcoverage_details();
	  			   Thread.sleep(1000);
	  			   filltimesheet_details();
	  			   Thread.sleep(3000);
	  			   TBDlink.click();
	  			   driver.findElement(By.xpath(".//*[@id='lblRequestTitle']")).click();
	  			    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  			   Editrequest_details();
	  			   Thread.sleep(1000);
	  			   holdreq_details();
	  			   Thread.sleep(1000);
	  			   cancelreq_details();
	  			   Thread.sleep(1000);
	  			   requesthistory_details();
	  			   Thread.sleep(1000);
	  			    //recurring_details();
	  			    Thread.sleep(1000);
	  			    setaslarge();
	  			    Thread.sleep(1000);
	  			   req_comments();
	  			   Thread.sleep(1000);
	  			   deadline_TBD();
	  			   Thread.sleep(1000);
	  		}
  }
