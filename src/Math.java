import java.util.Random;

class Math {
    /**
     * method for returning specific id string output
     * @param counter = variable for returing specific id string output
     * @return  String id
     */
    String incrementID(int counter) {
        String id = "";
        if (counter < 10) {
            id = "00" + counter;
        }
        if (counter > 9) {
            id = "0" + counter;
        }

        if (counter >= 100) {
            id = "" + counter;
        }

        return id;
    }

    int createRandom(){
        Random r = new Random();
        int upperbound = 5;
        return r.nextInt(upperbound);
    }
}
