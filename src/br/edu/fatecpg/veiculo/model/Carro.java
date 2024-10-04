package br.edu.fatecpg.veiculo.model;

public class Carro extends Veiculo{
   private String modelo;
   
   public Carro(String mrc,String mod) {
	   super(mrc);
	   this.modelo = mod;
   }
   @Override
public void mover() {
	 System.out.println("O carro está dirigindo !");
      }
}
