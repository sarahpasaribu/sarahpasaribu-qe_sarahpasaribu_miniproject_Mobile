@login
Feature: Login


  @login1
  Scenario Outline: Login
    Given User navigates to login page
    When User input <Email> <password>
    And User click button login

    Examples: 
      | Email  | password |  
      | sarah123@gmail.com | Windows15 | 
      | sarah123gmail.com | Windows15 |
      | sarah123@gmail.com | Windows |  
      | sarah123gmail.com | Windows | 
