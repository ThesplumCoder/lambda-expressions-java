package org.lambdaexpressions;

import java.util.function.Predicate;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Predicate<String> isPalindrome = (word) -> {
            StringBuilder reverseWord;

            reverseWord = new StringBuilder();
            for(int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            return word.contentEquals(reverseWord);
        };

        System.out.println("Roma is palindrome: " + isPalindrome.test("roma"));
    }

}
