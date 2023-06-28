import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPatternProblem {

    public static boolean isValidEmail(String email) {
        // Regular expression pattern for email validation
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailPattern);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(email);

        // Check if the email matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "john.doe@example.com",
                "jane.doe@domain",
                "john.doe@.com",
                "john.doe@example",
                "john.doe@example.com.",
                "john.doe123@example.com",
                "john.doe@example.com.",
                "john.doe@example..com",
                "john.doe@example_com"
        };

        for (String email : emails) {
            boolean isValid = isValidEmail(email);
            System.out.println(email + " is " + (isValid ? "valid" : "invalid"));
        }
    }
}
