package com.galvanize;

public class Application {

    public static void main(String[] args) {
//        System.out.println("Hello " + args[0]);
//        int x = 45;
//        while(x <= 50) {
//            System.out.println(x);
//            x++;
//        }
//        for(int i = 2; i <= 6; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        BankAccount b1 = new BankAccount();
        b1.deposit(20);
        b1.withdraw(10);
        System.out.println(b1.balance());
        System.out.println(b1.isOverDrawn());
        System.out.println(b1);
    }

    String grade(int input) {
        if (input >= 90) {
            return "A";
        } else if (input >= 80) {
            return "B";
        } else if (input >= 70) {
            return "C";
        } else if (input >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

}
