package com.group.sahitest.demo.definitions;

import com.group.sahitest.demo.steps.BooksSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BooksDefinitions {

	@Steps
	BooksSteps booksS;

	@When("^anado libros para compra \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void anadoLibrosParaCompra(String java, String ruby, String python) {
		booksS.anadirLibros(java, ruby, python);
	}

	@Then("^valido el precio de los libros$")
	public void validoElPrecioDeLosLibros() {
		booksS.validoValorLibros();
	}

}
