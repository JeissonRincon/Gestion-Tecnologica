package blackjack;

import java.util.ArrayList;

public class Baraja {
	
	String[] valores;
	
	ArrayList<String> mazo =new ArrayList<String>();
	ArrayList<String> manoIA =new ArrayList<String>();
	ArrayList<String> manoJugador =new ArrayList<String>();
	
	public void crearBaraja(){
		String[] baraja={"A","A","A","A","2","2","2","2","3","3","3","3","4","4","4","4","5","5","5","5",
				"6","6","6","6","7","7","7","7","8","8","8","8","9","9","9","9","10","10","10","10",
				"J","J","J","J","Q","Q","Q","Q","K","K","K","K"};
		valores=baraja;
	}
	
	public void rellenarBaraja() {
		for (int i = 0; i<valores.length;i++){
			mazo.add(valores[i]);
		}
	}
	
	public int numeroCartasBaraja() {
		return mazo.size();
	}
	
	public ArrayList<String> getBaraja() {
		return mazo;
	}
	
	public void crearManoJugador() {
		manoJugador.add(entregarCarta());
		manoJugador.add(entregarCarta());
	}
	
	public void modificarManoJugador(int index){
		String carta = mazo.get(index);
		mazo.remove(index);
		manoJugador.add(carta);
	}
	
	public void crearManoIA() {
		manoIA.add(entregarCarta());
		manoIA.add(entregarCarta());
	}
	
	public ArrayList<String> getManoJugador() {
		return manoJugador;
	}
	
	public ArrayList<String> getManoIA() {
		return manoIA;
	}
	
	public void pedirCartaJugador() {
		manoJugador.add(entregarCarta());
	}
	
	public void pedirCartaIA() {
		manoIA.add(entregarCarta());
	}
	
	public String entregarCarta() {
		int numeroCarta = (int) (Math.random()*mazo.size());
		String carta = mazo.get(numeroCarta);
		mazo.remove(numeroCarta);
		return carta;
	}
	
	public int valorMazo(ArrayList<String> mazo) {
		int valor=0;
		int aces=0;
		for(int i=0; i<mazo.size(); i++) {
			if(mazo.get(i).equals("J") || mazo.get(i).equals("Q") || mazo.get(i).equals("K")) {
				valor+=10;
			}else {
				if(mazo.get(i).equals("A")) {
					aces=1;
					valor+=1;
				}else {
					valor+=Integer.parseInt(mazo.get(i));
				}
			}
		}
		if(aces!=0) {
			if(valor<=11) {
				valor+=10;
			}
		}
		return valor;
	}
	
}
