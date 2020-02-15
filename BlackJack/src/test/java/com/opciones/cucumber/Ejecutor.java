package com.opciones.cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features= "src/test/resources",
	    plugin="pretty")	
public class Ejecutor {
	public static void main(String[] args) {
        cucumber.api.cli.Main.main(args );
    }
}
