import java.util.Scanner;
public class Driver { 
    public static void main(String[] args) { 
        Scanner scnr = new Scanner(System.in);
        System.out.println("Is this your class? Y/N?");
        String input = scnr.next();
        if(input.equalsIgnoreCase("yes")) { 
            MyClass mine = new MyClass();
            System.out.println(mine);
        }
        else { 
            System.out.println("Good boy..");
        }
    }
}