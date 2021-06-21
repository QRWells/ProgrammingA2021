/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DisplayURL {
    public static void main(String[] args) {
        try {
            URL url = new URL(args[0]);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException mue) {
            System.out.println("URLの形式が誤っています：" + mue);
        } catch (IOException ioe) {
            System.out.println("I/Oエラーです：" + ioe);
        }
    }
}
