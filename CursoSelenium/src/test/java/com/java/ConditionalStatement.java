package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidad = 60, limiteVelocidad = 80;

		// IF ANIDADO - IF ELSE IF

		boolean carretera = false;

		if (carretera) {

			System.out.println("carretera");

			limiteVelocidad = 110;

			if (velocidad > limiteVelocidad) {
				System.out.println("Limite de velocidad excedido");
			} else {
				System.out.println("Velocidad admitida");
			}
		} else if (velocidad > limiteVelocidad) {
			System.out.println("Calle");
			System.out.println("Exceso de velocidad");
		} else {
			System.out.println("Velocidad admitida");
		}

		// SWITCH CASE

		int Temperatura = 10;

		switch (Temperatura) {
		case 5:
			System.out.println("Muy frio");
			break;
		case 10:
			System.out.println("Clima frio");
			break;
		case 20:
			System.out.println("Clima templado");
			break;
		case 50:
			System.out.println("Clima caliente");
			break;
			
			default: 
				System.out.println("Clima desconocido");
				break;
		}
	}

}
