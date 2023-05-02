package com.softserve.edu11.pt11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask3 {
    public static void main(String[] args) {
        String[] usernames = {"user_123", "user_name_1", "user.name", "user123456789012345", "user"};
        for (String username : usernames) {
            boolean isValid = validateUsername(username);
            String status = isValid ? "Valid" : "Invalid";
            System.out.println(username + ": " + status);
        }
    }

    public static boolean validateUsername(String username) {//Good decision
        // Regular expression pattern for username validation
        String pattern = "^[a-zA-Z0-9_]{3,15}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(username);
        return matcher.matches();
    }
}
