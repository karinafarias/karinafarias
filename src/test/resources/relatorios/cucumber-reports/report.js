$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchInAmazon.feature");
formatter.feature({
  "line": 2,
  "name": "Wex challenge",
  "description": "",
  "id": "wex-challenge",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WexChallenge"
    }
  ]
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Open Browser on \"www.google.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Search for \"Amazon Brasil\" and Search",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"www.amazon.com.br\" Through The Search Page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Search For \"Iphone\" Using The Search Bar",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "www.google.com",
      "offset": 17
    }
  ],
  "location": "SearchInAmazonSteps.openBrowserOn(String)"
});
formatter.result({
  "duration": 1394649300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon Brasil",
      "offset": 12
    }
  ],
  "location": "SearchInAmazonSteps.searchForAndSearch(String)"
});
formatter.result({
  "duration": 1548428200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "www.amazon.com.br",
      "offset": 13
    }
  ],
  "location": "SearchInAmazonSteps.navigateToThroughTheSearchPage(String)"
});
formatter.result({
  "duration": 1515649200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 12
    }
  ],
  "location": "SearchInAmazonSteps.searchForUsingTheSearchBar(String)"
});
formatter.result({
  "duration": 1958383400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Products Different Than The Searched Product Should Be Cheaper Than The Searched Product",
  "description": "",
  "id": "wex-challenge;products-different-than-the-searched-product-should-be-cheaper-than-the-searched-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@S3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "Find Products Which Are Not \"Iphone\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Make Sure All Found Products Are Cheaper Than The Cheapest \"Iphone\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 29
    }
  ],
  "location": "SearchInAmazonSteps.findProductsWhichAreNot(String)"
});
formatter.result({
  "duration": 2489787900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone",
      "offset": 60
    }
  ],
  "location": "SearchInAmazonSteps.makeSureAllFoundProductsAreCheaperThanTheCheapest(String)"
});
formatter.result({
  "duration": 1714400,
  "error_message": "java.lang.AssertionError: The price of another product is greater than the Iphone\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat paginas.PageAmazon.validateValueFoundProductsAreCheaperThanThe(PageAmazon.java:120)\r\n\tat steps.SearchInAmazonSteps.makeSureAllFoundProductsAreCheaperThanTheCheapest(SearchInAmazonSteps.java:72)\r\n\tat ✽.Then Make Sure All Found Products Are Cheaper Than The Cheapest \"Iphone\"(SearchInAmazon.feature:24)\r\n",
  "status": "failed"
});
});