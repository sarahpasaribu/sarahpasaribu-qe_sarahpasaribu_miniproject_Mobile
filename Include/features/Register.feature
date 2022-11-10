@register
Feature: Register
  User want to register account to Alta Shop Mobile

  @tag1
  Scenario Outline: Successfully Register
  	Given Open the app mobile
  	And I click login icon 
  	And I click register
    And I input the fullname <fullname> field
    When I input the email <email> field
    And I input the valid password <password> field
    Then I click the register button1

    Examples: 
      | fullname  			| email 				| password  |
      | Oktaviani	| perpus@gmail.com | Intel |
      | Oktaviani	| perpus@gmail.com | Intel |
      | Oktaviani	| tangangmail.com | Intel |
      | Oktaviani	| colokan@gmailcom | Intel |