package com.qrwells.practices.No7;

import java.util.regex.Pattern;

public class Length {

    public static char[] encode(char[] data) {
        if (data == null)
            throw new IllegalArgumentException();
        if (data.length == 0)
            return data.clone();
        char t = data[0];
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < data.length; i++) {
            if (data[i] == t && counter < 9)
                counter++;
            else {
                sb.append(counter);
                sb.append(t);
                t = data[i];
                counter = 1;
            }
        }
        sb.append(counter);
        sb.append(t);
        return sb.toString().toCharArray();
    }

    public static char[] decode(char[] data) {
        if (data == null || data.length < 2)
            throw new IllegalArgumentException();
        String pattern = "^([1-9][a-z])+$";
        if (!Pattern.matches(pattern, String.valueOf(data)) || data.length % 2 == 1)
            throw new IllegalArgumentException();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i += 2)
            sb.append(String.valueOf(data[i + 1])
                    .repeat(data[i] - 0x30));
        return sb.toString().toCharArray();
    }

    public static void print(char[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] input = {
                'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a',
                'b', 'b', 'b', 'b', 'b',
                'c', 'c',
        };
        print(input);
        print(encode(input));
        print(decode(encode(input)));
        print(decode(input));
    }
}
