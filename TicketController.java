public class TicketController {
    private  static  TicketController ticketController;
    public static TicketController getTicketController(){
    if (ticketController ==null){
        ticketController=new TicketController();
    }
    return ticketController;
    }

    public Ticket getTicketInformation(String type) throws Exception {
        if(type == null){
            throw new Exception("No keyword to get data");
        }
        return DBUtils.getTicketInformation(type);
    }
    public void saveBarcode(String barCode){
         DBUtils.saveBarCode(barCode);
    }
}
