public class Student
{
  private String firstName;
  private String lastName;
  private String school;
  private int grade;
  private int gpa;

  public Student(String fName, String lName, String skool, int graide)
  {
    FirstName = fName;
    LastName = lName;
    school = skool;
    grade = graide;
  }
  public String toString()
  {
    return "Student's name is: " + firstName + " " + lastName + "and they are in grade " + grade + "at" + school;
  }
