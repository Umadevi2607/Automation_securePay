Feature: Contact us form
Scenario: Fill the contact-us form in securepay website
Given Open Google home page
When Searches for SecurePay and go to SecurePay website
And Navigates to the contact us page
And Verifies that the contact-us page is loaded
And Generates random data using an open-source library and fill the form
