package question3;

import java.util.List;
import java.util.Map;

public class CodeRefactoring {

    //Refactored Method

    public double calculateTicketPrice(List<Map<String, Object>> tickets) { //Re named the function to explain the purpose better
        double total = 0;
        if(null != tickets && !tickets.isEmpty()) {                        // Process only if tickets list is not empty.
            for (Map<String, Object> ticket : tickets) {                   // Replaced the for loop for better code readability
                if(ticket == null || ticket.isEmpty())                     // If ticket is null, move to next ticket
                    continue;
                try{
                    double price = convertToDouble(ticket.get("price"));           // Handling Object casting
                    int quantity = convertToInt(ticket.get("quantity"));           // Handling Object casting
                    double discount = convertToDouble(ticket.get("discount"));     // Handling Object casting
                    total += price * quantity * (1 - discount);
                } catch (Exception e) {
                    System.err.println("Error thrown while calculateTicketPrice..."+e.getMessage());  // logging error for better approach
                }
            }
            return total;
        }
        return total;
    }

    //Object casting to double
    public static double convertToDouble(Object obj){
        if(obj instanceof Number)
            return ((Number)obj).doubleValue();
        return 0.0 ;
    }

    //Object casting to int
    public static int convertToInt(Object obj){
        if(obj instanceof Number)
            return ((Number)obj).intValue();
        return 0 ;

    }

}
