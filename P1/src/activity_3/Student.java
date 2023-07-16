package Activity3;

import java.util.ArrayList;

public class Student {
  private java.lang.String name;
  private int grade;
  private String[] courses;

  public Student(String name, int grade, String[] courses) {
    this.name = name;
    this.grade = grade;
    this.courses = courses;
  }

  public java.lang.String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public String[] getCourses() {
    return courses;
  }

  public void setCourses(String[] courses) {
    this.courses = courses;
  }
}
