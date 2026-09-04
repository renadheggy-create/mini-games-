import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner (System.in);

 int x=(int)(Math.random()*100)+1;

int trials =0;

int guess;

 do{

 System.out.println("enter your guess");

guess=input.nextInt();

 if(guess>x){

System.out.println("its too high");

 }else if (guess<x){

 System.out.println("its too low ");

 }

 trials++;
}while(guess!=x);

System.out.println("you finally got it ");

System.out.println("your attamps "+"  "+trials);

    }
}
