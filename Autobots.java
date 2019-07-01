package Machines;

public class Autobots extends Robots implements Coach {
    public static final int TheAutobotsNumber() {
        return 8;
    }

    public void stickToAHealthyDiet() {
        System.out.println("Keep your fridge closed");
    }

    @Override
    public void trainHard() {
        System.out.println("100 push-ups, running, squats");

    }

    @Override
    public void makeClientsSuffer() {
        System.out.println("Do this one more time");

    }
}
