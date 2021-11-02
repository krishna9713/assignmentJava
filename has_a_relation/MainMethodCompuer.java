package com.technoelvate.javabasics.has_a_relation;


public class MainMethodCompuer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keybord keybord=new Keybord(52, "English");
		MotherBord motherBord= new MotherBord("Samsung", 5);
		Mouse mouse=new Mouse("Dell", 350);
		Display display=new Display("Super_Amoled", 2024);
		Sounds sounds=new Sounds(2, 100);
		Printer printer=new Printer("Epson", 25000);
		Computer computer= new Computer(keybord, motherBord, mouse, display, sounds, printer);
		computer.status();
	}

}
