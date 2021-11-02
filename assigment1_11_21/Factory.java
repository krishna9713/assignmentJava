package com.technoelevate.javabasics.assigment1_11_21;

public class Factory {
	Collegeus collegeus= null;
	public Collegeus getCollegeus(String name) {
		if(name.equalsIgnoreCase("Dhananjay")) {
			collegeus=new Dhanajay();
		}else if(name.equalsIgnoreCase("Vyankatesh")) {
			collegeus=new Vyankatesh();
		}else if (name.equalsIgnoreCase("Nitesh")) {
			collegeus=new Nitesh();
		}else {
			collegeus=new Vijay();
		}
		return collegeus;
	}	

}
