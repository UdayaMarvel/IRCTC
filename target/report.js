$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/IRCTC1.feature");
formatter.feature({
  "name": "Bus Tickets booking",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Bus"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Book a Flights",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Buses"
    }
  ]
});
formatter.step({
  "name": "User enters the from place \"\u003cFrom\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "From",
        "To"
      ]
    },
    {
      "cells": [
        "CHENNAI EGMORE",
        "Delhi"
      ]
    }
  ]
});
formatter.background({
  "name": "Launching the application",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the IRCTC application \"https://www.irctc.co.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.co.irctc.stepDefinition.General.launch_the_irctc_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book a Flights",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Bus"
    },
    {
      "name": "@Buses"
    }
  ]
});
formatter.step({
  "name": "User enters the from place \"CHENNAI EGMORE\"",
  "keyword": "When "
});
formatter.match({
  "location": "in.co.irctc.stepDefinition.TrainTickets.user_enters_the_from_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});