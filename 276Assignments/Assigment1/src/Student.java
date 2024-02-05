public class Student extends Person {
    //Attributes
    private String studentId;
    private String grade;
    private boolean hasTakenExam;

    // Constructor
    public Student(String name, String email, String studentId, String grade) {
        super(name, email);
        this.studentId = studentId;
        this.grade = grade;
        // Check if take exam
        this.hasTakenExam = (grade != null && !grade.trim().isEmpty());
    }

    // Getter and setter
    public String getStudentId() {

        return studentId;
    }

    public void setStudentId(String studentId) {

        this.studentId = studentId;
    }

    // Getter and setter for grade
    public String getGrade() {

        return grade;
    }

    public void setGrade(String grade) {

        this.grade = grade;
        this.hasTakenExam = (grade != null && !grade.trim().isEmpty());
    }

    // A method to check if take exams
    public boolean hasTakenExam() {
        return hasTakenExam;
    }

    @Override
    public String toString() {
        return "Student's name: " + getName() + ", Email: " + getEmail() + ", Student ID: " + studentId + ", Grade: " + grade + ", Exam Status: " + (hasTakenExam() ? "Taken" : "Not taken");
    }

}
