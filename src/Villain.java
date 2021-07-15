import java.util.ArrayList;

public class Villain extends SuperPerson {

    /**
     * String variable to remember archRival of Villain
     */
    private String archRival;
    /**
     * static int variable to remember count of id for incrementing
     */
    private static int idCounter = 1;
    /**
     * ArrayList of Strings to store names of heroes the villain thinks who are stupid
     */
    private ArrayList<String> antiFriendsBook;
    /**
     * ArrayList of Gadgets the villain owns and uses in fights
     */
    private ArrayList<Gadget> myGadgets = new ArrayList<>();

    /**
     * constructor for creating a new villain
     * @param superName = name of the villain
     * @param realName = real name of the villain
     * @param age = the age of the villain
     * @param city = the city where the villain is most active
     * @param powerLevel = the power level of the villain
     * @param oneLiner = the favorite sentence of villain to create fear to villain's opponent
     * @param archRival = the name of hero the villain thinks is extra stupid
     */
    Villain(String superName, String realName, Integer age, String city, Integer powerLevel, String oneLiner, String archRival) {
        super(superName, realName, age, city, powerLevel, oneLiner);
        this.archRival = archRival;
        Math math = new Math();
        super.setId("#V" + math.incrementID(idCounter));
        idCounter++;

    }

    /**
     * method for adding gadgets of villain to its arsenal
     * @param gadgets list of all available gadgets
     */
    void myGadgetsList(ArrayList<Gadget> gadgets) {
        for (Gadget gadget : gadgets) {
            if (gadget.getDescription().equalsIgnoreCase(this.getSuperName())) {
                if (!myGadgets.contains(gadget)) {
                    myGadgets.add(gadget);
                }
            }
        }
    }


    /**
     * method for adding heroes who the villain thinks are stupid to ArrayList of antiFriendsBook
     * @param heroes list of all available heroes
     */
    void createAntiFriendsBook(ArrayList<Hero> heroes) {
        ArrayList<String> antiFriendsBook = new ArrayList<>();
        for (Hero hero : heroes) {
            if (!hero.getSuperName().toLowerCase().equals(archRival.toLowerCase())) {
                antiFriendsBook.add(hero.getSuperName());
            }

        }
        this.antiFriendsBook = antiFriendsBook;
    }

    ArrayList<Gadget> getMyGadgets() {
        return myGadgets;
    }

    /**
     * overriding toString method from super for printing information of a villain with a specific layout
     * @return String Villain information
     */
    @Override
    public String toString() {
        System.out.println(super.toString() + "\n" + "Vijanden:");
        for (int count = 0 ; count < 3 && count <= antiFriendsBook.size() -1  ;count++ ){
            System.out.println("\t" + antiFriendsBook.get(count));
        }
        System.out.println("\n" + "Archrival:" + "\t" + archRival + "\n" + "\n"
                + "Gadgets:" + "\n" + myGadgets.toString().replaceAll("[\\[\\],]", ""));
        return "";
    }

}
