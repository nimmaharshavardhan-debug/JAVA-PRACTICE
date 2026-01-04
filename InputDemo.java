import java.util.Scanner;
public class InputDemo {
    public static void main(String[] args) {

        // Demo of the input Acessing the values at the run time 
        Scanner obj = new Scanner(System.in);
        System.out.println("Plese enter your Bio Data ");
        System.out.print("Please,Enter your name : ");
        String name = obj.nextLine();
        System.out.print("Please,mention your Gender : ");
        String gender = obj.nextLine();
        System.out.print("Please,Enter your age : ");
        int age = obj.nextInt();
        System.out.print("Please,Enter your date of birth : ");
        String DOB = obj.nextLine();
        obj.nextLine();
        System.out.print("Please,Provide your Mobile Number : ");
        long Mobile_Number = obj.nextLong();

        obj.close();
        System.out.println("Name : "+name);
        System.out.println("Gender  "+gender);
        System.out.println("Age : "+age);
        System.out.println("Date Of Birth : "+DOB);
        System.out.println("Mobile Number : "+Mobile_Number);




    }
}