package com.youtube.projects;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * This is a utility class that offers the 26 letters of
 * the English alphabet using the {@link #getAlphabetLetters()} method.
 *
 * <p> The contents can either be got all together by the method call or
 * accessed individually with the ArrayList {@code .get(int index)} method
 *
 * @author Andrew Jones
 * @see ArrayList
 * @since 23.0
 */

public final class Alphabet {

    static final Map<Integer, Character> ALPHABET_LETTERS = new HashMap<>();
    static final Map<Integer, Character> VOWELS = new TreeMap<>();
    static final Map<Integer, Character> CONSONANTS = new HashMap<>();

    private Alphabet() {
    }

    /**
     * Returns an {@code ArrayList} with the 26 letters inside
     * with {@code .getFirst()} returning the letter A
     * and {@code .getLast()} returning the letter Z
     */
    @Contract(" -> new")
    public static @NotNull List<Character> getAlphabetLetters() {
        addAlphabetLetters();
        return new ArrayList<>(ALPHABET_LETTERS.values());
    }

    /**
     * Returns an {@code ArrayList} containing the 5 vowels
     * of the English alphabet
     */

    @Contract(" -> new")
    public static @NotNull List<Character> getVowels() {
        addAlphabetLetters();
        addVowels();
        return new ArrayList<>(VOWELS.values());
    }

    /**
     * Returns an {@code ArrayList} containing the 21 consonants of
     * the English alphabet
     */

    @Contract(" -> new")
    public static @NotNull List<Character> getConsonants() {
        addAlphabetLetters();
        addVowels();
        addConsonants();
        return new ArrayList<>(CONSONANTS.values());
    }

    private static void addAlphabetLetters() {
        ALPHABET_LETTERS.put(1, 'A');
        ALPHABET_LETTERS.put(2, 'B');
        ALPHABET_LETTERS.put(3, 'C');
        ALPHABET_LETTERS.put(4, 'D');
        ALPHABET_LETTERS.put(5, 'E');
        ALPHABET_LETTERS.put(6, 'F');
        ALPHABET_LETTERS.put(7, 'G');
        ALPHABET_LETTERS.put(8, 'H');
        ALPHABET_LETTERS.put(9, 'I');
        ALPHABET_LETTERS.put(10, 'J');
        ALPHABET_LETTERS.put(11, 'K');
        ALPHABET_LETTERS.put(12, 'L');
        ALPHABET_LETTERS.put(13, 'M');
        ALPHABET_LETTERS.put(14, 'N');
        ALPHABET_LETTERS.put(15, 'O');
        ALPHABET_LETTERS.put(16, 'P');
        ALPHABET_LETTERS.put(17, 'Q');
        ALPHABET_LETTERS.put(18, 'R');
        ALPHABET_LETTERS.put(19, 'S');
        ALPHABET_LETTERS.put(20, 'T');
        ALPHABET_LETTERS.put(21, 'U');
        ALPHABET_LETTERS.put(22, 'V');
        ALPHABET_LETTERS.put(23, 'W');
        ALPHABET_LETTERS.put(24, 'X');
        ALPHABET_LETTERS.put(25, 'Y');
        ALPHABET_LETTERS.put(26, 'Z');
    }

    private static void addVowels() {
        int[] vowelArray = {1, 5, 9, 15, 21};

        for (int i = 0; i < 5; i++) {
            VOWELS.put(vowelArray[i], ALPHABET_LETTERS.get(vowelArray[i]));
        }

    }

    private static void addConsonants() {
        CONSONANTS.putAll(ALPHABET_LETTERS);

        for (int i : VOWELS.keySet()) {
            CONSONANTS.remove(i);
        }

    }

}
