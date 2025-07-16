#Overtime

@Main_feature @Overtime
Feature: Overtime_Calculations

  #Scenario1 - Overtime_Parameter
  @Overtime_Amount_Parameter
  Scenario Outline: Overtime Calculations based on Parameters

    Given I am on Eastern Test Env - Front "<Browser>"
    And I Verify Login Page
    And I Sign In as HR "<User_Name>" "<Password>"
    And I Verify Successful Login
    And I Click on Human Resource
    And I Click on Attendance
    And I Click on Retrieve Attendance
    And I Input Attendance Date "<Date1>"
    And I Select Employee Code "<Emp_Code>"
    And I Click on Query Button
    And I Verify Hours Worked for Day one "<Hrs_wrk_one>"
    And I Click on Process Button
    And I Verify Success Message for Process Attendance
    And I Click on Attendance
    And I Click on Manage Overtime Hours
    And I Verify Manage Overtime Hours Page
    And I Select Company Name
    And I Select Location "<Location>"
    And I Select Employee Code "<Emp_Code>"
    And I Input Date From and Date To "<Date1>" "<Date2>"
    And I Click on Query Overtime Hours
    And I Verify Hours Work in Manage OT "<Hrs_wrk_one>" "<Hrs_wrk_two>"
    And I Verify Overtime Hours Rate One Point Five "<OT15Day1>" "<OT15Day2>"
    And I Verify Overtime Hours Rate Two Point Zero "<OT20Day1>" "<OT20Day2>"
    And I Verify Overtime Hours Rate Three Point Zero "<OT30Day1>" "<OT30Day2>"
    And I Verify Overtime Hours Rate Sunday "<OTSUNDay1>" "<OTSUNDay2>"
    And I Verify Overtime Hours Rate Public Holiday "<OTPHDay1>" "<OTPHDay2>"
    And I Click on Save Button
    And I Verify Success Message for OT Saved
    And I Click on Attendance
    And I Click on Manage Overtime Hours and Meals
    And I Verify Manage Overtime Hours and Meals Page
    And I Input Date From and Date To in Manage Overtime and Meals "<Date1>" "<Date2>"
    And I Select Company Name
    And I Select Location In Manage Overtime and Meals "<Location>"
    And I Select Employee Code In Manage Overtime and Meals "<Emp_Code>"
    And I Click on Query Button
    And I Verify Overtime Hours and Amount "<OT15Day1>" "<OT15Day2>" "<OT20Day1>" "<OT20Day2>" "<OT30Day1>" "<OT30Day2>" "<OTSUNDay1>" "<OTSUNDay2>" "<OTPHDay1>" "<OTPHDay2>" "<OT15Amt1>" "<OT15Amt2>" "<OT20Amt1>" "<OT20Amt2>" "<OT30Amt1>" "<OT30Amt2>" "<OTSUNPHAmt1>" "<OTSUNPHAmt2>" "<Total_Amt1>" "<Total_Amt2>" "<Off_Leave_amt1>" "<Off_Leave_amt2>"
    And I Sign Out
    And I Verify Successful Sign Out

    Examples:
      |SCN  |Browser |User_Name |Password |Date1      |Emp_Code |Hrs_wrk_one  |Hrs_wrk_two|Location|Date2       |OT15Day1|OT15Day2|OT20Day1|OT20Day2|OT30Day1|OT30Day2|OTSUNDay1|OTSUNDay2|OTPHDay1|OTPHDay2|OT15Amt1 |OT15Amt2|OT20Amt1|OT20Amt2|OT30Amt1|OT30Amt2|OTSUNPHAmt1|OTSUNPHAmt2|Total_Amt1 |Total_Amt2|Off_Leave_amt1|Off_Leave_amt2|
#      |1    |Chrome  |AAA       |Admin@123|02-Jun-2025|75       |9.75         |null       |Adm     |02-Jun-2025 |0.75    |null    |null    |null    |null    |null    |null     |null     |null    |null    |162.84   |null    |null    |null    |null    |null    |null        |null        |162.84     |null      |null            |null            |
#      |2    |Chrome  |AAA       |Admin@123|06-Jun-2025|039      |11.75        |null       |Aux     |06-Jun-2025 |2.75    |null    |null    |null    |null    |null    |null     |null     |null    |null    |447.40   |null    |null    |null    |null    |null    |null        |null        |447.40     |null      |null            |null            |
#      |3    |Chrome  |AAA       |Admin@123|07-JUN-2025|75       |5.75         |null       |Adm     |07-JUN-2025 |0.75    |null    |null    |null    |null    |null    |null     |null     |null    |null    |162.84   |null    |null    |null    |null    |null    |null        |null        |162.84     |null      |null            |null            |
#      |5.1  |Chrome  |AAA       |Admin@123|30-Apr-2025|75       |16.75        |2.00       |Adm     |01-May-2025 |7.75    |null    |null    |2.00    |null    |null    |null     |null     |null    |null    |1,682.64 |null    |null    |578.97  |null    |null    |null        |null        |1,682.64   |578.97    |null            |null            |
#      |5.2  |Chrome  |AAA       |Admin@123|30-Apr-2025|039      |16.75        |2.00       |Aux     |01-May-2025 |7.75    |null    |null    |2.00    |null    |null    |null     |null     |null    |null    |1,260.87 |null    |null    |433.85  |null    |null    |null        |null        |1,260.87   |433.85    |null            |null            |
#      |6.1  |Chrome  |AAA       |Admin@123|29-Mar-2025|75       |16.75        |2.00       |Adm     |30-Mar-2025 |11.75   |null    |null    |2.00    |null    |null    |null     |null     |null    |null    |2,551.11 |null    |null    |578.97  |null    |null    |null        |null        |2,551.11   |578.97    |null            |null            |
#      |6.2  |Chrome  |AAA       |Admin@123|29-Mar-2025|039      |16.75        |2.00       |Aux     |30-Mar-2025 |11.75   |null    |null    |2.00    |null    |null    |null     |null     |null    |null    |1,911.63 |null    |null    |433.85  |null    |null    |null        |null        |1,911.63   |433.85    |null            |null            |
#      |7    |Chrome  |AAA       |Admin@123|08-Jun-2025|75       |4.00         |null       |Adm     |08-Jun-2025 |null    |null    |4.00    |null    |null    |null    |null     |null     |null    |null    |null     |null    |1,157.95|null    |null    |null    |null        |null        |1,157.95   |null      |null            |null            |
#      |8    |Chrome  |AAA       |Admin@123|29-Jan-2025|75       |8.00         |null       |Adm     |29-Jan-2025 |null    |null    |null    |null    |null    |null    |null     |null     |7.00    |null    |null     |null    |null    |null    |null    |null    |2,315.90    |null        |2,315.90   |null      |null            |null            |
#      |9    |Chrome  |AAA       |Admin@123|29-Jan-2025|021      |9.08         |null       |Reg     |29-Jan-2025 |null    |null    |null    |null    |0.08    |null    |null     |null     |8.08    |null    |null     |null    |null    |null    |57.44   |null    |3,675.90    |null        |3,733.33   |null      |null            |null            |
#      |10.1 |Chrome  |AAA       |Admin@123|08-Jun-2025|012      |8.00         |null       |Adm     |08-Jun-2025 |null    |null    |7.00    |null    |null    |null    |null     |null     |null    |null    |null     |null    |3,535.90|null    |null    |null    |null        |null        |3,535.90   |null      |null            |null            |
#      |10.2 |Chrome  |AAA       |Admin@123|01-May-2025|012      |8.00         |null       |Adm     |01-May-2025 |null    |null    |7.00    |null    |null    |null    |null     |null     |null    |null    |null     |null    |3,535.90|null    |null    |null    |null        |null        |3,535.90   |null      |null            |null            |
#      |11.1 |Chrome  |AAA       |Admin@123|08-Jun-2025|036      |9.00         |null       |Aux     |08-Jun-2025 |null    |null    |null    |null    |null    |null    |8.00     |null     |null    |null    |null     |null    |null    |null    |null    |null    |3,569.23   |null        |3,569.23   |null      |null            |null            |
#      |11.2 |Chrome  |AAA       |Admin@123|01-May-2025|036      |9.00         |null       |Aux     |01-May-2025 |null    |null    |null    |null    |null    |null    |null     |null     |8.00    |null    |null     |null    |null    |null    |null    |null    |3,569.23   |null        |3,569.23   |null      |null            |null            |
#      |12.1 |Chrome  |AAA       |Admin@123|08-Jun-2025|73       |12.00        |null       |Reg     |08-Jun-2025 |null    |null    |3.00    |null    |null    |null    |11.00    |null     |null    |null    |null     |null    |1,181.54|null    |null    |null    |3,150.77   |null        |4,332.31   |null      |null            |null            |
#      |12.2 |Chrome  |AAA       |Admin@123|01-May-2025|73       |12.00        |null       |Reg     |01-May-2025 |null    |null    |3.00    |null    |null    |null    |null     |null     |11.00   |null    |null     |null    |1,181.54|null    |null    |null    |3,150.77   |null        |4,332.31   |null      |null            |null            |

      #Scenario2 - Overtime_Scenarios
  @Overtime_Amount_Scenarios
  Scenario Outline: Overtime Calculations based on scenarios

    Given I am on Eastern Test Env - Front "<Browser>"
    And I Verify Login Page
    And I Sign In as HR "<User_Name>" "<Password>"
    And I Verify Successful Login
    And I Click on Human Resource
    And I Click on Attendance
    And I Click on Retrieve Attendance
    And I Input Attendance Date "<Date1>"
    And I Select Employee Code "<Emp_Code>"
    And I Click on Query Button
    And I Verify Hours Worked for Day one "<Hrs_wrk_one>"
    And I Click on Process Button
    And I Verify Success Message for Process Attendance
    And I Click on Attendance
    And I Click on Manage Overtime Hours
    And I Verify Manage Overtime Hours Page
    And I Select Company Name
    And I Select Location "<Location>"
    And I Select Employee Code "<Emp_Code>"
    And I Input Date From and Date To "<Date1>" "<Date2>"
    And I Click on Query Overtime Hours
    And I Verify Hours Work in Manage OT "<Hrs_wrk_one>" "<Hrs_wrk_two>"
    And I Verify Overtime Hours Rate One Point Five "<OT15Day1>" "<OT15Day2>"
    And I Verify Overtime Hours Rate Two Point Zero "<OT20Day1>" "<OT20Day2>"
    And I Verify Overtime Hours Rate Three Point Zero "<OT30Day1>" "<OT30Day2>"
    And I Verify Overtime Hours Rate Sunday "<OTSUNDay1>" "<OTSUNDay2>"
    And I Verify Overtime Hours Rate Public Holiday "<OTPHDay1>" "<OTPHDay2>"
    And I Click on Save Button
    And I Verify Success Message for OT Saved
    And I Click on Attendance
    And I Click on Manage Overtime Hours and Meals
    And I Verify Manage Overtime Hours and Meals Page
    And I Input Date From and Date To in Manage Overtime and Meals "<Date1>" "<Date2>"
    And I Select Company Name
    And I Select Location In Manage Overtime and Meals "<Location>"
    And I Select Employee Code In Manage Overtime and Meals "<Emp_Code>"
    And I Click on Query Button
    And I Verify Overtime Hours and Amount "<OT15Day1>" "<OT15Day2>" "<OT20Day1>" "<OT20Day2>" "<OT30Day1>" "<OT30Day2>" "<OTSUNDay1>" "<OTSUNDay2>" "<OTPHDay1>" "<OTPHDay2>" "<OT15Amt1>" "<OT15Amt2>" "<OT20Amt1>" "<OT20Amt2>" "<OT30Amt1>" "<OT30Amt2>" "<OTSUNPHAmt1>" "<OTSUNPHAmt2>" "<Total_Amt1>" "<Total_Amt2>" "<Off_Leave_amt1>" "<Off_Leave_amt2>"
    And I Sign Out
    And I Verify Successful Sign Out

    Examples:
      |SCN|Browser |User_Name |Password |Date1      |Emp_Code |Hrs_wrk_one  |Hrs_wrk_two|Location|Date2       |OT15Day1|OT15Day2|OT20Day1|OT20Day2|OT30Day1|OT30Day2|OTSUNDay1|OTSUNDay2|OTPHDay1|OTPHDay2|OT15Amt1 |OT15Amt2|OT20Amt1|OT20Amt2|OT30Amt1 |OT30Amt2|OTSUNPHAmt1|OTSUNPHAmt2|Total_Amt1 |Total_Amt2|Off_Leave_amt1|Off_Leave_amt2|
      |1  |Chrome  |AAA       |Admin@123|07-Jan-2025|75       |15.75        |1.00       |Adm     |08-Jan-2025 |6.75    |1.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,465.53 |217.12  |null    |null    |null     |null    |null       |null       |1,465.53   |217.12    |null          |null          |
      |1  |Chrome  |AAA       |Admin@123|07-Jan-2025|039      |15.75        |1.00       |Aux     |08-Jan-2025 |6.75    |1.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,098.17 |162.69  |null    |null    |null     |null    |null       |null       |1,098.17   |162.69    |null          |null          |
      |2  |Chrome  |AAA       |Admin@123|14-Jan-2025|75       |16.75        |10.00      |Adm     |15-Jan-2025 |7.75    |6.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,682.64 |1,302.69|null    |null    |null     |null    |null       |null       |1,682.64   |1,302.69  |null          |null          |
      |2  |Chrome  |AAA       |Admin@123|14-Jan-2025|039      |16.75        |10.00      |Aux     |15-Jan-2025 |7.75    |6.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,260.87 |976.15  |null    |null    |null     |null    |null       |null       |1,260.87   |976.15    |null          |null          |
      |3.1|Chrome  |AAA       |Admin@123|21-Jan-2025|75       |16.75        |4.00       |Adm     |22-Jan-2025 |7.75    |4.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,682.64 |868.46  |null    |null    |null     |null    |null       |null       |1,682.64   |868.46    |null          |null          |
      |3.1|Chrome  |AAA       |Admin@123|21-Jan-2025|039      |16.75        |4.00       |Aux     |22-Jan-2025 |7.75    |4.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,260.87 |650.77  |null    |null    |null     |null    |null       |null       |1,260.87   |650.77    |null          |null          |
      |3.2|Chrome  |AAA       |Admin@123|05-Feb-2025|75       |16.75        |2.00       |Adm     |06-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,682.64 |434.23  |null    |null    |null     |null    |null       |null       |1,682.64   |434.23    |null          |null          |
      |3.2|Chrome  |AAA       |Admin@123|05-Feb-2025|039      |16.75        |2.00       |Aux     |06-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,260.87 |325.38  |null    |null    |null     |null    |null       |null       |1,260.87   |325.38    |null          |null          |
      |3.3|Chrome  |AAA       |Admin@123|05-Feb-2025|009      |16.75        |2.00       |Adm     |06-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |2,125.29 |548.46  |null    |null    |null     |null    |null       |null       |2,125.29   |548.46    |null          |null          |
      |3.3|Chrome  |AAA       |Admin@123|05-Feb-2025|012      |16.75        |2.00       |Adm     |06-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |2,936.06 |757.69  |null    |null    |null     |null    |null       |null       |2,936.06   |757.69    |null          |null          |
      |4.1|Chrome  |AAA       |Admin@123|18-Feb-2025|75       |16.75        |10.75      |Adm     |19-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,682.64 |434.23  |null    |null    |null     |null    |null       |null       |1,682.64   |1,592.18  |null          |1,157.95      |
      |4.1|Chrome  |AAA       |Admin@123|18-Feb-2025|039      |16.75        |10.75      |Aux     |19-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,260.87 |325.38  |null    |null    |null     |null    |null       |null       |1,260.87   |1,193.08  |null          |867.69        |
      |4.2|Chrome  |AAA       |Admin@123|21-Feb-2025|75       |16.75        |7.00       |Adm     |22-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,682.64 |434.23  |null    |null    |null     |null    |null       |null       |1,682.64   |1,592.18  |null          |1,157.95      |
      |4.2|Chrome  |AAA       |Admin@123|21-Feb-2025|039      |16.75        |7.00       |Aux     |22-Feb-2025 |7.75    |2.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,260.87 |325.38  |null    |null    |null     |null    |null       |null       |1,260.87   |1,193.08  |null          |867.69        |
      |5  |Chrome  |AAA       |Admin@123|08-Feb-2025|75       |16.75        |2.00       |Adm     |22-Jan-2025 |11.75   |null    |null    |2.00    |null    |null    |null     |null     |null    |null    |2,551.11 |null    |null    |578.97  |null     |null    |null       |null       |2,551.11   |578.97    |null          |null          |
      |5  |Chrome  |AAA       |Admin@123|08-Feb-2025|039      |16.75        |2.00       |Aux     |22-Jan-2025 |11.75   |null    |null    |2.00    |null    |null    |null     |null     |null    |null    |1,911.63 |null    |null    |433.85  |null     |null    |null       |null       |1,911.63   |433.85    |null          |null          |
      |6  |Chrome  |AAA       |Admin@123|04-Mar-2025|75       |16.75        |8.00       |Adm     |05-Mar-2025 |7.75    |8.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,682.64 |1,736.92|null    |null    |null     |null    |null       |null       |1,682.64   |1,736.92  |null          |null          |
      |6  |Chrome  |AAA       |Admin@123|04-Mar-2025|039      |16.75        |8.00       |Aux     |05-Mar-2025 |7.75    |8.00    |null    |null    |null    |null    |null     |null     |null    |null    |1,260.87 |1,301.54|null    |null    |null     |null    |null       |null       |1,260.87   |1,301.54  |null          |null          |
      |7  |Chrome  |AAA       |Admin@123|02-Mar-2025|75       |10:00        |null       |Adm     |02-Mar-2025 |null    |null    |null    |null    |1.0     |null    |8.0      |null     |null    |null    |null     |null    |null    |null    |434.23   |null    |2,315.90   |null       |2,750.13   |null      |null          |null          |
      |8  |Chrome  |AAA       |Admin@123|02-Mar-2025|039      |10:00        |null       |Aux     |02-Mar-2025 |null    |null    |null    |null    |1.0     |null    |8.0      |null     |null    |null    |null     |null    |null    |null    |216.92   |null    |1,735.38   |null       |1,952.31   |null      |null          |null          |
      |9  |Chrome  |AAA       |Admin@123|16-Mar-2025|039      |17:00        |5:00       |Aux     |17-Mar-2025 |null    |5.0     |8.0     |null    |null    |null    |8.0      |null     |null    |null    |null     |813.46  |1,735.38|null    |null     |null    |1,735.38   |null       |3,470.77   |813.46    |null          |null          |
      |10 |Chrome  |AAA       |Admin@123|16-Mar-2025|75       |17:00        |5:00       |Adm     |17-Mar-2025 |null    |5.0     |null    |null    |8.0     |null    |8.0      |null     |null    |null    |null     |1,085.58|null    |null    |3,473.85 |null    |2,315.90   |null       |5,789.74   |1,085.58  |null          |null          |

