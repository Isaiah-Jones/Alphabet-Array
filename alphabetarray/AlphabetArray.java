/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetarray;

/**
 * CSC 206
 * Mr.Osborne
 * @author Isaiah J Jones
 * 2-25-17
 */
public class AlphabetArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an array of 100 chacracters
        char[] letters = new char[100];
        
        //Create an array of 26 integers
        int[] letterStore = new int[26];
        char x;
        char y = 'a';

        //Fill the array with random letters form "a" to "z"
        for (int i = 0; i < letters.length; i++) {
            x = AlphabetArray.getRandomLowerCaseLetter();
            letters[i] = x;
        }
        
        //Read the array and find out how many times each number occurs;
        for (int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case 'a':
                    letterStore[0] = letterStore[0] + 1;
                    break;
                case 'b':
                    letterStore[1] = letterStore[1] + 1;
                    break;
                case 'c':
                    letterStore[2] = letterStore[2] + 1;
                    break;
                case 'd':
                    letterStore[3] = letterStore[3] + 1;
                    break;
                case 'e':
                    letterStore[4] = letterStore[4] + 1;
                    break;
                case 'f':
                    letterStore[5] = letterStore[5] + 1;
                    break;
                case 'g':
                    letterStore[6] = letterStore[6] + 1;
                    break;
                case 'h':
                    letterStore[7] = letterStore[7] + 1;
                    break;
                case 'i':
                    letterStore[8] = letterStore[8] + 1;
                    break;
                case 'j':
                    letterStore[9] = letterStore[9] + 1;
                    break;
                case 'k':
                    letterStore[10] = letterStore[10] + 1;
                    break;
                case 'l':
                    letterStore[11] = letterStore[11] + 1;
                    break;
                case 'm':
                    letterStore[12] = letterStore[12] + 1;
                    break;
                case 'n':
                    letterStore[13] = letterStore[13] + 1;
                    break;
                case 'o':
                    letterStore[14] = letterStore[14] + 1;
                    break;
                case 'p':
                    letterStore[15] = letterStore[15] + 1;
                    break;
                case 'q':
                    letterStore[16] = letterStore[16] + 1;
                    break;
                case 'r':
                    letterStore[17] = letterStore[17] + 1;
                    break;
                case 's':
                    letterStore[18] = letterStore[18] + 1;
                    break;
                case 't':
                    letterStore[19] = letterStore[19] + 1;
                    break;
                case 'u':
                    letterStore[20] = letterStore[20] + 1;
                    break;
                case 'v':
                    letterStore[21] = letterStore[21] + 1;
                    break;
                case 'w':
                    letterStore[22] = letterStore[22] + 1;
                    break;
                case 'x':
                    letterStore[23] = letterStore[23] + 1;
                    break;
                case 'y':
                    letterStore[24] = letterStore[24] + 1;
                    break;
                case 'z':
                    letterStore[25]++;
                    break;
                default:
                    y++;
                    break;
            }

        }
        //Print out how many times each letter occurs in the array.
        for (char b = 'a'; b <= 'z'; b++) {
            System.out.print(b + " ");
        }
        System.out.println();
        printArray(letterStore);
    }

    public static char getRandomCharacter(char a, char z) {
        return (char) (a + Math.random() * (z - a + 1));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

}
