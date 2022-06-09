package org.example;

import org.example.logic.checkNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        while(flag!=true){
            System.out.println("pick a number less than 50");
            int a = sc.nextInt();
            checkNumber obj = new checkNumber();
            flag = obj.checkNumber(a, randomNumber);
            if(flag == true){
                System.out.println("your guess " +a+ " is absolutely correct");
            } else {
                System.out.println("Sorry " + a + " is wrong, better luck next time");
            }
        }
        //System.out.println(a);
    }
}