package com.company;

public class Main {

    public static void main(String[] args) {

        FlyingBird eagle = new FlyingBird();
        eagle.setFeathers(true);
        eagle.setLayEggs(true);
        eagle.setName("Eagle");

        FlyingBird swallow = new FlyingBird();
        swallow.setLayEggs(true);
        swallow.setFeathers(true);
        swallow.setName("Swallow");

        NonFlyingBird penguin = new NonFlyingBird();
        penguin.setFeathers(false);
        penguin.setLayEggs(true);
        penguin.setName("Penguin");

        NonFlyingBird chicken = new NonFlyingBird();
        chicken.setLayEggs(true);
        chicken.setFeathers(true);
        chicken.setName("Chicken");
        Bird[] birds = new Bird[] { eagle, swallow,penguin,chicken};

        for (int k = 0; k < 4; k++) {
            if (birds[k].isFeathers() && birds[k].isLayEggs())
                System.out.println(birds[k].getName() + " has feathers and can lay eggs");
            else if (birds[k].isFeathers() && !birds[k].isLayEggs())
                System.out.println(birds[k].getName() + " has feathers and but lay eggs");
            else if (!birds[k].isFeathers() && birds[k].isLayEggs())
                System.out.println(birds[k].getName() + " hasn't feathers but can lay eggs ");
            else System.out.println(birds[k].getName() + " hasn't feathers and can't lay eggs");

            birds[k].fly();
            System.out.println();


        }

    }
}
