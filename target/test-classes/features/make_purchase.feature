# language: en

Feature: Make a purchase
As a user
I want to add products to cart
To make purchases	

Background: 
Given I'm accessing e-commerce
And I click on Sign in
When I enter the email "burgarelliraphael@hotmail.com"
And the password "teste"
And I select Sign in
Then I view the logged user page

Scenario: Must make purchase
When I select T-Shirts from the menu
And I add a product to the cart
And do the whole validation process
Then I make the purchase