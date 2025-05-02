public class Travel {
    public String getBookDetails(String agency,String destination,String traveller){
        return "\n agency:"+agency +"\n destination:"+destination+"\n taveller:"+traveller;
    }
    public static void main(String[] args) {
        Travel travel = new Travel();
        System.out.println(travel.getBookDetails("wander last traveller","paris","2"));
        System.out.println(travel.getBookDetails("wanderlast traveller","Tokoyo","3"));
    }
}

    
