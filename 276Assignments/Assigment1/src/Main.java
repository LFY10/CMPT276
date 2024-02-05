import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Brook James", "brook@stu.com", "123000STD", "B");
        Instructor instructor = new Instructor("Thomas Lin", "thomas@emp.com", "123000EMP");

        System.out.println("A method for an instructor to change a student's grade.");
        System.out.println(student);
        System.out.println(instructor);

        // The instructor modifies the student's grade
        instructor.modifyStudentGrade(student, "A");

        // Print the student's details after the grade modification
        System.out.println(student);

        // A list to hold Person objects
        List<Person> individuals = new ArrayList<>();

        // Add Instructor and Student objects to the list
        individuals.add(new Instructor("John Doe", "johndoe@emp.com", "123000EMP"));
        individuals.add(new Student("Jason Doe", "jasondoe@stu.com", "123000STD", ""));
        individuals.add(new Instructor("James Lee", "jameslee@emp.com", "456000EMP"));
        individuals.add(new Student("Emily Liu", "emilyliu@stu.com", "456000STD", "A"));

        // In JSON format
        writeIndividualsToFile(individuals, "individuals.txt");

        // Print each individual's details to the console
        /*
        for (Person individual : individuals) {
            System.out.println(individual.toString());
        }*/


    }

    public static void writeIndividualsToFile(List<Person> individuals, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person individual : individuals) {
                // Use individual's toString() method to get their details
                writer.write(individual.toString());
                writer.newLine(); // Ensure each individual's details are on a new line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
