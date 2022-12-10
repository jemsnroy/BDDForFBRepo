#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Facebook Login
 #Without Example Keyword
Scenario: Facebook login test 
		Given user is already on login page
    When url of login page is "https://www.facebook.com/"
    Then user enters "jemish1023@gmail.com" and "Sarang123@"
    Then user click on login button
    Then user is on home page
    Then user clicks on marketplace
    Then user is on marketplace page
    Then user navigates to back page
    Then user quits the facebook
    
    
#Scenario Outline: Facebook login test 
  #  Given user is already on login page
  #  When url of login page is "https://www.facebook.com/"
  #  Then user enters "<username>" and "<password>"
  #  Then user click on login button
   # Then user is on home page
    
#Examples: 
	#| username 						 | password   |
	#| jemish1023@gmail.com | Sarang123@ |
	#| tom								   | testing123	|