$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/authentication.feature");
formatter.feature({
  "name": "Validation of Ind Digi Agri Jewel Loan",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Authentication Stage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter valid CIF/SB Accountnumber",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_enter_valid_CIF_SB_Accountnumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click validate button",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_click_validate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click sendotp button",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_click_sendotp_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d110.0.5481.104)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LPT2881\u0027, ip: \u0027192.168.24.90\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 110.0.5481.104, chrome: {chromedriverVersion: 110.0.5481.77 (65ed616c6e8e..., userDataDir: C:\\Program Files (x86)\\scop...}, goog:chromeOptions: {debuggerAddress: localhost:60634}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3545673af72611ab09cfeed61fa68bd6\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat org.stepdefinition.StepdefinitionClass.user_have_to_click_sendotp_button(StepdefinitionClass.java:54)\r\n\tat ✽.User have to click sendotp button(file:src/test/resources/Feature/authentication.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to enter valid OTP",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_enter_valid_OTP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to click submitotp button",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_click_submitotp_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to customerdetails page",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_navigate_to_customerdetails_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should check the purpose of loan is always agri and non editable",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_check_the_purpose_of_loan_is_always_agri_and_non_editable()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter valid email address and click generate otp and enter valid otp and click submit otp button",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_enter_valid_email_address_and_click_generate_otp_and_enter_valid_otp_and_click_submit_otp_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should select Religion-caste",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_select_Religion_caste()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User  should click radio button of permananent address and user should check permananent address and temporary address are same",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_click_radio_button_of_permananent_address_and_user_should_check_permananent_address_and_temporary_address_are_same()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should add nominee details",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_add_nominee_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter next button",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_enter_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to activity details",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_navigate_to_activity_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to fill the loan amount and gross weight",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_fill_the_loan_amount_and_gross_weight()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to fill the crop details and agri allied deatils",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_fill_the_crop_details_and_agri_allied_deatils()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to enter the Value in Loan Amount Repaid to Non-Institutional Lender  and if enter more than amount user have to check the alert is coming",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_enter_the_Value_in_Loan_Amount_Repaid_to_Non_Institutional_Lender_and_if_enter_more_than_amount_user_have_to_check_the_alert_is_coming()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to branch selection page",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_navigate_to_branh_selection_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to select branch",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_select_branch()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to select appoinmentdate",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_select_appoinmentdate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to preview page",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_navigate_to_preview_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to check all the textboxes having values or not",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_check_all_the_textboxes_having_values_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to click next button",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_have_to_click_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to branch verification page",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionClass.user_should_navigate_to_branch_verification_page()"
});
formatter.result({
  "status": "skipped"
});
});