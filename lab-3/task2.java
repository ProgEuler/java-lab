class Person {
   public Person() {
      System.out.println("Person created");
   }
}

class Teacher extends Person {
   public Teacher() {
      System.out.println("Teacher created");
   }
}

public class task2 {
   public static void main(String[] args){
      Teacher t = new Teacher();
   }
}

// Theory: The Person constructor executes first because Java automatically inserts super() as the first statement in every constructor if not explicitly written. This ensures parent class initialization happens before child class initialization.

