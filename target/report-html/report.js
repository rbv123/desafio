$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/make_purchase.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 3,
  "name": "Make a purchase",
  "description": "As a user\r\nI want to add products to cart\r\nTo make purchases",
  "id": "make-a-purchase",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14442880900,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I\u0027m accessing e-commerce",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter the email \"burgarelliraphael@hotmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the password \"teste\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select Sign in",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I view the logged user page",
  "keyword": "Then "
});
formatter.match({
  "location": "MakePurchaseSteps.iMAccessingECommerce()"
});
formatter.result({
  "duration": 7801027300,
  "status": "passed"
});
formatter.match({
  "location": "MakePurchaseSteps.iClickOnSignIn()"
});
formatter.result({
  "duration": 1574969800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "burgarelliraphael@hotmail.com",
      "offset": 19
    }
  ],
  "location": "MakePurchaseSteps.iEnterTheEmail(String)"
});
formatter.result({
  "duration": 877702100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste",
      "offset": 14
    }
  ],
  "location": "MakePurchaseSteps.thePassword(String)"
});
formatter.result({
  "duration": 100186600,
  "status": "passed"
});
formatter.match({
  "location": "MakePurchaseSteps.iSelectSignIn()"
});
formatter.result({
  "duration": 1494775200,
  "status": "passed"
});
formatter.match({
  "location": "MakePurchaseSteps.iViewTheLoggedUserPage()"
});
formatter.result({
  "duration": 38257100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Must make purchase",
  "description": "",
  "id": "make-a-purchase;must-make-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I select T-Shirts from the menu",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I add a product to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "do the whole validation process",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I make the purchase",
  "keyword": "Then "
});
formatter.match({
  "location": "MakePurchaseSteps.iSelectTShirtsFromTheMenu()"
});
formatter.result({
  "duration": 2857877000,
  "status": "passed"
});
formatter.match({
  "location": "MakePurchaseSteps.iAddAProductToTheCart()"
});
formatter.result({
  "duration": 2227150500,
  "status": "passed"
});
formatter.match({
  "location": "MakePurchaseSteps.doTheWholeValidationProcess()"
});
formatter.result({
  "duration": 11807382900,
  "status": "passed"
});
formatter.match({
  "location": "MakePurchaseSteps.iMakeThePurchase()"
});
formatter.result({
  "duration": 29308800,
  "status": "passed"
});
formatter.after({
  "duration": 528508800,
  "status": "passed"
});
formatter.after({
  "duration": 745776800,
  "status": "passed"
});
});