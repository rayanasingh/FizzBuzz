package com.fizzbuzz;

public class
FizzBuzz {
    public static void main(String[] args) {
        int i;
        for (i=0; i<=15; i++){
            if (i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
