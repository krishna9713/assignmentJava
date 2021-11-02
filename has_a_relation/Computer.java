package com.technoelvate.javabasics.has_a_relation;

import com.technoelevate.javabasics.assigment1_11_21.Display;

public class Computer {
	
		Keybord keybord;
		MotherBord motherBord;
		Mouse mouse;
		com.technoelvate.javabasics.has_a_relation.Display display;
		Sounds sounds;
		Printer printer;
		
		public Computer(Keybord keybord, MotherBord motherBord, Mouse mouse, com.technoelvate.javabasics.has_a_relation.Display display, Sounds sound,
				Printer printer) {
			this.keybord = keybord;
			this.motherBord = motherBord;
			this.mouse = mouse;
			this.display = display;
			this.sounds = sounds;
			this.printer = printer;
		}
		
		public void status() {
			System.out.println("Computer is ready for use");
		}
		
	}

