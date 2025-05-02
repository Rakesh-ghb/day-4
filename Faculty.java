

public class Faculty {
    public void showFacultyDetails(String universityName, String facultyName, String department){
        System.out.println("universityName"+universityName);
        System.out.println("facultyName"+facultyName);
        System.out.println("department"+department);
    }
    public static void main(String[] args) {
        Faculty facultys =new Faculty();
        facultys.showFacultyDetails("standford university","DragGestureEvent.lisa green","physics");
        
    }
    }
