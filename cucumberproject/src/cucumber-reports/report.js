$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeliton/casestudy2.feature");
formatter.feature({
  "name": "casestudy2.Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The one when the user added atleast one product to the cart and performing succesfull payment.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login select product",
  "keyword": "Given "
});
formatter.match({
  "location": "AddcartStepDefination.user_login_select_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lalitha added a wear to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "AddcartStepDefination.lalitha_added_a_wear_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout for payment",
  "keyword": "And "
});
formatter.match({
  "location": "AddcartStepDefination.checkout_for_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills transaction details",
  "keyword": "And "
});
formatter.match({
  "location": "AddcartStepDefination.fills_transaction_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is succesfully ordered",
  "keyword": "Then "
});
formatter.match({
  "location": "AddcartStepDefination.the_product_is_succesfully_ordered()"
});
formatter.result({
  "status": "passed"
});
});