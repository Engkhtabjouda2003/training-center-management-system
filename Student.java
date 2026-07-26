public class Student extends Person {

    private String courseName;

    // متغير static عشان نعد كل الطلاب اللي انعملهم اضافة
    static int studentCount = 0;

    public Student() {
        super();
        studentCount++;
    }

    public Student(int id, String name, int age, String courseName) {
        super(id, name, age);
        this.courseName = courseName;
        studentCount++;
    }

    // copy constructor، ياخذ طالب وينسخ بياناته لكائن جديد
    public Student(Student other) {
        super(other.getId(), other.getName(), other.getAge());
        this.courseName = other.courseName;
        studentCount++;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + courseName);
    }

    @Override
    public String toString() {
        return "Student [ID=" + getId() + ", Name=" + getName() + ", Age=" + getAge() + ", Course=" + courseName + "]";
    }

    // مقارنة طالبين حسب الـ ID لأنه ما بتكرر
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        if (this.getId() == s.getId()) {
            return true;
        } else {
            return false;
        }
    }

}
