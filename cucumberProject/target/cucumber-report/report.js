$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginData.feature");
formatter.feature({
  "line": 1,
  "name": "login panel data testing with multiple data",
  "description": "",
  "id": "login-panel-data-testing-with-multiple-data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "validating login panel with credential credentials",
  "description": "",
  "id": "login-panel-data-testing-with-multiple-data;validating-login-panel-with-credential-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@uat"
    },
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters valid user name \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters valid password as\"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be on the account page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should close the browser",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "abcg",
        "bhjkb"
      ],
      "line": 11
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 12
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce"
      ],
      "line": 13
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ],
      "line": 14
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_user"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
});