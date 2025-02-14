package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        System.out.println("Hello world!");

        test();
    }

    public static void test()
    {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter the test string here : ");
        String x = scan.nextLine();

        System.out.print(x);


    }
}