package algorithms;

import org.springframework.util.Assert;

/*
CreatePalindrome
Replace all question marks in a given string to obtain a palindrome.

Task description
Write a function solution that, given a string S of length N, returns any palindrome which can be obtained by
replacing all of the question marks in S by lowercase letters ('a'−'z'). If no palindrome can be obtained, the function should return the string "NO".

A palindrome is a string that reads the same both forwards and backwards. Some examples of palindromes are: "kayak", "radar", "mom".

* */
public class Test_CreatePalindrome {

    final char DEFAULT_CHAR = 'a';
    final char QUESTION_MARK = '?';
    final String NO_PALINDROME = "NO";

    public static void main(String[] args) {

        Test_CreatePalindrome t = new Test_CreatePalindrome();
        String p = "omississimo";
        String shouldReturn = "omississimo";
        String result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "osso";
        shouldReturn = "osso";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "rir";
        shouldReturn = "rir";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "mirim";
        shouldReturn = "mirim";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "mrim";
        shouldReturn = "NO";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "food";
        shouldReturn = "NO";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "zoo";
        shouldReturn = "NO";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));


        p = "omissi?simo";
        shouldReturn = "omississimo";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "omiss?ssimo";
        shouldReturn = "omissassimo";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));


        p = "o??o";
        shouldReturn = "oaao";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "?ir";
        shouldReturn = "rir";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "?i?";
        shouldReturn = "aia";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "?";
        shouldReturn = "a";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "??";
        shouldReturn = "aa";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "???";
        shouldReturn = "aaa";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "miri?";
        shouldReturn = "mirim";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "mrim";
        shouldReturn = "NO";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "mri?";
        shouldReturn = "NO";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "fo?d";
        shouldReturn = "NO";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

        p = "z?o";
        shouldReturn = "NO";
        result = t.getPalindrome(p);
        Assert.isTrue(result.equals(shouldReturn));

    }

    private String getPalindrome(String s) {

        final int stringLength = s.length();
        final char[] sequenceToBePalindrome = new char[stringLength];

        final int partSize = stringLength / 2;
        char charPart1;
        char charPart2;
        int indexPart2;
        for (int indexPar1 = 0; indexPar1 < partSize; indexPar1++) {
            indexPart2 = stringLength - 1 - indexPar1;
            charPart1 = s.charAt(indexPar1);
            charPart2 = s.charAt(indexPart2);

            if (isBothQuestionMark(charPart1, charPart2)) {
                setInSequence(sequenceToBePalindrome, indexPar1, DEFAULT_CHAR, indexPart2, DEFAULT_CHAR);
                continue;
            }

            if (charPart1 == charPart2) {
                setInSequence(sequenceToBePalindrome, indexPar1, charPart1, indexPart2, charPart2);
                continue;
            }

            if (isQuestionMark(charPart1)) {
                setInSequence(sequenceToBePalindrome, indexPar1, charPart2, indexPart2, charPart2);
                continue;
            }

            if (isQuestionMark(charPart2)) {
                setInSequence(sequenceToBePalindrome, indexPar1, charPart1, indexPart2, charPart1);
                continue;
            }

            return NO_PALINDROME;

        }

        final boolean isOdd = stringLength % 2 != 0;
        if (isOdd) {
            char charOfTheMiddle = s.charAt(partSize);
            sequenceToBePalindrome[partSize] = isQuestionMark(charOfTheMiddle) ? DEFAULT_CHAR : charOfTheMiddle;
        }

        return String.valueOf(sequenceToBePalindrome);

    }

    private void setInSequence(final char[] sequenceToBePalindrome, final int indexPar1, final char charPart1, final int indexPart2, final char charPart2) {
        sequenceToBePalindrome[indexPar1] = charPart1;
        sequenceToBePalindrome[indexPart2] = charPart2;
    }

    private boolean isQuestionMark(final char c) {
        return c == QUESTION_MARK;
    }

    private boolean isBothQuestionMark(final char c1, final char c2) {
        return isQuestionMark(c1) && isQuestionMark(c2);
    }

}