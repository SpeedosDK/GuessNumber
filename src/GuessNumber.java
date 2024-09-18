import java.util.Locale;
import java.util.Scanner;
public class GuessNumber
{
    public static void main(String[] args)
    {
        runProgram(); // kører vores program
    }

    public static void runProgram()
    {
        welcomeMsg(); // udskriver velkomstbeskeden

        // bruger det tilfældige fra chooseDifficulty, sender det til checkGuess og modtager
        // input fra brugeren og tjekker om det er for højt, lavt eller rigtigt
        checkGuess(chooseDifficulty());

        handlePlayAgain(); // spørger om brugeren vil spille igen, og hvis sandt, spiller spillet igen
    }

    public static void checkGuess( int number)
    {
        Scanner guessInput = new Scanner(System.in);

        int guess = -1;
        while (guess != number) {

            System.out.println("Gæt et tal.");
            guess = guessInput.nextInt();

            if (guess == number) {
                System.out.println("Dit gæt er rigtigt " + number);
            } else if (guess > number) {
                System.out.println(" Dit gæt er for højt");
            } else if (guess < number) {
                System.out.println("Dit gæt er for lavt. Prøv igen.");

            }
        }
    }

    public static int randomNumberGen(int maksTal)
    {

    }

    public static void welcomeMsg()
    {
        System.out.println("Velkommen til gæt et tal spillet");
        System.out.println("Vælg en sværhedsgrad: ");
        System.out.println("1. Let (1-10)");
        System.out.println("2. Mellem (1-50)");
        System.out.println("3. Svær (1-100)");
    }
}