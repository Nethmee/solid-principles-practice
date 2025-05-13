package com.solid.employee.management.service.EmployeeReportGenerator;

import java.io.File;
import java.io.IOException;

public class ReportGeneratorImpl implements ReportGenerator {

  @Override
  public File generateExcelReportForEmployee(String employeeName, String reportType)
       {
         try{
           return File.createTempFile("employee_report_" + employeeName, ".xlsx");
         }
         catch (IOException e) {
           e.printStackTrace();
           System.out.println("Error generating report for employee: " + employeeName);
         }
    return null;
  }

  @Override
  public File generateExcelReportForAllEmployee( String reportType) {
    try{
      return File.createTempFile("employees_report_" , ".xlsx");
    }
    catch (IOException e) {
      e.printStackTrace();
      System.out.println("Error generating report to get all employees: " );
    }
    return null;
  }
}
