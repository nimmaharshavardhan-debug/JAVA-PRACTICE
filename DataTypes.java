public class DataTypes{
    public static void main(String [] args){
        // Primitive data types
        byte b = 100;   // 1 byte
        short s = 30000; // 2 byte
        int i = 1000000; // 4 byte
        long l = 100000000L; // 8 byte
        float f = 3.14f; // 4 byte
        double d = 3.1223344; // 8 byte
        char ch = 'a';
        boolean bo = true;

        // Non primitive data types
        String str = "Hello java  ";  // String class in java
        int [] arr = {12,23,34,56,}; // array
        Integer wrapperInt = Integer.valueOf(50); //wrapper class example
        StringBuilder sb = new StringBuilder("Java"); // class object

        // Output print function
        System.out.println("Primitive Data Types");

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(bo);

        System.out.println("Non Primitive Data Types");

        System.out.println(str);
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println(wrapperInt);
        System.out.println(sb);
    }

}