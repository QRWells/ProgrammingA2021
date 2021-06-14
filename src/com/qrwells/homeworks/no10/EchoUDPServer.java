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
                byte[] outData;
                var inPacket = new DatagramPacket(inData, inData.length);
                DatagramPacket outPacket;
                // Receive packet.
                socket.receive(inPacket);
                // Make DatagramPacket for output.
                outData = inPacket.getData();
                outPacket = new DatagramPacket(
                        outData, outData.length, inPacket.getSocketAddress());
                // Send packet.
                socket.send(outPacket);

            }
        } catch (IOException ioe) {
            ioe.printStackTrace(System.err);
        }
    }
}
