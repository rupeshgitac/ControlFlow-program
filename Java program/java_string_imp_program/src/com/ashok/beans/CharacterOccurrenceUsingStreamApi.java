package com.ashok.beans;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurrenceUsingStreamApi {

	public static void main(String[] args) {

        String input = "java";

        Map<Character, Long> result =
                input.chars()                     // IntStream
                     .mapToObj(c -> (char) c)     // int → Character
                     .collect(Collectors.groupingBy(
                             c -> c,              // key = character
                             Collectors.counting() // value = count
                     ));

        System.out.println(result);
    }
}
