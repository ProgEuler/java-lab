import java.util.Scanner;

class Person {
   protected String name;
   protected int age;
   protected String address;

   public Person(String name, int age, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
   }

   public void displayInfo() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Address: " + address);
   }
}

class Student extends Person {
   protected long roll;
   protected String department;
   protected double marks;

   public Student(String name, int age, String address, long roll, String department, double marks) {
      super(name, age, address);
      this.roll = roll;
      this.department = department;
      this.marks = marks;
   }

   public String calculateGrade() {
      if (marks >= 80) {
         return "A+";
      } else if (marks >= 70) {
         return "A";
      } else if (marks >= 60) {
         return "A-";
      } else if (marks >= 50) {
         return "B";
      } else if (marks >= 40) {
         return "C";
      } else if (marks >= 30) {
         return "D";
      } else {
         return "F";
      }
   }

   @Override
   public void displayInfo() {
      super.displayInfo();
      System.out.println("Roll: " + roll);
      System.out.println("Department: " + department);
      System.out.println("Marks: " + marks);
      System.out.println("Grade: " + calculateGrade());
   }
}

class Teacher extends Person {
   protected int teacherId;
   protected String subject;
   private double salary;

   public Teacher(String name, int age, String address, int teacherId, String subject, double salary) {
      super(name, age, address);
      this.teacherId = teacherId;
      this.subject = subject;
      this.salary = salary;
   }

   public double calculateSalary() {
      return salary + (salary % 20);
   }

   @Override
   public void displayInfo() {
      super.displayInfo();
      System.out.println("Teacher Id: " + teacherId);
      System.out.println("Subject: " + subject);
      System.out.println("Salary: " + salary);
   }
}

public class task5 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("=== SCHOOL MANAGEMENT SYSTEM ===\n");

      System.out.println("--- Enter Student Details ---");
      System.out.print("Name: ");
      String sName = sc.nextLine();
      System.out.print("Age: ");
      int sAge = sc.nextInt();
      sc.nextLine();
      System.out.print("Address: ");
      String sAddr = sc.nextLine();
      System.out.print("Roll Number: ");
      long roll = sc.nextLong();
      sc.nextLine();
      System.out.print("Department: ");
      String dept = sc.nextLine();
      System.out.print("Marks: ");
      double marks = sc.nextDouble();
      sc.nextLine();

      Student student = new Student(sName, sAge, sAddr, roll, dept, marks);

      System.out.println("\n--- Enter Teacher Details ---");
      System.out.print("Name: ");
      String tName = sc.nextLine();
      System.out.print("Age: ");
      int tAge = sc.nextInt();
      sc.nextLine();
      System.out.print("Address: ");
      String tAddr = sc.nextLine();
      System.out.print("Teacher ID: ");
      int tId = sc.nextInt();
      System.out.print("Subject: ");
      String sub = sc.nextLine();
      sc.nextLine();
      System.out.print("Base Salary: ");
      double salary = sc.nextDouble();

      Teacher teacher = new Teacher(tName, tAge, tAddr, tId, sub, salary);

      System.out.println("\n========== STUDENT INFORMATION ==========");
      student.displayInfo();

      System.out.println("\n========== TEACHER INFORMATION ==========");
      teacher.displayInfo();

      sc.close();
   }
}
