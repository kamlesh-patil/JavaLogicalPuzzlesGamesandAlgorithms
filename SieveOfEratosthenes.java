import java.util.Scanner;
/*
we are finding prime numbers in given range from 2 to n 
we are ignoring 1 because one is not a prime number
*/
public class SieveOfEratosthenes{
    static boolean allNumbers[]; //we first assume all numbers are prime so it will set all number to true
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number: ");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int arrSize = n+1; 
        createArray(arrSize);
        Sieve(arrSize);

    }
    static void Sieve(int n){
        for(int i=2;i<n;i++){
            if(allNumbers[i]){
                for(int c=i; i*c<n; c++ ){
                    allNumbers[i*c]=false;
                }
            }
        }
        int counter=0;
        for(int i=2;i<n;i++){
            if(allNumbers[i]){
                System.out.print(i+" ");
                counter++;
            }
            if(counter==10){
                System.out.println();
                counter=0;
            }
        }
    }
    static void createArray(int n){
        allNumbers = new boolean[n];
        for (int i = 0; i < n; i++) {
            allNumbers[i] = true;
        }
    }
}
