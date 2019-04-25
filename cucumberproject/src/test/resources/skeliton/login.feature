Feature: login Feature
@valid
Scenario Outline: Valid User Scenario
Given  The URL of TestMe App
When user enters <username> as username
And user enters <password> as password
Then user is in <page>
Examples:

|username |password|page   |
|Lalitha  |Password123|Home  |
|admin| Password456|Admin Home|

@valid1
Scenario: invalid scenario
Given The URL of TestMe App
When user enters invalid data
|abcxyz | Password123|
|Lalitha |abc123|
|abc123 |abc123|
Then user is in login page
|abc|
|abc|
|abc|
   

#Scenario: Valid User Scenario
#Given  The URL of TestMe App
#When user enters "admin" as username
#And user enters "Password456" as password
#Then user is in home page

