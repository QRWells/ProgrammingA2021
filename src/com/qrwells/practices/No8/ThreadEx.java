package com.qrwells.practices.No8;

public class ThreadEx {
	public static void main(String[] args) {
		new ThreadXX().start();
		new Thread(new ThreadYY()).start();
	}
}
