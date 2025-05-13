package com.solid.employee.management;

import java.io.File;
import java.io.IOException;

import com.solid.employee.management.model.Employee;
import com.solid.employee.management.service.EmployeeBonusCalculator.BonusCalculator;
import com.solid.employee.management.service.EmployeeBonusCalculator.BonusCalculatorImpl;
import com.solid.employee.management.service.EmployeePersistor.EmployeePersistor;
import com.solid.employee.management.service.EmployeePersistor.EmployeePersistorImpl;
import com.solid.employee.management.service.EmployeeReportGenerator.ReportGenerator;
import com.solid.employee.management.service.EmployeeReportGenerator.ReportGeneratorImpl;

public class EmployeeManagement {

  public static void main(String[] args) {

    Employee employee = Employee.builder()
        .name("John Doe")
        .position("Software Engineer")
        .salary(75000.0)
        .build();

    //save the Employee object to the database\
    EmployeePersistor employeePersistor= new EmployeePersistorImpl();
    employeePersistor.persistEmployee(employee);

    //calculate yearly bonus
    BonusCalculator employeeBonusCalculator = new BonusCalculatorImpl();
    double bonus = employeeBonusCalculator.calculateYearlyBonus(employee.getSalary(), 10);
    System.out.println("Yearly Bonus: " + bonus);
    //calculate special bonus
    double specialBonus = employeeBonusCalculator.calculateSpecialBonus(employee.getSalary(), 15, 5);
    System.out.println("Special Bonus: " + specialBonus);

    //generate report
    ReportGenerator reportGenerator = new ReportGeneratorImpl();
    try {
      File individualEmployeeReport = reportGenerator.generateExcelReportForEmployee(employee.getName(),"INDIVIDUAL_EMPLOYEE_REPORT");
      File collectiveEmployeeReport = reportGenerator.generateExcelReportForAllEmployee("ALL_EMPLOYEE_REPORT");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }



}
