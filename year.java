import java.util.*;
class age{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year you were born:");
        int birthyear=sc.nextInt();
        int year=2025;
        int age=year-birthyear;
        System.out.println("your age is "+age);
    }
}