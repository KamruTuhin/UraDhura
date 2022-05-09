

Feature: prouduct checkout feature
@smoke
Scenario: validating that user can add and checkout product

Given user is on the product page
When user adds backpack in the cart
And user adds bike lightin the cart
Then checkout menu should be available with products
And user should be able to click on checkout
