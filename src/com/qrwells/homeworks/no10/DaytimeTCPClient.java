/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no10;

import java.net.*;
import java.io.*;
public class DaytimeTCPClient {
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        try (Socket socket = new Socket(args[0], 13)) {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (UnknownHostException uhe) {
            System.out.println("ホストが見付かりません:" + uhe);
        } catch (IOException ioe) {
            System.out.println("I/Oエラーです:" + ioe);
        }
    }
}
