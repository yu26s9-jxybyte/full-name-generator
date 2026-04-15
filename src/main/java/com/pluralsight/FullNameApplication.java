package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //my variables
        // String first;
        //String middle;
        //String last;
        //String suffix;

        System.out.println("Please enter your name.");

        System.out.print("Your first name: ");
        String first = input.nextLine();
        first = first.trim();

        System.out.print("Your middle name: ");
        String middle = input.nextLine();
        middle = middle.trim();

        System.out.print("Your last name: ");
        String last = input.nextLine();
        last = last.trim();

        System.out.print("Your suffix: ");
        String suffix = input.nextLine();
        suffix = suffix.trim();

        String fullName = first;

        if(!middle.isEmpty()) {
           fullName += " " + middle;
        }

        fullName += " " + last;

        if(!suffix.isEmpty()){
           fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);

    }
}
