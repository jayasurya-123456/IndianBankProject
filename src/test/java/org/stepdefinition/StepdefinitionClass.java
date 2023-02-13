package org.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	public void user_have_to_click_submitotp_button() {
	    driver.findElement(By.id("LoginSubmitB")).click();
	    driver.findElement(By.id("KCCLogin_button11")).click();
	    driver.findElement(By.xpath("//*[@id=\"Loan_Pre_Requisites_frame3\"]/div/div/div[14]/div/div[1]/div")).click();
	    driver.findElement(By.id("KCCLogin_button8")).click();
	}

	@When("User should navigate to customerdetails page")
	public void user_should_navigate_to_customerdetails_page() {
	    System.out.println(driver.getCurrentUrl());
	    
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
		WebElement email = driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_EMAILID"));
		String email1 = email.getText();
	    if (email.isEnabled()) {
	    	System.out.println("email is enabled");
	    	System.out.println("email  value is not there  and editable");
	    	email.sendKeys("suryamoorthy2907@gmail.com");
	    	robotEnter();
	    	driver.findElement(By.id("KCC_PDS_GenerateOTP")).click();
	    	Thread.sleep(20000);
	    	//driver.findElement(By.id("KCCPersonalDetails_textbox91")).sendKeys(" ");
	    	driver.findElement(By.id("KCC_PDS_SubmitOTP")).click();
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
	    
		WebElement radiobutten = driver.findElement(By.xpath("//*[@id=\"KCCPersonalDetails_frame3\"]/div[2]/div/div[15]/div/div[1]/div"));
		radiobutten.click();
		Thread.sleep(2000);
		//if (radiobutten.isSelected()) {
			//System.out.println("Both permanent and temporary address are same and non editable");
			  
		//} else {
		//	driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_CA_PINCODE")).sendKeys("626111");
		 ////     robotEnter();
		  //  driver.findElement(By.id("LP_LOS_PERSONAL_DETS_JEWELET_CA")).sendKeys("No 2/28 WATER TANK STREET MANGUDI SANKARANKOIL STREET");
		
			
		//}
	    
		
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



}
