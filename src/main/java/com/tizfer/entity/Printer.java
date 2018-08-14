package com.tizfer.entity;

/**
 *  组装打印机
 * @author tzf
 *
 */
public class Printer {
	
	private Papar papar;
	private InkBox inkBox;
	
	public void setPapar(Papar papar) {
		this.papar = papar;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}

	public void helloPrinter() {
		System.out.println("用"+papar.paparSize()+"纸打印"+inkBox.boxColor()+"的");
	}
}
