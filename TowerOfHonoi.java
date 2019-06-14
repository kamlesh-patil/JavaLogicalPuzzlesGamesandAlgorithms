import java.util.Scanner;

public class TowerOfHonoi{
    static int counter=0;
    static int discs=0;
    public static void main(String args[]){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please Enter no. of Discs ");
        discs=Integer.parseInt(scanner.nextLine());
        scanner.close();
        Tower(discs, 1, 3, 2);
    }
    public static void Tower(int n, int srcPeg , int destPeg, int sparePeg){
        if(n==1){
            System.out.println(counter+" "+srcPeg+"-->"+destPeg);
            counter++; 
        }
        else{
            Tower(n-1, srcPeg, sparePeg, destPeg);
            System.out.println(counter+" "+srcPeg+"-->"+destPeg);
            counter++;
            Tower(n-1, sparePeg, destPeg, srcPeg);
        }
    }
} 