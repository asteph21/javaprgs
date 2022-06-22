package com.revature.exceptions.demo;

public class FirstExceptionExample {

    public static void main(String[] args) {
        int[] myArray = new int[5];

        myArray[2] = 15;
        try {
            System.out.println("Inside Try .....");
            myArray[1] = 25;
            System.out.println("still inside try");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            System.out.println("always executes whether exception or no exception");
        }
        System.out.println("This program is complete . .. . .");
    }

}