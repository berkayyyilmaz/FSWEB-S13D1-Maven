package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        return isBarking && ((clock >= 0 && clock < 8) || (clock == 23));
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        int[] ages = {firstAge,secondAge,thirdAge};
        for(int age: ages) {
            if (age>12 && age<20){
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return isSummer ? (temp > 24 && temp < 46) : (temp > 24 && temp < 36);
    }

    public static double area(double width, double height) {
        return ((width < 0) || (height < 0)) ? -1 : (width * height);
        }


    public static double area(double radius) {
        return (radius < 0) ? -1 : radius*radius*Math.PI ;
    }
}
