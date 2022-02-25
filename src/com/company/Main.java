package com.company;

public class Main {

    public static void main(String[] args) {

     try(Car car = new Car("Mercedes",5.5)) {
         System.out.println(car);
         car.drive();
     } catch (RuntimeException e) {
         e.printStackTrace();
     }
    }
}










































