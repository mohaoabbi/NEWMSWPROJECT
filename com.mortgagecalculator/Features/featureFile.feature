Feature: Home value, interest rate, loan terms, and taxes
@smoke,@regression
Scenario: Home value and interest rate boxes

Given  user is on home page
When user enters home value into homeval textbox 
And entres rate into rate textbox 
Then clicks on submit button
And A Mortgage Repayment Summary dislays with a monthly payment value

@smoke
Scenario: Loan terms and taxes

Given  user is on home page
When user enters loan term value into loan term textbox 
And entres property tax into property tax textbox 
Then clicks on submit button
And A Mortgage Repayment Summary dislays with a monthly payment value
