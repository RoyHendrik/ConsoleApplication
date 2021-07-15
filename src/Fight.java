import java.util.ArrayList;

public class Fight {
    private ArrayList<String> historyOfFights = new ArrayList<>();
    private Hero hero;
    private Villain villain;
    private static int heroWinnings = 0;
    private static int villainWinnings = 0;
    private String winner;

    Fight() {

    }

    void newFight(Hero hero, Villain villain, String winner) {
        this.hero = hero;
        this.villain = villain;
        run(winner);
    }

    private void addFight(Fight fight) {
        historyOfFights.add(String.valueOf(fight));
    }

    private void run(String winner) {
        System.out.println(hero.getOneLiner());
        System.out.println(villain.getOneLiner());
        try {
            BattleTime.Battle();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        Math math = new Math();

        switch (winner.toLowerCase()) {
            case "h":
                System.out.println("gevecht is gewonnen door <" + hero.getSuperName() + ">!");
                this.winner = "h";
                break;
            case "v":
                System.out.println("gevecht is gewonnen door <" + villain.getSuperName() + ">!");
                this.winner = "v";
                break;
            case "n":
                for (int i = 1; i < 100; ) {

                    int winningChanceVillain = (villain.getPowerLevel() + villain.getMyGadgets().size()) * math.createRandom();
                    System.out.println("Villain random: " + winningChanceVillain / (hero.getPowerLevel() + hero.getMyGadgets().size()));
                    int winningChanceHero = (hero.getPowerLevel() + hero.getMyGadgets().size()) * math.createRandom();
                    System.out.println("Hero random: " + winningChanceHero / (hero.getPowerLevel() + hero.getMyGadgets().size()));
                    if (winningChanceHero > winningChanceVillain) {
                        System.out.println("gevecht is gewonnen door <" + hero.getSuperName() + ">!");
                        this.winner = "h";
                        heroWinnings++;
                    } else {
                        System.out.println("gevecht is gewonnen door <" + villain.getSuperName() + ">!");
                        this.winner = "v";
                        villainWinnings++;
                    }

                    addFight(this);
                    i++;
                }
                System.out.println("Hero wins: " + heroWinnings + " - " + "Villain wins: " + villainWinnings);

                break;
        }
        // when fight is over add fight to list
        addFight(this);

    }

    ArrayList<String> getFights() {
        return historyOfFights;
    }

    @Override
    public String toString() {
        if (winner.equals("v")) {
            return "\tMatch: \t" + hero.getSuperName() + " vs " + villain.getSuperName() + "\t winner = \t" + villain.getSuperName();
        } else {
            return "\tMatch: \t" + hero.getSuperName() + " vs " + villain.getSuperName() + "\t winner = \t" + hero.getSuperName();
        }
    }
}

