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
And User should navigate to activity details
And User have to fill the loan amount and gross weight
And User have to fill the crop details and agri allied deatils
And User have to enter the Value in Loan Amount Repaid to Non-Institutional Lender  and if enter more than amount user have to check the alert is coming
And User should navigate to branch selection page
And User have to select branch
And User have to select appoinmentdate
And User should navigate to preview page
And User have to check all the textboxes having values or not
And User have to click next button
And User should navigate to branch verification page



 