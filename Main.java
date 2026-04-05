package telephone;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static final Map<Character, String> DIGIT_MAP = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl", 
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

  public static void main(String[] args) {
    Scanner readerObj = new Scanner(System.in);
    System.out.println("Enter digits: ");

    String digits = readerObj.nextLine();  // Read user input

    ArrayList<String> letters = letters_to_digits(digits);
    System.out.println(letters);
  }

  private static ArrayList<String> letters_to_digits(String digits){
    if (digits.length() > 0 & digits.length() <= 4 ){
        
    }
    else{
        return [];
    }
  }
}