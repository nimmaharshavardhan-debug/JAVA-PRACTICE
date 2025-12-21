import java.util.*;
public class Input {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a = obj.nextInt();
        System.out.println("Enter a value : ");
        int b = obj.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
