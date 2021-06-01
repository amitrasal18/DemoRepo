$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to application",
  "description": "As a registered user, I want to log on to application then I can see home screen",
  "id": "login-to-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Logon to the application",
  "description": "",
  "id": "login-to-application;logon-to-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login-to-application;logon-to-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "login-to-application;logon-to-the-application;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 17,
      "id": "login-to-application;logon-to-the-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Logon to the application",
  "description": "",
  "id": "login-to-application;logon-to-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 26870675300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 153122600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 13
    },
    {
      "val": "secret_sauce",
      "offset": 33
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 342843000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 186095100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 152966800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 893039100,
  "status": "passed"
});
});