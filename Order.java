public class Order {
    public String getOrderDetails(String restaurantName, String foodItem, int quantity){
        return "\nrestaurantName is:"+ restaurantName +"\nfoodItem is"+ foodItem +"\nquantity is:"+quantity;
    }
    public static void main(String[] args) {
        Order orders= new Order();
      System.out.println( orders.getOrderDetails("Spice Garden", "paneer buter masala", 2));
      System.out.println( orders.getOrderDetails("Spice Garden", "chicken biryani", 1));
    }

    }
    

