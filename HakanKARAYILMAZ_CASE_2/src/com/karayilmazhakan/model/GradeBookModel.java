package com.karayilmazhakan.model;

import java.util.Scanner;

public class GradeBookModel {


    String courseName;
    int average = 0;
    int count = 0;

    public GradeBookModel() {

    }
    public GradeBookModel(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void generateGradeBook() {


        boolean isContinue = true;

        Scanner input = new Scanner(System.in);

        while (isContinue) {
            if (count == 0) System.out.println("Welcome the " + courseName);
            System.out.println("Please enter a grade");
            int grade = input.nextInt();
            average = (average + grade) / 2;
            System.out.println("Grade Saved, Are you continue ? [1:yes, 0:no]");
            int areYouContinue = input.nextInt();


            if (areYouContinue == 1) {
                count++;


            } else {
                isContinue = false;
                System.out.println("Number of grades entered: " + count);
                System.out.println("Class average: " + average);
            }


        }


    }

    public void displayInfo() {

        if (count == 0) {
            System.out.println(courseName);
            System.out.println("No grades entered!");

        } else {
            System.out.println(courseName);
            System.out.println("Number of grades entered: " + count);
            System.out.println("Class average: " + average);
        }
    }
}
