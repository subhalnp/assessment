package question4;

import java.util.Map;

public class StadiumSeatAllocator {

    //Takes parameters as section ID to available seats and requested number of seats
    public static String allocateSeats(Map<String, Integer> availableSeatsMap, int numSeats){
       return availableSeatsMap.entrySet().stream()
                .filter(entry -> entry.getValue() >= numSeats) // filters only if avalableseats greater than or equal to requested seats
                .map(Map.Entry::getKey).findFirst().orElse(null); // findFirst satisfying section Id else return null.

    }

    public static void main(String[] args) {
        Map<String, Integer> availableSeatsMap = Map.of("A",6
        , "B",5
        , "C",4
        , "D",3
        , "E",2);

        System.out.println("section "+allocateSeats(availableSeatsMap, 2));
    }

}
