package Inheritance;

public class Child extends Parent {
//     Child(){
//         System.out.println("Child");
//     }
     static void show(){
         System.out.println("Child method");
     }
    public static void main(String[] args) {
        Child obj=new Child();//upcasting
//        ((Child) obj).show();//downcasting

        obj.show();
    }
}