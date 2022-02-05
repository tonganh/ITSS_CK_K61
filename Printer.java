public class Printer {
    private  static  Printer printer;
    public static Printer getPrinter(){
        if (printer ==null){
            printer=new Printer();
        }
        return printer;
    }

    public Image createTicketImage(Ticket ticket){
        return null;
    }
    public String printTicket(Image ticketImage){
        return null;
    }

}
