package com.karayilmazhakan.model;

import java.time.LocalDate;
import java.util.Locale;

public class HealtRecordModel {

    String name;
    String lastName;
    String gender;
    int dayOfBirthDay;
    int monthOfBirthDay;
    int yearOfBirthDay;
    int weight;
    double height;


    public HealtRecordModel() {

    }

    public HealtRecordModel(String name, String lastName, String gender, int dayOfBirthDay, int monthOfBirthDay, int yearOfBirthDay, int weight, double height) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirthDay = dayOfBirthDay;
        this.monthOfBirthDay = monthOfBirthDay;
        this.yearOfBirthDay = yearOfBirthDay;
        this.weight = weight;
        this.height = height;
    }

    public int calculateAge(int age) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - age;

    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String resultBMI(double ibm) {

        if (ibm < 18.5) return "Underweight";
        if (18.5 <= ibm && ibm < 25) return "Normal Weight";
        if (25 <= ibm && ibm <= 30) return "Normal Weight";
        if (ibm > 30) return "Obese";

        return "";

    }

    public void showSummary() {

        System.out.println("Healt Profile Summary");
        System.out.println("---------------------");
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birthdate: " + dayOfBirthDay + "/" + monthOfBirthDay + "/" + yearOfBirthDay);
        System.out.println("Age: " + calculateAge(yearOfBirthDay));
        System.out.println("Max: " + (220 - calculateAge(yearOfBirthDay)));
        System.out.println("Gender: " + gender);
        System.out.println("Range: " + ((220 - calculateAge(yearOfBirthDay)) * 0.5) + "--" + ((220 - calculateAge(yearOfBirthDay)) * 0.85));
        System.out.println("BMI: " + calculateBMI());
        System.out.println("BMI result: "+ resultBMI(calculateBMI()));


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDayOfBirthDay() {
        return dayOfBirthDay;
    }

    public void setDayOfBirthDay(int dayOfBirthDay) {
        this.dayOfBirthDay = dayOfBirthDay;
    }

    public int getMonthOfBirthDay() {
        return monthOfBirthDay;
    }

    public void setMonthOfBirthDay(int monthOfBirthDay) {
        this.monthOfBirthDay = monthOfBirthDay;
    }

    public int getYearOfBirthDay() {
        return yearOfBirthDay;
    }

    public void setYearOfBirthDay(int yearOfBirthDay) {
        this.yearOfBirthDay = yearOfBirthDay;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
