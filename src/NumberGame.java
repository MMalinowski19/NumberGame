import java.util.Scanner;
public class NumberGame {
    public static void main (String [] args) {
        int randomNumber = (int) (Math.random()*100)+1;
        boolean hasWon = false;
        System.out.println("Choose the number from 1 to 100");
        //System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        for (int i=10; i>0; i--){
            int guess = scanner.nextInt();
            System.out.println("You have "+ i +" tries. Choose again!");
            System.out.println(guess);
            if (randomNumber < guess){
                System.out.println("The number is smaller then "+guess);
            }
            if (randomNumber > guess){
                System.out.println("The number is bigger then " +guess);
            }
            if (randomNumber == guess){
                hasWon = true;
                System.out.println("Yeah! You win!");
                break;

            }
            if (i==1){
                System.out.println("You lose it");
            }

        }


    }
}
