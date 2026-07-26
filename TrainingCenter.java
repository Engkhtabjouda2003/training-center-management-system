import java.util.ArrayList;

public class TrainingCenter {

    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Trainer> trainers = new ArrayList<Trainer>();
    ArrayList<Course> courses = new ArrayList<Course>();

    // overload اول شكل: ياخذ كائن طالب جاهز
    public void addStudent(Student s) {
        students.add(s);
    }

    // overload تاني شكل: ياخذ البيانات وبعدين يسوي الكائن جوا
    public void addStudent(int id, String name, int age, String courseName) {
        Student s = new Student(id, name, age, courseName);
        students.add(s);
    }

    public void addTrainer(Trainer t) {
        trainers.add(t);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("لا يوجد طلاب مسجلين حاليا.");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println("-----------------------------");
            students.get(i).displayInfo();
        }
    }

    public void displayAllTrainers() {
        if (trainers.isEmpty()) {
            System.out.println("لا يوجد مدربين مسجلين حاليا.");
            return;
        }
        for (int i = 0; i < trainers.size(); i++) {
            System.out.println("-----------------------------");
            trainers.get(i).displayInfo();
        }
    }

    public void displayAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("لا يوجد دورات مسجلة حاليا.");
            return;
        }
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }

    // بحث عن طالب بالـ ID
    public Student searchStudentById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }

    public Trainer searchTrainerById(int id) {
        for (int i = 0; i < trainers.size(); i++) {
            if (trainers.get(i).getId() == id) {
                return trainers.get(i);
            }
        }
        return null;
    }

}
