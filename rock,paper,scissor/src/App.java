
import java.util.*;
public class App {
        public static void main(String[] args) throws Exception {
        Scanner input =new Scanner (System.in);
    int x=(int)(Math.random()*100)+1;
    String n;
    if(x<=100&&x>70){
        n="Scissors";
    }else if(x<=70&&x>35){
        n="rock";
    }
    else{
        n="paper";
    }
    System.out.println("enter your choise ");
    System.out.println("1 for scissors , 2 for rock and 3 for paper ");

    String m=null;

    int choise=input.nextInt();
    switch(choise){
        case 1:
            m="scissors";
            break;
        case 2:
            m="rock";
            break;
        case 3:
            m="paper";
            break;
    }
    System.out.println("you chose "+"  "+m);
        System.out.println("computer chose "+"  "+n);

    if(n.equalsIgnoreCase("scissors")&& m.equalsIgnoreCase("paper")){
        System.out.println("computer wins ");
    }else if(n.equalsIgnoreCase("rock")&& m.equalsIgnoreCase("Scissors")){
        System.out.println("computer wins ");
    }else if(n.equalsIgnoreCase("paper")&&m.equalsIgnoreCase("rock")){
    System.out.println("computer wins ");}else if(m.equalsIgnoreCase("scissors ")&& n.equalsIgnoreCase("paper")){
        System.out.println("you won ");

    }else if(m.equalsIgnoreCase("rock")&& n.equalsIgnoreCase("Scissors")){
        System.out.println("you won");
    }else if(m.equalsIgnoreCase("paper")&&n.equalsIgnoreCase("rock")){
    System.out.println("you won ");}
    else if (n.equalsIgnoreCase(m)){
        System.err.println("you both chose the same hahahah");
    }
}}
    

