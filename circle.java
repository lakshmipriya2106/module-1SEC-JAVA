import java.util.*;
class circle{
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius of circle:");
    float radius=sc.nextFloat();
    float pi=3.14f;
    float area=pi*radius*radius;
    System.out.println("the area of circle is "+area);
}
}