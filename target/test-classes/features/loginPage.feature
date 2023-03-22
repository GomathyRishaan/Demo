Feature: Adactin Hotel page Validation

Scenario: End to end credentials

Given User is on Adactin Login page
When User enter the username, password, and clicks on login
And  User enter the location, hotels, room type, number of rooms, 
     adults per room, children per room and clicks on search in seach hotel page
And  User clicks on select radio button and clicks on continue in the select hotel page
And  User enter the first name, last name, billing address, credit card no, 
     credit card type, expiry date, cvv no and clicks on book now in the book a hotel page
Then Use verify the error message