package files.students;

import files.students.domain.Student;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Ion", 20),
                new Student("Dan", 24)
        };

        writeStudentFile("student.txt", students);
        readStudentFile("student.txt");
    }

    private static void writeStudentFile(String fileName, Student[] students) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (Student student : students) {
                out.writeObject(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readStudentFile(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                Student student = (Student) in.readObject();
                System.out.println(student);
            }
        } catch (EOFException e) {
            // end of stream, nothing to worry about
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
