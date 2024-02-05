public class Instructor extends Person {
    //attribute
    private String employeeId;
    //constructor
    public Instructor (String name, String email, String employeeId){
        super(name,email);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Method to modify a student's grade with detailed logging
    public void modifyStudentGrade(Student student, String newGrade) {
        if (student != null) {
            String originalGrade = student.getGrade(); // Capture the original grade
            student.setGrade(newGrade); // Set the new grade
            // Log the change including instructor name, student name, original grade, and new grade
            System.out.printf("%s (Instructor) changed %s (Student)'s grade from %s to %s.%n",
                    this.getName(), student.getName(), originalGrade, newGrade);
        } else {
            System.out.println("Student not found.");
        }
    }
    @Override
    public String toString() {
        return "Instructor's name: " + getName() + ", Email: " + getEmail() + ", Employee ID: " + employeeId;
    }

}
