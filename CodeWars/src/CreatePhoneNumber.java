//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CreatePhoneNumber {
    public static void main(String[] args) {


        //Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
        // Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7};
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Invalid number");
        }

        System.out.printf("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);

//        return Arrays.stream(numbers)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining())
//                .replaceFirst("^(\\d{3})(\\d{3})(\\d{4})$", "($1) $2-$3");


    }
}