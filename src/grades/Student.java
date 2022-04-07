package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

/////////////////////////////// Constructor(s) ////////////////////////////////

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }
////////////////////////////// Getters ///////////////////////////////////////

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
///////////////////////////// Setters ////////////////////////////////////////

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }
///////////////////////////// Custom Methods ////////////////////////////////////////

    public void addGrade(int grade) {
        grades.add(grade);
    }

//    public double getGradeAverage(ArrayList<Integer> grades) // this was my original method format
    public double getGradeAverage() {
        float sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
//////////////////////////// MAIN TESTING  ///////////////////////////////////////////

//    public static void main(String[] args) {
//
//        Student oscar = new Student("Oscar");
//        oscar.addGrade(90);
//        oscar.addGrade(80);
//        oscar.addGrade(95);
//        System.out.println(oscar.getGrades());
//        System.out.println(oscar.getGradeAverage());
////        System.out.println(oscar.getGradeAverage(oscar.getGrades())); /// this was for the original method format
//
//
//    }


}
