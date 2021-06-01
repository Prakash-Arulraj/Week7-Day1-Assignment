Feature: Create Lead To Leaftaps Application 

Background: 


	Given Enter as Username 'DemoSalesManager' 
	And Enter as Password 'crmsfa' 
	When Click Login Button 
	And Click crmsfa Link 
	Then Click Lead Button 
	
	
Scenario Outline: Fill Mandatory Steps 
	When Click Create Lead Button 
	Then Type Company Name <companyname> 
	And Type First Name <firstname> 
	And Type Last Name <lastname> 
	And Click Create Lead 
	Then Verify Create Lead 
	
	
	Examples: 
	
		|companyname|firstname|lastname|
		|Testleaf|Prakash|Arulraj|