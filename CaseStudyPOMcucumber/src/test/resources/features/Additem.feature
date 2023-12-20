Feature: User Login feature


Background: Valid Login
Given User is on Login Page
When User enters  "muskan12"  and "Muskan12" 
Then User Should on Home page

Scenario: Add item to cart
When User add item to cart 
Then Item must be added