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

    public static int chooseDifficulty()
    {
        Scanner chooseDifficultyScanner = new Scanner(System.in);
        int diff = chooseDifficultyScanner.nextInt();

        int diffNumber = 0;

        // tjekker brugerens input og generer et tilfældigt tal ud fra deres valg ved hjælp af randomNumberGen
        if (diff == 1) {
            diffNumber = randomNumberGen(11);
            System.out.println("Du har valgt sværhedsgraden nem. Gæt et tal mellem 1 og 10.");
        }
        else if (diff == 2) {
            diffNumber = randomNumberGen(51);
            System.out.println("Du har valgt sværhedsgraden mellem. Gæt et tal mellem 1 og 50.");
        }
        else if (diff == 3) {
            diffNumber = randomNumberGen(101);
            System.out.println("Du har valgt sværhedsgraden svær. Gæt et tal mellem 1 og 100.");
        }
        return diffNumber;
    }

    public static void checkGuess(int number)
    {
        Scanner guessInput = new Scanner(System.in); // opretter en scanner

        int guess = -1;
        int tries = 0; // definerer int'en tries og resetter den samtidig til 0 for hver gang programmes køres

        while (guess != number) { // loop som kører indtil brugeren svarer rigtigt

            guess = guessInput.nextInt();
            tries++; // tæller tries op med 1 gang per gang loopet køres

            // tjekker om brugerens input svarer til det genererede tal og svarer om det er for højt, lavt eller rigtigt
            if (guess == number) {
                System.out.println("Dit gæt er rigtigt. Tallet var: " + number);
                System.out.println("Du brugte " + tries + " forsøg.");
            } else if (guess > number) {
                System.out.println("Dit gæt er for højt. Prøv igen.");
            } else {
                System.out.println("Dit gæt er for lavt. Prøv igen.");
            }
        }
    }

    public static int randomNumberGen(int maksTal)
    {
        return (int)(1 + (Math.random() * maksTal)); // genererer et tilfældigt tal som er mindst 1
    }


    public static void handlePlayAgain()
    {
        // spørger om spilleren vil spille igen, og hvis ja køres programmet forfra
        System.out.println("Vil du spille igen? ('ja' eller 'nej')");
        Scanner input = new Scanner(System.in);
        String tryAgain = input.nextLine().toLowerCase();

        switch (tryAgain)
        {
            case "ja":
              runProgram(); // kører programmet forfra
              break;

            case "nej":
                System.out.println("Programmet afsluttes.");
                System.exit(0); // afslutter programmet

            default:
                System.out.println("Ugyldigt svar. Programmet afsluttes nu.");
                System.exit(0);
        }

    }


    public static void welcomeMsg()
    {
        // Her udskriver vi en velkomst besked samt hvilken sværhedsgrad man kan vælge mellem.
        System.out.println("Velkommen til gæt et tal spillet.");
        System.out.println("Vælg en sværhedsgrad: ");
        System.out.println("1. Let (1-10)");
        System.out.println("2. Mellem (1-50)");
        System.out.println("3. Svær (1-100)");
    }
}