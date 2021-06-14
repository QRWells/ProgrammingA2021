package com.qrwells.homeworks.no10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Arrays;

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
                    System.out.write(inData);
                    System.out.println();

                    // Obtain socket address.

                    final SocketAddress inPacketSocketAddress = inPacket.getSocketAddress();
                    var outData = inPacket.getData();

                    // Make Thread-Per-Message.
                    new Thread(() -> {
                        try {
                            // Make DatagramPacket for output.
                            var outPacket = new DatagramPacket(
                                    outData, outData.length, inPacketSocketAddress);
                            // Send packet.
                            socket.send(outPacket);
                            // Print data sent.
                            System.out.print(Thread.currentThread().getName() + " sent: ");
                            System.out.write(outData);
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
