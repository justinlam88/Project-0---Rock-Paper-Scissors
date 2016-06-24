package com.company;
import java.util.*;


public class Main {

   public static int move;
    public static int num;
   // public satic int compMove;

    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);


        Random generator = new Random();
         num = generator.nextInt(3);



        System.out.println("Play or History");
        String answer = question.next();
        mainMenu(answer);


        System.out.println("rock, paper, or scissor");
        String answer2 = question.next();
        choices(answer2);

        String h = "outcome";
       game(h);


    }

    public static void mainMenu(String menu) {

        menu = menu.toLowerCase();

        if (menu.equals("play")) {
            System.out.println("lets play");

        } else {
            System.out.println("invalid");

        }
    }

    public static void choices(String x) {


        if (x.equals("rock")) {
            move = 1;
        }

        else if(x.equals("paper")){
            move = 2;
        }

        else if(x.equals("scissor")){
            move = 3;
        }


    }

    public static void game(String h){

        switch(move){
            case 1:
                if(move == num){
                    System.out.println("tie");
                }
                else if(num == 2){
                    System.out.println("lose");
                }
                else if(num == 3){
                    System.out.println("win");
                }
                break;

            case 2:
                if(move == num){
                    System.out.println("tie");
                }
                else if(num == 1){
                    System.out.println("win");
                }
                else if(num == 3){
                    System.out.println("lose");
                }
                break;
            case 3:
                if(move == num){
                    System.out.println("tie");
                }
                else if(num == 2){
                    System.out.println("win");
                }
                else if(num == 1){
                    System.out.println("lose");
                }
                break;

        }

    }

    



}
