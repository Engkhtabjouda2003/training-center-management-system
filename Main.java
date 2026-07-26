import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TrainingCenter center = new TrainingCenter();
        Scanner sc = new Scanner(System.in);

        // بس تجربة على مفهوم ال polymorphism
        // المرجع من نوع Person بس الكائن الحقيقي طالب او مدرب
        System.out.println("=== Polymorphism Demo ===");
        Person p1 = new Student(101, "أحمد", 20, "جافا");
        Person p2 = new Trainer(201, "رمزي", 35, "برمجة", 15.5, 40);
        p1.displayInfo();
        System.out.println("-----------------------------");
        p2.displayInfo();
        System.out.println("==========================");

        int choice = 0;

        while (choice != 11) {

            System.out.println("\n----- Training Center Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. Add Trainer");
            System.out.println("3. Add Course");
            System.out.println("4. Display All Students");
            System.out.println("5. Display All Trainers");
            System.out.println("6. Display All Courses");
            System.out.println("7. Search Student by ID");
            System.out.println("8. Search Trainer by ID");
            System.out.println("9. Compare Two Students");
            System.out.println("10. Display Trainer Salary");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("خطأ! لازم تدخل رقم صحيح. حاول مرة ثانية.");
                sc.nextLine(); // نظف الادخال الغلط
                continue;
            }

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course Name: ");
                        String course = sc.nextLine();

                        center.addStudent(id, name, age, course);
                        System.out.println("تمت اضافة الطالب بنجاح.");
                    } catch (InputMismatchException e) {
                        System.out.println("خطأ في الادخال! تأكد انك تدخل رقم بالمكان الصحيح.");
                        sc.nextLine();
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Specialization: ");
                        String spec = sc.nextLine();
                        System.out.print("Enter Hourly Rate: ");
                        double rate = sc.nextDouble();
                        System.out.print("Enter Working Hours: ");
                        int hours = sc.nextInt();
                        sc.nextLine();

                        Trainer t = new Trainer(id, name, age, spec, rate, hours);
                        center.addTrainer(t);
                        System.out.println("تمت اضافة المدرب بنجاح.");
                    } catch (InputMismatchException e) {
                        System.out.println("خطأ في الادخال! تأكد انك تدخل رقم بالمكان الصحيح.");
                        sc.nextLine();
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter Course ID: ");
                        int cid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course Name: ");
                        String cname = sc.nextLine();
                        System.out.print("Enter Duration (weeks): ");
                        int duration = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Trainer ID (that already exists): ");
                        int tid = sc.nextInt();
                        sc.nextLine();

                        Trainer trainer = center.searchTrainerById(tid);
                        if (trainer == null) {
                            System.out.println("ما في مدرب بهذا الرقم! رح تنضاف الدورة بدون مدرب.");
                        }
                        Course c = new Course(cid, cname, duration, trainer);
                        center.addCourse(c);
                        System.out.println("تمت اضافة الدورة بنجاح.");
                    } catch (InputMismatchException e) {
                        System.out.println("خطأ في الادخال! تأكد انك تدخل رقم بالمكان الصحيح.");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    center.displayAllStudents();
                    break;

                case 5:
                    center.displayAllTrainers();
                    break;

                case 6:
                    center.displayAllCourses();
                    break;

                case 7:
                    try {
                        System.out.print("Enter Student ID: ");
                        int sid = sc.nextInt();
                        Student found = center.searchStudentById(sid);
                        if (found != null) {
                            found.displayInfo();
                        } else {
                            System.out.println("ما في طالب بهذا الرقم.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("خطأ! لازم تدخل رقم صحيح.");
                        sc.nextLine();
                    }
                    break;

                case 8:
                    try {
                        System.out.print("Enter Trainer ID: ");
                        int tid2 = sc.nextInt();
                        Trainer foundT = center.searchTrainerById(tid2);
                        if (foundT != null) {
                            foundT.displayInfo();
                        } else {
                            System.out.println("ما في مدرب بهذا الرقم.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("خطأ! لازم تدخل رقم صحيح.");
                        sc.nextLine();
                    }
                    break;

                case 9:
                    try {
                        System.out.print("Enter first Student ID: ");
                        int id1 = sc.nextInt();
                        System.out.print("Enter second Student ID: ");
                        int id2 = sc.nextInt();

                        Student s1 = center.searchStudentById(id1);
                        Student s2 = center.searchStudentById(id2);

                        if (s1 == null || s2 == null) {
                            System.out.println("واحد من الطلاب مش موجود.");
                        } else if (s1.equals(s2)) {
                            System.out.println("الطالبين نفس الشخص.");
                        } else {
                            System.out.println("الطالبين مختلفين.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("خطأ! لازم تدخل رقم صحيح.");
                        sc.nextLine();
                    }
                    break;

                case 10:
                    try {
                        System.out.print("Enter Trainer ID: ");
                        int tid3 = sc.nextInt();
                        Trainer t3 = center.searchTrainerById(tid3);
                        if (t3 != null) {
                            System.out.println("Salary: " + t3.calculateSalary());
                        } else {
                            System.out.println("ما في مدرب بهذا الرقم.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("خطأ! لازم تدخل رقم صحيح.");
                        sc.nextLine();
                    }
                    break;

                case 11:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("رقم غير موجود بالقائمة، جرب مرة ثانية.");
            }

        }

        sc.close();

    }

}
