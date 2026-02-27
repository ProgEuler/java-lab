import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

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

class Teacher extends Person {
    private String[] subjects;
    private int numSubjects;

    public Teacher(String name, int age, String[] subjects) {
        super(name, age);
        this.subjects = subjects;
        this.numSubjects = subjects.length;
    }

    public void displaySubjects() {
        System.out.println("Classes/Subjects Taught (" + numSubjects + " total):");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("  " + (i + 1) + ". " + subjects[i]);
        }
    }

    @Override
    public void Disp() {
        super.Disp();
        displaySubjects();
    }
}

class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║     SCHOOL MANAGEMENT SYSTEM       ║");
        System.out.println("╚════════════════════════════════════╝\n");

        System.out.println("--- Creating Students ---");
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Grade (0-100): ");
            int grade = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, age, grade);
        }

        System.out.println("\n--- Creating Teachers ---");
        Teacher[] teachers = new Teacher[2];

        for (int i = 0; i < teachers.length; i++) {
            System.out.println("\nTeacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("How many subjects? ");
            int count = sc.nextInt();
            sc.nextLine();

            String[] subjects = new String[count];
            for (int j = 0; j < count; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                subjects[j] = sc.nextLine();
            }

            teachers[i] = new Teacher(name, age, subjects);
        }

        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║       STUDENT INFORMATION          ║");
        System.out.println("╚════════════════════════════════════╝");

        for (Student s : students) {
            System.out.println("\n┌────────────────────────────────────┐");
            s.Disp();
            System.out.println("└────────────────────────────────────┘");
        }

        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║       TEACHER INFORMATION          ║");
        System.out.println("╚════════════════════════════════════╝");

        for (Teacher t : teachers) {
            System.out.println("\n┌────────────────────────────────────┐");
            t.Disp();
            System.out.println("└────────────────────────────────────┘");
        }

        sc.close();
    }
}
