import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = obj.nextInt();
        int num[] = new int[size];
        for(int i =0;i<size;i++){
            System.out.print("Enter array elements "+(i+1)+":");
            num[i]=obj.nextInt();
        }
        int sum =0;
        int average=0;
        for(int i=0;i<size;i++){
            sum=sum+num[i];
            average = sum/num.length;
        }
        
             System.out.println("The sum of the array :"+sum);
            System.out.println("The average of array elements : "+average);
            
        
        



    }
}
