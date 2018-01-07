package com.conditional;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ifElseCondition();
        nestedIf();
        conditionalStatements();
        whileLoop();
        doWhileLoop();
        forLoop();
        usingArray();
        switchLoop();
    }
    public static void ifElseCondition() {
        int val1 = 10;
        int val2 = 5;
        /*Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();
        int val2 = scan.nextInt();*/
        if(val1 > val2) {
            System.out.println("val1 is greater");
        } else if (val1 < val2){
            System.out.println("val2 is greater");
        } else {
            System.out.println("val1 and val2 are equal");
        }
    }
    public static void nestedIf() {
        float studs = 0.0f;
        float rooms = 4.0f;

        if(studs > 0.0f) {
            if(rooms > 0.0f) {
                System.out.println(studs);
            }
        } else {
            System.out.println("No students");
        }
    }
    /**
     * AND      &       true&true
     * OR       |       false|true  true|false  true|true
     * XOR      ^       false^true  true^false
     * Negation !       false
     *
     * Conditional AND      &&      true&&true
     * Conditional OR       ||      true||false  false||true
     */

    public static void conditionalStatements() {
        int students = 150;
        int rooms = 0;
        if(rooms > 0 && students/rooms > 30) {
            System.out.println("Croweded");
        } else {
            System.out.println("Success");
        }
    }
    public static void whileLoop() {
        /*int kVal = 5, factorial = 1;
        while (kVal > 1)
            factorial *= kVal-- ;
        System.out.println(factorial);*/
        int kVal = 10;
        int factorial = 1;
        while (kVal > 1) {
            factorial *= kVal;
            kVal -= 1;
            System.out.println(factorial);
        }
        System.out.println(factorial);
    }
    public static void doWhileLoop() {
        int iVal = 150;
        do {
            System.out.println(iVal);
            System.out.println(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal > 100);
    }
    public static void forLoop() {
       for (int iVal = 1; iVal < 100; iVal*=2) {
           System.out.println(iVal);
       }
    }
    public static void usingArray() {
        float [] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;

        //float [] theVals = {10.0f, 20.0f, 30.0f};

        float sum = 0.0f;

        for (int i = 0; i < theVals.length; i++) {
            sum += theVals[i];
        }
        System.out.println(sum);

        //      OR     //

        float [] theVals1 = {10.0f, 20.0f, 30.0f};
        float sum1 = 0.0f;

        for(float currentVal : theVals1) {
            sum += currentVal;
            System.out.println(sum1);
        }
    }
    public static void switchLoop () {
        int iVal = 11;
        switch (iVal % 2) {
            case 0: System.out.println(iVal);
                System.out.println(" is even");
                break;
            case 1: System.out.println(iVal);
                System.out.println(" is odd");
                break;
            default:
                    System.out.println("Oops! it broke");
                    break;
        }
    }
}
