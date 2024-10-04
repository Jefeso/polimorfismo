package br.edu.fatecpg.veiculo.view;
import br.edu.fatecpg.veiculo.model.Bicicleta;
import br.edu.fatecpg.veiculo.model.Carro;

public class Main {

	public static void main(String[] args) {
		
	//Veiculo	veiculos = new Veiculo();
    Carro kwid = new Carro("Renault" ,"Kwid");
    
     kwid.mover();
     
    Bicicleta caloi = new Bicicleta("Caloi" , "Preta");
    
    caloi.mover();
	}

}
