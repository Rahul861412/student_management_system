import java.util.*;
public class std
{
    int id;
    String name;
    int marks;
    static ArrayList<std>abc=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public std(int id,String name,int marks){
        this.id=id;
        this.marks=marks;
        this.name=name;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
    	public static void main(String[] args) {
    	     int choice;

        do {
            System.out.println("\n----- Student Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1: add(); break;
                case 2: view(); break;
                case 3: update(); break;
                case 4: delete(); break;
                case 5: System.out.println("Exiting program."); break;
                default: System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
    }
	    
    
    public static void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id:");
        int i=sc.nextInt();
        System.out.println("enter the name:");
        String nam=sc.next();
        System.out.println("enter the marks:");
        int mark=sc.nextInt();
        
        abc.add(new std(i,"nam",mark));
        System.out.println("student added sucessfully");
    }
    public static void view(){
        if(abc.isEmpty()){
            System.out.println("no students records found");
        }
        else{
            System.out.println("student list are:");
            for(std s:abc){
                System.out.println(s);
            }
        }
        
    }
    public static void update(){
        System.out.println("enter id to be updated");
        int id=sc.nextInt();
        for(std s:abc){
            if(s.id==id){
                System.out.println("enter the new name");
                s.name=sc.next();
                System.out.println("enter new marks");
                s.marks=sc.nextInt();
                System.out.println("student added sucessfylly");
            }
            else{
                System.out.println("student with"+id+"not found");
            }
        }
    }
    public static void delete(){
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        boolean removed = abc.removeIf(s -> s.id == id);
        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
        
    }
}