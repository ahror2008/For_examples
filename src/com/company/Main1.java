package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yilni kiriting");
        int year=scanner.nextInt();
        LocalDate localDate=LocalDate.of(year,1, 1);
        boolean bool=localDate.isLeapYear();
        if (bool){
            System.out.println("Kabisa yili");
        }else {
            System.out.println("Kabisa yili emas");
        }
    }
}
