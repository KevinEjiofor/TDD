package Assignments;

import java.util.Objects;
import java.util.Scanner;

import static Assignments.Geographical.*;

public class GeographicalState {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                :
                NORTH CENTRAL
                NORTH EAST
                NORTH WEST
                SOUTH WEST
                SOUTH EAST
                SOUTH SOUTH
                Enter the Geographical zone to  get the State names
                """);
        String state = input.next();

      if(Objects.equals(state, "NORTH CENTRAL")) {state = NORTH_CENTRAL.state();}

      else if (state.equalsIgnoreCase( "NORTH EAST")) {state = NORTH_EAST.state();}

      else if (Objects.equals(state, "NORTH WEST")){ state = NORTH_WEST.state();}

      else if (Objects.equals(state, "SOUTH WEST")){ state = SOUTH_WEST.state();}

      else if (Objects.equals(state, "SOUTH EAST")){state = SOUTH_EAST.state();}

      else if (Objects.equals(state, "SOUTH SOUTH")){state = SOUTH_SOUTH.state();}

      System.out.println(state);


    }
}
