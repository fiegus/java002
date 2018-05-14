package com.java002.testing;

import com.java002.testing.calculator.Calculator;
import com.java002.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("TEST #1 (user):");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        ////////// test calc
        System.out.println("TEST #2 (calc):");
        Calculator calculator = new Calculator();
        int result2 = calculator.add(2,3);
        if (result2==5){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        int result3 = calculator.substract(4,3);
        if (result3==1){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}