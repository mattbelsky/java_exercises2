package part_03;

import java.util.Random;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

/* Models a cat and mouse in a house. Randomly sets the room and time of day, depending on which determines whether
    cartoon-like hijinks will ensue. Prints the result.
 */
class Controller {
    public static void main(String[] args) {
        Housecat tom = new Housecat("tabby", true);
        Mouse jerry = new Mouse("house mouse", "cheese");

        // Prints whether there will will won't be hijinks.
        System.out.print("There ");
        if (hijinks() == true) {
            System.out.print("will");
        }
        else {
            System.out.print("won't");
        }
        System.out.print(" be cartoon hijinks.");
    }

    public static int timeOfDay() {
        Random rando = new Random();
        int timeOfDay = rando.nextInt(2 - 0 + 1) + 0; // 0 = morning, 1 = noon, 2 = night
        return timeOfDay;
    }

    public static int roomInHouse() {
        Random rando = new Random();
        int roomInHouse = rando.nextInt(1 - 0 + 1) + 0; // 0 = living room (people there, must behave), 1 = kitchen
        return roomInHouse;
    }

    /*  If it's morning or night they are hungry; at noon they're lethargic. If they're in the kitchen during these
        times of day, there will be cartoony hijinks. */
    public static boolean hijinks() {
        // timeofday = 0 or 2 AND roominhouse = 1
        return timeOfDay() == 0 || timeOfDay() == 2 ? roomInHouse() == 1 ? true : false : false;
    }
}

class Housecat {
    private String breed;
    private boolean retractableClaws;
    private boolean nightVision;
    private boolean isPet;

    public Housecat(String breed, boolean isPet) {
        this.breed = breed;
        this.retractableClaws = true;
        this.nightVision = true;
        this.isPet = isPet;
    }
}

class Mouse {
    private String species;
    private String diet;
    private boolean digsBurrows;

    public Mouse(String species, String diet) {
        this.species = species;
        this.diet = diet;
        this.digsBurrows = true;
    }
}