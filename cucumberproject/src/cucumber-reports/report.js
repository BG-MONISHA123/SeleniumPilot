$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeliton/Casestudy1.feature");
formatter.feature({
  "name": "Casestudy1.feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "admin login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the URL of TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "AddproductStepDefination.the_URL_of_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The admin enters login data",
  "keyword": "When "
});
formatter.match({
  "location": "AddproductStepDefination.the_admin_enters_login_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin is in Admin Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AddproductStepDefination.admin_is_in_Admin_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on add product",
  "keyword": "Given "
});
formatter.match({
  "location": "AddproductStepDefination.clicks_on_add_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills data to add product",
  "keyword": "When "
});
formatter.match({
  "location": "AddproductStepDefination.fills_data_to_add_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Product sucessfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddproductStepDefination.the_Product_sucessfully_added()"
});
formatter.result({
  "status": "passed"
});
});