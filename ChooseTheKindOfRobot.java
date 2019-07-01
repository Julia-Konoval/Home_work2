package Machines;

public class ChooseTheKindOfRobot<firstArray> {


    private int generateNumber(int min, int max) {
        java.util.Random r = new java.util.Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int theRandomNumber() {
        int number = generateNumber( int min, int max);


        if (number < = 3) {
            System.out.println("Hi! I belong to the class Robots");

        }
        else  (number < = 8) {
            System.out.println("Hi! I belong to the class Decepticons") ;

        }
        else (number < = 12) {
            System.out.println("Hi! I belong to the class Autobots");
        }
    }
}

