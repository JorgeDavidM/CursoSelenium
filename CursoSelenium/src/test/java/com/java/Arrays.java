package com.java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ARREGLO UNIDIMENSIONAL

		String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "S", "D" };
		System.out.println("El dìa de hoy es: " + dias[0]);

		for (int i = 0; i < dias.length; ++i) {
			System.out.println("Hoy es: " + dias[i]);
		}

		// ARREGLO BIDIMENSIONAL

		String[][] nombresCompletos = new String[4][2];

		nombresCompletos[0][0] = "Hernando";
		nombresCompletos[0][1] = "Muñoz";
		nombresCompletos[1][0] = "Haidy";
		nombresCompletos[1][1] = "Gutiérrez";
		nombresCompletos[2][0] = "Jorge";
		nombresCompletos[2][1] = "Muñoz";
		nombresCompletos[3][0] = "Paola";
		nombresCompletos[3][1] = "Muñoz";

		System.out.println(nombresCompletos[1][0] + " " + nombresCompletos[1][1]);
		
		

	}

}
