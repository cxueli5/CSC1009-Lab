//import java packages

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//start of testing program
public class RandomCharacterTest {

    //test if getRandomLowerCaseLetter() works
    @Test
    public void randomLowerCaseLetterTest() {
        int lowerCaseAAsciiCode = 97;   // a
        int lowerCaseZAsciiCode = 122;  // z
        //for loop to get 15 lowercase letters
        for (int i = 0; i < 15; i++) {
            //get random lowercase letter from getRandomLowerCaseLetter()
            char letter = RandomCharacter.getRandomLowerCaseLetter();
            //condition is true
            //condition: if random alphabet is within the lowercase letters ascii code range
            assertTrue(letter >= lowerCaseAAsciiCode && letter <= lowerCaseZAsciiCode);
        }
    }

    //test if getRandomUpperCaseLetter() works
    @Test
    public void randomUpperCaseLetterTest() {
        int upperCaseAAsciiCode = 65; // A
        int upperCaseZAsciiCode = 90; // Z
        //for loop to get 15 uppercase letters
        for (int i = 0; i < 15; i++) {
            //get random uppercase letter from getRandomUpperCaseLetter()
            char letter = RandomCharacter.getRandomUpperCaseLetter();
            //condition is true
            //condition: if random alphabet is within the uppercase letters ascii code range
            assertTrue(letter >= upperCaseAAsciiCode && letter <= upperCaseZAsciiCode);
        }
    }

    //test if getRandomDigitCharacter() works
    @Test
    public void randomDigitCharacterTest() {
        int digitCharacter0AsciiCode = 48; // 0
        int digitCharacter9AsciiCode = 57; // 9
        //for loop to get 15 digit characters
        for (int i = 0; i < 15; i++) {
            //get random digit character from getRandomDigitCharacter()
            char digit = RandomCharacter.getRandomDigitCharacter();
            //condition is true
            //condition: if random digit character is within the digit characters ascii code range
            assertTrue(digit >= digitCharacter0AsciiCode && digit <= digitCharacter9AsciiCode);
        }
    }

    //test if checkPrimeNumber() works
    @Test
    public void checkPrimeNumberTest() {
        //it is a prime number
        boolean checkPrime = true;
        //value used to check if it is prime number
        char val = 3;
        //get checkPrimeNumber function. boolean as checkPrimeNumber() returns a boolean value
        boolean testFunction;
        //intialise checkPrimeNumber() function with testFunction variable
        //checks if val (as initialised earlier) is a prime number
        testFunction = RandomCharacter.checkPrimeNumber(val);
        //if val is a prime number is true, equals to checkPrime (which is true)
        assertEquals(checkPrime, testFunction);
    }

    //test if checkPrimeNumber() works
    @Test
    public void randomCharacterTest() {
        //for loop to get 15 characters
        for (int i = 0; i < 15; i++) {
            //get random digit character from getRandomCharacter()
            char testChar = RandomCharacter.getRandomCharacter();
            //condition is true
            //condition: if random character is within the static string of characters (in RandomCharacter.java)
            //given that the static string is not empty
            assertTrue(RandomCharacter.characterList.indexOf(testChar) != -1);
        }
    }
}