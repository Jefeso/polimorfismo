package br.edu.fatecpg.pagamento.view;
import br.edu.fatecpg.pagamento.model.Pagamento;
import br.edu.fatecpg.pagamento.model.PagamentoCartao;
import br.edu.fatecpg.pagamento.model.PagamentoBoleto;
public class Main {

	public static void main(String[] args) {
		
		Pagamento cartao = new PagamentoCartao();
		Pagamento generico = new Pagamento();
		Pagamento boleto = new PagamentoBoleto();
		
	generico.processarPagamento();
	cartao.processarPagamento();
	boleto.processarPagamento();
		
	}

}
