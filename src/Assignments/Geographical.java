package Assignments;

public enum Geographical {
    NORTH_CENTRAL(new String[]{"Benue", "Abuja", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_WEST(new String[]{"Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"}),;


    private  String[] states;


    Geographical(String [] states) {
        this.states = states;
    }
          public String[] state() {
        return this.states;
    }
    
   public static Geographical geopolitical(String states){

        for (Geographical zone : Geographical.values())
            for(String state: zone.state()) {
                boolean isState =state.equalsIgnoreCase(states);
                if (isState){return zone;}
            }
       return null;
   }


    }











