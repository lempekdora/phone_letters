package telephone;

import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;

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

        readerObj.close();
    }

    static ArrayList<String> letters_to_digits(String digits){  //package private
        //checking constraints
        if (digits == null || digits.isEmpty() || !digits.matches("^[2-9]{0,4}$")) {
            return new ArrayList<String>();
        }

        ArrayList<String> result = new ArrayList<String>();

        StringBuilder sb = new StringBuilder("");

        backtrack(digits, result, 0, sb);

        result.sort( (a, b) -> { return -1 * a.compareTo(b); } ); //sort the results in reverse alphabetical order

        return result;
    }

    private static void backtrack(String digits, ArrayList<String> result, Integer index, StringBuilder current_path){
        //base case
        if (index == digits.length()){
            result.add(current_path.toString());
            return;
        }

        //recursion
        Character current_digit = digits.charAt(index);
        String letter_options = DIGIT_MAP.get(current_digit);

        for(Character letter : letter_options.toCharArray()){
            current_path.append(letter);

            backtrack(digits, result, index + 1, current_path);

            current_path.deleteCharAt(current_path.length() - 1);
        }
    }
}