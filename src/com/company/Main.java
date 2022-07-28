package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yilni kiriting");
        int year = scanner.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

        if (noOfDays > 365) {
            System.out.println("kabisa yili");
        } else {
            System.out.println("Kabisa yili emas");
        }

    }

}
