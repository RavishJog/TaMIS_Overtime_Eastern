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
      "line": 70,
      "value": "#Scenario2 - Overtime_Scenarios"
    }
  ],
  "line": 72,
  "name": "Scenarios Mauritian and Expatriates working Overtime",
  "description": "",
  "id": "overtime-calculations;scenarios-mauritian-and-expatriates-working-overtime",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 71,
      "name": "@Overtime_Amount_Scenarios"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "I am on Eastern Test Env - Front \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "I Verify Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "I Sign In as HR \"\u003cUser_Name\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "I Verify Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "I Click on Human Resource",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "I Click on Retrieve Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "I Input Attendance Date \"\u003cDate1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "I Select Employee Code \"\u003cEmp_Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "I Click on Query Button",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "I Verify Hours Worked for Day one \"\u003cHrs_wrk_one\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "I Click on Process Button",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "I Verify Success Message for Process Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "I Click on Manage Overtime Hours",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "I Verify Manage Overtime Hours Page",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I Select Company Name",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "I Select Location \"\u003cLocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "I Select Employee Code \"\u003cEmp_Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I Input Date From and Date To \"\u003cDate1\u003e\" \"\u003cDate2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "I Click on Query Overtime Hours",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "I Verify Hours Work in Manage OT \"\u003cHrs_wrk_one\u003e\" \"\u003cHrs_wrk_two\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "I Verify Overtime Hours Rate One Point Five \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "I Verify Overtime Hours Rate Two Point Zero \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "I Verify Overtime Hours Rate Three Point Zero \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "I Verify Overtime Hours Rate Sunday \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "I Verify Overtime Hours Rate Public Holiday \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "I Click on Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "I Verify Success Message for OT Saved",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "I Click on Manage Overtime Hours and Meals",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I Verify Manage Overtime Hours and Meals Page",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "I Input Date From and Date To \"\u003cDate1\u003e\" \"\u003cDate2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "I Select Company Name",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "I Select Location \"\u003cLocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "I Select Employee Code \"\u003cEmp_Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "I Click on Query Button",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "I Verify Overtime Hours and Amount \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\" \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\" \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\" \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\" \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\" \"\u003cOT15Amt1\u003e\" \"\u003cOT15Amt2\u003e\" \"\u003cOT20Amt1\u003e\" \"\u003cOT20Amt2\u003e\" \"\u003cOT30Amt1\u003e\" \"\u003cOT30Amt2\u003e\" \"\u003cOTSUNPHAmt1\u003e\" \"\u003cOTSUNPHAmt2\u003e\" \"\u003cTotal_Amt1\u003e\" \"\u003cTotal_Amt2\u003e\" \"\u003cOff_Leave_amt1\u003e\" \"\u003cOff_Leave_amt2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "I Sign Out",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "I Verify Successful Sign Out",
  "keyword": "And "
});
formatter.examples({
  "line": 115,
  "name": "",
  "description": "",
  "id": "overtime-calculations;scenarios-mauritian-and-expatriates-working-overtime;",
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
      "line": 116,
      "id": "overtime-calculations;scenarios-mauritian-and-expatriates-working-overtime;;1"
    },
    {
      "cells": [
        "1",
        "Chrome",
        "AAA",
        "Admin@123",
        "07-Jan-2025",
        "75",
        "16.00",
        "1.00",
        "Adm",
        "08-Jan-2025",
        "6.75",
        "1.00",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "1,465.53",
        "217.12",
        "",
        "",
        "",
        "",
        "",
        "",
        "1,465.53",
        "217.12",
        "",
        ""
      ],
      "line": 117,
      "id": "overtime-calculations;scenarios-mauritian-and-expatriates-working-overtime;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 90300,
  "status": "passed"
});
formatter.before({
  "duration": 36700,
  "status": "passed"
});
formatter.scenario({
  "line": 117,
  "name": "Scenarios Mauritian and Expatriates working Overtime",
  "description": "",
  "id": "overtime-calculations;scenarios-mauritian-and-expatriates-working-overtime;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 71,
      "name": "@Overtime_Amount_Scenarios"
    },
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
formatter.step({
  "line": 74,
  "name": "I am on Eastern Test Env - Front \"Chrome\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "I Verify Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "I Sign In as HR \"AAA\" \"Admin@123\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "I Verify Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "I Click on Human Resource",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "I Click on Retrieve Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "I Input Attendance Date \"07-Jan-2025\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "I Select Employee Code \"75\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "I Click on Query Button",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "I Verify Hours Worked for Day one \"16.00\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "I Click on Process Button",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "I Verify Success Message for Process Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "I Click on Manage Overtime Hours",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "I Verify Manage Overtime Hours Page",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I Select Company Name",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "I Select Location \"Adm\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "I Select Employee Code \"75\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I Input Date From and Date To \"07-Jan-2025\" \"08-Jan-2025\"",
  "matchedColumns": [
    4,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "I Click on Query Overtime Hours",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "I Verify Hours Work in Manage OT \"16.00\" \"1.00\"",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "I Verify Overtime Hours Rate One Point Five \"6.75\" \"1.00\"",
  "matchedColumns": [
    10,
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "I Verify Overtime Hours Rate Two Point Zero \"\" \"\"",
  "matchedColumns": [
    12,
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "I Verify Overtime Hours Rate Three Point Zero \"\" \"\"",
  "matchedColumns": [
    14,
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "I Verify Overtime Hours Rate Sunday \"\" \"\"",
  "matchedColumns": [
    16,
    17
  ],
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "I Verify Overtime Hours Rate Public Holiday \"\" \"\"",
  "matchedColumns": [
    18,
    19
  ],
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "I Click on Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "I Verify Success Message for OT Saved",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "I Click on Manage Overtime Hours and Meals",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I Verify Manage Overtime Hours and Meals Page",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "I Input Date From and Date To \"07-Jan-2025\" \"08-Jan-2025\"",
  "matchedColumns": [
    4,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "I Select Company Name",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "I Select Location \"Adm\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "I Select Employee Code \"75\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "I Click on Query Button",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "I Verify Overtime Hours and Amount \"6.75\" \"1.00\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"\" \"1,465.53\" \"217.12\" \"\" \"\" \"\" \"\" \"\" \"\" \"1,465.53\" \"217.12\" \"\" \"\"",
  "matchedColumns": [
    10,
    11,
    12,
    13,
    14,
    15,
    16,
    17,
    18,
    19,
    20,
    21,
    22,
    23,
    24,
    25,
    26,
    27,
    28,
    29,
    30,
    31
  ],
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "I Sign Out",
  "keyword": "And "
});
formatter.step({
  "line": 113,
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
  "duration": 4218695900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifyLoginPage()"
});
formatter.result({
  "duration": 64532200,
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
  "duration": 235133700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifySuccessfulLogin()"
});
formatter.result({
  "duration": 595003500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnHumanResource()"
});
formatter.result({
  "duration": 71206900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnAttendance()"
});
formatter.result({
  "duration": 3436387400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnRetrieveAttendance()"
});
formatter.result({
  "duration": 92896700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07-Jan-2025",
      "offset": 25
    }
  ],
  "location": "Steps.iInputAttendanceDate(String)"
});
formatter.result({
  "duration": 715164100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "75",
      "offset": 24
    }
  ],
  "location": "Steps.iSelectEmployeeCode(String)"
});
formatter.result({
  "duration": 180058000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnQueryButton()"
});
formatter.result({
  "duration": 5140328700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16.00",
      "offset": 35
    }
  ],
  "location": "Steps.iVerifyHoursWorkedForDayOne(String)"
});
formatter.result({
  "duration": 74381900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnProcessButton()"
});
formatter.result({
  "duration": 66914900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifySuccessMessageForProcessAttendance()"
});
formatter.result({
  "duration": 578940300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnAttendance()"
});
formatter.result({
  "duration": 2131140100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnManageOvertimeHours()"
});
formatter.result({
  "duration": 2549321100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifyManageOvertimeHoursPage()"
});
formatter.result({
  "duration": 75585900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iSelectCompanyName()"
});
formatter.result({
  "duration": 134612800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adm",
      "offset": 19
    }
  ],
  "location": "Steps.iSelectLocation(String)"
});
formatter.result({
  "duration": 2188028000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "75",
      "offset": 24
    }
  ],
  "location": "Steps.iSelectEmployeeCode(String)"
});
formatter.result({
  "duration": 138226100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07-Jan-2025",
      "offset": 31
    },
    {
      "val": "08-Jan-2025",
      "offset": 45
    }
  ],
  "location": "Steps.iInputDateFromAndDateTo(String,String)"
});
formatter.result({
  "duration": 5179248400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnQueryOvertimeHours()"
});
formatter.result({
  "duration": 3104457900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16.00",
      "offset": 34
    },
    {
      "val": "1.00",
      "offset": 42
    }
  ],
  "location": "Steps.iVerifyHoursWorkInManageOT(String,String)"
});
formatter.result({
  "duration": 76771700,
  "error_message": "java.lang.AssertionError: 15.75 expected [16.00] but found [Hours Work 1 is NOT good]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:190)\r\n\tat stepdefinition.Steps.iVerifyHoursWorkInManageOT(Steps.java:623)\r\n\tat ✽.And I Verify Hours Work in Manage OT \"16.00\" \"1.00\"(features/Login.feature:95)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "6.75",
      "offset": 45
    },
    {
      "val": "1.00",
      "offset": 52
    }
  ],
  "location": "Steps.iVerifyOvertimeHoursRateOnePointFive(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 45
    },
    {
      "val": "",
      "offset": 48
    }
  ],
  "location": "Steps.iVerifyOvertimeHoursRateTwoPointZero(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 47
    },
    {
      "val": "",
      "offset": 50
    }
  ],
  "location": "Steps.iVerifyOvertimeHoursRateThreePointZero(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 37
    },
    {
      "val": "",
      "offset": 40
    }
  ],
  "location": "Steps.iVerifyOvertimeHoursRateSunday(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 45
    },
    {
      "val": "",
      "offset": 48
    }
  ],
  "location": "Steps.iVerifyOvertimeHoursRatePublicHoliday(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iClickOnSaveButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iVerifySuccessMessageForOTSaved()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iClickOnAttendance()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iClickOnManageOvertimeHoursAndMeals()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iVerifyManageOvertimeHoursAndMealsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "07-Jan-2025",
      "offset": 31
    },
    {
      "val": "08-Jan-2025",
      "offset": 45
    }
  ],
  "location": "Steps.iInputDateFromAndDateTo(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iSelectCompanyName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Adm",
      "offset": 19
    }
  ],
  "location": "Steps.iSelectLocation(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "75",
      "offset": 24
    }
  ],
  "location": "Steps.iSelectEmployeeCode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iClickOnQueryButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "6.75",
      "offset": 36
    },
    {
      "val": "1.00",
      "offset": 43
    },
    {
      "val": "",
      "offset": 50
    },
    {
      "val": "",
      "offset": 53
    },
    {
      "val": "",
      "offset": 56
    },
    {
      "val": "",
      "offset": 59
    },
    {
      "val": "",
      "offset": 62
    },
    {
      "val": "",
      "offset": 65
    },
    {
      "val": "",
      "offset": 68
    },
    {
      "val": "",
      "offset": 71
    },
    {
      "val": "1,465.53",
      "offset": 74
    },
    {
      "val": "217.12",
      "offset": 85
    },
    {
      "val": "",
      "offset": 94
    },
    {
      "val": "",
      "offset": 97
    },
    {
      "val": "",
      "offset": 100
    },
    {
      "val": "",
      "offset": 103
    },
    {
      "val": "",
      "offset": 106
    },
    {
      "val": "",
      "offset": 109
    },
    {
      "val": "1,465.53",
      "offset": 112
    },
    {
      "val": "217.12",
      "offset": 123
    },
    {
      "val": "",
      "offset": 132
    },
    {
      "val": "",
      "offset": 135
    }
  ],
  "location": "Steps.iVerifyOvertimeHoursAndAmount(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iSignOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.iVerifySuccessfulSignOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1208834800,
  "status": "passed"
});
formatter.after({
  "duration": 347900,
  "status": "passed"
});
});