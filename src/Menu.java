import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Integer.parseInt;

class Menu {
    /**
     * create new instance of SuperPersons to use its methods
     */
    private Character supers = new Character();
    /**
     * create new instance of fight to use its methods
     */
    private Fight fight = new Fight();
    /**
     * create new instance of Scanner to use it in methods of menu
     */
    private Scanner reader = new Scanner(System.in);

    /**
     * Constructor of menu
     * intialize creatSupers() method
     */
    Menu() {
        //Initialiseer Heroes en Villains
        supers.createSupers();

    }

    /**
     * method for displaying mainMenu in console en ask for input user
     */
    void mainMenu() throws InterruptedException {

        try {
            //maindmenu

            System.out.println("\nMain Menu\n (1) List of Heroes\n (2) List of Villains\n (3) List of Gadgets \n (4) Search for specific Hero or Villain\n (5) List history of Fights\n (6) Start a new Fight\n (0) Exit");
            System.out.print("choose an number from menu: \n");


            int keuze = parseInt(reader.nextLine());

            switch (keuze) {
                case 1:
                    supers.printHeroes((supers.getHeroes().size()));
                    returnMenu();
                    break;
                case 2:
                    supers.printVillains(supers.getVillains().size());
                    returnMenu();
                    break;
                case 3:
                    supers.printGadgets();
                    returnMenu();
                    break;
                case 4:
                    searchMenu();
                    searchAgain();
                    break;
                case 5:
                    int count = 1;
                    System.out.println();
                    for (String fight : fight.getFights()) {
                        if (count < 10) {
                            System.out.println("(" + count + ") " + fight);
                        } else {
                            System.out.println("(" + count + ")" + fight);
                        }
                        count++;
                    }
                    returnMenu();
                    break;
                case 6:
                    fightMenu();
                    try {
                        BattleTime.loadingTime();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    returnMenu();
                    break;
                case 0:
                    exitCheck();
                    break;
                default:
                    System.out.println("Wrong <number>, Returning to Mainmenu...");
                    TimeUnit.SECONDS.sleep(1);
                    mainMenu();
            }
        } catch (Exception e) {
            System.out.println("Wrong <input>, Returning to Mainmenu...");
            TimeUnit.SECONDS.sleep(1);
            mainMenu();

        }

    }

    private void searchMenu() throws InterruptedException {
        System.out.println("welke hero of villain wil je opzoeken?");
        String superPerson = reader.nextLine();
        for (Hero hero : supers.getHeroes()) {
            if (hero.getSuperName().toLowerCase().contains(superPerson.toLowerCase())) {
                System.out.println("Superperson found!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(hero.toString());
                searchAgain();
                break;
            }
        }
        for (Villain villain : supers.getVillains()) {
            if (villain.getSuperName().toLowerCase().contains(superPerson.toLowerCase())) {
                System.out.println("Superperson found!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(villain.toString());
                searchAgain();
            }
        }
        System.out.println("Superperson not found!");
    }


    private void fightMenu() {
        Hero hero;
        Villain villain;
        int amount = 4;
        System.out.println("\nkies een hero:");
        supers.printHeroes(amount);
        int herochoice = parseInt(reader.nextLine());
        hero = supers.getHeroes().get(herochoice);
        System.out.println("\nkies een vilain:");
        supers.printVillains(amount);
        int villainchoice = parseInt(reader.nextLine());
        villain = supers.getVillains().get(villainchoice);
        System.out.println("\nHeeft het gevecht een winnaar? (\"h\" = hero, \"v\" = villain, \"n\" = laat applicatie bepalen).");
        String winnerchoice = reader.nextLine();
        if (winnerchoice.equalsIgnoreCase("h") || winnerchoice.equalsIgnoreCase("v") || winnerchoice.equalsIgnoreCase("n")) {
            fight.newFight(hero, villain, winnerchoice);
        }
    }

    private void returnMenu() throws InterruptedException {
        System.out.println("Return to main or quit!");
        System.out.println("(1) Mainmenu\t\t(2) Quit");
        int keuze = parseInt(reader.nextLine());
        switch (keuze) {
            case 1:
                mainMenu();
                break;
            case 2:
                exitCheck();
                break;
            default:
                System.out.println("Returning to the mainmenu...");
                TimeUnit.SECONDS.sleep(1);
                returnMenu();
                break;

        }
    }

    private void searchAgain() throws InterruptedException {
        System.out.println();
        System.out.println("(1) Search again\t\t(2) Mainmenu");
        int keuze = parseInt(reader.nextLine());
        switch (keuze) {
            case 1:
                searchMenu();
                break;
            case 2:
                mainMenu();
                break;
            default:
                returnMenu();
                break;

        }

    }

    private void exitCheck() throws InterruptedException {
        System.out.println();
        System.out.println("Are you sure you want to quit?");
        System.out.println("(1) No\t\t(2) Yes");
        int keuze = parseInt(reader.nextLine());
        switch (keuze) {
            case 1:
                mainMenu();
                break;
            case 2:
                credits();
                break;
            default:
                returnMenu();
                break;

        }
    }

    private void credits() throws InterruptedException {
        String createdBy = "Created by:\n" +
                "APDE Group 4\n" +
                "\n" +
                "Designed by:\n" +
                "Amar Kanhai\n" +
                "Rens van der Meijs \n" +
                "Roy Hendrik \n" +
                "Vera Woerdeman \n" +
                "\n" +
                "Visual Paradigm:\n" +
                "Amar Kanhai\n" +
                "Rens van der Meijs \n" +
                "Roy Hendrik \n" +
                "Vera Woerdeman \n" +
                "\n" +
                "Inspired by:\n" +
                "DC Comics\n" +
                "Marvel\n" +
                "APDE Course\n" +
                "\n" +
                "Teachers:\n" +
                "Jaap van Gestel\n" +
                "Mathijs Koning\n" +
                "Wouter Pijnacker Hordijk\n" +
                "\n" +
                "Omnibus®2020\n";
        Scanner scanner = new Scanner(createdBy);
        ArrayList<String> array = new ArrayList<>();
        while (scanner.hasNextLine()) {
            array.add(scanner.nextLine());
        }

        for (int i = 0; i < array.size(); ) {
            System.out.println(array.get(i));
            TimeUnit.MILLISECONDS.sleep(500);
            i++;
        }
    }
}

