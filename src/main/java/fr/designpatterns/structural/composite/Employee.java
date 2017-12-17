package fr.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String name;
  private String dept;
  private int salary;
  private List<Employee> subordinates;

  public Employee(String name, String dept, int salary) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
    subordinates = new ArrayList<>();
  }

  public void add(Employee e) {
    subordinates.add(e);
  }

  public void remove(Employee e) {
    subordinates.remove(e);
  }

  public List<Employee> getSubordinates() {
    return subordinates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Employee employee = (Employee) o;

    if (salary != employee.salary) return false;
    if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
    return dept != null ? dept.equals(employee.dept) : employee.dept == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (dept != null ? dept.hashCode() : 0);
    result = 31 * result + salary;
    return result;
  }
}
