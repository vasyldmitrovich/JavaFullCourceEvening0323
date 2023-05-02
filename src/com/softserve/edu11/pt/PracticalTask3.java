package com.softserve.edu11.pt;

import java.util.regex.Pattern;

public class PracticalTask3 {
    public static void main(String[] args) {
        String usernames[] = {"marshal86", "davinci_2000", "y_a_n_k_i", "ultimatum_2223", "al", "valeriy marcus"};
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]{3,15}$");
        //Good
        for (String username : usernames) {
            if (pattern.matcher(username).matches()) {
                System.out.println(username + " - valid username.");
            } else {
                System.out.println(username + " - not valid username!");
            }
        }
    }
}
