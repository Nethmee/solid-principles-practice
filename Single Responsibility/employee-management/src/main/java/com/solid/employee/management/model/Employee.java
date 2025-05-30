package com.solid.employee.management.model;

import lombok.Builder;

@Builder
public class Employee {

  String name;
  String position;
  Double salary;

  Employee(String name, String position, Double salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }


}
