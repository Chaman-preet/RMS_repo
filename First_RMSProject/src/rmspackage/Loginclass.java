package rmspackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileCacheImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rmspackage.ExcelUtils;

public class Loginclass {
	WebDriver driver;
	@FindBy(id="ctl00_PlaceHolderMain_signInControl_UserName")
	WebElement username;
	
	@FindBy(id="ctl00_PlaceHolderMain_signInControl_password")
	WebElement password;
	
	@FindBy(id="ctl00_PlaceHolderMain_signInControl_login")
	WebElement login;

	@FindBy(id="ctl00_HeaderControl1_lnkRightDD")
	WebElement useredit;
	
	@FindBy(id="ctl00_HeaderControl1_lnkSignOut")
	WebElement logoutlink;

	FileInputStream fs;
	
  public Loginclass(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  }
  
/*  public void getobjects() throws IOException
  {
	  fs=new FileInputStream("C://RMS_workspace//First_RMSProject//src//rmspackage//object.properties");
	  Properties prp=new Properties();
	  prp.load(fs);
  }*/
  
  //Open URL
  public void logintourl()
  {
	 String URL=ExcelUtils.getCellData(1, 2);
	  System.out.println("URL is " +URL);
	  driver.get(URL);
  }
  
  // Methods to login to application
  public void enteruser(int i) throws InterruptedException
  {
	String user=ExcelUtils.getCellData(2, i);
	 System.out.println("Username is " +user);
	 username.click();
	  username.sendKeys(user);
	  }
	 
  
  public void enterpswd(int i) throws InterruptedException
  {
	 	  String pswd=ExcelUtils.getCellData(3, i);
	  System.out.println("Password is " +pswd);
	 password.click();
	 password.sendKeys(pswd);
	  }
  
  public void log()
  {
	  login.click();
  }
  
  public void logout() throws InterruptedException
  {
	  Thread.sleep(1000);
	  useredit.click();
	  Thread.sleep(1000);
	  logoutlink.click();
  }
}
