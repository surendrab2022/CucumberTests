Feature: DataTableTest 

Scenario: Testing data table
Given I navigate to form
When I enter the following data
| Fields | Values |
| First Name | Tom |
| Last Name | Kenny |
| Email Address | someone@someone.com |
| Re-enter Email Address | someone@someone.com |
| Password | Password1 |
| Birthdate | 01 |
Then data is populated correctly