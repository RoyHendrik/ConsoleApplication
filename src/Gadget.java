public class Gadget {

    /**
     * String variable to remember id of gadget
     */
    private String id;

    /**
     * String variable to remember name of gadget
     */
    private String name;

    /**
     * String variable to remember owner of gadget
     */
    private String description;


    /**
     * static int variable to remember count of id for incrementing
     */
    private static int idCounter = 1;

    /**
     * constructor for creating a new gadget
     * @param name = name of gadget
     * @param description = name owner gadget
     */
    Gadget(String name, String description) {
        this.name = name;
        this.description = description;
        Math math = new Math();
        this.id = "#G" + math.incrementID(idCounter);
        idCounter++;
    }

    /**
     *  getter for returning the name of gadget
     *  @return String name
     */
    String getName() {
        return name;
    }

    /**
     * getter for returning the id of gadget
     * @return String id
     */
    String getId() {
        return id;
    }

    /**
     * getter for returning the description of gadget(name owner of gadget)
     * @return String description
     */
    String getDescription() {
        return description;
    }

    /**
     * toString method for returning only the string name of the gadget
     * @return String name of gadget
     */
    @Override
    public String toString() {
        return
                "\t" + "\t" + name + "\n";
    }
}
