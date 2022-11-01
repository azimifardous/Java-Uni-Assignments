import java.util.Scanner;
public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int frontRows = 600, middleRows = 400, backRows = 150, totalCost;

        System.out.println("Please enter the ticket type:");
        String ticketType = sc.next();

        ticketType = ticketType.toLowerCase(); // POINT

        if (ticketType.equals("front") || ticketType.equals("middle") || ticketType.equals("back")) {

            System.out.println("How many " + ticketType + " row tickets do you want?");
            int numberOfTickets = sc.nextInt();

            if (ticketType.equals("front")) {
                totalCost = numberOfTickets * frontRows;
                System.out.println("Total cost is " + totalCost + " TL.");
            } else if (ticketType.equals("middle")) {
                totalCost = numberOfTickets * middleRows;
                System.out.println("Total cost is " + totalCost + " TL.");
            } else {
                totalCost = numberOfTickets * backRows;
                System.out.println("Total cost is " + totalCost + " TL.");
            }
        } else {
            System.out.println("Invalid ticket type!");
        }

    }
}
