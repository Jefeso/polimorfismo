package br.edu.fatecpg.produto.model;

public class Produto {
public String nome;
public int estoque;
public Double preco;

  public Produto(String nm) {
	  this.nome = nm;
  }
  public Produto(String nm, double prc) {
	  this.nome = nm;
	  this.preco = prc;
  }
  public Produto(String nm, double prc,int est) {
	  this.nome = nm;
	  this.preco = prc;
	  this.estoque = est;
  }
}