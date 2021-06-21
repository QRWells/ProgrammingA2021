/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no10;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DaytimeUDPServer {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(13)) {
            byte[] inData = new byte[256];
            byte[] outData;
            DatagramPacket inPacket = new DatagramPacket(inData, inData.length);
            DatagramPacket outPacket;
            while (true) {
                socket.receive(inPacket);
                outData = (new java.util.Date()).toString().getBytes();
                outPacket = new DatagramPacket(
                        outData, outData.length, inPacket.getSocketAddress());
                socket.send(outPacket);
            }
        } catch (Exception e) {
            System.out.println("エラー: " + e);
        }
    }
}
