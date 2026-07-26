// الفئة الأساسية لأي شخص بالنظام
// خليتها abstract لأنه مافي داعي نسوي كائن "شخص" لحاله، لازم يكون طالب او مدرب
public abstract class Person {

    private int id;
    private String name;
    private int age;

    // constructor فاضي
    public Person() {

    }

    // constructor فيه المعطيات
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // دالة مجردة، كل فئة ترث من هون لازم تعمل لها Override
    public abstract void displayInfo();

}
