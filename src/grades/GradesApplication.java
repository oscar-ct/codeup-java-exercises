package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {


    public static void intro(HashMap<String, Student> student) {

        System.out.println("Welcome!" + "\n");
        System.out.println("Here are the GitHub usernames of our students:" + "\n");
        for (Map.Entry<String, Student> report : student.entrySet()){
            System.out.print("  |" + report.getKey() + "| ");
        }
        System.out.println("\n");
    }


    public static void gradesApplication(HashMap<String, Student> student) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What student would you like to see more information on?" + "\n");
        String input = sc.nextLine();
        System.out.println();

        if (student.containsKey(input)) {
            System.out.println("Name: " + student.get(input).getName() +
                    " - GitHub Username: " + input + "\n" +
                    "Current Average: " + student.get(input).getGradeAverage() + "\n" +
                    "Current Grades: " + student.get(input).getGrades());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + input);
        }
        System.out.println("\n");
        System.out.println("Would you like to see another student? yes/no" + "\n");
        String input1 = sc.nextLine();

        if (input1.equals("yes") || input1.equals("y")) {
            System.out.println();
            gradesApplication(student);
        } else {
            System.out.println("Goodbye");
        }

    }


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Student oscar = new Student("Oscar");
        oscar.addGrade(90);
        oscar.addGrade(90);
        oscar.addGrade(95);
        students.put("oscar-ct", oscar);

        Student chris = new Student("Chris");
        chris.addGrade(90);
        chris.addGrade(90);
        chris.addGrade(100);
        students.put("c-berry", chris);

        Student javier = new Student("Javier");
        javier.addGrade(100);
        javier.addGrade(100);
        javier.addGrade(100);
        students.put("javier-codeup", javier);

        intro(students);
        gradesApplication(students);


//        for (Map.Entry<String, Student> report : students.entrySet()){
//            System.out.println("Name: " + report.getValue().getName() +
//                    " - GitHub Username: " + report.getKey() + "\n" +
//                    "Current Average: " + report.getValue().getGradeAverage(report.getValue().getGrades()));
//        }


    }
}
