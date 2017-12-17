package fr.designpatterns.architectural.mvc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MVCTest {
  @Test
  public void should_mvc() throws Exception {
    //fetch student record based on his roll no from the database
    Student model = retriveStudentFromDatabase();

    //Create a view : to write student details on console
    StudentView view = new StudentView();
    StudentController controller = new StudentController(model, view);
    assertThat(controller.updateView()).containsExactly(
            "Student: ",
            "Name: Robert",
            "Roll No: 10"
    );

    //update model data
    controller.setStudentName("John");
    assertThat(controller.updateView()).containsExactly(
            "Student: ",
            "Name: John",
            "Roll No: 10"
    );
  }

  private static Student retriveStudentFromDatabase() {
    Student student = new Student();
    student.setName("Robert");
    student.setRollNo("10");
    return student;
  }
}
