import java.util.Scanner;

public class Boundary {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Type you want to get");

        String type = myObj.nextLine();  // Read user input
        Ticket ticketInformation = TicketController.getTicketController().getTicketInformation(type);
        System.out.println("Type:"+ticketInformation.getType());
        System.out.println("Name:"+ticketInformation.getName());
        System.out.println("Price:"+ticketInformation.getPrice());

        System.out.println("Type 1 to accept this ticket.");
        String response = myObj.nextLine();
        if(response == "1"){
            Image imagePrint = Printer.getPrinter().createTicketImage(ticketInformation);
            String barcode = Printer.getPrinter().printTicket(imagePrint);
            System.out.println(barcode);
        }
    }
}
