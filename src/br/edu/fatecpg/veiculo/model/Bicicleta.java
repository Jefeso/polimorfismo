package br.edu.fatecpg.veiculo.model;

public class Bicicleta extends Veiculo {
    private String cor;
    
    public Bicicleta(String mrc,String cor) {
    	super(mrc);
    	this.cor = cor;
    }
    
    @Override
    public void mover() {
		System.out.println("A bicicleta"  + "   " + cor + "  está pedalando!");
	}
}
