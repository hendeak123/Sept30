package com.company;

public class Main {

    public static void main(String[] args) {
        double[] covidRates = {4.5, 8.8, 8.1, 3.9};
        /*junk
        junk
        junk
         */
        reverseArray(covidRates);
        Student[] classList = new Student[12];
        populateStudentsArray(classList);
    }

    private static void populateStudentsArray(Student[] classList) {
        for (int i = 0; i < classList.length - 1; i++) {
            Student newStudent = new Student();
            newStudent.name = "Travis number " + i;
            classList[i] = newStudent;
            System.out.println(classList[i].name);
            System.out.println(classList[i].height);
        }
    }

    private static void reverseArray(double[] covidRates) {
        double[] reversedArray = new double[4];
        int counter = 0;
        for (int i = covidRates.length - 1; i > -1; i--) {
            reversedArray[counter] = covidRates[i];
            System.out.println(reversedArray[counter]);
            counter++;
        }
    }
}

