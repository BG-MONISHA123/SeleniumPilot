Feature: casestudy2.Feature
Scenario: The one when the user added atleast one product to the cart and performing succesfull payment.
    Given user login select product
    When Lalitha added a wear to the cart
    And checkout for payment 
    And fills transaction details
    Then the product is succesfully ordered