$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/GoogleSearch.feature");
formatter.feature({
  "name": "Google search feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.scenario({
  "name": "Making sure google search is working as expected",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@google"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters flowers",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchSteps.user_enters_flowers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchSteps.user_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see results related to flowers",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.user_should_see_results_related_to_flowers()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Keyword flowers was not located in title\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat steps.GoogleSearchSteps.user_should_see_results_related_to_flowers(GoogleSearchSteps.java:33)\r\n\tat ✽.user should see results related to flowers(src/test/java/features/GoogleSearch.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});