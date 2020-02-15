package pasos;

import java.util.ArrayList;

import blackjack.Baraja;
import blackjack.Juego;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Pasos {
	Juego prueba = new Juego();
	Baraja pruebaBaraja = new Baraja();
	@Given("^reparto de baraja$")
	public void reparto_de_baraja() throws Throwable							
    {		
       pruebaBaraja.crearBaraja();					
    }	
    @When("^cargan cartas$")			
    public void cargan_cartas() throws Throwable							
    {		
       pruebaBaraja.rellenarBaraja();					
    }
    @Then("^cartas en el mazo$")
    public void cartas_en_el_mazo() throws Throwable							
    {		
        if(pruebaBaraja.numeroCartasBaraja()==52) {
        	System.out.println("La baraja está completa");
        }
    }
    ArrayList<String> manoJugador = pruebaBaraja.getManoJugador();
    int valor;
    @Given("^cartas J Q K$")
    public void cartas_J_Q_K() {
    	pruebaBaraja.crearBaraja();	
    	pruebaBaraja.rellenarBaraja();
    	pruebaBaraja.modificarManoJugador(50);
    	pruebaBaraja.modificarManoJugador(40);
    }
    @When("^se obtiene la suma$")
    public void se_obtiene_la_suma() {
    	valor=pruebaBaraja.valorMazo(manoJugador);
    }
    @Then("^esta suma debe ser veinte$")
    public void esta_suma_debe_ser_veinte() {
    	if(valor==20) {
    		System.out.println("La suma de letras es correcta");
    	}
    }
    
    @Given("^repartidas las cartas$")
    public void repartidas_las_cartas() {
    	pruebaBaraja.crearBaraja();	
    	pruebaBaraja.rellenarBaraja();
    	int as = (int)(Math.random()*((3-0)+1))+0;
    	int diez = (int)(Math.random()*((51-36)+1))+36;
    	pruebaBaraja.modificarManoJugador(diez);
    	pruebaBaraja.modificarManoJugador(as);
    }
    @When("^exista un as y un diez$")		
    public void exista_un_as_y_un_diez() {    	
    	if(manoJugador.get(0)=="10" || manoJugador.get(0)=="J" || manoJugador.get(0)=="Q" || manoJugador.get(0)=="K" && manoJugador.get(1)=="A") {
    		System.out.println("Existe un diez y un as en la mano");
    	}
  
    }
    @Then("^el jugador gana$")
    public void el_jugador_gana() {
    	if(pruebaBaraja.valorMazo(manoJugador)==21) {
    		System.out.println("El jugador tiene blackjack");
    	}
    }
}
