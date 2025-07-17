$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Overtime"
    }
  ],
  "line": 4,
  "name": "Overtime_Calculations",
  "description": "",
  "id": "overtime-calculations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@Main_feature"
    },
    {
      "line": 3,
      "name": "@Overtime"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 448,
      "value": "#Scenario9 - Overtime_Parameter_9_Mauritian"
    }
  ],
  "line": 450,
  "name": "Overtime_Parameter_9_Mauritian",
  "description": "",
  "id": "overtime-calculations;overtime-parameter-9-mauritian",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 449,
      "name": "@Overtime_Parameter_9_Mauritian"
    }
  ]
});
formatter.step({
  "line": 452,
  "name": "I am on Eastern Test Env - Front \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 453,
  "name": "I Verify Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 454,
  "name": "I Sign In as HR \"\u003cUser_Name\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 455,
  "name": "I Verify Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 456,
  "name": "I Click on Human Resource",
  "keyword": "And "
});
formatter.step({
  "line": 457,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 458,
  "name": "I Click on Retrieve Attendance",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 459,
      "value": "#    And I Input Attendance Date \"\u003cDate1\u003e\""
    },
    {
      "line": 460,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 461,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 462,
      "value": "#    And I Verify Hours Worked for Day one \"\u003cHrs_wrk_one\u003e\""
    },
    {
      "line": 463,
      "value": "#    And I Click on Process Button"
    },
    {
      "line": 464,
      "value": "#    And I Verify Success Message for Process Attendance"
    },
    {
      "line": 465,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 466,
      "value": "#    And I Click on Manage Overtime Hours"
    },
    {
      "line": 467,
      "value": "#    And I Verify Manage Overtime Hours Page"
    },
    {
      "line": 468,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 469,
      "value": "#    And I Select Location \"\u003cLocation\u003e\""
    },
    {
      "line": 470,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 471,
      "value": "#    And I Input Date From and Date To \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 472,
      "value": "#    And I Click on Query Overtime Hours"
    },
    {
      "line": 473,
      "value": "#    And I Verify Hours Work in Manage OT \"\u003cHrs_wrk_one\u003e\" \"\u003cHrs_wrk_two\u003e\""
    },
    {
      "line": 474,
      "value": "#    And I Verify Overtime Hours Rate One Point Five \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\""
    },
    {
      "line": 475,
      "value": "#    And I Verify Overtime Hours Rate Two Point Zero \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\""
    },
    {
      "line": 476,
      "value": "#    And I Verify Overtime Hours Rate Three Point Zero \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\""
    },
    {
      "line": 477,
      "value": "#    And I Verify Overtime Hours Rate Sunday \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\""
    },
    {
      "line": 478,
      "value": "#    And I Verify Overtime Hours Rate Public Holiday \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\""
    },
    {
      "line": 479,
      "value": "#    And I Click on Save Button"
    },
    {
      "line": 480,
      "value": "#    And I Verify Success Message for OT Saved"
    },
    {
      "line": 481,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 482,
      "value": "#    And I Click on Manage Overtime Hours and Meals"
    },
    {
      "line": 483,
      "value": "#    And I Verify Manage Overtime Hours and Meals Page"
    },
    {
      "line": 484,
      "value": "#    And I Input Date From and Date To in Manage Overtime and Meals \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 485,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 486,
      "value": "#    And I Select Location In Manage Overtime and Meals \"\u003cLocation\u003e\""
    },
    {
      "line": 487,
      "value": "#    And I Select Employee Code In Manage Overtime and Meals \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 488,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 489,
      "value": "#    And I Verify Overtime Hours and Amount \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\" \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\" \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\" \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\" \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\" \"\u003cOT15Amt1\u003e\" \"\u003cOT15Amt2\u003e\" \"\u003cOT20Amt1\u003e\" \"\u003cOT20Amt2\u003e\" \"\u003cOT30Amt1\u003e\" \"\u003cOT30Amt2\u003e\" \"\u003cOTSUNPHAmt1\u003e\" \"\u003cOTSUNPHAmt2\u003e\" \"\u003cTotal_Amt1\u003e\" \"\u003cTotal_Amt2\u003e\" \"\u003cOff_Leave_amt1\u003e\" \"\u003cOff_Leave_amt2\u003e\""
    }
  ],
  "line": 490,
  "name": "I Sign Out",
  "keyword": "And "
});
formatter.step({
  "line": 491,
  "name": "I Verify Successful Sign Out",
  "keyword": "And "
});
formatter.examples({
  "line": 493,
  "name": "",
  "description": "",
  "id": "overtime-calculations;overtime-parameter-9-mauritian;",
  "rows": [
    {
      "cells": [
        "SCN",
        "Browser",
        "User_Name",
        "Password",
        "Date1",
        "Emp_Code",
        "Hrs_wrk_one",
        "Hrs_wrk_two",
        "Location",
        "Date2",
        "OT15Day1",
        "OT15Day2",
        "OT20Day1",
        "OT20Day2",
        "OT30Day1",
        "OT30Day2",
        "OTSUNDay1",
        "OTSUNDay2",
        "OTPHDay1",
        "OTPHDay2",
        "OT15Amt1",
        "OT15Amt2",
        "OT20Amt1",
        "OT20Amt2",
        "OT30Amt1",
        "OT30Amt2",
        "OTSUNPHAmt1",
        "OTSUNPHAmt2",
        "Total_Amt1",
        "Total_Amt2",
        "Off_Leave_amt1",
        "Off_Leave_amt2"
      ],
      "line": 494,
      "id": "overtime-calculations;overtime-parameter-9-mauritian;;1"
    },
    {
      "cells": [
        "9",
        "Chrome",
        "AAA",
        "Admin@123",
        "29-Jan-2025",
        "021",
        "9.08",
        "null",
        "Reg",
        "29-Jan-2025",
        "null",
        "null",
        "null",
        "null",
        "0.08",
        "null",
        "null",
        "null",
        "8.08",
        "null",
        "null",
        "null",
        "null",
        "null",
        "57.44",
        "null",
        "3,675.90",
        "null",
        "3,733.33",
        "null",
        "null",
        "null"
      ],
      "line": 495,
      "id": "overtime-calculations;overtime-parameter-9-mauritian;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 95300,
  "status": "passed"
});
formatter.before({
  "duration": 52300,
  "status": "passed"
});
formatter.scenario({
  "line": 495,
  "name": "Overtime_Parameter_9_Mauritian",
  "description": "",
  "id": "overtime-calculations;overtime-parameter-9-mauritian;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Main_feature"
    },
    {
      "line": 3,
      "name": "@Overtime"
    },
    {
      "line": 449,
      "name": "@Overtime_Parameter_9_Mauritian"
    }
  ]
});
formatter.step({
  "line": 452,
  "name": "I am on Eastern Test Env - Front \"Chrome\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 453,
  "name": "I Verify Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 454,
  "name": "I Sign In as HR \"AAA\" \"Admin@123\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 455,
  "name": "I Verify Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 456,
  "name": "I Click on Human Resource",
  "keyword": "And "
});
formatter.step({
  "line": 457,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 458,
  "name": "I Click on Retrieve Attendance",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 459,
      "value": "#    And I Input Attendance Date \"\u003cDate1\u003e\""
    },
    {
      "line": 460,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 461,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 462,
      "value": "#    And I Verify Hours Worked for Day one \"\u003cHrs_wrk_one\u003e\""
    },
    {
      "line": 463,
      "value": "#    And I Click on Process Button"
    },
    {
      "line": 464,
      "value": "#    And I Verify Success Message for Process Attendance"
    },
    {
      "line": 465,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 466,
      "value": "#    And I Click on Manage Overtime Hours"
    },
    {
      "line": 467,
      "value": "#    And I Verify Manage Overtime Hours Page"
    },
    {
      "line": 468,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 469,
      "value": "#    And I Select Location \"\u003cLocation\u003e\""
    },
    {
      "line": 470,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 471,
      "value": "#    And I Input Date From and Date To \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 472,
      "value": "#    And I Click on Query Overtime Hours"
    },
    {
      "line": 473,
      "value": "#    And I Verify Hours Work in Manage OT \"\u003cHrs_wrk_one\u003e\" \"\u003cHrs_wrk_two\u003e\""
    },
    {
      "line": 474,
      "value": "#    And I Verify Overtime Hours Rate One Point Five \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\""
    },
    {
      "line": 475,
      "value": "#    And I Verify Overtime Hours Rate Two Point Zero \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\""
    },
    {
      "line": 476,
      "value": "#    And I Verify Overtime Hours Rate Three Point Zero \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\""
    },
    {
      "line": 477,
      "value": "#    And I Verify Overtime Hours Rate Sunday \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\""
    },
    {
      "line": 478,
      "value": "#    And I Verify Overtime Hours Rate Public Holiday \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\""
    },
    {
      "line": 479,
      "value": "#    And I Click on Save Button"
    },
    {
      "line": 480,
      "value": "#    And I Verify Success Message for OT Saved"
    },
    {
      "line": 481,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 482,
      "value": "#    And I Click on Manage Overtime Hours and Meals"
    },
    {
      "line": 483,
      "value": "#    And I Verify Manage Overtime Hours and Meals Page"
    },
    {
      "line": 484,
      "value": "#    And I Input Date From and Date To in Manage Overtime and Meals \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 485,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 486,
      "value": "#    And I Select Location In Manage Overtime and Meals \"\u003cLocation\u003e\""
    },
    {
      "line": 487,
      "value": "#    And I Select Employee Code In Manage Overtime and Meals \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 488,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 489,
      "value": "#    And I Verify Overtime Hours and Amount \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\" \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\" \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\" \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\" \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\" \"\u003cOT15Amt1\u003e\" \"\u003cOT15Amt2\u003e\" \"\u003cOT20Amt1\u003e\" \"\u003cOT20Amt2\u003e\" \"\u003cOT30Amt1\u003e\" \"\u003cOT30Amt2\u003e\" \"\u003cOTSUNPHAmt1\u003e\" \"\u003cOTSUNPHAmt2\u003e\" \"\u003cTotal_Amt1\u003e\" \"\u003cTotal_Amt2\u003e\" \"\u003cOff_Leave_amt1\u003e\" \"\u003cOff_Leave_amt2\u003e\""
    }
  ],
  "line": 490,
  "name": "I Sign Out",
  "keyword": "And "
});
formatter.step({
  "line": 491,
  "name": "I Verify Successful Sign Out",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 34
    }
  ],
  "location": "Steps.iAmOnEasternTestEnvFront(String)"
});
formatter.result({
  "duration": 2712328900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifyLoginPage()"
});
formatter.result({
  "duration": 78027600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 17
    },
    {
      "val": "Admin@123",
      "offset": 23
    }
  ],
  "location": "Steps.iSignInAsHR(String,String)"
});
formatter.result({
  "duration": 368508200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifySuccessfulLogin()"
});
formatter.result({
  "duration": 570814400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnHumanResource()"
});
formatter.result({
  "duration": 1499931700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnAttendance()"
});
formatter.result({
  "duration": 2268460700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnRetrieveAttendance()"
});
formatter.result({
  "duration": 123741000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iSignOut()"
});
formatter.result({
  "duration": 816667400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifySuccessfulSignOut()"
});
formatter.result({
  "duration": 25428900,
  "status": "passed"
});
formatter.after({
  "duration": 1379501000,
  "status": "passed"
});
formatter.after({
  "duration": 126300,
  "status": "passed"
});
});