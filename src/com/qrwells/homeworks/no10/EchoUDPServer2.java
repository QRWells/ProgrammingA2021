/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.homeworks.no10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;

public class EchoUDPServer2 {
    public static void main(String[] args) {
        DatagramPacket inPacket;
        try (final var socket = new DatagramSocket(7)) {
            try {
                while (true) {
                    // Prepare data.
                    // Make DatagramPacket for input.
                    // Receive packet.
                    // Print data received.

                    byte[] inData = new byte[256];
                    inPacket = new DatagramPacket(inData, inData.length);
                    socket.receive(inPacket);
                    System.out.print(Thread.currentThread().getName() + " received: ");
                    System.out.write(inPacket.getData(), inPacket.getOffset(), inPacket.getLength());
                    System.out.println();

                    // Obtain socket address.

                    final SocketAddress inPacketSocketAddress = inPacket.getSocketAddress();
                    // Make Thread-Per-Message.
                    DatagramPacket finalInPacket = inPacket;
                    new Thread(() -> {
                        try {
                            // Make DatagramPacket for output.
                            var outPacket = new DatagramPacket(
                                    finalInPacket.getData(), finalInPacket.getLength(), inPacketSocketAddress);
                            // Send packet.
                            socket.send(outPacket);
                            // Print data sent.
                            System.out.print(Thread.currentThread().getName() + " sent: ");
                            System.out.write(outPacket.getData(), outPacket.getOffset(), outPacket.getLength());
                            System.out.println();
                        } catch (IOException se) {
                            se.printStackTrace(System.err);
                        }
                    }).start();
                }
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace(System.err);
        }
    }
}
