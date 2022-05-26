package simpleGUI.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A string validator.
 */
public class Validation {

    /**
     * Check if a string is an 8-digit phone number.
     * @param text The string to be validated.
     * @return True if phone number is 8-digits and starting with a digit greater than 0.
     */
    public static boolean checkIfPhoneNumber(String text){
        String phoneNumberCheck = "^[1-9][0-9]{7}$";
        Pattern phoneNumber = Pattern.compile(phoneNumberCheck);
        Matcher matchInput = phoneNumber.matcher(text);

        return matchInput.find();
    }

    /**
     * Check if a string contains one or more special character(s).
     * @param text The string to be validated.
     * @return False if no special characters was found.
     */
    public static boolean checkIfContainsSpecialCharacter(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetterOrDigit(text.charAt(i)) && !Character.isWhitespace(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if a string contains digits only.
     * @param text The text to be validated.
     * @return True if digits only.
     */
    public static boolean checkIfDigitsOnly(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if a string contains digits and/or whitespace only.
     * @param text The text to be validated.
     * @return True if digits and/or whitespace only.
     */
    public static boolean checkIfDigitsAndWhitespaceOnly(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i)) && !Character.isWhitespace(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if a string only contains characters.
     * @param text The text to be validated.
     * @return True if characters only.
     */
    public static boolean checkIfCharactersOnly(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if a string only contains characters and/or whitespace.
     * @param text The text to be validated.
     * @return True if character and/or whitespace only.
     */
    public static boolean checkIfCharacterAndWhitespaceOnly(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i)) && !Character.isWhitespace(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
