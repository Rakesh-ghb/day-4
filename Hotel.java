public class Hotel {
    public String getReservationDetails(String hotelName,String guestname,int nights){
        return "\n hotelName:"+hotelName+"\n guestname:"+guestname+"\n nights:"+nights;
    }
    public static void main(String[] args) {
        Hotel hotel =new Hotel();
        System.out.println(hotel.getReservationDetails("Grandpalace", "david", 3));
        System.out.println(hotel.getReservationDetails("Grandpalace","maria",2));
    }
}

    

