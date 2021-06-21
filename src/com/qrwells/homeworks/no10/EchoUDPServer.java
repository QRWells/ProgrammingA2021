/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class EchoUDPServer {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(7)) {
            while (true) {
                // Prepare data.
                // Make DatagramPacket for input.
                byte[] inData = new byte[256];
                var inPacket = new DatagramPacket(inData, inData.length);
                DatagramPacket outPacket;
                // Receive packet.
                socket.receive(inPacket);
                // Make DatagramPacket for output.
                outPacket = new DatagramPacket(
                        inPacket.getData(), inPacket.getLength(), inPacket.getSocketAddress());
                // Send packet.
                socket.send(outPacket);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace(System.err);
        }
    }
}
