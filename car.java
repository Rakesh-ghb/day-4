public class car {
    public void printcardetails(String showroomName, String modelName, int price){
    System.out.println("showroom name"+ showroomName);
    System.out.println("car model"+modelName);
    System.out.println("price"+price);
}
public static void main(String[] args) {
    car cars = new car();
    cars.printcardetails("Elite motors","tesla models",80000);
    
}
}