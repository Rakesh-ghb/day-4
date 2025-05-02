public class Enrollment {
    public String getEnrollmentInfo(String platform,String course,String student){
        return "\n platform:"+platform +"\n course:"+course+"\n student:"+student;
    }
    public static void main(String[] args) {
        Enrollment enrollment =new Enrollment();
        System.out.println(enrollment.getEnrollmentInfo("udemy","javaprograming","Alice"));
        System.out.println(enrollment.getEnrollmentInfo("udemy","webdevelopment","bob"));
    }
}
