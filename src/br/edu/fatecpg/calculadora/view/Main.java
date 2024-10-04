package br.edu.fatecpg.calculadora.view;

import br.edu.fatecpg.calculadora.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(2, 5));
        
		System.out.println(calc.somar(2.3, 5));
		
		System.out.println(calc.somar(2, 5 , 8));
	}

}
