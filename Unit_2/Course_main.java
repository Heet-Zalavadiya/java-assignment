// Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits. Implement two 
// constructor Course() to initialize default values and Course(Course object)-call by reference. Call display() to print all the
// information.

class Course {
    String courseName;
    String instructor;
    int credits;

    Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    Course(Course c) {
        courseName = c.courseName;
        instructor = c.instructor;
        credits = c.credits;
    }

    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}

public class Course_main {
    public static void main(String[] args) {
        Course c1 = new Course("Java", "Heet", 4);
        Course c2 = new Course(c1);
        c1.display();
        c2.display();
    }

}
