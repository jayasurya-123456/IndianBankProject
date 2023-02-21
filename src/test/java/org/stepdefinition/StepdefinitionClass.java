package org.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.util.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionClass extends BaseClass {
	public static Select s;
	
	@Given("User have to launch the URL")
	public void user_have_to_launch_the_URL() {
		
	    launchChrome();
	    maximize();
	    loadUrl("https://ibdlpuat.indianbank.in/loanPortalAgri/components/viewer/portal/initializePortal.jsp?navigationPage=NavigationFormETB");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User have to enter valid CIF\\/SB Accountnumber")
	public void user_have_to_enter_valid_CIF_SB_Accountnumber() {
	   driver.findElement(By.id("LP_LOS_LOGIN_JL_CIFORSBNUMBER")).sendKeys("3295500708");
	   
	   
	}

	@When("User have to click validate button")
	public void user_have_to_click_validate_button() {
	    driver.findElement(By.id("LoginFetchCIF")).click();
	}

	@When("User have to click sendotp button")
	public void user_have_to_click_sendotp_button() throws InterruptedException {
	    driver.findElement(By.id("LoginSendOTPB")).click();
	    Thread.sleep(20000);
	}

	@When("User have to enter valid OTP")
	public void user_have_to_enter_valid_OTP() {
	    driver.findElement(By.id("LP_LOS_LOGIN_JL_OTP")).sendKeys(" ");
	}

	@When("User have to click submitotp button")
	public void user_have_to_click_submitotp_button() throws InterruptedException {
	    driver.findElement(By.id("LoginSubmitB")).click();
	   
	    driver.findElement(By.id("KCCLogin_button11")).click();
	    //WebDriverWait w = new WebDriverWait(driver,10);
	   // w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='checkbox'])[2]//parent::div")));
	  driver.findElement(By.xpath("//*[@id=\"Loan_Pre_Requisites_frame3\"]/div/div/div[14]/div/div[1]/div")).click();
	 
	    driver.findElement(By.id("KCCLogin_button8")).click();
	}

	@When("User should navigate to customerdetails page")
	public void user_should_navigate_to_customerdetails_page() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("Agri")) {
			System.out.println("The current url is correct");
			
		} else {
			System.out.println("The current url is non correct");
		}
	    
	    
	}

	@When("User should check the purpose of loan is always agri and non editable")
	public void user_should_check_the_purpose_of_loan_is_always_agri_and_non_editable() {
	    WebElement value = driver.findElement(By.xpath("//input[@placeholder='Agri']"));
	    String text = value.getAttribute("placeholder");
	    System.out.println(text);
	    if (text.equals("Agri")) {
	    System.out.println("The purpose of loan:Agri");
			
		} else {
System.out.println("The purpose of loan:Not Agri");
		}
	}

	@When("User should enter valid email address and click generate otp and enter valid otp and click submit otp button")
	public void user_should_enter_valid_email_address_and_click_generate_otp_and_enter_valid_otp_and_click_submit_otp_button() throws AWTException, InterruptedException {
		WebElement email = driver.findElement(By.xpath("//input[@id='LP_LOS_PERSONAL_DETS_JEWELET_EMAILID']"));
		String text = email.toString();
	
		
	    if (email.isEnabled()) {
	    	System.out.println("email is enabled");
	    //	if (text.isEmpty()) {
	    		System.out.println("email  value is not there  and editable");
		    	email.sendKeys("suryamoorthy2907@gmail.com");
		    	//robotEnter();
		    	driver.findElement(By.id("KCC_PDS_GenerateOTP")).click();
		    	Thread.sleep(30000);
		    	//driver.findElement(By.id("KCCPersonalDetails_textbox91")).sendKeys(" ");
		    	driver.findElement(By.id("KCC_PDS_SubmitOTP")).click();
				
			//} else {
//System.out.println("testcase fail");
		//}
	    
	    	}
			
	    	
	    	else {
System.out.println("email values is default enabled but non editable");
		}
	    
	}

	@When("User should select Religion-caste")
	public void user_should_select_Religion_caste() {
	    WebElement selectvalue = driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_RELIGION"));
	     s = new Select(selectvalue);
	    if (selectvalue.isSelected()) {
	    	System.out.println("The select value is default non editable");
			
		} else {
            System.out.println("The select value is editable");
            s.selectByVisibleText("Hindu General");
		}
	}
	@When("User  should click radio button of permananent address and user should check permananent address and temporary address are same")
	public void user_should_click_radio_button_of_permananent_address_and_user_should_check_permananent_address_and_temporary_address_are_same() throws AWTException, InterruptedException {
	    
		WebElement radiobutten = driver.findElement(By.xpath("//input[@id='LP_LOS_PERSONAL_DETS_JEWELET_SAMEASPERADDR']//parent::div"));
		radiobutten.click();
		Thread.sleep(10000);
//		if (radiobutten.isSelected()) {
//			System.out.println("Both permanent and temporary address are same and non editable");
//			  
//		} else {
//			driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_CA_PINCODE")).sendKeys("626111");
//		      robotEnter();
//		   driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_CA")).sendKeys("No 2/28 WATER TANK STREET MANGUDI SANKARANKOIL STREET");
//		
//			
//		}
//    
		
	}

	@When("User should add nominee details")
	public void user_should_add_nominee_details() throws InterruptedException {
	    WebElement novalue = driver.findElement(By.xpath("//select[@name='LP_LOS_PERSONAL_DETS_JEWELET_NOMINEE_DETAILS']"));
	    		Thread.sleep(2000);;
	   s = new Select(novalue);
	   s.selectByVisibleText("Yes");
	 WebElement excus = driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_EXISTING_CUSTOMER"));
	     s = new Select(excus);
	    s.selectByVisibleText("Yes");
	    driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_NOMINEE_CIF_ACC_NO")).sendKeys("7366567360");
	    driver.findElement(By.id("ETBPersonalDetails_button6")).click();
	    WebElement pervalue = driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_NOMINEE_RELATION"));
	    s= new Select(pervalue);
	    s.selectByVisibleText("Father");
	    
	}

	@When("User should enter next button")
	public void user_should_enter_next_button() {
	    driver.findElement(By.id("KCC_Btn_Next")).click();
	}
	@When("User should navigate to activity details")
	public void user_should_navigate_to_activity_details() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("Agri")) {
			System.out.println("The current url is correct");
			
		} else {
			System.out.println("The current url is non correct");
		}
	}
	@When("User have to fill the loan amount and gross weight")
	public void user_have_to_fill_the_loan_amount_and_gross_weight() {
	   WebElement text = driver.findElement(By.id("DLP_ETB_CREDIT_ASSESMENT_GL_AMOUNT_AVAILABLE"));
	   String string = text.toString();
	   if (string.isEmpty()) {
		   System.out.println("Value is not there  in field \\\"Amount cannot be availed ₹\\\"");
		
	} else {
System.out.println("Value should be there  in field \"Amount can be availed ₹\"");
	}
	   driver.findElement(By.id("DLP_ETB_CREDIT_ASSESMENT_GL_REQUESTEDAMOUNT")).sendKeys("100000");
	   driver.findElement(By.id("DLP_ETB_CREDIT_ASSESMENT_GL_GOLDVALUE")).sendKeys("500");
	}

	@When("User have to fill the crop details and agri allied deatils")
	public void user_have_to_fill_the_crop_details_and_agri_allied_deatils() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='TBL_CREDIT_ASSESSMENT_0']//parent::div")).click();
	    WebElement value = driver.findElement(By.xpath("(//select[@class='control-class form-control inputStyle  '])[1]"));
	    s= new Select(value);
	    s.selectByVisibleText("TAMIL NADU");
	    WebElement value1 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[2]"));
	    s= new Select(value1);
	    s.selectByVisibleText("CHENNAI");
	    WebElement value2 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[3]"));
	    s= new Select(value2);
	    s.selectByVisibleText("Ambattur");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[4]")).sendKeys("1");
	    WebElement value3 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[4]"));
	    s= new Select(value3);
	    s.selectByVisibleText("Apple");
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[5]")).sendKeys("2");
	    WebElement value4 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[5]"));
	    s= new Select(value4);
	    s.selectByVisibleText("Owned");
	    driver.findElement(By.id("add_TBL_CREDIT_ASSESSMENT")).click();
	    driver.findElement(By.xpath("//input[@id='TBL_CREDIT_ASSESSMENT_1']//parent::div")).click();
	    WebElement value5 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[6]"));
	    s= new Select(value5);
	    s.selectByVisibleText("TAMIL NADU");
	    WebElement value6 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[7]"));
	    s= new Select(value6);
	    s.selectByVisibleText("CHENNAI");
	    WebElement value7 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[8]"));
	    s= new Select(value7);
	    s.selectByVisibleText("Adambakkam");
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[8]")).sendKeys("1");
	    WebElement value8 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[9]"));
	    s= new Select(value8);
	    s.selectByVisibleText("Amla");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[9]")).sendKeys("2");
	    WebElement value9= driver.findElement(By.xpath("(//select[@datatype='combobox'])[10]"));
	    s= new Select(value9);
	    s.selectByVisibleText("Lease");
	    driver.findElement(By.id("add_TBL_CREDIT_ASSESSMENT")).click();
	    WebElement value10 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[11]"));
	    s= new Select(value10);
	    s.selectByVisibleText("TAMIL NADU");
	    WebElement value11 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[12]"));
	    s= new Select(value11);
	    s.selectByVisibleText("CHENNAI");
	    WebElement value12 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[13]"));
	    s= new Select(value12);
	    s.selectByVisibleText("Alandur");
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[12]")).sendKeys("1");
	    WebElement value13 = driver.findElement(By.xpath("(//select[@datatype='combobox'])[14]"));
	    s= new Select(value13);
	    s.selectByVisibleText("Cashew");
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[13]")).sendKeys("2");
	    WebElement value14= driver.findElement(By.xpath("(//select[@datatype='combobox'])[15]"));
	    s= new Select(value14);
	    s.selectByVisibleText("Lease");
	    driver.findElement(By.id("add_TBL_CREDIT_ASSESSMENT")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	    
	   // driver.findElement(By.xpath("//input[@id='Credit_Assessment_GL_table4_0']//parent::div")).click();
	    WebElement value15 = driver.findElement(By.xpath("(//select[@class='control-class form-control inputStyle  '])[16]"));
	    s= new Select(value15);
	    s.selectByVisibleText("Fishery");
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[17]")).sendKeys("1");
	    driver.findElement(By.id("add_Credit_Assessment_GL_table4")).click();
	   // driver.findElement(By.xpath("//input[@id='Credit_Assessment_GL_table4_1']//parent::div")).click();
	    WebElement value16 = driver.findElement(By.xpath("(//select[@class='control-class form-control inputStyle  '])[17]"));
	    s= new Select(value16);
	    s.selectByVisibleText("Dairy/Cattle");
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[20]")).sendKeys("1");
	    driver.findElement(By.id("add_Credit_Assessment_GL_table4")).click();
	    WebElement value17 = driver.findElement(By.xpath("(//select[@class='control-class form-control inputStyle  '])[18]"));
	    s= new Select(value17);
	    s.selectByVisibleText("Piggery");
	    driver.findElement(By.xpath("(//input[@typeofvalue='Text'])[23]")).sendKeys("1");
	    driver.findElement(By.id("add_Credit_Assessment_GL_table4")).click();
	    Thread.sleep(2000);
driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	   
	    
	    
	}
	@When("User have to enter the Value in Loan Amount Repaid to Non-Institutional Lender  and if enter more than amount user have to check the alert is coming")
	public void user_have_to_enter_the_Value_in_Loan_Amount_Repaid_to_Non_Institutional_Lender_and_if_enter_more_than_amount_user_have_to_check_the_alert_is_coming() throws InterruptedException {
	    WebElement amount = driver.findElement(By.id("DLP_ETB_CREDIT_ASSESMENT_GL_LOANREPAIDNIL"));
	    amount.sendKeys("200000");
	    driver.findElement(By.id("ETBCredit_AssessmentGL_button3")).click();
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	   
	   
	 // Alert a = driver.switchTo().alert();
	  // String text = a.getText();
	  // System.out.println(text);
	  // a.accept();
       Thread.sleep(2000);
	    amount.sendKeys("100000");
	    
	    driver.findElement(By.id("ETBCredit_AssessmentGL_button3")).click();
	}
	@When("User should navigate to branch selection page")
	public void user_should_navigate_to_branh_selection_page() throws InterruptedException {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("Agri")) {
			System.out.println("The current url is correct");
			
		} else {
			System.out.println("The current url is non correct");
		}
		
	}
	

	@When("User have to select branch")
	public void user_have_to_select_branch() throws InterruptedException, AWTException {
	   
	   System.out.println("pass");
	   Thread.sleep(10000);
	   driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	   Thread.sleep(3000);
	   
	   WebElement s = driver.findElement(By.xpath("//select[@name='LP_LOS_SELECTBRANCH_JEWELET_BRANCHSELECTION']"));
		s.click();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

	@When("User have to select appoinmentdate")
	public void user_have_to_select_appoinmentdate() throws InterruptedException {
		
		//WebElement element = driver.findElement(By.id("LP_LOS_SELECTBRANCH_JEWELET_DATESELECTION"));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("document.getElementById('LP_LOS_SELECTBRANCH_JEWELET_DATESELECTION').value='17/02/2023';");
		//String s1 = (String)js.executeScript("returndocument.getElementById('LP_LOS_SELECTBRANCH_JEWELET_DATESELECTION').value");
		Thread.sleep(10000);
		 driver.findElement(By.xpath("(//button[text()=' Next'])[2]")).click();
		
		
	    
	}
	@When("User should navigate to preview page")
	public void user_should_navigate_to_preview_page() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("Agri")) {
			System.out.println("The current url is correct");
			
		} else {
			System.out.println("The current url is non correct");
		}
	}
	@When("User have to check all the textboxes having values or not")
	public void user_have_to_check_all_the_textboxes_having_values_or_not() throws InterruptedException {
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[20]"));
		   
		  WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[21]"));
		 
		   WebElement text3 = driver.findElement(By.xpath("(//input[@type='text'])[23]"));
		  
		   
		   WebElement text4 = driver.findElement(By.xpath("(//input[@type='text'])[24]"));
		  
		   List<WebElement> l = new ArrayList<WebElement>();
		  l.add(text);
		  l.add(text1);
		  l.add(text3);
		  l.add(text4);
		  for (WebElement web : l) {
			  String string = web.toString();
			  if (string.isEmpty()) {
				  System.out.println("value is not there");
				
			} else {
				System.out.println("value is  there");
			}
			
		}
		  Thread.sleep(2000);
	}

	@When("User have to click next button")
	public void user_have_to_click_next_button() {
		driver.findElement(By.id("ETB_Preview_button5")).click();
	}
	
	

	

	@When("User should navigate to branch verification page")
	public void user_should_navigate_to_branch_verification_page() {
		String s = "Thanks for applying to Indian Bank Jewel Loan. Your loan application reference number is IA7085EF. Kindly visit the branch with the KYC(Know Your Customer) documents on 16/02/2023";
		if (s.contains("Indian Bank Jewel Loan")) {
			System.out.println(s);
			
		} else {
	System.out.println("The value is non corect");
		}
	}


}
