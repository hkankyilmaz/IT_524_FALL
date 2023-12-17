package com.karayilmazhakan.main;

import com.karayilmazhakan.model.GradeBookModel;

public class GradeBookMain {

    public static void main(String[] args) {

        GradeBookModel courseOne = new GradeBookModel("Math");

        courseOne.displayInfo();

        System.out.println("--------------------------------");

        courseOne.generateGradeBook();
    }
}
