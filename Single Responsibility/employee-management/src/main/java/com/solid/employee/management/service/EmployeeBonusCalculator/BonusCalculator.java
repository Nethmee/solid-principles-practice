package com.solid.employee.management.service.EmployeeBonusCalculator;

public interface BonusCalculator {


  double calculateYearlyBonus(double baseSalary, double bonusPercentage);

  double calculateSpecialBonus(double baseSalary, double bonusPercentage, int yearsOfService);
}
