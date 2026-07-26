# 🎓 Training Center Management System

A Java console application developed to manage students, trainers, and training courses using Object-Oriented Programming principles.

## 📌 About the Project

This project was created as a final Java programming project to demonstrate the practical use of Object-Oriented Programming concepts.

The system allows the user to manage students, trainers, and courses through a simple interactive console menu.

## ✨ Main Features

- Add new students
- Add new trainers
- Add new training courses
- Display all students
- Display all trainers
- Display all courses
- Assign a trainer to a course
- Calculate trainer salary
- Store data using `ArrayList`
- Handle invalid user input using exception handling
- Navigate through an interactive console menu

## 🧠 OOP Concepts Used

- Classes and Objects
- Encapsulation
- Inheritance
- Abstraction
- Abstract Classes
- Interfaces
- Polymorphism
- Method Overloading
- Aggregation
- Copy Constructor
- Static Variables
- Exception Handling
- ArrayList

## 📂 Project Files

```text
training-center-management-system/
├── Main.java
├── Person.java
├── Student.java
├── Trainer.java
├── Course.java
├── TrainingCenter.java
├── Payable.java
└── README.md
```

### File Description

- `Main.java` — Runs the program and displays the main menu.
- `Person.java` — Abstract parent class for students and trainers.
- `Student.java` — Represents students and their course information.
- `Trainer.java` — Represents trainers and calculates their salaries.
- `Course.java` — Stores course information and its assigned trainer.
- `TrainingCenter.java` — Manages students, trainers, and courses using `ArrayList`.
- `Payable.java` — Interface used for salary calculation.

## 🔗 Class Relationships

- `Student` inherits from `Person`.
- `Trainer` inherits from `Person`.
- `Trainer` implements the `Payable` interface.
- `Course` contains a `Trainer` object using aggregation.
- `TrainingCenter` stores and manages all system data.

## ▶️ How to Run

1. Download or clone the repository.
2. Open the project using IntelliJ IDEA, NetBeans, Eclipse, or Visual Studio Code.
3. Make sure Java JDK is installed.
4. Compile the Java files.
5. Run the `Main.java` file.
6. Use the displayed menu to interact with the system.

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming
- Java Collections
- Console-Based User Interface

## 🎯 Project Purpose

The purpose of this project is to practice building a complete Java application and understand how different classes interact inside one system.

It demonstrates how Object-Oriented Programming can be used to organize code, reduce repetition, and make applications easier to develop and maintain.

## 👨‍💻 Author

**Khattab Jouda**

Computer Engineering and Intelligent Systems Student

- GitHub: [Engkhtabjouda2003](https://github.com/Engkhtabjouda2003)
- LinkedIn: [Khattab M. Jouda](https://www.linkedin.com/in/khtab-m-jouda-457702405)
- Location: Gaza, Palestine 🇵🇸

---

⭐ If you find this project useful, feel free to give it a star.
