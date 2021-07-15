import java.util.ArrayList;

public class Hero extends SuperPerson {

    /**
     * String variable to remember archRival of Hero
     */
    private String archRival;
    /**
     * static int variable to remember count of id for incrementing
     */
    private static int idCounter = 1;
    /**
     * ArrayList of Strings to store names of villains the hero thinks who are stupid
     */
    private ArrayList<String> antiFriendsBook;
    /**
     * ArrayList of Gadgets the hero owns and uses in fights
     */
    private ArrayList<Gadget> myGadgets = new ArrayList<>();

    /**
     * constructor for creating a new hero
     * @param superName = name of the hero
     * @param realName = real name of the hero
     * @param age = the age of the hero
     * @param city = the city where the hero is most active
     * @param powerLevel = the power level of the hero
     * @param oneLiner = the favorite sentence of hero to create fear to hero's opponent
     * @param archRival = the name of villain the hero thinks is extra stupid
     */
    Hero(String superName, String realName, Integer age, String city, Integer powerLevel, String oneLiner, String archRival) {
        super(superName, realName, age, city, powerLevel, oneLiner);
        this.archRival = archRival;
        Math math = new Math();
        super.setId("#H" + math.incrementID(idCounter));
        idCounter++;

    }

    /**
     * method for adding gadgets of hero to its arsenal
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
     * method for adding villains who the hero thinks are stupid to ArrayList of antiFriendsBook
     * @param villains  list of all available villains
     */
    void createAntiFriendsBook(ArrayList<Villain> villains) {
        ArrayList<String> antiFriendsBook = new ArrayList<>();
        for (Villain villain : villains) {
            if (!villain.getSuperName().toLowerCase().equals(archRival.toLowerCase())) {
                antiFriendsBook.add(villain.getSuperName());
            }

        }
        this.antiFriendsBook = antiFriendsBook;
    }


    ArrayList<Gadget> getMyGadgets() {
        return myGadgets;
    }

    /**
     * overriding toString method from super for printing information of a hero with a specific layout
     * @return String Hero information
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
