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
      "line": 1870,
      "value": "#ScenarioTest - Overtime_Parameter_Test Jenkins"
    }
  ],
  "line": 1872,
  "name": "Jenkins Test",
  "description": "",
  "id": "overtime-calculations;jenkins-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1871,
      "name": "@Jenkins_Test"
    }
  ]
});
formatter.step({
  "line": 1874,
  "name": "I am on Eastern Test Env - Front \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 1875,
  "name": "I Verify Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 1876,
  "name": "I Sign In as HR \"\u003cUser_Name\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 1877,
  "name": "I Verify Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 1878,
  "name": "I Click on Human Resource",
  "keyword": "And "
});
formatter.step({
  "line": 1879,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 1880,
  "name": "I Click on Retrieve Attendance",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 1881,
      "value": "#    And I Input Attendance Date \"\u003cDate1\u003e\""
    },
    {
      "line": 1882,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 1883,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 1884,
      "value": "#    And I Verify Hours Worked for Day one \"\u003cHrs_wrk_one\u003e\""
    },
    {
      "line": 1885,
      "value": "#    And I Click on Process Button"
    },
    {
      "line": 1886,
      "value": "#    And I Verify Success Message for Process Attendance"
    },
    {
      "line": 1887,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 1888,
      "value": "#    And I Click on Manage Overtime Hours"
    },
    {
      "line": 1889,
      "value": "#    And I Verify Manage Overtime Hours Page"
    },
    {
      "line": 1890,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 1891,
      "value": "#    And I Select Location \"\u003cLocation\u003e\""
    },
    {
      "line": 1892,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 1893,
      "value": "#    And I Input Date From and Date To \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 1894,
      "value": "#    And I Click on Query Overtime Hours"
    },
    {
      "line": 1895,
      "value": "#    And I Verify Hours Work in Manage OT \"\u003cHrs_wrk_one\u003e\" \"\u003cHrs_wrk_two\u003e\""
    },
    {
      "line": 1896,
      "value": "#    And I Verify Overtime Hours Rate One Point Five \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\""
    },
    {
      "line": 1897,
      "value": "#    And I Verify Overtime Hours Rate Two Point Zero \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\""
    },
    {
      "line": 1898,
      "value": "#    And I Verify Overtime Hours Rate Three Point Zero \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\""
    },
    {
      "line": 1899,
      "value": "#    And I Verify Overtime Hours Rate Sunday \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\""
    },
    {
      "line": 1900,
      "value": "#    And I Verify Overtime Hours Rate Public Holiday \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\""
    },
    {
      "line": 1901,
      "value": "#    And I Click on Save Button"
    },
    {
      "line": 1902,
      "value": "#    And I Verify Success Message for OT Saved"
    },
    {
      "line": 1903,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 1904,
      "value": "#    And I Click on Manage Overtime Hours and Meals"
    },
    {
      "line": 1905,
      "value": "#    And I Verify Manage Overtime Hours and Meals Page"
    },
    {
      "line": 1906,
      "value": "#    And I Input Date From and Date To in Manage Overtime and Meals \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 1907,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 1908,
      "value": "#    And I Select Location In Manage Overtime and Meals \"\u003cLocation\u003e\""
    },
    {
      "line": 1909,
      "value": "#    And I Select Employee Code In Manage Overtime and Meals \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 1910,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 1911,
      "value": "#    And I Verify Overtime Hours and Amount \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\" \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\" \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\" \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\" \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\" \"\u003cOT15Amt1\u003e\" \"\u003cOT15Amt2\u003e\" \"\u003cOT20Amt1\u003e\" \"\u003cOT20Amt2\u003e\" \"\u003cOT30Amt1\u003e\" \"\u003cOT30Amt2\u003e\" \"\u003cOTSUNPHAmt1\u003e\" \"\u003cOTSUNPHAmt2\u003e\" \"\u003cTotal_Amt1\u003e\" \"\u003cTotal_Amt2\u003e\" \"\u003cOff_Leave_amt1\u003e\" \"\u003cOff_Leave_amt2\u003e\""
    }
  ],
  "line": 1912,
  "name": "I Sign Out",
  "keyword": "And "
});
formatter.step({
  "line": 1913,
  "name": "I Verify Successful Sign Out",
  "keyword": "And "
});
formatter.examples({
  "line": 1915,
  "name": "",
  "description": "",
  "id": "overtime-calculations;jenkins-test;",
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
      "line": 1916,
      "id": "overtime-calculations;jenkins-test;;1"
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
      "line": 1917,
      "id": "overtime-calculations;jenkins-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 123200,
  "status": "passed"
});
formatter.before({
  "duration": 39600,
  "status": "passed"
});
formatter.scenario({
  "line": 1917,
  "name": "Jenkins Test",
  "description": "",
  "id": "overtime-calculations;jenkins-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Main_feature"
    },
    {
      "line": 1871,
      "name": "@Jenkins_Test"
    },
    {
      "line": 3,
      "name": "@Overtime"
    }
  ]
});
formatter.step({
  "line": 1874,
  "name": "I am on Eastern Test Env - Front \"Chrome\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 1875,
  "name": "I Verify Login Page",
  "keyword": "And "
});
formatter.step({
  "line": 1876,
  "name": "I Sign In as HR \"AAA\" \"Admin@123\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 1877,
  "name": "I Verify Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 1878,
  "name": "I Click on Human Resource",
  "keyword": "And "
});
formatter.step({
  "line": 1879,
  "name": "I Click on Attendance",
  "keyword": "And "
});
formatter.step({
  "line": 1880,
  "name": "I Click on Retrieve Attendance",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 1881,
      "value": "#    And I Input Attendance Date \"\u003cDate1\u003e\""
    },
    {
      "line": 1882,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 1883,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 1884,
      "value": "#    And I Verify Hours Worked for Day one \"\u003cHrs_wrk_one\u003e\""
    },
    {
      "line": 1885,
      "value": "#    And I Click on Process Button"
    },
    {
      "line": 1886,
      "value": "#    And I Verify Success Message for Process Attendance"
    },
    {
      "line": 1887,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 1888,
      "value": "#    And I Click on Manage Overtime Hours"
    },
    {
      "line": 1889,
      "value": "#    And I Verify Manage Overtime Hours Page"
    },
    {
      "line": 1890,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 1891,
      "value": "#    And I Select Location \"\u003cLocation\u003e\""
    },
    {
      "line": 1892,
      "value": "#    And I Select Employee Code \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 1893,
      "value": "#    And I Input Date From and Date To \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 1894,
      "value": "#    And I Click on Query Overtime Hours"
    },
    {
      "line": 1895,
      "value": "#    And I Verify Hours Work in Manage OT \"\u003cHrs_wrk_one\u003e\" \"\u003cHrs_wrk_two\u003e\""
    },
    {
      "line": 1896,
      "value": "#    And I Verify Overtime Hours Rate One Point Five \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\""
    },
    {
      "line": 1897,
      "value": "#    And I Verify Overtime Hours Rate Two Point Zero \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\""
    },
    {
      "line": 1898,
      "value": "#    And I Verify Overtime Hours Rate Three Point Zero \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\""
    },
    {
      "line": 1899,
      "value": "#    And I Verify Overtime Hours Rate Sunday \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\""
    },
    {
      "line": 1900,
      "value": "#    And I Verify Overtime Hours Rate Public Holiday \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\""
    },
    {
      "line": 1901,
      "value": "#    And I Click on Save Button"
    },
    {
      "line": 1902,
      "value": "#    And I Verify Success Message for OT Saved"
    },
    {
      "line": 1903,
      "value": "#    And I Click on Attendance"
    },
    {
      "line": 1904,
      "value": "#    And I Click on Manage Overtime Hours and Meals"
    },
    {
      "line": 1905,
      "value": "#    And I Verify Manage Overtime Hours and Meals Page"
    },
    {
      "line": 1906,
      "value": "#    And I Input Date From and Date To in Manage Overtime and Meals \"\u003cDate1\u003e\" \"\u003cDate2\u003e\""
    },
    {
      "line": 1907,
      "value": "#    And I Select Company Name"
    },
    {
      "line": 1908,
      "value": "#    And I Select Location In Manage Overtime and Meals \"\u003cLocation\u003e\""
    },
    {
      "line": 1909,
      "value": "#    And I Select Employee Code In Manage Overtime and Meals \"\u003cEmp_Code\u003e\""
    },
    {
      "line": 1910,
      "value": "#    And I Click on Query Button"
    },
    {
      "line": 1911,
      "value": "#    And I Verify Overtime Hours and Amount \"\u003cOT15Day1\u003e\" \"\u003cOT15Day2\u003e\" \"\u003cOT20Day1\u003e\" \"\u003cOT20Day2\u003e\" \"\u003cOT30Day1\u003e\" \"\u003cOT30Day2\u003e\" \"\u003cOTSUNDay1\u003e\" \"\u003cOTSUNDay2\u003e\" \"\u003cOTPHDay1\u003e\" \"\u003cOTPHDay2\u003e\" \"\u003cOT15Amt1\u003e\" \"\u003cOT15Amt2\u003e\" \"\u003cOT20Amt1\u003e\" \"\u003cOT20Amt2\u003e\" \"\u003cOT30Amt1\u003e\" \"\u003cOT30Amt2\u003e\" \"\u003cOTSUNPHAmt1\u003e\" \"\u003cOTSUNPHAmt2\u003e\" \"\u003cTotal_Amt1\u003e\" \"\u003cTotal_Amt2\u003e\" \"\u003cOff_Leave_amt1\u003e\" \"\u003cOff_Leave_amt2\u003e\""
    }
  ],
  "line": 1912,
  "name": "I Sign Out",
  "keyword": "And "
});
formatter.step({
  "line": 1913,
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
  "duration": 2638630200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifyLoginPage()"
});
formatter.result({
  "duration": 59483100,
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
  "duration": 923148500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifySuccessfulLogin()"
});
formatter.result({
  "duration": 1087202500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnHumanResource()"
});
formatter.result({
  "duration": 3577181900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnAttendance()"
});
formatter.result({
  "duration": 2186232400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iClickOnRetrieveAttendance()"
});
formatter.result({
  "duration": 136993300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iSignOut()"
});
formatter.result({
  "duration": 704517200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iVerifySuccessfulSignOut()"
});
formatter.result({
  "duration": 32193500,
  "status": "passed"
});
formatter.after({
  "duration": 1367919400,
  "status": "passed"
});
formatter.after({
  "duration": 172100,
  "status": "passed"
});
});