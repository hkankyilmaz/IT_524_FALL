import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        System.out.println("Please enter the year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 ==0 && year % 400 ==0 ) System.out.println(year + " is leap day");
        else System.out.println(year + " is not leap day");

    }
}
