 @CartPage
 Feature: CucumberJava

    @AddItem
    Scenario: Verify if user can add an item to cart
         Given User have opened the browser
         When User opens the website
         And User enters valid username standard_user and password secret_sauce
         And User clicks the login button
         And User adds an item to cart
         Then item should be added to cart

    @RemoveItem
    Scenario: Verify if user can add and then remove an item from cart
      Given User have opened the browser
      When User opens the website
      And User enters valid username standard_user and password secret_sauce
      And User clicks the login button
      And User adds an item to cart
      And User removes the item from cart
      Then item should be removed from cart