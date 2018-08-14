package com.tizfer.computer;

public class MyComputer {
	
	private USB1 usb1;
	private USB2 usb2;
	public void setUsb1(USB1 usb1) {
		this.usb1 = usb1;
	}
	public void setUsb2(USB2 usb2) {
		this.usb2 = usb2;
	}

	public void myComputer() {
		System.out.println(usb1.firUsbType()+"---"+usb2.secUsbType());
	}
}
