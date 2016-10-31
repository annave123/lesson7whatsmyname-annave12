package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner Names = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = Names.next();
        System.out.println("Please enter your second name");
        String secondName = Names.next();
        System.out.println("your full name is "+firstName+ " "+ secondName);

    }
 }
