package fr.designpatterns.architectural.transferobject;

import org.junit.Test;

public class TransferObjectTest {
  @Test
  public void should_transfer() throws Exception {
    StudentBO studentBusinessObject = new StudentBO();

    //print all students
    for (StudentVO student : studentBusinessObject.getAllStudents()) {
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }

    //update student
    StudentVO student = studentBusinessObject.getAllStudents().get(0);
    student.setName("Michael");
    studentBusinessObject.updateStudent(student);

    //get the student
    student = studentBusinessObject.getStudent(0);
    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
  }
}
