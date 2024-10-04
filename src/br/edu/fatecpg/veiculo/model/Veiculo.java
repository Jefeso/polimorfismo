package br.edu.fatecpg.veiculo.model;

public abstract class Veiculo {
  private String marca;
  
  public Veiculo(String mrc) {
	  this.marca = mrc;
  }
  
  public void mover() {
 System.out.println("Está se movendo");
 }
}
