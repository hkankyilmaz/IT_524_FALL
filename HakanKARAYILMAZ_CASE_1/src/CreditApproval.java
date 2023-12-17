import java.util.Scanner;

public class CreditApproval {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if ( age >= 31 && age < 41 ) System.out.println("Credit Approved");
        else {
            if (age <= 30) {
                System.out.println("Please enter your credit rating [ 1: Excellent, 0: Fair ]");
                byte number = input.nextByte();
                if (number == 1 ) System.out.println("Credit Approved");
                else System.out.println("Credit Rejected");
            }else {
                System.out.println("Are you Emplooye [ 1: Yes, 0: No ]");
                byte number = input.nextByte();
                if (number == 1 ) System.out.println("Credit Approved");
                else System.out.println("Credit Rejected");
            }
        }

    }
}