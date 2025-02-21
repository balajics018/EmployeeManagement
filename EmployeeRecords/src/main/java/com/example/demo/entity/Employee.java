package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Employee.java
@Entity
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long employeeId;
 private String name;
 private int age;
 private String department;
 private String position;

 // Default Constructor
 public Employee() {}

 // Parameterized Constructor
 public Employee(String name, int age, String department, String position) {
     this.name = name;
     this.age = age;
     this.department = department;
     this.position = position;
 }

 // Getters
 public Long getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getDepartment() {
     return department;
 }

 public String getPosition() {
     return position;
 }

 // Setters
 public void setEmployeeId(Long employeeId) {
     this.employeeId = employeeId;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 public void setPosition(String position) {
     this.position = position;
 }
}
