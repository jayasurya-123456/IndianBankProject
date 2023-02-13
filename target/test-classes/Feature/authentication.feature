Feature: Validation of Ind Digi Agri Jewel Loan 
Scenario: Authentication Stage
Given  User have to launch the URL 
When User have to enter valid CIF/SB Accountnumber
And User have to click validate button
And User have to click sendotp button
And User have to enter valid OTP
And User have to click submitotp button
And User should navigate to customerdetails page
And User should check the purpose of loan is always agri and non editable 
And User should enter valid email address and click generate otp and enter valid otp and click submit otp button
And User should select Religion-caste
And User  should click radio button of permananent address and user should check permananent address and temporary address are same
And User should add nominee details
And User should enter next button
 