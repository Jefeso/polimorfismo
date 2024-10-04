package br.edu.fatecpg.pagamento.model;
import br.edu.fatecpg.pagamento.model.Pagamento;
public class PagamentoBoleto extends Pagamento {

	
	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento por Boleto Bancário");
	}
}
