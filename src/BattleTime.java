import java.util.concurrent.TimeUnit;

class BattleTime {
    static void Battle() throws InterruptedException {

        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.print("3");
        TimeUnit.MILLISECONDS.sleep(750);
        System.out.print("\b");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("2");
        TimeUnit.MILLISECONDS.sleep(750);
        System.out.print("\b");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("1");
        TimeUnit.MILLISECONDS.sleep(750);
        System.out.print("\b");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("FIGHT!");
        TimeUnit.MILLISECONDS.sleep(750);
        System.out.print("\b\b\b\b\b\b");
        System.out.print ("Pow! ");
        TimeUnit.MILLISECONDS.sleep(750);
        System.out.print("Kets! ");
        TimeUnit.MILLISECONDS.sleep(750);
        System.out.print("Bam! ");
        TimeUnit.MILLISECONDS.sleep(250);
        System.out.print("\b\b\b\b\b");
        TimeUnit.MILLISECONDS.sleep(250);
        System.out.print("Bam! ");
        TimeUnit.MILLISECONDS.sleep(250);
        System.out.print("\b\b\b\b\b");
        TimeUnit.MILLISECONDS.sleep(250);
        System.out.print("Bam!\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Knockout!");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print("\b\b\b\b\b\b\b\b\b");
        TimeUnit.MILLISECONDS.sleep(250);
        System.out.print("Knockout!");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print("\b\b\b\b\b\b\b\b\b");
        TimeUnit.MILLISECONDS.sleep(250);
        System.out.print("Knockout!");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print("\b\b\b\b\b\b\b\b\b");
        System.out.println();
    }
    static void loadingTime() throws InterruptedException {
        System.out.println();
        System.out.print("Game Over!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("\b\b\b\b\b\b\b\b\b\b");

    }
    public String toString() {
        return "";
    }
}