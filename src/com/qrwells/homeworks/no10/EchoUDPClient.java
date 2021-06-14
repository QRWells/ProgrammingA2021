package com.qrwells.homeworks.no10;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoUDPClient {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            byte[] outData = "This is test".getBytes();
            byte[] inData = new byte[256];
            InetAddress address = InetAddress.getByName(args[0]);
            socket = new DatagramSocket();
            DatagramPacket outPacket = new DatagramPacket(outData, outData.length, address, 7);
            DatagramPacket inPacket = new DatagramPacket(inData, inData.length);
            socket.setSoTimeout(5000);
            socket.send(outPacket);
            System.out.print("Client sent    : ");
            System.out.write(outData);
            System.out.println();
            socket.receive(inPacket);
            System.out.print("Client received: ");
            System.out.write(inData);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}
