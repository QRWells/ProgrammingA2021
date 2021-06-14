/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        var fileChannel = new FileOutputStream(args[0]).getChannel();

        while (sc.hasNextLine()) {
            var temp = sc.nextLine();
            if (temp.equals("END")) break;
            temp += "\n";
            var buf = ByteBuffer.allocate(temp.length());
            buf.put(temp.getBytes());
            buf.flip();

            try {
                fileChannel.write(buf);
                System.out.print(temp);
            } catch (IOException e) {
                e.printStackTrace(System.err);
            } finally {
                buf.clear();
            }
        }
        fileChannel.close();
        sc.close();
    }
}
