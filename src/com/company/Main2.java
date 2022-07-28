package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter year");
        int year=scanner.nextInt();
        GregorianCalendar cal = new GregorianCalendar();
        if (cal.isLeapYear(year)) {
            System.out.print("kabisa yili ");
        } else {
            System.out.print("kabisa yili emas");


        }
    }
}
    
