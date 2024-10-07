Feature: Login feature


  @Test1
  Scenario: Successfully Login
  
      Given I am on the login page
           
      When I enter the valid credentials
      
      Then I should be redirected to dashboard or welcome page
      
     
      
  @Test2 
  Scenario: Unsuccessfully Login
  
      Given I am on the login page
           
      When I enter the invalid credentials
      
      Then I should see an error message
      
      And close the browser