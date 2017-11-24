package rmspackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class add_know {
	WebDriver driver;
	
	@FindBy(xpath="//input[contains(@id,'_btnAddKnowledgeDocument')]")
	WebElement AddKnow;
	 
	@FindBy(xpath="//input[contains(@id,'_ddlKnowledgeTypeLookup_Input')]")
	WebElement Knowtype;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Know_type;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtDocumentTitle')]")
		WebElement Title;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlRegionLookup_Input')]")
	  WebElement Region;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Region_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlCoverageGroupLookup_Input')]")
	  WebElement Coverage;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> CG_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_pplListBoxClientOwner_Input')]")
	  WebElement HR_Owner;
	
	  @FindBy(xpath="//input[contains(@id,'_pplListBoxEVSOwner_Input')]")
	  WebElement EVS_Owner;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtDocumentTags')]")
	  WebElement Tags;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtDocumentCompany')]")
	  WebElement Company;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtTextBox1')]")
	  WebElement Industry;
	  
	  @FindBy(xpath="//input[contains(@id,'_txtVolume')]")
	  WebElement Volume;
	  
	  @FindBy(id="dateDocumentLastUpdatedDateFrom")
	  WebElement From_Date;
	  
	  @FindBy(id="dateDocumentLastUpdatedDateTo")
	  WebElement To_Date;
	  
	  @FindBy(xpath="//input[contains(@id,'_chkIsSignedOff')]")
	  WebElement Signed_off;
	
	  @FindBy(xpath="//input[contains(@id,'_richTextDocumentSetDescription')]")
	  WebElement Desc;
	  
	  @FindBy(xpath="//input[contains(@id,'BtnSearch')]")
			WebElement Search;
	  
	  @FindBy(xpath="//input[contains(@id,'_richTextDocumentSetDescription_contentIframe')]")
	  WebElement Desc1;
	  
	  @FindBy(xpath="//input[contains(@id,'btnCancel')]")
			WebElement Clear;
		
	  @FindBy(className="filterHeadAccordionHeaderClose")
		WebElement Expand;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlSectorLookup_Input')]")
	  WebElement Sector;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Sector_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlSubSectorLookup_Input')]")
	  WebElement Sub_Sector;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Sub_Sector_Value;
	  
	  @FindBy(xpath="//input[contains(@id,'_ddlProfileTypeLookup_Input')]")
	  WebElement Profile_type;
	  @FindAll({@FindBy(className="rcbItem")})
	  List<WebElement> Profile_type_Value;

	  public void Title(String pswd)
	   {
	 	 Title.click();
	 	 Title.sendKeys(pswd);
	   }
	  
	  public void Knowtype_Comp()
	   {
		   Knowtype.click();
		   Know_type.get(0).click();
	   }
	      
	  public void Region()
	   {
		   Region.click();
		   Region_Value.get(1).click();
	   }
	  
	  public void Coverage()
	   {
		   Coverage.click();
		   CG_Value.get(4).click();
	   }
	   
	   public void HROwner () throws InterruptedException 
		{
		HR_Owner.sendKeys("req");
		Thread.sleep(1000);
		driver.findElement(By.className("racItem")).click(); 
		}
		
		public void EVSOwner () throws InterruptedException 
		{
		EVS_Owner.sendKeys("tea");
		Thread.sleep(1000);
		driver.findElement(By.className("racItem")).click(); 
		}
		
		  
	
		public void Tags(String pswd)
		   {
		 	 Tags.click();
		 	 Tags.sendKeys(pswd);
		   }
		   
		   public void Company(String pswd)
		   {
			   Company.click();
			   Company.sendKeys(pswd);
		   }
		   
		   public void Industry(String pswd)
		   {
			   Industry.click();
			   Industry.sendKeys(pswd);
		   }
		   
		   public void Volume(String pswd)
		   {
			   Volume.click();
			   Volume.sendKeys(pswd);
		   }
		   
		   public void From(String pswd)
		   {
			   From_Date.click();
			   From_Date.sendKeys(pswd);
		   }
		   
		   public void To(String pswd)
		   {
			   To_Date.click();
			   To_Date.sendKeys(pswd);
		   }
		   
		   public void Apply()
		   {
			   Search.click();
			   }
		   
		   public void Description(String pswd)
		   {
			   Desc.click();
			   Desc1.sendKeys(pswd);
		   }
		   
		   public void Signed_off()
		   {
			   Signed_off.click();
			   }
		   
		   public void Clear_all()
		   {
			   Clear.click();
			   }
		   public void Expand()
		   {
			   Expand.click();
			   }
		   
		      
		   public void Knowtype_Trad()
		   {
			   Knowtype.click();
			   Know_type.get(1).click();
		   }
		   
		   public void Sector()
		   {
			   Sector.click();
			   Sector_Value.get(1).click();
		   }
		   
		   public void Allfieldsempty() throws InterruptedException
	       {
	    	Thread.sleep(2000);
	    	
	    	String Empty_Knowtype = Knowtype.getAttribute("value");
	    	if(Empty_Knowtype.contentEquals("Select")) { }
	     	else {  System.out.println("Knowledge type field is NOT cleared"); }

	    	String Empty_Title = Title.getAttribute("value");
	    	if(Empty_Title.isEmpty()) { }
	    	else { System.out.println("Title field is NOT cleared"); }

	       	String Empty_Region = Region.getAttribute("value");
	    	if(Empty_Region.contentEquals("Select")) { }
	  	    else { System.out.println("Region field is NOT cleared"); }
	    	
	    	String Empty_Coverage = Coverage.getAttribute("value");
	     	if(Empty_Coverage.contentEquals("Select")) { }
	   	    else { System.out.println("Coverage field is NOT cleared"); }
	     	
	     	String Empty_Sector = Sector.getAttribute("value");
	     	if(Empty_Sector.contentEquals("Select")) { }
	   	    else { System.out.println("Sector field is NOT cleared"); }
	     	
	     	String Empty_Sub_Sector = Sub_Sector.getAttribute("value");
	     	if(Empty_Sub_Sector.contentEquals("Select")) { }
	   	    else { System.out.println("Sub_Sector field is NOT cleared"); }
	     	
	     	String Empty_Profile_type = Profile_type.getAttribute("value");
	     	if(Empty_Profile_type.contentEquals("Select")) { }
	   	    else { System.out.println("Profile_type field is NOT cleared"); }
	     	
	     	String Empty_Tags = Tags.getAttribute("value");
	    	if(Empty_Tags.isEmpty()) { }
	    	else { System.out.println("Tags field is NOT cleared"); }
	     	
	    	String Empty_Company = Company.getAttribute("value");
	    	if(Empty_Company.isEmpty()) { }
	    	else { System.out.println("Company field is NOT cleared"); }
	     	
	    	String Empty_Industry = Industry.getAttribute("value");
	    	if(Empty_Industry.isEmpty()) { }
	    	else { System.out.println("Industry field is NOT cleared"); }
	    	
	    	String Empty_From_Date = From_Date.getAttribute("value");
	    	if(Empty_From_Date.isEmpty()) { }
	    	else { System.out.println("From_Date field is NOT cleared"); }
	    	
	    	String Empty_To_Date = To_Date.getAttribute("value");
	    	if(Empty_To_Date.isEmpty()) { }
	    	else { System.out.println("To_Date field is NOT cleared"); }
	    	
	       }
	public void Add_Know() throws InterruptedException
	   {
		   AddKnow.click();
		  Thread.sleep(2000);
//		 Knowledge type as Company Profile
		  Knowtype_Comp();
		  Thread.sleep(3000);
		  Title("Enter Title");
		  Region();
		  Thread.sleep(2000);
		  Coverage();
		  HROwner();
		  Thread.sleep(1000);
		  EVSOwner();
		  Thread.sleep(1000);
		  Thread.sleep(2000);
		  Tags("Enter Tags");
		  Company("Enter Company");
		  Industry("Enter Industry");
		  Volume("123");
		  From("06/01/2016");
		  To("06/20/2016");
		  Apply();
		  Thread.sleep(2000);
		  Signed_off();
		  Description("Test description");    
		     
//		  Knowledge type as Trading Comps
		  Expand();
		  Thread.sleep(1000);
		  Clear_all();
		  Thread.sleep(3000);
		  Knowtype_Trad();
		  Thread.sleep(2000);
		  Title("Enter Title");
	  	  Thread.sleep(1000);
		  Region();
		  Thread.sleep(1000);
		  Coverage();
		  Thread.sleep(2000);
		  Sector();
		  Thread.sleep(1000);
		  HROwner();
		  Thread.sleep(1000);
		  EVSOwner();
		  Thread.sleep(1000);
		  Tags("Enter Tags");
		  Company("Enter Company");
		  Industry("Enter Industry");
	      From("06/01/2016");
		  To("06/20/2016");
		  Apply();
		  Thread.sleep(3000);
		  Expand();
		  Clear_all();
		  Thread.sleep(2000);
		  Allfieldsempty();
		  Signed_off();
		  Description("Test description");  
		  Volume("123");
            }
}
