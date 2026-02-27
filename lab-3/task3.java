class Shape {
   public void draw(){}
}

class Circle extends Shape {
   @Override
   public void draw() {
      System.out.println("Drawing circle");
   }
}

class Rectangle extends Shape {
   @Override
   public void draw() {
      System.out.println("Drawing rectangle");
   }
}

class Triangle extends Shape {
   @Override
   public void draw(){
      System.out.println("Drawing triangle");
   }
}

public class task3 {
   public static void main(String[] args){
      Shape c = new Circle();
      Shape r = new Rectangle();
      Shape t = new Triangle();

      c.draw();
      r.draw();
      t.draw();
   }
}
