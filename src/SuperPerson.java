public class SuperPerson {
    /**
     * String variable to remember id of the SuperPerson
     */
    private String id;
    /**
     * String variable to remember name of the SuperPerson
     */
    private String superName;
    /**
     * String variable to remember real name of the SuperPerson
     */
    private String realName;
    /**
     * Integer variable to remember age of the SuperPerson
     */
    private Integer age;
    /**
     * String variable to remember city where the SuperPerson is most active
     */
    private String city;
    /**
     * String variable to remember power level of the SuperPerson
     */
    private Integer powerLevel;
    /**
     * String variable to remember favorite sentence of the SuperPerson
     */
    private String oneLiner;

    /**
     * Constructor of Superclass when creating a new SuperPerson
     * this constructor contains the minimum information/variables for creating a SuperPerson
     * @param superName = name of SuperPerson
     * @param realName = real name of SuperPerson
     * @param age = age of SuperPerson
     * @param city = city where SuperPerson is most active
     * @param powerLevel = power level of SuperPerson
     * @param oneLiner = is favorite sentence of a SuperPerson
     */
    SuperPerson(String superName, String realName, Integer age, String city, Integer powerLevel, String oneLiner) {
        this.superName = superName;
        this.realName = realName;
        this.age = age;
        this.city = city;
        this.powerLevel = powerLevel;
        this.oneLiner = "\"" + oneLiner + "!\"";
    }

    /**
     * setter for setting id
     *
     * @param id = string id to set id of SuperPerson
     */
    void setId(String id) {
        this.id = id;
    }

    /**
     * getter for getting name of SuperPerson
     *
     * @return String name of SuperPerson
     */
    String getSuperName() {
        return superName;
    }
    /**
     * getter for getting power level of SuperPerson
     *
     * @return int power level of SuperPerson
     */
    public Integer getPowerLevel() {
        return powerLevel;
    }

    /**
     * getter for getting one liner of SuperPerson
     *
     * @return String one liner of SuperPerson
     */
    public String getOneLiner() {
        return oneLiner;
    }

    /**
     * toString method for printing SuperPerson with a specific layout
     *
     * @return String SuperPerson information
     */
    @Override
    public String toString() {
        return "ID" + "\t" + "\t" + id + "\n" +
                "Hero" + "\t" + superName + "\n" +
                "Name" + "\t" + realName + "\n" +
                "Age" + "\t" + "\t" + age + "\n" +
                "City" + "\t" + city + "\n" + "\n" +
                "One-liner" + "\t" + oneLiner + "\n";
    }
}

