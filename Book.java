public class Book {
    public void displayInfo(String libraryName, String title, String author){
    System.out.println("libraryName"+ libraryName);
    System.out.println("title"+title);
    System.out.println("author"+author);
    }
    public static void main(String[] args) {
        Book Book =new  Book();
        Book.displayInfo("City public Library", "The great gatsby"," f.Scott fitzgraland");
    }
         }

