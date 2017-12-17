package fr.designpatterns.architectural.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentView {
  public List<String> printStudentDetails(String studentName, String studentRollNo) {
    List<String> output = new ArrayList<>();

    output.add("Student: ");
    output.add("Name: " + studentName);
    output.add("Roll No: " + studentRollNo);

    return output;
  }
}
