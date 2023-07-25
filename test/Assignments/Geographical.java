package Assignments;

public enum Geographical {
    NORTH_CENTRAL   ("Benue, ABUJA FCT, Kogi, Kwara, Nasarawa, Niger, Plateau"),
    NORTH_EAST  ("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe"),
    NORTH_WEST  ("Kaduna, Katsina, Kano, Kebbi, Sokoto, Jigawa, Zamfara"),
    SOUTH_WEST  ("Ekiti, Lagos, Osun, Ondo, Ogun, Oyo"),
    SOUTH_EAST  ("Abia, Anambra, Ebonyi, Enugu, Imo"),
    SOUTH_SOUTH ("Akwa-Ibom, Bayelsa, Cross-River, Delta, Edo, Rivers."),
    ;

    private String state;


      Geographical(String state) {
        this.state = state;
    }



    public String state() {
        return this.state;
    }
}






