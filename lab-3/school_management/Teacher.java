package school_management;

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
