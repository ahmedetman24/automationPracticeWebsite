Feature: User Registration 
         The purpose of this feature is to register user data
				 
Scenario: User Registration
Given The user is in the home page
When The user click on Sign in button
And Enter "<email>"
And create account with "<gender>", "<custFName>", "<custLName>", "<password>", "<day>", "<month>", "<year>", "<fname>", "<lname>", "<address1>", "<city>", "<state>", "<postalCode>", "<mobileNo>", "<alias>"
Then The user can purchase

Examples:
| email | gender | custFName | custLName | password | day | month | year | fname | lname | address1 | city | state | postalCode | mobileNo | alias |
| ahmed.etman129@gmail.com |male| Ahmed | Etman | 12345 | 1 | 8 | 1991 | Ahmed | Etman | Mohandessin | Giza | 9 | 24568 | 01143440577 | Shehab st. |
| dina.mohamed129@gmail.com |female| dina | mohamed | 12345 | 24 | 7 | 2000 | Dina | Mohamed | Mohandessin | Giza | 9 | 24568 | 01143440577 | Shehab st. |