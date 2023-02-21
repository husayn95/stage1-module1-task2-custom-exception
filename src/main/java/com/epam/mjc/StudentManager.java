package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};


  //public Student find(String studentID) throws StudentNotFoundException {
  //    if (studentID.equals("123456")) {
  //      return new Student();
  //    } else {
  //      throw new StudentNotFoundException(
  //          "Could not find student with ID " + studentID);
  //    }
  //  }
  public Student find(long studentID) throws StudentException{
    StudentManager manager = new StudentManager();
   // Student student = manager.find(studentID);
    for (int i = 0; i < IDs.length; i++)
      if (studentID == IDs[i])
        studentID = IDs[i];
      else throw new StudentException("Could not find student with ID " + studentID);

    return Student.getValueOf(studentID);
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    try {


      for (int i = 0; i < IDs.length; i++) {
        Student student = manager.find(IDs[i]);
        System.out.println("Student name " + student.getName());
      }
    }  catch (StudentException ex) {
    System.err.print(ex);
  }
  }
}