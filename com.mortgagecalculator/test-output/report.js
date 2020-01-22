$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFile.feature");
formatter.feature({
  "line": 1,
  "name": "Home value, interest rate, loan terms, and taxes",
  "description": "",
  "id": "home-value,-interest-rate,-loan-terms,-and-taxes",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Home value and interest rate boxes",
  "description": "",
  "id": "home-value,-interest-rate,-loan-terms,-and-taxes;home-value-and-interest-rate-boxes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke,"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters home value into homeval textbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "entres rate into rate textbox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "A Mortgage Repayment Summary dislays with a monthly payment value",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefenition.user_is_on_home_page()"
});
formatter.result({
  "duration": 10762224600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.user_enters_home_value_into_homeval_textbox()"
});
formatter.result({
  "duration": 201711000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.entres_rate_into_rate_textbox()"
});
formatter.result({
  "duration": 57273900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.clicks_on_submit_button()"
});
formatter.result({
  "duration": 355364600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.a_Mortgage_Repayment_Summary_dislays_with_a_monthly_payment_value()"
});
formatter.result({
  "duration": 665147500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Loan terms and taxes",
  "description": "",
  "id": "home-value,-interest-rate,-loan-terms,-and-taxes;loan-terms-and-taxes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user enters loan term value into loan term textbox",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "entres property tax into property tax textbox",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "A Mortgage Repayment Summary dislays with a monthly payment value",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefenition.user_is_on_home_page()"
});
formatter.result({
  "duration": 9753724700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.user_enters_loan_term_value_into_loan_term_textbox()"
});
formatter.result({
  "duration": 93174700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.entres_property_tax_into_property_tax_textbox()"
});
formatter.result({
  "duration": 61279300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.clicks_on_submit_button()"
});
formatter.result({
  "duration": 385949800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefenition.a_Mortgage_Repayment_Summary_dislays_with_a_monthly_payment_value()"
});
formatter.result({
  "duration": 757061400,
  "status": "passed"
});
});