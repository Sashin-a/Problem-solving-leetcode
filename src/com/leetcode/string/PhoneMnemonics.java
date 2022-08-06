package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class PhoneMnemonics {
    private static List<String> phoneKeyMapping = List.of(
            "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
    );

    public static void main(String[] args) {
        PhoneMnemonics phoneMnemonics = new PhoneMnemonics();
        System.out.println(phoneMnemonics.letterCombinations(""));
    }

    public List<String> letterCombinations(String digits) {
        char[] partialMnemonics = new char[digits.length()];
        List<String> mnemonics = new ArrayList<>();
        phoneMnemonicHelper(partialMnemonics, mnemonics, 0, digits);
        return mnemonics;
    }

    private void phoneMnemonicHelper(char[] partialMnemonics, List<String> mnemonics, int digit, String phoneNumber) {
        if (digit == phoneNumber.length()) {
            if (partialMnemonics.length > 0) {
                mnemonics.add(new String(partialMnemonics));
            }
        } else {
            for (char c : phoneKeyMapping.get(phoneNumber.charAt(digit) - '0').toCharArray()) {
                partialMnemonics[digit] = c;
                phoneMnemonicHelper(partialMnemonics, mnemonics, digit + 1, phoneNumber);
            }
        }
    }
}
