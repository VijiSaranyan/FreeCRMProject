Feature: verifying change2TestAutomationAPI using datadriven concept
Scenario Outline: validating post method with multiple values
Given the user has post method details "<Title>" "<body>" "<author>"
When the user send post HTTP request
Then user gets message data inserted succesfully

Examples:
|Title|body|author|
|Viji|Neetika|Viji1|
|Viji1|Neetika1|Viji2|


Scenario Outline: validating put method with multiple values
Given the user has put method details  "<id>" "<author>"
When the user send put HTTP request
Then user gets message data updated successfully

Examples:
|id|author|
|262|Viji5|

Scenario Outline: validating Delete method with multiple values
Given the user has delete method details  "<id>" 
When the user send delete HTTP request
Then user gets message data deleted successfully

Examples:
|id|
|297|