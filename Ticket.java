public class Ticket {
    public String  getTicketInfo(String theaterName, String movieName, String seatNo){
    return "\ntheaterName :"+theaterName + "\nmovieName"+ movieName +"\n :seatNo :"+seatNo;
    }
    public static void main(String[] args) {
        Ticket tickets =new Ticket();
       System.out.println(tickets.getTicketInfo("Galaxy cinemas","Interesteller","A10"));
    System.out.println(tickets.getTicketInfo("Galaxy cinemas","Inception","B12"));
    }
    
}
