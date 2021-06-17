/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no10;

import java.io.*;

public class CopyingFile {
    public static void main(String[] args) {
        if (args.length < 3) throw new IllegalArgumentException();

        var inputFile = new File(args[0]);
        var outputFile = new File(args[1]);
        var isBuffered = Boolean.parseBoolean(args[2]);

        try (var inputStream = new FileInputStream(inputFile);
             var outputStream = new FileOutputStream(outputFile)) {
            var startTime = System.currentTimeMillis();
            if (isBuffered) {
                int data;
                try (InputStream is = new BufferedInputStream(inputStream);
                     OutputStream os = new BufferedOutputStream(outputStream)) {
                    while ((data = is.read()) != -1) {
                        os.write(data);
                    }
                } catch (IOException e) {
                    e.printStackTrace(System.err);
                }
            } else {
                try (var from = inputStream.getChannel();
                     var to = outputStream.getChannel()) {
                    from.transferTo(0, inputFile.length(), to);
                } catch (IOException |
                        IllegalStateException |
                        IllegalArgumentException e) {
                    e.printStackTrace(System.err);
                }
            }
            var elapsed = System.currentTimeMillis() - startTime;
            System.out.println(elapsed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
