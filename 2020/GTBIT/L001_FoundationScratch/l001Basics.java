import java.util.Scanner;
public class l001Basics{
    public static Scanner scn = new Scanner(System.in);

    public static int multiply(int a,int b){
        int c = a * b;
        return c;
    }
    
    public static int add(int a,int b){
        int c = a + b;
        return c;
    }
    
    public static int subtract(int a,int b){
        int c = b - a;
        return c;
    }
    
    public static int divide(int a,int b){
        int c = b / a;
        return c;
    }
    
    public static void printmessage(){
       System.out.println("see you soon!");
    }

    public static void gradingSystem(int marks){
        if(marks > 90){
            System.out.println("excellent");
        }else if(marks > 80){
            System.out.println("good");
        }else if(marks > 70){
            System.out.println("fair");
        }else if(marks > 60){
            System.out.println("meets expectations");
        }else{
            System.out.println("below par");
        }
    }

    public static void main(String[] args){
    //     System.out.println("Hello");
    //     System.out.println("Pepcoder");
    int a = scn.nextInt();
    int b = scn.nextInt();

    System.out.println(multiply(a,b));
    System.out.println(multiply(a,b));
    System.out.println(add(a,b));
    System.out.println(subtract(a,b));
    printmessage();
   }
}