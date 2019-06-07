//number which multiplies starting from one to itself in between all the numbers
import java.util.Scanner;
public class Factorial{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth value as integer");
        int num = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if(num<0){
            System.out.println("Factorial of Negative Number Does Not Exitst...");
            return;
        }
        System.out.println("By Using Loop      Calculation of "+num+" is "+calculateLoop(num));
        System.out.println("By Using Recursion Calculation of "+num+" is "+calculateRecursion(num));
    }
    public static int calculateLoop(int n){
        int factorial=n;
        System.out.println("Factorial of "+n+" is ");
        for(int i=1; i<n; ++i){
            factorial *= i; 
        }
        return factorial;
    }
    public static int calculateRecursion(int n){
        if(n==1){
            return 1;
        }
        return n * calculateRecursion(n-1);
    }
}
