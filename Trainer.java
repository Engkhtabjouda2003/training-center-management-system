public class Trainer extends Person implements Payable {

    private String specialization;
    private double hourlyRate;
    private int workingHours;

    public Trainer() {
        super();
    }

    public Trainer(int id, String name, int age, String specialization, double hourlyRate, int workingHours) {
        super(id, name, age);
        this.specialization = specialization;
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    // حساب الراتب = اجر الساعة * عدد الساعات
    @Override
    public double calculateSalary() {
        return hourlyRate * workingHours;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Specialization: " + specialization);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Working Hours: " + workingHours);
    }

    @Override
    public String toString() {
        return "Trainer [ID=" + getId() + ", Name=" + getName() + ", Specialization=" + specialization + "]";
    }

}
