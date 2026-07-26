public class Course {

    private int courseId;
    private String courseName;
    private int duration;
    private Trainer trainer; // aggregation، كل دورة إلها مدرب

    public Course() {

    }

    public Course(int courseId, String courseName, int duration, Trainer trainer) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.trainer = trainer;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        String trainerName = "No trainer yet";
        if (trainer != null) {
            trainerName = trainer.getName();
        }
        return "Course [ID=" + courseId + ", Name=" + courseName + ", Duration=" + duration + " weeks, Trainer=" + trainerName + "]";
    }

}
