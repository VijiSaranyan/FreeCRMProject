Feature: Verifying the change2 Automation with  Resuable Methods
@SmokeTesting
Scenario:  Validating the Resuable Methods 
Given The User has APi method details
When  The User uses "postapi" and "postpayload"
Then the "message" in the response body is "Data Inserted Successfully"