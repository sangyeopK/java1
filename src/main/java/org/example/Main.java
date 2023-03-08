package org.example;

public class Main {
    public static void main(String[] args) {
        int age = 30;

        System.out.println("당신의 나이 : " + age);

        if (age >= 20 && age<=34) {
            System.out.println("청년입니다");
        }
        else {
            System.out.printf("X");
        }
    }
}