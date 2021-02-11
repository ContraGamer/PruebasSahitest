package com.group.sahitest.demo.steps;

import org.junit.Assert;

import com.group.sahitest.demo.pageObjects.BooksPageObject;


import net.thucydides.core.annotations.Step;

public class BooksSteps {

	BooksPageObject booksPO;

	private String cantJava, cantRuby, cantPython;

	@Step("Agregar libros para comprar")
	public void anadirLibros(String java, String ruby, String python) {
		this.cantJava = java;
		this.cantPython = python;
		this.cantRuby = ruby;
		booksPO.sendKeyInputJava(java);
		booksPO.sendKeyInputRuby(ruby);
		booksPO.sendKeyInputPython(python);
		booksPO.clickBtnAdd();
	}

	@Step("Valido el valor de los libros")
	public void validoValorLibros() {

		int cJava=Integer.parseInt(cantJava);
		int cRuby=Integer.parseInt(cantRuby);
		int cPython=Integer.parseInt(cantPython);
		int valor=0;
		int valorJava = 300;
		int valorRuby = 200;
		int valorPython = 350;
		valor=(valorJava*cJava)+(valorRuby*cRuby)+(valorPython*cPython);
		String valorTotal = booksPO.getTextInputTotal();
		Assert.assertEquals(valor+"", valorTotal);
		
	}

}
