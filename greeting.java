import java.util.*;
class greeting{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=sc.nextLine();
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
    }