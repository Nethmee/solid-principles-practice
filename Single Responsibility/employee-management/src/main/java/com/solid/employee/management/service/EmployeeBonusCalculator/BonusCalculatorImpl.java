package com.solid.employee.management.service.EmployeeBonusCalculator;

public class BonusCalculatorImpl implements BonusCalculator {

  @Override
  public double calculateYearlyBonus(double baseSalary, double bonusPercentage) {
    return baseSalary*bonusPercentage/100;
  }

  @Override
  public double calculateSpecialBonus(double baseSalary, double bonusPercentage, int yearsOfService) {
    return baseSalary*bonusPercentage/100*yearsOfService;
  }
}
