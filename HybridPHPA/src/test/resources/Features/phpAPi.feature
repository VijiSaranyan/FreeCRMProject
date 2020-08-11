Feature: Verify change2testautomation API
Scenario: Validating the PostMethod
Given the User has PostMethod Details 
When the User calls Post API with Post http methods
Then User Receives the Post StatusCode success

Scenario: Validating the PutMethod
Given the User has PutMethod Details
When the User calls Put API with Put http methods
Then User receives message successfully updated

Scenario: Validating the Getmethod
Given the User has GetMethod Details
When the USer calls Get API with Get http methods
Then user receives message updated successfully

Scenario: validating delete method
Given the user has delete method details 
When the user call delete API with delete HTTP method
Then the user receive delete status code success

