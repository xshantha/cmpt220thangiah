/* Shantha Thangiah
 * CMPT220
 * Lab 7, Problem 10.5
 * Prime Factors
 */

public class lab7pb10_09 {
    public static void main(String[] args) {

        Course course = new Course("CMPT220 - Software Development I\nLab 7, Problem 10.9\n\nENROLLED STUDENTS\n-----------------");
         // adding 15 students
        
        for (int i = 0; i < 10; i++) {
            course.addStudent("Student " + (i + 1));
        }

        // Displaying course name and student taking the course.
        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-12s ", students[i]);
            if ((i + 1) % 4 == 0) {
                System.out.printf("\n");
            }

        }
        System.out.println("\n\nTotal Students at the Beginning: " + course.getNumberOfStudents());

        System.out.println("\n\nDROPPED STUDENTS\n----------------");
        System.out.println("\tStudent 5 dropped.");
        course.dropStudent("Student " + (5));
        System.out.println("\tStudent 10 dropped.");
        course.dropStudent("Student " + (10));

        System.out.println("\n\nCURRENT STUDENTS\n----------------");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%-12s ", students[i]);

            if ((i + 1) % 4 == 0) {
                System.out.printf("\n");
            }
        }
          System.out.println("\nCurrent Students Total: " + course.getNumberOfStudents());
    }
}

// Course Class
class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {return students;}

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {return courseName;}

    public void dropStudent(String student) {

        for (int i = 0; i < students.length; i++) {
            if (student.equalsIgnoreCase(students[i])) {
                students[i] = null; // sets dropped student's value to null
                numberOfStudents--;
                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                    i++;
                }
                break;
            }
        }
    }

    public void clear(){
        students = new String[25];
        numberOfStudents = 0;
    }

    public Object clone() {
        Course course = null;
        try {
            course = (Course)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        course.students = students.clone();
        course.courseName = new String(courseName);
        return course;
    }
}


