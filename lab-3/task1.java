class Student {
   protected String name;
   protected int roll;

   public Student(String name, int roll) {
      this.name = name;
      this.roll = roll;
   }
   public void displayInfo (){
      System.out.println("Name: " + name);
      System.out.println("Roll: " + roll);
   }
}

class Result extends Student {
   protected double marks;

   public Result(String name, int roll, double marks){
      super(name, roll);
      this.marks = marks;
   }
   public void display(){
      displayInfo();
      System.out.println("Mark: " + marks);
   }
}

public class task1 {
   public static void main(String[] args) {
      Result r = new Result("Jamil", 3, 90);
      r.display();
   }
}
