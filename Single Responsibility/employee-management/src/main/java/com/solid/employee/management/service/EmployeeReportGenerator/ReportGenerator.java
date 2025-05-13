package com.solid.employee.management.service.EmployeeReportGenerator;
import java.io.File;
import java.io.IOException;

public interface ReportGenerator {

    File generateExcelReportForEmployee(String employeeName, String reportType) throws IOException;

    File generateExcelReportForAllEmployee(String reportType);
}
