package org.example;

public class Employee {
  String fullName;
  float salary;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public Employee(String fullName, int salary) {
    this.fullName = fullName;
    this.salary = salary;
  }
}
