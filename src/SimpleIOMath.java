import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Simple  I/O project using Objects
 * @version 09.23/2022
 * @author 24steinbergb
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Ask the user questions and get input.
     */
    public void promptUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *\n" + "*All you gotta do is repeat after me*");
        System.out.print("What is your name?: ");
        name = in.nextLine();
        System.out.print("How old are you?: ");
        age = in.nextInt();
        System.out.print("What is your favNumber?: ");
        favNumber = in.nextInt();
        System.out.println("i'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" + "Let me tell you what it's all about\n" + "Reading, writing, arithmetic \n " +
                "Are the branches of the learning tree");

    }

    /**
     * Narrators Response
     */
    public void printInfo() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " +age);
        System.out.println ("At your next birthday, you will turn " + (age + 1) + ".");
        System.out.println("The first prime factor of " + age + " is " + smallestPrimeFactor(age));
        System.out.println("Your favorite number squared is: " + (favNumber * favNumber));
        System.out.println("* end of program*");
    }


    // Boolean for loop used to find if a number is prime (false = prime)
    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private int smallestPrimeFactor ( int num){
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                if (num % i == 0)
                    return i;
            }
        }
        return num;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line argument, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();

    }
}