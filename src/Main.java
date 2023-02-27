import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    static int randomNumber = getRandomNumber();
    static int userNumber;

    public static int getRandomNumber() {
        Random rand = new Random();
        // Setting the upper bound to generate the
        // random numbers in specific range
        int upperbound = 101;
        // Generating random values from 0 to 100
        // using nextInt()
        return rand.nextInt(upperbound);
    }

    public static int getUserNumber() throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.print("Enter a number: ");
        return Integer.parseInt(in.readLine());
    }

    public static Boolean compareNumbers() {
        if (userNumber < randomNumber) {
            System.out.println("Number is greater than " + userNumber + ". Guess again");
            return false;
        } else if (userNumber > randomNumber) {
            System.out.println("Number is less than " + userNumber + ". Guess again");
            return false;
        } else {
            System.out.println("You won");
            return true;
        }
    }


    public static void main(String[] args) throws IOException {
        boolean isFinished;
        System.out.println("Hello, let's play a game");
        do {
            userNumber = getUserNumber();
            isFinished = compareNumbers();
        } while (!isFinished);

    }
    // Napisz program zgadnij liczbe
    // odczytywac w nieskonczonosc liczny dopoki uzytkownik nie trafi liczby ktora zostala wygenerowana losowo
    // jak wpisze za mala to ma wyswietlic to ma wyswietlic ze podana liczba jest za mala
    // jak za duza to ma wyswewitlic ze za duza
    // jak zgadnie to zakoncz program
}