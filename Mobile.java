public class Mobile {
    public void showDetails(String storeName, String brand, int price){
System.out.println("storeName"+storeName);
System.out.println("Stringbrand"+brand);
System.out.println("intprice"+ price);
    }
public static void main(String[] args) {
    Mobile mobiles = new Mobile();
    mobiles.showDetails("Tech World","Apple",  1200 );
    
}

    
}
