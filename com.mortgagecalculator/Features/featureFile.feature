Feature: Home value and interest rate

Scenario: Home value and interest rate boxes

Given  user is on home page
When user enters home value into homeval textbox 
And entres rate into rate textbox 
Then clicks on submit button
And A Mortgage Repayment Summary dislays with a monthly payment value


