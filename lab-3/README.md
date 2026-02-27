# Java Inheritance Practice Tasks

A collection of beginner-to-intermediate Java exercises focused on **inheritance**, **constructors**, **method overriding**, **access modifiers**, and basic OOP concepts.

Created for: learning / classroom assignments / self-study (February 2026)

## 📋 Tasks Overview

| Task | Topic                              | Main Learning Points                                 | Difficulty |
|------|------------------------------------|------------------------------------------------------|------------|
| 1    | Basic inheritance + method         | Single inheritance, adding attributes, method in child | ★☆☆☆☆     |
| 2    | Constructor chaining               | super() implicit call, constructor execution order   | ★★☆☆☆     |
| 3    | Method overriding (polymorphism)   | Runtime polymorphism, different behavior per subclass| ★★☆☆☆     |
| 4    | Access modifiers (private/protected)| Visibility rules in inheritance                      | ★★☆☆☆     |
| 5    | Multi-level inheritance + input    | Real-world classes, overriding, user input           | ★★★☆☆     |
| 6    | Mini School Management System      | Combining constructors, arrays, conditional logic, inheritance | ★★★☆☆     |

## Task Details

### Task 1 – Student & Result
- Create class `Student` (name, roll)
- Create subclass `Result` that adds `marks`
- Write a method to display all information

### Task 2 – Constructor Execution Order
- Class `Person` → prints "Person created" in constructor
- Subclass `Teacher` → prints "Teacher created" in constructor
- Question: Which message appears **first** and **why**?

**Expected answer**: Parent constructor runs **first** (automatic `super()` call)

### Task 3 – Shape Polymorphism
- Abstract-ish base class `Shape` with method `draw()`
- Subclasses: `Circle`, `Rectangle`, `Triangle`
- Each overrides `draw()` with its own message
- Demonstrate polymorphism in `main()`

### Task 4 – Access Modifiers
- Class `Account`
  - `private` double balance
  - `protected` String accountNumber
- Subclass `SavingsAccount`
- Try accessing members from subclass and outside → understand visibility rules

### Task 5 – Person → Student & Teacher Hierarchy
Realistic mini-project with:

- **Person** (base)
  name, age, address
  `displayInfo()`

- **Student** extends Person
  rollNo, department, marks
  `calculateGrade()`, overridden `displayInfo()`

- **Teacher** extends Person
  teacherID, subject, salary
  `calculateSalary()`, overridden `displayInfo()`

- **Main** class: user input + object creation + method calls

### Task 6 – School Management System (Recommended Mini Project)

**Classes:**

- `Person` (abstract-ish base)
  - name, age
  - constructor + `Disp()` method

- `Student` extends Person
  - grade (int or double)
  - `performance()` → prints Excellent / Good / Needs improvement

- `Teacher` extends Person
  - String[] subjects
  - Method to display list of subjects taught

**Main requirements:**

- Create several `Student` and `Teacher` objects
- Call all display/performance methods
- Show proper constructor chaining


```bash
./
├── task1
├── task2
│── ...
└── school_management/
    ├── Person.java
    ├── Student.java
    ├── Teacher.java
    └── SchoolMain.**java**
