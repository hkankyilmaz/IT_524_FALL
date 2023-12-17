import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int rndNumber = rnd.nextInt(100);
        System.out.println(rndNumber);
        boolean isCorrect = false;
        int count = 0;

        while (count < 10 && !isCorrect) {

            System.out.println("Plaase enter your guess");
            int guess = input.nextInt();

            if (guess != rndNumber) {

                if (count == 9) System.out.println("You fail in 10 attempt");
                else {
                    if (guess > rndNumber) System.out.println("smaller");
                    else System.out.println("bigger");
                }


                count++;

            } else {
                int _count = count +1;
                System.out.println("equal --- You win ! count---> " + _count);
                isCorrect = true;
            }

        }


    }
}
