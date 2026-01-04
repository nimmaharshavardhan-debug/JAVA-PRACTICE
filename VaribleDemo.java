public class VaribleDemo{
    // instance varibles
    int instanceVar = 10;

    // static variable
    static String staticVar = "I am static";

    public void showVarible(){
        int localVar = 5;
        System.out.println("Instance variable : "+ instanceVar);
        System.out.println("Ststic variable : "+ staticVar);
        System.out.println("Local variable : "+ localVar);
    }

    public static void main(String[] args){
        VaribleDemo obj1 = new VaribleDemo();
        obj1.showVarible();

        // Acessing static varible directly using class name
        System.out.println("Accessing static variable : "+VaribleDemo.staticVar);
    }


}