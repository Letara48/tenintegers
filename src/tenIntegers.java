import java.util.Scanner;

public class tenIntegers {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int num, total = 0;
        for ( num = 0; num < 11; num ++){
            // Get user input
            System.out.println("Please give me a number: ");
            // assign num to keyboard
            num = keyboard.nextInt();
            total += num;



        }System.out.println("The total of all 10 numbers is " + total);



    }
}
