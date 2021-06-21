/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no10;

import java.io.*;

public class DeepCopy {

    public static void main(String[] args) {
        try {
            copyFileOrDirectory(args[0], args[1]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileOrDirectory(String srcName, String dstName) throws FileNotFoundException {
        File srcFile = new File(srcName);
        if (srcFile.isFile()) {
            try {
                copyFile(srcFile.getAbsolutePath(), dstName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (srcFile.isDirectory()) {
            copyDir(srcFile.getAbsolutePath(), dstName);
        }
    }

    public static void copyDir(String srcName, String dstName) throws FileNotFoundException {
        var srcDir = new File(srcName);
        var dstDir = new File(dstName);
        if (!dstDir.exists()) {
            if (dstDir.mkdirs()) {
                var files = srcDir.listFiles();
                if (files != null) {
                    for (var file : files) {
                        String strFrom = srcName + File.separator + file.getName();
                        String strTo = dstName + File.separator + file.getName();
                        if (file.isDirectory()) {
                            copyDir(strFrom, strTo);
                        } else if (file.isFile()) {
                            copyFile(strFrom, strTo);
                        }
                    }
                }
            }
        }
    }

    public static void copyFile(String srcName, String dstName) throws FileNotFoundException {
        var inputFile = new File(srcName);
        var outputFile = new File(dstName);
        var inputStream = new FileInputStream(inputFile);
        var outputStream = new FileOutputStream(outputFile);
        try (var from = inputStream.getChannel();
             var to = outputStream.getChannel()) {
            from.transferTo(0, inputFile.length(), to);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
} 
