package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
	Baraja baraja = new Baraja();
	ArrayList<String> mazo = baraja.getBaraja();
	ArrayList<String> manoJugador = baraja.getManoJugador();
	ArrayList<String> manoIA = baraja.getManoIA();
	private Scanner entradaEscaner;
	public void jugar() {
		baraja.crearBaraja();
		baraja.rellenarBaraja();
		baraja.crearManoJugador();
		baraja.crearManoIA();
		partidaJugador();
	}
	
	public void partidaJugador() {
		int valor = baraja.valorMazo(manoJugador);
		System.out.print("Mano del jugador: ");
		for(int i=0; i<manoJugador.size();i++) {
			System.out.print(manoJugador.get(i)+" ");
		}
		System.out.println(" valor: "+valor);
		if(valor==21) {
			System.out.println("GANASTE");
		}else {
			if(valor>21) {
				System.out.println("PERDISTE");
			}else {
				System.out.println ("¿Quiere una carta más? s/ n ");
				String entradaTeclado = "";
				entradaEscaner = new Scanner (System.in);
				entradaTeclado = entradaEscaner.nextLine();
				System.out.println(entradaTeclado);
				if(entradaTeclado.equals("s")||entradaTeclado.equals("S")) {
					baraja.pedirCartaJugador();
					partidaJugador();
				}else {
					partidaIA();
				}
			}
		}
	}
	
	public void partidaIA() {
		int valor = baraja.valorMazo(manoJugador);
		int valorIA=baraja.valorMazo(manoIA);
		System.out.print("Mano de la banca: ");
		for(int i=0; i<manoIA.size();i++) {
			System.out.print(manoIA.get(i)+" ");
		}
		System.out.println(" valorIA: "+valorIA);
		if(valorIA>21) {
			System.out.println("GANASTE");
		}else {
			if(valorIA==21 || valorIA>valor) {
				System.out.println("PERDISTE");
			}else {
				if(valorIA==valor) {
					System.out.println("EMPATE");
				}else {
					baraja.pedirCartaIA();
					partidaIA();
				}
			}
		}
	}
}
