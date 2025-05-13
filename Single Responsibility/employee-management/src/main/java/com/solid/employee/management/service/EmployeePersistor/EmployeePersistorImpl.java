package com.solid.employee.management.service.EmployeePersistor;


import com.solid.employee.management.model.Employee;

public class EmployeePersistorImpl implements EmployeePersistor {

  @Override
  public void persistEmployee(Employee employee) {
    System.out.println("Persisting employee: " + employee.getName());
  }
}
