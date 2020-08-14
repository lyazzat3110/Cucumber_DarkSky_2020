$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 3,
  "name": "DarkSky  Feature",
  "description": "",
  "id": "darksky--feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@darkSky"
    }
  ]
});
formatter.before({
  "duration": 4860174185,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.verificationHomePageTitlte()"
});
formatter.result({
  "duration": 365956763,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify today\u0027s temperature",
  "description": "",
  "id": "darksky--feature;verify-today\u0027s-temperature",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@homePage"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on Today and expand it",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.expandTodayLine()"
});
formatter.result({
  "duration": 3163963246,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.showMaxAndMinTemp()"
});
formatter.result({
  "duration": 3488870064,
  "status": "passed"
});
formatter.after({
  "duration": 157117740,
  "status": "passed"
});
});