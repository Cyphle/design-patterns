package fr.designpatterns.architectural.dataaccessobject;

import org.junit.Test;

public class DataAccessObjectTest {
  @Test
  public void should_dao() throws Exception {
    StudentDao studentDao = new StudentDaoImpl();

    //print all students
    for (Student student : studentDao.getAllStudents()) {
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }

    //update student
    Student student = studentDao.getAllStudents().get(0);
    student.setName("Michael");
    studentDao.updateStudent(student);

    //get the student
    studentDao.getStudent(0);
    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
  }
}
