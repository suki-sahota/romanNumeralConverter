/*
Author: Suki Sahota
Description: Roman Numeral Converter
*/
import java.util.*;
public class RomanNumeral {
    public static void main(String[] args) {
        description();
    }
    
    public static void description() {
        Scanner kb = new Scanner(System.in);
        System.out.print("********    This program converts your birthday to its\nequivalent roman numbers    ********\nHow many times do you want to repeat this program: ");
        int repeat = kb.nextInt();
        for (int i = 1; i <= repeat; i++) {
            start(kb);
        }
    }
    
    public static void start(Scanner kb) {
        System.out.print("Please enter your name: ");
        String name = kb.next();
        System.out.println("Hi " + name + " lets start");
        birthday(kb);
    }
    
    public static void birthday(Scanner kb) {
        System.out.print("Enter the Month of your Birthday as a two digit number: ");
        int month = kb.nextInt();
        System.out.print("Enter the day of your birthday as a two digit number: ");
        int day = kb.nextInt();
        System.out.print("Enter the year of your birthday as a four digit number: ");
        int year = kb.nextInt();
        //convert birthdate to roman numerals
        String romanMonth = roman(month);
        String romanDay = roman(day);
        String romanYear = roman(year);
        System.out.println("Your birthday in Roman is: " + romanMonth + "/" + romanDay + "/" + romanYear);
    }
    
    public static String roman(int number) {
        String s = "";
        int M = number / 1000;
        for (int i = M; i > 0; i--) {
            s += "M";
            number -= 1000;
        }
        int CM = number / 900;
        for (int i = CM; i > 0; i--) {
            s += "CM";
            number -= 900;
        }
        int D = number / 500;
        for (int i = D; i > 0; i--) {
            s += "D";
            number -= 500;
        }
        int CD = number / 400;
        for (int i = CD; i > 0; i--) {
            s += "CD";
            number -= 400;
        }
        int C = number / 100;
        for (int i = C; i > 0; i--) {
            s += "C";
            number -= 100;
        }
        int XC = number / 90;
        for (int i = XC; i > 0; i--) {
            s += "XC";
            number -= 90;
        }
        int L = number / 50;
        for (int i = L; i > 0; i--) {
            s += "L";
            number -= 50;
        }
        int XL = number / 40;
        for (int i = XL; i > 0; i--) {
            s += "XL";
            number -= 40;
        }
        int X = number / 10;
        for (int i = X; i > 0; i--) {
            s += "X";
            number -= 10;
        }
        int IX = number / 9;
        for (int i = IX; i > 0; i--) {
            s += "IX";
            number -= 9;
        }
        int V = number / 5;
        for (int i = V; i > 0; i--) {
            s += "V";
            number -= 5;
        }
        int IV = number / 4;
        for (int i = IV; i > 0; i--) {
            s += "IV";
            number -= 4;
        }
        int I = number / 1;
        for (int i = I; i > 0; i--) {
            s += "I";
            number -= 1;
        }
        return s;
    }
}