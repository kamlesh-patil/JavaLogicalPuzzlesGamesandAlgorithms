//from 1 to 100 if number divisible by 3 then Fizz and by 5 then Buzz if both then fizzBuzz
public class FizzBuzz{
    public static void main(String args[]){
       for(int i=1;i<=100;i++){
           if(i%3==0 && i%5==0){    //or you can use (i%15 == 0)
               System.out.println("FizzBuzz");
           }else if(i%3==0){
               System.out.println("Fizz");
           }else if(i%5==0){
               System.out.println("Buzz");
           }else{
               System.out.println(i);
           }
       }
       System.out.println("\nRecursive Solution\n");
       recursiveSolution(1);
   }
   public static int recursiveSolution(int i) {
    if(i>100){
        return 1;
    }else if(i%3==0 && i%5==0){    //or you can use (i%15 == 0)
        System.out.println("FizzBuzz");
    }else if(i%3==0){
        System.out.println("Fizz");
    }else if(i%5==0){
        System.out.println("Buzz");
    }else{
        System.out.println(i);
    }   
    return recursiveSolution(i+1);
   }
}