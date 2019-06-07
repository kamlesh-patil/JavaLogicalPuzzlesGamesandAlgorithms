//1,1,2 ... is default pattern for fibonacci there is no zero
import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of sequence : ");
        int limit = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int num1=0,num2=1,next=0;
        System.out.print(num2);
        for(int i=1;i<limit;i++){
            next = num1+num2;
            num1=num2;
            num2=next;
            System.out.print(" "+next);
        }
        System.out.print("\n\nRecursive Solution\n");
        for(int i=0;i<limit;i++){
            System.out.print(recursiveSolution(i)+" ");
        }
   }
   public static int recursiveSolution(int n) {
       if(n<=1){
           return 1;
       }
       return recursiveSolution(n-2)+recursiveSolution(n-1);
   }
}

/*
//above recursion program requires for loop but this one don't
public class Fibonacci   
  {   
    static int n1=0;
    static int n2=1;
    static int nex=0;
    public static  void fb(int n)
    {
    if(n<10)
    {
      if(n==0)
       {
         System.out.print(" "+n);
         n++;
         fb(n);
       }
        else
           if(n==1)
       {
         System.out.print(" "+n);
         n++;
         fb(n);
       }

        else{ 
            nex=n1+n2;
            System.out.print(" "+nex);
            n1=n2;
            n2=nex;
            n++;
            fb(n);                
            }           
      }        
    }
    public static void main(String[] args)
    {
      fb(0);                                          
    }
}
*/


/*
 class FibonacciRecursion
{
private static int index = 0;
private static int stoppingPoint = 9;

public static void main (String[] args)
{
  int n1 = 0;
  int n2 = 1;

  fibonacciSequence(n1, n2);
}

public static void fibonacciSequence(int n1, int n2)
{
  System.out.println("index: " + index + " -> " + n1);

  // make sure we have set an ending point so this Java recursion
  // doesn't go on forever.
  if (index == stoppingPoint)
    return;

  // make sure we increment our index so we make progress
  // toward the end.
  index++;

  fibonacciSequence(n2, n1+n2);
}
}
*/

/*
import java.util.*; 
public class Fibonacci{
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no.");
    int n= sc.nextInt(),a=1,b=0,c=0;
    num(n,a,b,c);
  }
  public static void num(int n,int a,int b,int c){
    if(a<=n){
      System.out.println(a);
      c=b;
      b=a;
      a=b+c;
      num(n,a,b,c);
    }
  }
}
*/
