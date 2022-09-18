import java.util.Scanner;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        int morpion[] = {0,0,0,0,0,0,0,0,0};
        display(morpion);

        Scanner input = new Scanner(System.in);

        boolean win = false;

        while(win !=true){

            // start
            System.out.println("Select a number between 1 and 9.");

            // your turn

            // your number
            int x = input.nextInt() - 1;

            // check if your numer is ok
            while(true) {
                if(morpion[x] != 0) {
                    System.out.println("This case is already used. Choose an other number.");
                    x = input.nextInt();
                } else {
                    morpion[x] = 1;
                    break;
                }
            }
            
            // your win conditions
            if (morpion[0] == 1 && morpion[4] == 1 && morpion[8] == 1){
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;

            } if (morpion[0] == 1 && morpion[1] == 1 && morpion[2] == 1) {
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;
                
            } if (morpion[0] == 1 && morpion[3] == 1 && morpion[6] == 1) {
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;

            } if (morpion[1] == 1 && morpion[4] == 1 && morpion[7] == 1) {
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;

            } if (morpion[2] == 1 && morpion[5] == 1 && morpion[8] == 1) {
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;

            } if (morpion[3] == 1 && morpion[4] == 1 && morpion[5] == 1) {
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;

            } if (morpion[6] == 1 && morpion[7] == 1 && morpion[8] == 1) {
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;

            } if (morpion[6] == 1 && morpion[4] == 1 && morpion[2] == 1) {
                win = true;
                display(morpion);

                System.out.println("Well done, you win !");
                break;

            } else {
                win = false;
            }

            display(morpion);
            System.out.println();

            // computer turn

            // generate a random number between 0 and 8
            Random random = new Random();
            int rand = random.nextInt(9);;
            while (morpion[rand] != 0){
                rand = random.nextInt(9);
            }

            // computer "thinking"
            if (morpion[0] == 2 && morpion[4] == 2){
                rand = 8;
            } if (morpion[8] == 2 && morpion[4] == 2){
                rand = 0;
            } if (morpion[0] == 2 && morpion[8] == 2){
                rand = 4;
            } if (morpion[0] == 2 && morpion[1] == 2){
                rand = 2;
            } if (morpion[0] == 2 && morpion[2] == 2){
                rand = 1;
            } if (morpion[1] == 2 && morpion[2] == 2){
                rand = 0;
            } if (morpion[0] == 2 && morpion[3] == 2){
                rand = 6;
            } if (morpion[0] == 2 && morpion[6] == 2){
                rand = 3;
            } if (morpion[3] == 2 && morpion[6] == 2){
                rand = 0;
            } if (morpion[1] == 2 && morpion[4] == 2){
                rand = 7;
            } if (morpion[1] == 2 && morpion[7] == 2){
                rand = 4;
            } if (morpion[4] == 2 && morpion[7] == 2){
                rand = 1;
            } if (morpion[2] == 2 && morpion[5] == 2){
                rand = 8;
            } if (morpion[2] == 2 && morpion[8] == 2){
                rand = 5;
            } if (morpion[8] == 2 && morpion[5] == 2){
                rand = 2;
            } if (morpion[3] == 2 && morpion[4] == 2){
                rand = 5;
            } if (morpion[3] == 2 && morpion[5] == 2){
                rand = 4;
            } if (morpion[5] == 2 && morpion[4] == 2){
                rand = 3;
            } if (morpion[6] == 2 && morpion[7] == 2){
                rand = 8;
            } if (morpion[8] == 2 && morpion[7] == 2){
                rand = 6;
            } if (morpion[8] == 2 && morpion[6] == 2){
                rand = 7;
            } if (morpion[2] == 2 && morpion[4] == 2){
                rand = 6;
            } if (morpion[4] == 2 && morpion[6] == 2){
                rand = 2;
            } if (morpion[2] == 2 && morpion[6] == 2){
                rand = 4;
            } else {
                if (morpion[0] == 1 && morpion[4] == 1){
                    rand = 8;
                } if (morpion[8] == 1 && morpion[4] == 1){
                    rand = 0;
                } if (morpion[0] == 1 && morpion[8] == 1){
                    rand = 4;
                } if (morpion[0] == 1 && morpion[1] == 1){
                    rand = 2;
                } if (morpion[0] == 1 && morpion[2] == 1){
                    rand = 1;
                } if (morpion[1] == 1 && morpion[2] == 1){
                    rand = 0;
                } if (morpion[0] == 1 && morpion[3] == 1){
                    rand = 6;
                } if (morpion[0] == 1 && morpion[6] == 1){
                    rand = 3;
                } if (morpion[3] == 1 && morpion[6] == 1){
                    rand = 0;
                } if (morpion[1] == 1 && morpion[4] == 1){
                    rand = 7;
                } if (morpion[1] == 1 && morpion[7] == 1){
                    rand = 4;
                } if (morpion[4] == 1 && morpion[7] == 1){
                    rand = 1;
                } if (morpion[2] == 1 && morpion[5] == 1){
                    rand = 8;
                } if (morpion[2] == 1 && morpion[8] == 1){
                    rand = 5;
                } if (morpion[8] == 1 && morpion[5] == 1){
                    rand = 2;
                } if (morpion[3] == 1 && morpion[4] == 1){
                    rand = 5;
                } if (morpion[3] == 1 && morpion[5] == 1){
                    rand = 4;
                } if (morpion[5] == 1 && morpion[4] == 1){
                    rand = 3;
                } if (morpion[6] == 1 && morpion[7] == 1){
                    rand = 8;
                } if (morpion[8] == 1 && morpion[7] == 1){
                    rand = 6;
                } if (morpion[8] == 1 && morpion[6] == 1){
                    rand = 7;
                } if (morpion[2] == 1 && morpion[4] == 1){
                    rand = 6;
                } if (morpion[4] == 1 && morpion[6] == 1){
                    rand = 2;
                } if (morpion[2] == 1 && morpion[6] == 1){
                    rand = 4;
                }
            }
            
            // cumputer playing
            while(true) {
                if(morpion[rand] != 0) {
                    rand = input.nextInt();
                } else {
                    morpion[rand] = 2;
                    break;
                }
            }

            display(morpion);
            System.out.println();

            // computer win
            if (morpion[0] == 2 && morpion[4] == 2 && morpion[8] == 2){
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;

            } if (morpion[0] == 2 && morpion[1] == 2 && morpion[2] == 2) {
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;
                
            } if (morpion[0] == 2 && morpion[3] == 2 && morpion[6] == 2) {
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;

            } if (morpion[1] == 2 && morpion[4] == 2 && morpion[7] == 2) {
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;

            } if (morpion[2] == 2 && morpion[5] == 2 && morpion[8] == 2) {
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;

            } if (morpion[3] == 2 && morpion[4] == 2 && morpion[5] == 2) {
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;

            } if (morpion[6] == 2 && morpion[7] == 2 && morpion[8] == 2) {
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;

            } if (morpion[6] == 2 && morpion[4] == 2 && morpion[2] == 2) {
                win = true;
                display(morpion);

                System.out.println("You loose !");
                break;

            } else {
                win = false;
            }
        }
    }

    private static void display(int[] morpion) {
        System.out.println(morpion[0]+" "+morpion[1]+" "+morpion[2]);
        System.out.println(morpion[3]+" "+morpion[4]+" "+morpion[5]);
        System.out.println(morpion[6]+" "+morpion[7]+" "+morpion[8]);
    }
}