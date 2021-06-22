/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountMain {
    public static void main(String[] args) {
        try {
            var t = readFile(args[0]);
            var ts = Arrays.stream(t.replace(",", "").replace("\r\n"," ").toLowerCase().split(" "));
            ts.collect(Collectors.groupingBy(x -> x))
                    .values()
                    .stream()
                    .collect(Collectors.toMap(s -> s.get(0), List::size, Math::addExact, TreeMap::new))
                    .forEach((String s, Integer v) -> System.out.println(s + "," + v));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String name) throws IOException {
        var sb = new StringBuilder();
        var charset = StandardCharsets.UTF_8;
        var decoder = charset.newDecoder();

        var file = new File(name);
        var raFile = new RandomAccessFile(file, "r");
        var fChannel = raFile.getChannel();

        var bBuf = ByteBuffer.allocate(32); // set cache size to 32.(could be any number)
        var cBuf = CharBuffer.allocate(32);

        var bytesRead = fChannel.read(bBuf); // read to buffer
        char[] tmp; // keep decoded characters temporary
        byte[] remainByte;// bytes haven't been decoded
        int leftNum; // the length of remainBytes
        while (bytesRead != -1) {

            bBuf.flip(); // switch from write-mode to read-mode
            decoder.decode(bBuf, cBuf, true); // decode in UTF-8
            cBuf.flip(); // switch from write-mode to read-mode
            remainByte = null;
            leftNum = bBuf.limit() - bBuf.position();
            if (leftNum > 0) {
                remainByte = new byte[leftNum];
                bBuf.get(remainByte, 0, leftNum);
            }

            // output decoded bytes
            tmp = new char[cBuf.length()];
            while (cBuf.hasRemaining()) {
                cBuf.get(tmp);
                sb.append(new String(tmp));
            }

            bBuf.clear(); // switch from read-mode to write-mode
            cBuf.clear(); // switch from read-mode to write-mode
            if (remainByte != null) {
                bBuf.put(remainByte); // write remain byte to next read
            }
            bytesRead = fChannel.read(bBuf);
        }
        raFile.close();
        return sb.toString();
    }
}
