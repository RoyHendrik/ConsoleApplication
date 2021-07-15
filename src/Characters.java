import java.util.ArrayList;

class Character {
    /**
     * ArrayList to store created heroes
     */
    private ArrayList<Hero> heroes = new ArrayList<>();
    /**
     * ArrayList to store created villains
     */
    private ArrayList<Villain> villains = new ArrayList<>();
    /**
     * ArrayList to store created gadgets
     */
    private ArrayList<Gadget> gadgets = new ArrayList<>();

    /**
     * constructor for using this class when created
     */
    Character() {
    }

    /**
     * method for creating new Heroes, Vilains and Gadgets and new objects to ArrayLists ;
     */
    void createSupers() {

        // new heroes
        Hero hero1 = new Hero("Superman", "Clark Kent", 32, "Smallville",99, "I'm not a bird!", "Lex Luthor");
        Hero hero2 = new Hero("Batman", "Bruce Wayne", 48, "Gotham City",95,"I'm Batman!", "Joker");
        Hero hero3 = new Hero("Spiderman", "Peter Parker", 16, "New York City",96, "You may call me Spiderman!", "Venom");
        Hero hero4 = new Hero("Wonder woman", " Elizabeth Holloway Marston", 29, "Amazonen",99, "I'm faster then Hermes!","Catwoman");
        // new villains
        Villain villain1= new Villain("Lex Luthor","Alexander Joseph Luthor",45,"Metropolis",100,"I'm Evil!","Superman");
        Villain villain2= new Villain("Joker","Jack Napier",25,"Gotham City", 91,"HahaHaha!@#$","Batman");
        Villain villain3= new Villain("Venom","Eddie Brock",34,"New York City",91,"I'm hungry","Spiderman");
        Villain villain4= new Villain("Catwoman","Selina Kyle",24,"Gotham City",89,"Miauw!@#$","Batman");

        // new gadgets of heroes
        Gadget hero1gadget1 = new Gadget("glasses", "Superman");
        Gadget hero1gadget2 = new Gadget("suit", "Superman");
        Gadget hero2gadget1 = new Gadget("Batarangs", "Batman");
        Gadget hero2gadget2 = new Gadget("Batmobile", "Batman");
        Gadget hero3gadget1 = new Gadget("Sticky globes","Spiderman");
        Gadget hero4gadget1 = new Gadget("Super crown","Wonderwoman");
        Gadget hero4gadget2 = new Gadget("Golden lasso","Wonderwoman");



        // new gadgets of villains
        Gadget villain1gadget1 = new Gadget("Bunker Buster", "Lex Luthor");
        Gadget villain2gadget1 = new Gadget("Vortex Cannon", "Lex Luthor");
        Gadget villain1gadget2 = new Gadget("Chattering Teeth", "The Joker");
        Gadget villain2gadget2 = new Gadget("Jester Cane", "The Joker");
        Gadget villain3gadget1 = new Gadget("Black slime","Venom");
        Gadget villain4gadget1 = new Gadget("Long nails","Catwoman");

        //add heroes and villains to list
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        villains.add(villain1);
        villains.add(villain2);
        villains.add(villain3);
        villains.add(villain4);

        // add gadgets to heroes
        gadgets.add(hero1gadget1);
        gadgets.add(hero1gadget2);
        gadgets.add(hero2gadget1);
        gadgets.add(hero2gadget2);
        gadgets.add(hero3gadget1);
        gadgets.add(hero4gadget1);
        gadgets.add(hero4gadget2);
        //add gadgets to villains
        gadgets.add(villain1gadget1);
        gadgets.add(villain1gadget2);
        gadgets.add(villain2gadget1);
        gadgets.add(villain2gadget2);
        gadgets.add(villain3gadget1);
        gadgets.add(villain4gadget1);

        // adds heroes who villains thinks are stupid to villains antiFriendsBook
        // and his adds his own gadgets from gadgets Arraylist
        for (Villain villain : villains) {
            villain.createAntiFriendsBook(heroes);
            villain.myGadgetsList(gadgets);
        }

        // adds villains who heroes thinks are stupid to heroes antiFriendsBook
        // and his adds his own gadgets from gadgets Arraylist
        for (Hero hero : heroes) {
            hero.createAntiFriendsBook(villains);
            hero.myGadgetsList(gadgets);
        }

    }


    /**
     * getter for returning heroes ArrayList
     *
     * @return ArrayList of heroes
     */
    ArrayList<Hero> getHeroes() {
        return heroes;
    }

    /**
     * getter for returning villains ArrayList
     *
     * @return ArrayList of villains
     */
    ArrayList<Villain> getVillains() {
        return villains;
    }

    /**
     * method for printing ArrayList of villains in a specific layout
     */
    void printVillains(int amount) {

        for (int index = 0; index < amount; index++) {
            System.out.println("[" + index + "] " + villains.get(index).getSuperName());

        }
    }


    /**
     * method for printing ArrayList of heroes in a specific layout
     */
    void printHeroes(int amount) {


        for (int index = 0; index < amount; index++) {
            System.out.println("[" + index + "] " + heroes.get(index).getSuperName());
        }


    }


    /**
     * method for printing Arraylist of gadgets in a specific layout
     */
    void printGadgets() {
        for (Gadget gadget : gadgets) {
            System.out.println("\t" + "-" + "\t" + gadget.getId() + "\t" + "|" + "\t" + gadget.getName() + "\t" + "|" + "\t" + gadget.getDescription());
        }

    }

}
