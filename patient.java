public class patient {
    public void printDetails(String hospitalName, String patientName, int age){
System.out.println("hospitalName"+hospitalName);
System.out.println("patientName"+patientName);
System.out.println("age"+age);
    }
    public static void main(String[] args) {
        patient patients =new patient();
        patients.printDetails("city care hospital", "john doe", 45);
    }
    
}
