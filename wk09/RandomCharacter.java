//import java libraries

import java.util.Random;

//start of RandomCharacter program
public class RandomCharacter {

    //  method to get a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        Random r = new Random();    //create random object
        //generate a lowercase letter in char datatype. 26 as there are 26 alphabets.
        return (char) (r.nextInt(26) + 'a');
    }

    //  method to get a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        Random r = new Random();    //create random object
        //generate an uppercase letter in char datatype. 26 as there are 26 alphabets.
        return (char) (r.nextInt(26) + 'A');
    }

    //  method to get a random digit character
    public static char getRandomDigitCharacter() {
        Random r = new Random();    //create random object
        //generate a digit character in char datatype. 10 as there 10 digits (0,1,2,3..,9)
        return (char) (r.nextInt(10) + '0');
    }

    //  create a string of characters
    public static String characterList = "0123456789abcdefghuijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    //  method to get a random character from a String of characters
    public static char getRandomCharacter() {
        Random r = new Random();    //create random object
        //get a random index of a character within the characterList string
        int listIndex = r.nextInt(characterList.length());
        //get the character from the random index as obtained in listIndex
        char randomChar = characterList.charAt(listIndex);
        //return the random character that was obtained
        return randomChar;
    }

    //  method to check if random digit character generated is a prime number
    public static boolean checkPrimeNumber(int val) {
        boolean isPrime = true;     //digit character is a prime number by default
        //if digit character is 0 or 1, not a  prime number as 0 and 1 are not prime numbers
        if (val == 0 || val == 1) {
            isPrime = false;
            return isPrime;
        }

        //check for not prime numbers, if digit character is divisible by any value other than itself
        //then that digit character is not a prime number
        else {
            for (int i = 2; i <= val / 2; i++) {
                if (val % i == 0) {
                    isPrime = false;
                }
            }
        }
        //return true or false if digit character is a prime number or not
        return isPrime;
    }

    //  start of main function to test methods
    public static void main(String[] args) {

        //the limit for loop to stop, in this case 15, as want to generate 15 characters
        int n = 15;

        //test getRandomLowerCaseLetter() method
        System.out.println("Lowercase: ");
        //for loop to generate 15 lowercase letters
        for (int i = 0; i < n; i++) {
            System.out.print(getRandomLowerCaseLetter() + " ");
        }

        //just some spacing to make print result look nicer
        System.out.println();
        System.out.println();

        //test getRandomUpperCaseLetter() method
        System.out.println("Uppercase: ");
        //for loop to generate 15 uppercase letters
        for (int i = 0; i < n; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
        }

        //just some spacing to make print result look nicer
        System.out.println();
        System.out.println();

        //test getRandomDigitCharacter() method
        System.out.println("Digit: ");
        //for loop to generate 15 digit characters
        for (int i = 0; i < n; i++) {
//            this line was used to test if for loop works
//            System.out.print(getRandomDigitCharacter() + " ");

            //check if digit characters generated are prime numbers
            char digit = getRandomDigitCharacter();
            //call checkPrimeNumber function, boolean as function returns boolean value
            boolean isPrime = checkPrimeNumber(digit - '0');
            //print digit character and check if it's a prime number
            System.out.println("Is " + digit + " a Prime Number?");
            //if digit character is a prime number, print digit : true
            if (isPrime == true) {
                System.out.println(digit + " : " + isPrime);
            } else {
                //if digit character is not a prime number, print digit : false
                System.out.println(digit + " : " + isPrime);
            }
            //just some spacing to make print result look nicer
            System.out.println();

        }

        //test getRandomCharacter() method
        System.out.println("Random Character: ");
        //for loop to generate 15 random characters
        for (int i = 0; i < n; i++) {
            System.out.print(getRandomCharacter() + " ");
        }

    }
}