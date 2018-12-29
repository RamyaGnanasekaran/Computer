package org.comp;

import java.util.Scanner;

 class Desktop implements Hardware, Software {
	

		public void desktopModel() {
		System.out.println("Desktop model - Personal computer");
	}

	public void hardwareResources() {
		System.out.println("Hardware Resources");
	}

	public void softwareResources() {
		System.out.println("Software Resources");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.hardwareResources();
		d.softwareResources();
	}
}
