package school_management;

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void performance() {
        System.out.print("Performance: ");
        if (grade >= 90) {
            System.out.println("Excellent ⭐⭐⭐");
        } else if (grade >= 75) {
            System.out.println("Good ⭐⭐");
        } else {
            System.out.println("Needs improvement ⭐");
        }
    }

    @Override
    public void Disp() {
        super.Disp();
        System.out.println("Grade: " + grade);
        performance();
    }
}
