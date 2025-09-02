import java.util.*;
class array{
    public static void main(String [] args){
    int[] squares=new int[10];
    for(int i=0;i<squares.length;i++){
        squares[i]=(i+1)*(i+1);
    }
    System.out.println("the squares of first 10 natural numbers are:");
    for(int i=0;i<squares.length;i++){
        System.out.println("square of " + (i+1) + " = " + squares[i]);
    }  
}
} 