package br.edu.fatecpg.pagamento.model;
import br.edu.fatecpg.pagamento.model.Pagamento;

public class PagamentoCartao extends Pagamento{
       
	
	@Override
	public void processarPagamento() {
		System.out.println("Processando pagamento por Cartão de crédito");
	}
}
