Feature: Login to application with multiple users

@Snehal_1
  Scenario Outline: Login to ecomm application
    Given ZAB User enters url "https://admin-demo.nopcommerce.com/admin/"
    When ZAB User enters login credentials as '<emails>' and '<passwords>'
         
    When ZAB user click on login button
    Then ZAB Validate user successfully logged in application
	
		Examples:
		
      | emails              | passwords |
      | admin@yourstore.com | admin     |
      ##| snehal@gmail.com    | xyz@123   |
   
 @Snehal_2     
   Scenario: Default status of checkbox
    Given ZAB User enters url "https://admin-demo.nopcommerce.com/admin/"
    Then ZAB validate remember_me checkbox status