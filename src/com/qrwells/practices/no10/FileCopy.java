package com.qrwells.practices.no10;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        int data;
        try (InputStream is = new BufferedInputStream(new FileInputStream(args[0]));
             OutputStream os = new BufferedOutputStream(new FileOutputStream(args[1]))) {
            while ((data = is.read()) != -1) {
                os.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }

//        This will be better 'cause there will no be CPU copy

//        var fromFile = new File(args[0]);
//        try (var from = new FileInputStream(fromFile).getChannel();
//             var to = new FileOutputStream(args[1]).getChannel()) {
//            from.transferTo(0, fromFile.length(), to);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
