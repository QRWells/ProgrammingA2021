package com.qrwells.homeworks.No8;

class Access {
	String name = null;
	private Access() {
		super();
	}
	public Access(String s) {
		this();
		name = s;
	}
	protected void dosome() {
	}
}
